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
	// 인자 처리
	// 인코딩 방식 지원 선처리
	// 참고 ) EUC-KR(표준 완성형 :KSC-5691) -> MS-949(x-window-949) 호환된다
	// MS-949가 EUC-KR 체계를 포함
	// 참고 ) UTF-8 : http://www.unicode.org/chars/PDF/UAC00.pdf
	// 기본 인코딩 : ISO-8859-1 (서유럽어) -> 변환 필요
	request.setCharacterEncoding("UTF-8");
	// POST 방식 전용 인코딩 변환(적용), GET 방식과는 상관 없다.
	// 추후에는 주로 필터(filter)로 선처리하는 경향 !
	// 참고) Tomcat 8 이후에는 get 방식 인자 한글 처리는 자동 !
	// 이전 버전은 수동 변환 처리 해야 됨.
	// ex) String.getByte 메서드 활용, server.xml
	// <Connectior URIEncoding="UTF-8" /> 로 처리 (서버 차원에서 처리: 모든 프로젝트에 적용됨)
	
	// POST 방식 전
	// request : 클라이언트 요청 처리 기본(내장) 객체
	// 원형 : HttpServletRequest
	// 인자 수신
	// out : 웹브라우저 출력 처리 JSP 기본(내장) 객체 
	// 원형 : JspWriter
	out.println("인자 : "+request.getParameter("message"));
	
	// 인자 수신 : DTO 단위
	// <jsp:useBean /> 액션 태그(xml)
	// java code 비교)
	// domain.MessageDTO messageDTO = new domain.MessageDTO();
	MessageDTO messageDTO2 = new MessageDTO();
%>

	<%--<jsp:useBean id="messageDTO" class="domain.MessageDTO"/> --%>
	<jsp:useBean id="messageDTO" class="domain.MessageDTO"></jsp:useBean>
	<!-- setter 역할 : 인자 입력 -->
	<jsp:setProperty name="messageDTO" property="message" />
	<%
		messageDTO2.setMessage(request.getParameter("message"));
	%>
	<!-- getter 역할 : 인자 출력 -->
	<br>
	- message : <jsp:getProperty name="messageDTO" property="message" /> 
	<br>
	- message2 : <%=messageDTO2.getMessage() %>
</body>
</html>