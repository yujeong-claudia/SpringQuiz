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
			<label for="name">제목</label>
			<input type="text" id="name" class="form-control">
		</div>

		<div class="form-group">
			<label for="address">URL 주소</label>
			<input type="text" id="address" class="form-control">
		</div>
		
		<button type="button" id="addBtn" class="btn btn-success btn-block">추가</button>
	</div>
	
<script>
	$(document).ready(function() {
		// 추가 버튼 클릭
		$('#addBtn').on('click', function() {
			//alert("버튼 클릭");
			// validation check
			let name = $('#name').val().trim();
			let address = $('#address').val().trim();
			if (name == "") {
				alert("제목을 입력하세요");
				return;
			}
			
			if (!address) {
				alert("주소를 입력하세요");
				return;
			}
			
			// http 또는 https 프로토콜
			if (address.startsWith("http://") == false
					&& address.startsWith("https://") == false) {
				alert("주소 형식이 잘못 되었습니다.");
				return;
			}
			
			// AJAX 통신
			$.ajax({
				// request
				type:"POST"
				, url:"/lesson06/add-bookmark"
				, data:{"name":name, "address":address}
				
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