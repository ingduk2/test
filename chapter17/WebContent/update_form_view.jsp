<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head><title>�����ϱ�</title></head>
<body>
<form action="update" method="post">
<input type="hidden" name="article_id" value="${article_id}">
<s:iterator value="vo">
����: <input type="text" name="title" size="20" value="${title}"/> <br/>
�ۼ���: <input type="text" name="writer_name" size="20" value="${writer_name}"/><br/>
�۳���: <br/>
<textarea name="content" cols="40" rows="5">${content}</textarea>
</s:iterator>
<br/>
<input type="submit" value="����"/>
</form>
</body>
</html>