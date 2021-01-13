package domain;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MessageDTO {

	private String message;
	private String writer;
	private String password;
	private String kind[];
	private String phone1;
	private String phone2;
	private String phone3;

	
	public MessageDTO() {}
	
	// request (인자들:map) =>DTO
	public MessageDTO(Map<String, String[]>map) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Set<String> set = map.keySet(); // 인자명들
		System.out.println("전송 인자명들 : ");
		set.forEach(x->System.out.println(x));
		System.out.println("-----------------");
		
		Iterator<String> it = set.iterator();
		// 멤버 필드 검색용(reflection)
		Field field;
		while(it.hasNext()) {
			String key = it.next(); // 인자명
			// ex) 인자명(writer)
			// this.writer = map.get(key)[0];
			// 그러면 인자명(writer)을 가진 멤버 변수를 어떻게 검색(추출)할 수 있는가?
			// 이때 쓰는 것이 reflection
			// howto) relection 활용 -> ReflectionTest.java 참고
			
			field = this.getClass().getDeclaredField(key); // this -> 이 객체 (MessageDTO)
			field.setAccessible(true); // 접근 허용
			// 배열/ 낱개의 인자 구별
			if(key.contentEquals("kind")) { // 배열(kind)
				field.set(this, map.get(key));
				
			}else { // 낱개	
				field.set(this, map.get(key)[0]); // 멤버 필드에 값을 대입
			// this.writer = map.get(key)[0]; 과 같은 의미
			} // if
		} // while
	} // 복사 생성자
	
	
	public String[] getKind() {
		return kind;
	}

	public void setKind(String[] kind) {
		this.kind = kind;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	@Override
	public String toString() {
		return String.format(
				"MessageDTO [message=%s, writer=%s, password=%s, kind=%s, phone1=%s, phone2=%s, phone3=%s]", message,
				writer, password, Arrays.toString(kind), phone1, phone2, phone3);
	}
	
}
