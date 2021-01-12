<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*, domain.MessageDTO" %>
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
	
	Map<String, String[]> map
	 = request.getParameterMap();
	// Map => 키/값 (pair) 구조	
	// ex) 아이디/패쓰워드 , 우편번호/기본 구조 , 전화번호(지역번호) / 지역..
	// ※ 인자의 이름 / 값이 key 값 구조가 될 수 있다.
	
	
	// 방법1
	Set<String> set = map.keySet();
	Iterator<String> it = set.iterator(); // 다음(next) 요소 검색 : 반복자 디자인 패턴 방식 
	
	while(it.hasNext()){ // 다음 요소 유무 검사 (반복문)
		String key = it.next(); // 인자를 구하자
		String[] value = map.get(key); // 값을 구하자
		
		if(value.length == 1) { // 키/값 = 1:1
			out.println("인자 이름 : "+key+", 값 : "+value[0]);
		}else if (value.length>1){ // 키/값 = 1:n ex) checkbox
			for(String s : value){
				out.println("인자 이름 : "+key+", 값 : "+s+"<br>");
			}
		}
		out.println("인자 이름 : "+key+", 값 : "+value[0]+"<br>");
	}
	
	// 방법2
	// map.forEach((x,y)->System.out.println(x+"="+y[0]));
	
	
	
	// getParameterValues 사용하기
	 out.println("분류 : ");
	
	// 방법 1
	/* String kinds[] = request.getParameterValues("kind");
	
	if(kinds == null){
		out.println("<script>alert('kind인자를 체크해주세요')</script>");
	}
	for(String s : kinds){
		out.print(s+"");
	} */

	// 방법 2
	if(request.getParameterValues("kind") == null){
		out.println("<script>alert('kind인자를 체크해주세요')</script>");
	}else{
		String kinds[] = request.getParameterValues("kind");
		for(String s : kinds){
			out.print(s+"");
		
	}
	
%> 
	

</body>
</html>