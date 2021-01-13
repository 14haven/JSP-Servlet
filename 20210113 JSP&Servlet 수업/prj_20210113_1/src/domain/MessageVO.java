package domain;

import java.util.Arrays;

public class MessageVO {

	private String message;
	private String writer;
	private String password;
	private String kind;
	private String phone;
	
	
	public MessageVO() {} // 생성자 오버로딩 할때 기본생성자 반드시 있어야 한다.
	
	 
	// 복사 생성자
	// DTO -> VO (형변환)
	// front(html/jsp) -> DTO -> VO -> DAO CRUD 메서드를 통해 -> DB에 저장
	public MessageVO(MessageDTO dto) {
		
		// 1:1 대응 인자들
		this.writer =  dto.getWriter();
		this.message = dto.getMessage();
		this.password = dto.getPassword();
		
		// 다:1 대응 인자들(가공)
		// 배열 -> 문자열
		// ex) ["스포츠", "문화" , "사회"] (배열) = " 스포츠", "문화", "사회" (문자열로) 
		this.kind = this.toString(dto.getKind()); 
		
		// 문자열들 병합해서 -> 문자열
		// ex) 010, 1234, 5678 -> 010-1234-5678 (DB)
		this.phone = dto.getPhone1()+"-"+
					dto.getPhone2()+"-"+
					dto.getPhone3();
	}
	
	// 형변환은 to~로시작함
	// 문자열 배열 => 문자열
	// ex) ["스포츠", "문화","사회"] (배열) = " 스포츠" "문화" "사회" (문자열로) 
	private String toString(String[] kind) {
			
		// 1) ["스포츠", "문화","사회"] 이런식으로 통으로 저장
		// return Arrays.asList(kind).toString(); // kind가 List로 변환이 됨 -> toString메소드 써서 문자열로 변환
		
		// 2) 스포츠 문화 사회 
		String result = "";
		for(String s : kind) { // for each문 써서 한 문자열로 변환
			result += s + " ";	
		}
		return result;
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return String.format("MessageVO [message=%s, writer=%s, password=%s, kind=%s, phone=%s]", message, writer,
				password, kind, phone);
	}
	
	
	
}
