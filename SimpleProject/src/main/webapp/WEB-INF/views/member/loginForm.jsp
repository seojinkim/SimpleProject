<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>

<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title>로그인</title>
	<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<style type="text/css">
		#login{
			margin-top: 5em;
		}
	</style>
</head>

<body>
	<div id="login">
		<div class="loginTop text-center" >
			<img src="${pageContext.request.contextPath}/resources/paper_plane.png" border="0" height="160px" width="160px"/>
		</div>
		<div class="loginCenter row" style="margin-left: 43.5%;">
			<form action="${context}/member/login" method="post" name="loginForm" class="form-horizontal">
				<fieldset class="loginField">
					<div class="form-group">
					 	<label for="input_id" class="control-label sr-only">아이디</label>
					 	<div class="col-sm-3">
							<input type="text" class="form-control" id="id" name="id" placeholder="아이디를 입력하세요"/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_pw" class="control-label sr-only">비밀번호</label>
					 	<div class="col-sm-3">
							<input type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력하세요"/>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
		<div class="input_button text-center">
			<input type="button" id="joinButton" class="btn btn-primary" value ="로그인" onclick="login()"/>
			<a class="btn btn-primary" href="${context}/member/joinForm" role="button">회원가입</a>
		</div>
	</div>
	<script type="text/javascript">
		function login() {
			if (document.loginForm.id.value=='') {
				alert('아이디를 입력해 주세요');
				document.loginForm.id.focus();
			} else if (document.loginForm.password.value==''){
				alert('비밀번호를 입력해 주세요');
				document.loginForm.password.focus();
			} else{
				document.loginForm.submit();
				return true;
			}
		}
	</script>
</body>
</html>