<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title>UPDATE</title>
</head>
<body>
	<div id="update">
		<div class="updateTop">
			<h2 class="text-center">회원정보수정</h2>
		</div>
		<div class="updateCenter row">
			<form action="${context}/member/update" method="get" name="updateForm" class="form-horizontal"> 
				<fieldset class="updateField">
					<div class="form-group">
					 	<label for="input_id" class="col-sm-4 control-label">ID</label>
					 	<div class="col-sm-4">
							<input type="text" class="form-control" id="userid" name="userid" value="${member.userid}" readonly/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_pw" class="col-sm-4 control-label">PASSWORD</label>
					 	<div class="col-sm-4">
							<input type="password" class="form-control" id="password" name="password"/>
						</div>
					</div>
					<div class="form-group">
						<label for="input_name" class="col-sm-4 control-label">NAME</label>
					 	<div class="col-sm-4">
							<input type="text" class="form-control" id="name" name="name" value="${member.name}"/>
						</div>
					</div>
					<div class="input_button text-center">
						<input type="button" id="updateButton" class="btn btn-primary" value ="UPDATE" onclick="updateMember()"/>
						<input type="button" id="updateButton" class="btn btn-primary" value ="WITHDRAWAL" onclick="withdrawalMember()"/>
						<a class="btn btn-primary" href="${context}/board/boardList" role="button">CANCEL</a>
					</div>					
				</fieldset>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function updateMember() {
			alert('정보수정');
			document.updateForm.submit();
		}
		function withdrawalMember() {
			alert("아직 미완성");
		}
	</script>
</body>
</html>

    
