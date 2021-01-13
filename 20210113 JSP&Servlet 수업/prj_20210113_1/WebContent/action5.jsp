<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*, domain.MessageDTO, domain.MessageVO"%>
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

	// 인자와 값을 한번에 받는 방법은 없을까? -> Map을 사용해도 되지만 이것 또한 번거롭다.
	// MessageDTO, MessageVO 사용
	
	
	MessageDTO dto = new MessageDTO();
	
	dto.setWriter(request.getParameter("writer"));
	dto.setMessage(request.getParameter("message"));
	dto.setPassword(request.getParameter("password"));
	dto.setKind(request.getParameterValues("kind"));
	dto.setPhone1(request.getParameter("phone1"));
	dto.setPhone2(request.getParameter("phone2"));
	dto.setPhone3(request.getParameter("phone3"));
	
	// DB 저장
	MessageVO messageVO = new MessageVO(dto);
	// 인자 확인
	out.println("messageVO : "+messageVO);
	// MessageVO messageVO = new MessageVO(dto);
	// dao.insertMessage(messageVO);
	
	

%> 
	

</body>
</html>