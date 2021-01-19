<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<%
	// 실제 파일 저장 영역 경로 획득
	String uploadPath=request.getRealPath("/upload");
	// application.getRealPath("/upload"); 해도 가능
	// 절대 경로라면?
	// String uploadPath = "c:\\upload"; 역슬래쉬 2개 써줘야 함
	// file:///C://upload 
	
	int size=10*1024*1024; // 전송 한계량(10MB)
	String name="";
	String subject="";
	String filename1="";
	String filename2="";
	String origfilename1="";
	String origfilename2="";
	
	try{
		// API reference) 
        // : http://servlets.com/cos/javadoc/com/oreilly/servlet/MultipartRequest.html
		MultipartRequest multi=new MultipartRequest(request,
											uploadPath,
											size, 
											"UTF-8",
								new DefaultFileRenamePolicy());

		name=multi.getParameter("name");
		subject=multi.getParameter("subject");
		
		Enumeration<String> files=multi.getFileNames();
		
		String file1 =(String)files.nextElement();
		filename1=multi.getFilesystemName(file1);
		origfilename1= multi.getOriginalFileName(file1);
		
		String file2 =(String)files.nextElement();
		filename2=multi.getFilesystemName(file2);
		origfilename2=multi.getOriginalFileName(file2);
		
	} catch(Exception e) {
		System.out.println("파일 저장 문제 발생");
		e.printStackTrace();
	} 
%>
<html>
<body>

<form name="filecheck" action="fileCheck.jsp" method="post">
	<input type="hidden" name="name" value="<%=name%>">
	<input type="hidden" name="subject" value="<%=subject%>">
	<input type="hidden" name="filename1" value="<%=filename1%>">
	<input type="hidden" name="filename2" value="<%=filename2%>">
	<input type="hidden" name="origfilename1" value="<%=origfilename1%>">
	<input type="hidden" name="origfilename2" value="<%=origfilename2%>">
</form>

<a href="#" onclick="javascript:filecheck.submit()">업로드 확인 및 다운로드 페이지 이동</a>

</body>
</html>
