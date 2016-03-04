<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="UTF-8" />
   <title>Board</title>
   <!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<style type="text/css">
		body {
			padding-top: 70px;
		}
		.footer {
			position: absolute;
			bottom: 0;
			width: 100%;
			height: 60px;
			background-color: #f5f5f5;
		}
		.container .text-muted {
		    margin: 20px 0;
		}
		.text-muted {
		    color: #777;
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				</button>
				<a href="${context}/board/boardList">
					<img src="${pageContext.request.contextPath}/resources/plane.png" border="0">
				</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li><a><strong>${sessionScope.member.name}</strong>님 반갑습니다.</a></li>
					<li><a href="${context}/member/updateForm">회원정보</a></li>
					<li><a href="${context}/member/logout">로그아웃</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>
    
    <h2 class="text-center">NH여행 게시판</h2>
    
	<div class="row center-block" style="width: 60%; ">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th style="width: 10%;">글번호</th>
					<th style="width: 70%;">제목</th>
					<th style="width: 20%;">글쓴이</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${boardList}" var="b">
					<tr>
						<td>${b.idx}</td>
						<td><a href="${context}/board/boardDetail?idx=${b.idx}">${b.title}</a></td>
						<td>${b.id}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pull-right">
			<a class="btn btn-primary" href="${context}/board/boardInsertForm">글쓰기</a>
		</div>
	</div>
	<footer class="footer">
		<div class="container">
			<p class="text-muted"><strong>&copy; 2016 NH Heros</strong> All rights reserved</p>
		</div>
	</footer>
</body>
</html>