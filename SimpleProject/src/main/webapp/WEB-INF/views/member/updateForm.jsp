<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>UPDATE</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="update">
		<div class="updateTop">
			<h2 class="text-center">회원정보수정</h2>
		</div>
		<div class="updateCenter row">
			<form action="${context}/member/update" method="post" name="updateForm" class="form-horizontal">
				<fieldset class="updateField">
					<div class="form-group">
						<label for="input_id" class="col-sm-4 control-label">아이디</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="id" name="id"
								value="${member.id}" readonly />
						</div>
					</div>
					<div class="form-group">
						<label for="input_pw" class="col-sm-4 control-label">비밀번호</label>
						<div class="col-sm-4">
							<input type="password" class="form-control" id="password"
								name="password" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="input_name" class="col-sm-4 control-label">이름</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="name" name="name"
								value="${member.name}" required="required" />
						</div>
					</div>
					<div class="input_button text-center">
						<input type="button" id="updateButton" class="btn btn-primary"
							value="수정" onclick="updateMember()" />
						<input type="button"
							id="withdrawalButton" class="btn btn-primary" value="탈퇴"
							onclick="withdrawalMember()" />
					<a class="btn btn-primary"
							href="${context}/board/boardList" role="button">취소</a>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function updateMember() {
			if (document.updateForm.password.value == '') {
				alert('비밀번호를 입력해주세요');
				document.updateForm.password.focus();
			} else {
				alert('정보수정');
				document.updateForm.submit();
			}
		}
		function withdrawalMember() {
			var withdrawal = confirm('정말 탈퇴하시겠습니까?');
			if (withdrawal == true) {
				location.href = "withdrawal/${member.id}";
			}
		}
	</script>
</body>
</html>


