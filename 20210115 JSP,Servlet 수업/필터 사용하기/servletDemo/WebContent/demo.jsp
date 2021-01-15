<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
<% // scriptlet(스크립트릿) JEE(JSE 포함) java 프로그램 코드
	
%>
계산결과 : <%=1+2+3+4%><br>
<!-- 프로젝트 시작(최상위:root) 경로(path) -->
context path-1 : <%=request.getContextPath() %> <br>
context path-2 : ${pageContext.request.contextPath} <br>  

	<form method="post" 
		  action="<%=request.getContextPath() %>/demo.do">
		  <input type="text" name="java" />
    </form>
    
</body>
</html>