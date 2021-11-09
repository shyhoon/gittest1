package ch09;

import java.util.Random; // ctrl shift o 

public class MainTest2 {
	public static void main(String[] args) {
	
		// jdk가 만들어준 도구
		
		Random r = new Random();
		int value = r.nextInt(20); //0부터 입력된 정수 값중에서 랜덤으로 생성
		System.out.println("value : "+ value);
		
		
		
		
}
}
