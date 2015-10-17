<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head><title>글쓰기</title>
<script src="js/board.js"></script>
</head>
<body>
<form action="insertat" method="post">
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