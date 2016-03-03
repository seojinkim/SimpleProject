<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
</head>
<body>
안뇽 요기는 보드
<nav class="navbar navbar-inverse navbar-fixed-top">
 	<div class="container">
		<div class="navbar-header">
        	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
          	</button>
          	<a class="navbar-brand" href="${context}/board/boardList">NH여행 게시판</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          	<ul class="nav navbar-nav pull-right">
	            <li><a href="#">ㅇㅇㅇ</a></li>
	            <li><a href="${context}/member/updateForm">회원정보</a></li>
	            <li><a href="javascript:logout()">로그아웃</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    <h2 class="text-center">BOARD</h2>
    <div class="row">
   	 	<div class="col-md-12">
          <table class="table table-striped">
            <thead>
              <tr>
                <th>#</th>
                <th>제목</th>
                <th>글쓴이</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
              </tr>
              <tr>
                <td>2</td>
                <td>Jacob</td>
                <td>Thornton</td>
              </tr>
              <tr>
                <td>3</td>
                <td>Larry</td>
                <td>the Bird</td>
              </tr>
            </tbody>
          </table>
        </div>
    </div>
    <a href="${context}/board/boardInserForm">글쓰기</a>
    <script type="text/javascript">
    	function logout(){
    		
    	}
    </script>
</body>
</html>