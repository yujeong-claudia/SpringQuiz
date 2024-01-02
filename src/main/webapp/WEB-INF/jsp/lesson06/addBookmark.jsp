<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<%-- AJAX를 사용하려면 jquery 원본 필요 --%>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
		<h1 class="font-weight-bold">즐겨찾기 추가하기</h1>
		<form method="post" action="/lesson06/quiz01/add-bookmark">
			<label for="name">제목</label>
			<input type="text" class="form-control mb-3" id="name" name="name">
			<label for="address">주소</label>
			<input type="text" class="form-control mb-3" id="url" name="url">
			
			<%-- AJAX로 할 때는 submit이 되면 안되므로 button으로 변경 --%>
				<input type="button" id="joinBtn" value="추가" class="btn btn-success w-100">	
		</form>
	</div>
<script>
	$(document).ready(function(){
		// jquery의 AJAX 통신 이용하기
		$("#joinBtn").on('click', function(){
			//alert("클릭");
			
			//validation 처리
			let name = $("#name").val();
			if(name.length < 1){
				alert("이름을 입력하세요");
				return;
			}
			
			let url = $("#url").val();
			if(url == ""){
				alert("주소를 입력하세요");
				return;
			}
	});

</script>	
</body>
</html>