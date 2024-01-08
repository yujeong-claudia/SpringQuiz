<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

<%-- AJAX를 사용하려면 jquery 원본 필요 --%>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>즐겨찾기 추가하기</h1>
		
		<div class="form-group">
			<label for="title">제목</label>
			<input type="text" id="title" class="form-control">
		</div>

		<div class="form-group">
			<label for="url">URL 주소</label>
			<div class="form-inline">
				<input type="text" id="url" class="form-control col-11">
				<button type="button" id="duplicationBtn" class="btn btn-info">중복확인</button>
			</div>
			<small id="duplicationText" class="text-danger d-none">중복된 url 입니다.</small>
			<small id="availableUrlText" class="text-success d-none">저장 가능한 url 입니다.</small>
		</div>
		
		<button type="button" id="addBtn" class="btn btn-success btn-block">추가</button>
	</div>
	
<script>
	$(document).ready(function() {
		// 중복확인
		$("#duplicationBtn").on('click', function() {
			// alert("중복확인");
			let url = $("#url").val().trim();
			if (!url) {
				alert("url을 입력하세요.");
				return;
			}
			
			// AJAX 통신 - DB 중복확인
			$.ajax({
				// request
				type:"POST"
				, url:"/lesson06/is-duplication-url"
				, data:{"url":url}
				
				// response
				, success:function(data) { // data: JSON String => dictionary
					// {"code":200, "is_duplication":true} => 중복
					if (data.is_duplication) {
						// 중복이다.
						$("#duplicationText").removeClass("d-none");
						$("#availableUrlText").addClass("d-none");
					} else {
						// 중복 아니다. => 사용 가능
						$("#duplicationText").addClass("d-none");
						$("#availableUrlText").removeClass("d-none");
					}
				}
				, error:function(request, status, error) {
					alert("중복확인에 실패했습니다.");
				}
			});
		});
		
		// 추가 버튼 클릭
		$('#addBtn').on('click', function() {
			//alert("버튼 클릭");
			// validation check
			let title = $('#title').val().trim();
			let url = $('#url').val().trim();
			if (title == "") {
				alert("제목을 입력하세요");
				return;
			}
			
			if (!url) {
				alert("주소를 입력하세요");
				return;
			}
			
			// http 또는 https 프로토콜
			if (url.startsWith("http://") == false
					&& url.startsWith("https://") == false) {
				alert("주소 형식이 잘못 되었습니다.");
				return;
			}
			
			// AJAX 통신
			$.ajax({
				// request
				type:"POST"
				, url:"/lesson06/add-bookmark"
				, data:{"title":title, "url":url}
				
				// response - call back 함수
				, success:function(data) { // data: JSON String => parsing(jquery ajax 함수) => dictionary
					//alert(data.code);
					
					if (data.code == 200) {
						// 목록 화면으로 이동
						location.href = "/lesson06/bookmark-list-view"; // get 방식 이동
					}
				}
				, error:function(request, status, error) {
					alert("추가하는데 실패했습니다. 관리자에게 문의해주세요.");
				}
			});
		});
	});
</script>
</body>
</html>