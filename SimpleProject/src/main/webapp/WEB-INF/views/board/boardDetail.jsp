<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		form {
			margin-top: 2em;
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
	
	<c:set var="boardId" value="${board.id}" />
	<c:set var="sessionId" value="${sessionScope.member.id}"/>
	
	<form class="form-horizontal">
		<div class="form-group">
			<label for="input_title" class="col-sm-4 control-label">제목</label>
		 	<div class="col-sm-4">
				<input type="text" id="title" name="title" class="form-control" value="${board.title}" readonly="readonly"/>
			</div>
	   </div>
	   <div class="form-group">
	   		<label for="input_context" class="col-sm-4 control-label">내용</label>
		 	<div class="col-sm-4">
		 		<textarea id="context" name="context" class="form-control" rows="12" readonly="readonly">${board.context}</textarea>
	   			<%-- <input type="text" id="context" name="context" class="form-control" value="${board.context}" readonly="readonly"/> --%>
	   		</div>
	   	</div>
	   <input type="hidden" id="id" value="${sessionScope.member.id}"/>
	   <input type="hidden" id="idx" value="${board.idx}" />
   </form>
   <div class="text-center">
	<c:choose>
		<c:when test="${boardId eq sessionId }">
			<a id="updateBtn" class="btn btn-primary" href="${context}/board/updateForm?idx=${board.idx}">수정</a>
		</c:when>
	</c:choose>
	<a class="btn btn-primary" href="${context}/board/boardList">목록</a>
	</div>
	<footer class="footer">
		<div class="container">
			<p class="text-muted"><strong>&copy; 2016 NH Heros</strong> All rights reserved</p>
		</div>
	</footer>
</body>
<script type="text/javascript">
var boardId = <%= request.getParameter("no") %>;
</script>
</html>