<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head><title>수정하기</title></head>
<body>
<form action="update" method="post">
<input type="hidden" name="article_id" value="${article_id}">
<s:iterator value="vo">
제목: <input type="text" name="title" size="20" value="${title}"/> <br/>
작성자: <input type="text" name="writer_name" size="20" value="${writer_name}"/><br/>
글내용: <br/>
<textarea name="content" cols="40" rows="5">${content}</textarea>
</s:iterator>
<br/>
<input type="submit" value="수정"/>
</form>
</body>
</html>