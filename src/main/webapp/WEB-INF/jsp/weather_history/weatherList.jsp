<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<link rel="stylesheet" href="/css/weather_history/style.css" type="text/css">
</head>
<body>
<div class="wrap">
	<header class="bg-dark col-9">
		<h1>과거 날씨</h1>
	</header>
    <aside class="col-3 bg-success">
     <!-- 수직(세로)방향 메뉴: nav + flex-column -->
       <ul class="nav flex-column">
           <li class="nav-item font-weight-bold"><a href="#" class="nav-link">날씨</a></li>
           <li class="nav-item font-weight-bold"><a href="#" class="nav-link">날씨입력</a></li>
           <li class="nav-item font-weight-bold"><a href="#" class="nav-link">테마날씨</a></li>
           <li class="nav-item font-weight-bold"><a href="#" class="nav-link">관측 기후</a></li>
        </ul>
    </aside>
	<section class="contents bg-danger">
		<table class="table text-center">
			<thead>
				<tr>
					<th>날짜</th>
					<th>날씨</th>
					<th>기온</th>
					<th>강수량</th>
					<th>미세먼지</th>
					<th>풍속</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="" >
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	<footer class="bg-warning">
		<img src="" alt="" width="">
		<div class="text-secondary"><small>(07062)서울시 동작구 여의대방로16길 61</small></div>
		<div class="text-secondary"><small>Copyright@20XX KMA. All Rights RESERVED</small></div>
	</footer>
</div>	
</body>
</html>