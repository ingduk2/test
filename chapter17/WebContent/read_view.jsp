<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<html>
<head><title>글 읽기</title></head>
<body>
<table>
<s:iterator value="vo">
<tr>
	<td>제목</td>
	<td><s:property  value="title"/></td>
</tr>
<tr>
	<td>작성자</td>
	<td><s:property  value="writer_name"/></td>
</tr>
<tr>
	<td>작성일</td>
	<td><s:property  value="posting_date"/></td>
</tr>
<tr>
	<td>내용</td>
	<td>
		<pre><s:property  value="content"/></pre>
	</td>
</tr>

<tr>
	<td colspan="2">
	<a href="list">목록보기</a>
	<a href="reply">답변쓰기</a>
	<a href="read?article_id=${article_id}">수정하기</a>
	<a href="delete?article_id=${article_id}">삭제하기</a>
	</td>
</tr>
</s:iterator>
</table>
</body>
</html>