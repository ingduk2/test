<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head><title>�۾���</title>
<script src="js/board.js"></script>
</head>
<body>
<form action="insertat" method="post">
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