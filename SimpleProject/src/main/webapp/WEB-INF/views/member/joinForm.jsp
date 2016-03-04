<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="UTF-8" />
   <title>회원가입</title>
   <!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>

<body>
	<div id="join">
		<div class="joinTop">
			<h2 class="text-center">회원가입</h2>
		</div>
		<div class="joinCenter row">
			<form action="${context}/member/join" method="post" name="joinForm" class="form-horizontal">
				<fieldset class="joinField">
					<div class="form-group">
					 	<label for="input_id" class="col-sm-4 control-label">아이디</label>
					 	<div class="col-sm-4">
							<input type="text" class="form-control" id="id" name="id" placeholder="아이디를 입력하세요"/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_pw" class="col-sm-4 control-label">비밀번호</label>
					 	<div class="col-sm-4">
							<input type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력하세요"/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_name" class="col-sm-4 control-label">이름</label>
					 	<div class="col-sm-4">
							<input type="text" class="form-control" id="name" name="name" placeholder="이름을 입력하세요"/>
						</div>
					</div>
					
					<div class="input_button text-center">
						<input type="button" id="joinButton" class="btn btn-primary" value ="회원가입" onclick="joinMember()"/>
						<a class="btn btn-primary" href="${context}/" role="button">취소</a>
					</div>
						
				</fieldset>
			</form>
		</div>
	</div>
	<script type="text/javascript">

	function joinMember(){
		
		if (document.joinForm.id.value=='') {
			alert('아이디를 입력해주세요');
			document.joinForm.id.focus();
		} else if(document.joinForm.name.value=='') {
			alert('이름을 입력해주세요');
			document.joinForm.password.focus();
		} else if(document.joinForm.password.value=='') {
			alert('비밀번호를 입력해주세요');
			document.joinForm.password.focus();
		}else{
			document.joinForm.submit();
			return true;
		}
	}
	</script>
</body>
</html>