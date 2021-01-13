package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import domain.MessageDTO;

public class ReflectTest {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		
		// reflection 테스트
		
		MessageDTO messageDTO = new MessageDTO();
		
		// 1) 필드로 접근
		// "writer"라는 이름의 멤버 필드에 "java"라는 값을 대입
		Field field 
			= messageDTO.getClass().getDeclaredField("writer");
		field.setAccessible(true); // 필드 접근 권한 획득
		field.set(messageDTO, "java");
		
		//////////////////////////////////////////////
		
		
		// 2) 메서드로 접근
		// "writer"라는 이름의 멤버 필드에 해당하는 setWriter 메서드를 통해
		// "java" 라는 값을 대입
		Method method 
			= messageDTO.getClass().getDeclaredMethod("setWriter", String.class);
		method.invoke(messageDTO, "python");
		
		System.out.println("writer : "+messageDTO.getWriter());
	}

}
