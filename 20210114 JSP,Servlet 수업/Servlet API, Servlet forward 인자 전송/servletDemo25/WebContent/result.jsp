<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- servlet => 인자 전송  -->

<!-- 방법1 -->
result1 : <%=request.getAttribute("java") %><br> 
<!-- 방법2 -->
result1 : ${java}<br>
<!-- 방법3 -->
<!-- requestScope EL(Expressional Language)의 request(요청 처리 객체)에 해당되는 기본 객체 -->
result1 : ${requestScope.java}<br>

result2 : <%=request.getAttribute("jsp") %><br>
result2 : ${jsp}<br>
result2 : ${requestScope.jsp}<br>
</html>