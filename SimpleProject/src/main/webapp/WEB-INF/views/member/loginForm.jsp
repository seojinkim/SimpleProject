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
</head>

<body>
	<div id="login">
		<div class="loginTop" >
			<h2 class="text-center">Sign In</h2>
		</div>
		<div class="loginCenter row">
			<form action="${context}/member/login" method="post" name="loginForm" class="form-horizontal">
				<fieldset class="loginField">
					<div class="form-group">
					 	<label for="input_id" class="col-sm-4 control-label">ID</label>
					 	<div class="col-sm-4">
							<input type="text" class="form-control" id="id" name="id" placeholder="ID"/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_pw" class="col-sm-4 control-label">PASSWORD</label>
					 	<div class="col-sm-4">
							<input type="password" class="form-control" id="password" name="password" placeholder="PASSWORD"/>
						</div>
					</div>
					<div class="input_button text-center">
						<input type="button" id="joinButton" class="btn btn-primary" value ="SIGN IN" onclick="login()"/>
						<a class="btn btn-primary" href="${context}/member/joinForm" role="button">SIGN UP</a>
					</div>
				</fieldset>
			</form>
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