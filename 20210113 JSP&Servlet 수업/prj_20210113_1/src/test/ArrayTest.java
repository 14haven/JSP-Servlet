package test;

import java.util.Arrays;

import domain.MessageVO;


// 단위 테스트
public class ArrayTest {

	private String toString(String[] kind) {
		
		// 1) ["스포츠", "문화","사회"] 이런식으로 통으로 저장
		return Arrays.asList(kind).toString(); // kind가 List로 변환이 됨
		
	}
	
	
	public static void main(String[] args) {
	
		String [] arr = {"나연","다현","쯔위"};
		
		// 위에 적힌 메소드 사용
		// System.out.println(new ArrayTest().toString(arr));
		
		
		// MessageVO() 클래스에 있는 toString 메소드 사용
		// 1) [나연,다현,쯔위] (DB에 저장)
		// 2) 나연 다현 쯔위 
		// System.out.println(new MessageVO().toString(arr));
		
		
	}

}
