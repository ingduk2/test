<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head><title>�� �б�</title></head>
<body>
<table>
<s:iterator value="vo">
<tr>
	<td>����</td>
	<td><s:property  value="title"/></td>
</tr>
<tr>
	<td>�ۼ���</td>
	<td><s:property  value="writer_name"/></td>
</tr>
<tr>
	<td>�ۼ���</td>
	<td><s:property  value="posting_date"/></td>
</tr>
<tr>
	<td>����</td>
	<td>
		<pre><s:property  value="content"/></pre>
	</td>
</tr>

<tr>
	<td colspan="2">
	<a href="list">��Ϻ���</a>
	<a href="">�亯����</a>
	<a href="read?article_id=${article_id}">�����ϱ�</a>
	<a href="delete?article_id=${article_id}">�����ϱ�</a>
	</td>
</tr>
</s:iterator>
</table>
</body>
</html>