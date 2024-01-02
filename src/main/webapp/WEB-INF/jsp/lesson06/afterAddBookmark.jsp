<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<%-- AJAX를 사용하려면 jquery 원본 필요 --%>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
			<h1 class="text-center">즐겨찾기 목록</h1>
			<table class="table text-center">
				<thead>
					<tr>
						<th>사이트</th>
						<th>사이트 주소</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
				<%
					while(result.next()) {
				%>
					<tr>
						<td><%= result.getString("name") %></td>
						<td><a href="<%= result.getString("url") %>"><%= url.getString("url") %></a></td>
						<td><a href="/lesson04/quiz01_delete?id=<%= result.getInt("id") %>" class="btn btn-danger">삭제하기</a></td>
					</tr>
				<%
					}
				%>
				</tbody>
			</table>
	</div>
</body>
</html>