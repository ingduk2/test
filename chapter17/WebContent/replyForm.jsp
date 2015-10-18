<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>replyForm.jsp</title>
	
	<script src="js/board.js"></script>
</head>

<body>
	<form action="reply_in" method="post">
	
		<!--  다음 페이지로 이동할때 답변글에 대한 처리를 해주기 위해서, 답변글에 대한 정보를 갱신한 후 폼의 히든 값으로 전송을 한다. -->
		<input type="hidden" name="ref" value="${ref}" />
		<input type="hidden" name="seq" value="${seq+1}" />
		<input type="hidden" name="lvl" value="${lvl+1}" />
	
		제목: <input type="text" name="title" size="20"/> <br/>
		작성자: <input type="text" name="writer_name" /> <br/>
		글암호: <input type="password" name="password" /> <br/>
		글내용: <br/>
		<textarea name="content" cols="40" rows="5"></textarea>
		<br/>
		<input type="submit" value="전송" onclick="goUrl('list')" />
		<input type="button" value="리스트" onclick="goUrl('list')" />
	</form>
</body>
</html>