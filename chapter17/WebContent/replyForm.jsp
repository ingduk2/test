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
	
		<!--  ���� �������� �̵��Ҷ� �亯�ۿ� ���� ó���� ���ֱ� ���ؼ�, �亯�ۿ� ���� ������ ������ �� ���� ���� ������ ������ �Ѵ�. -->
		<input type="hidden" name="ref" value="${ref}" />
		<input type="hidden" name="seq" value="${seq+1}" />
		<input type="hidden" name="lvl" value="${lvl+1}" />
	
		����: <input type="text" name="title" size="20"/> <br/>
		�ۼ���: <input type="text" name="writer_name" /> <br/>
		�۾�ȣ: <input type="password" name="password" /> <br/>
		�۳���: <br/>
		<textarea name="content" cols="40" rows="5"></textarea>
		<br/>
		<input type="submit" value="����" onclick="goUrl('list')" />
		<input type="button" value="����Ʈ" onclick="goUrl('list')" />
	</form>
</body>
</html>