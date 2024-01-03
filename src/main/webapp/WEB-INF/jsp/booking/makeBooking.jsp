<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>

<%-- bootstrap(datepicker 쓰려면 jquery 원본으로) --%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<%-- datepicker --%>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<%-- 내가 만든 외부 스타일시트 --%>
<link rel="stylesheet" type="text/css" href="/css/booking/style.css">

</head>
<body>
	<div id="wrap" class="container text-center">
		<header>
			<h1>통나무 펜션</h1>
		</header>
		<%-- 메뉴 영역 --%>
		<nav>
			<ul class="nav nav-fill d-flex justify-content-center align-items-center">
				<li class="nav-item">
					<a href="#" class="nav-link menu-font">펜션소개</a>
				</li>
				<li class="nav-item">
					<a href="#" class="nav-link menu-font">객실소개</a>
				</li>
				<li class="nav-item">
					<a href="#" class="nav-link menu-font">예약하기</a>
				</li>
				<li class="nav-item">
					<a href="#" class="nav-link menu-font">예약목록</a>
				</li>
			</ul>
		</nav>
		<section>
			<div>
				<img src="/img/test06_banner1.jpg" alt="배너1">
			</div>
			<div>
				<div>실시간 예약하기</div>
				<div>예약확인
					<div>
					
					</div>
				</div>
				<div>예약문의</div>
			</div>
		</section>
		<footer>
			<small class="text-sencondary">
			제주특별자치도 제주시 애월읍<br>
            사업자등록번호: 111-22-255222 / 농어촌민박사업자지정 / 대표:김통목<br>
            Copyright 2025 tongnamu. All right reserved.
			</small>
		</footer>
	</div>
</body>
</html>