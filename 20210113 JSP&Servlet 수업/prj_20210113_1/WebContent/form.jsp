<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	
<!--<form name="frm" method="post" action="action.jsp">  -->
<form name="frm" method="post" action="action6.jsp">

	작성자 : <input type="text" name="writer" /><br>
	패스워드 : <input type="password" name="password" /><br>
	메시지 : <input type="text" name="message" /><br>
	분류 : 스포츠 <input type="checkbox" name="kind" value="스포츠">&nbsp;
	문화 <input type="checkbox" name="kind" value="문화">&nbsp;
	사회 <input type="checkbox" name="kind" value="사회"><br>
	연락처 : <input type="text" name="phone1">-
		   <input type="text" name="phone2">-
		   <input type="text" name="phone3"><br>
	<input type="submit" value="전송"/>
	
</form>
</body>
</html>