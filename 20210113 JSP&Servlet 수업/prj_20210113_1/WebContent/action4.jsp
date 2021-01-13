<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*, domain.MessageDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action</title>
</head>
<body>
<%
	// 인자 인코딩 처리
	request.setCharacterEncoding("UTF-8");
	// 인자 일괄 처리(한꺼번에) 처리
	
	// 반복자 (디자인) 패턴 : 다음(next) 요소 검색 방식
	// 인덱스(index) 검색(X)
	Enumeration<String> en = request.getParameterNames();
	while(en.hasMoreElements()){
		String key = en.nextElement();
		String value = request.getParameter(key);
		
		if(key.equals("kind")){ // 체크박스(다수의 값)
			String[] vals = request.getParameterValues(key);
			for (String val : vals){
				out.println("인자명 : "+key+" = ");
				out.println("인자값 : "+val+ "<br>");
			}
		}else{
			out.println("인자명 : "+key+" = ");
			out.println("인자값 : "+value+ "<br>");
		}
	}
%> 
	

</body>
</html>