<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="domain.MessageDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	
	out.println("작성자 : "+request.getParameter("writer")+"<br>");
	out.println("메시지 : "+request.getParameter("message")+"<br>");

%> 
	<hr>
	<jsp:useBean id="messageDTO" class="domain.MessageDTO"/>
		
	<%-- <jsp:setProperty name="messageDTO" property="message" />
	<jsp:setProperty name="messageDTO" property="writer" /> --%>
	
	<jsp:setProperty name="messageDTO" property="*" />
	<br>
	- 작성자 : <jsp:getProperty name="messageDTO" property="writer" /> 
	<br>
	- 메시지 : <jsp:getProperty name="messageDTO" property="message" /> 

</body>
</html>