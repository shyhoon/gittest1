package ch01;

public class DataType1 {
	
	//메인함수  코드의 시작점
	public static void main(String[] args) {
		
		// 데이터 타입 종류
				// 1. 기본 자료형(primivive data type)
				// 2. 참조 타입(Reference Type)

				// 기본 자료형
				// 정수형 문자형 실수형 논리형(4가지 존재)

				// 정수형-수를 표현할수있는 데이터 타입(1,10,100)

				byte b; // 1바이트 (8비트)
				short s; // 2바이트 (16비트)
				int i; // 4바이트 (32비트) 기억하기
				long l; // 8바이트 (64비트)

				b = 127;
				// b = 128;
				b = -128;

				// int의 수의 표현 범위
				i = 2100000000;
				i = -210000000;

				l = 2200000000L; // 접미사 (대문자 L 또는 소문자ㅣ을 사용할 수 있다 가능한 대문자 사용)

				i = 10;
				System.out.println(i);

				i = 300;
				System.out.println(i);
		
		
				
		
	}// end of main

}// end of class
