package koreait.day02;

public class C03_IntegerData {

	public static void main(String[] args) {
		
		System.out.println("Short 정수 데이터---------------");
		System.out.println("메모리 크기 : " + Short.BYTES + " 바이트"); // 
		System.out.println("short 정수의 최소값 : " + Short.MIN_VALUE);
		System.out.println("short 정수의 최대값 : " + Short.MAX_VALUE);
		
		System.out.println("Integer 정수 데이터---------------");
		System.out.println("메모리 크기 : " + Integer.BYTES + " 바이트"); // 
		System.out.println("Integer 정수의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("Integer 정수의 최대값 : " + Integer.MAX_VALUE);
		

	}

}

/* 정수 데이터 기본 형식은  byte, short, int, long 4가지 이며 
 * 				ㄴ 각각 메모리에 할당받는 크기(바이트 단위)와 그에 따른 값의 저장 범위가 결정됩니다.
 *  			ㄴ 변수를 사용할 때 쓸 키워드 (예약어 : 기능이 정해진 용도가 정해진 단어)
 * Byte, Short, Integer, Long 클래스는 정수 데이터 형식를 다루는 속성과 메소드를 갖는 클래스입니다.(Wrapper 래퍼 클래스)
 *		ㄴ 다음은 위 클래스들의 구성요소인 속성(필드)들 중 변하지 않는값(상수) 입니다. 대체로 대문자로 표기합니다.
			ㄴ BYTES, MIN_VALUE, MAX_VALUE
			
 *			※123, 200 리터럴은 int(4바이트) 형식입니다.※			
 */


