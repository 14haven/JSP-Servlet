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
	// 인자 인코딩 처리/변환
	request.setCharacterEncoding("UTF-8");

	// MessageDTO dto = new MessageDTO();
	MessageDTO dto = new MessageDTO(request.getParameterMap());
	// DB 저장
	MessageVO messageVO = new MessageVO(dto);
	// 인자 확인
	out.println("messageVO : "+messageVO);
	// MessageVO messageVO = new MessageVO(dto);
	// dao.insertMessage(messageVO);
	
	
	// 한줄로 쓰기
	// dao.insertMessage(new MessageVO(new MessageDTO(request.getParaemterMap())));
%> 
	

</body>
</html>