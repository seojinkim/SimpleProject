<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${context}/board/insertBoard" method="post" name="insertBoardForm">
제목<input type="text" id="title" name="title" />
본문<input type="text" id="context" name="context"/>
<input type="button" value="글쓰기" onclick="writeBoard()"/>
</form>
<input type="hidden" id="id" value="${sessionScope.member.id}"/>
<script type="text/javascript">
function writeBoard(){
	
	if (document.insertBoardForm.title.value=='') {
	alert('제목를 입력해주세요');
	document.insertBoardForm.title.focus();
	} else if(document.insertBoardForm.context.value=='') {
	alert('본문을 입력해주세요');
	document.insertBoardForm.context.focus();
	} else { 
		document.insertBoardForm.submit();
		return true;
	}
}
</script>
</body>
</html>