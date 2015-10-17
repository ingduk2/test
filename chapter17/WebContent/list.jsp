<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>게시글 목록</title></head>
<body>
<form method="post">
<table border="1">
	<tr>
		<td colspan="5">
		</td>
	</tr>
	<tr>vvvvvvv
		<td>글 번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	

<!-- 	<tr> -->
<!-- 		<td colspan="5"> -->
<!-- 			게시글이 없습니다. -->
<!-- 		</td> -->
<!-- 	</tr> -->
	<s:iterator value="list">	
	<tr>
		<td class="article_id"><s:property value="article_id"/></td>
		<td class="title"><a href="detail?article_id=${article_id}&hitup?article_id=${article_id}">
		<s:property value="title"/></a></td>
		<td class="writer_name"><s:property value="writer_name"/></td>
		<td class="posting_date"><s:property value="posting_date"/></td>
		<td class="read_count"><s:property value="read_count"/></td>
	</tr>
     </s:iterator>
     
	<tr>
		<td colspan="5">
			<a href="writeForm">글쓰기</a>
		</td>
	</tr>	
	
</table>
</form>
</body>
</html>