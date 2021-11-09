package ch05;

import java.util.Scanner;

public class WhileMainTest4 {
//메인함수
	public static void main(String[] args) {
		
		//사용자가 0을 입력하면 프로그램을 종료 시켜라
		//사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경시켜라
		
		
		
		// do ~ while
		// 스캐너를 사용 해서 사용자에 입력값을 받아서 덧셈 연산을 해주세요.
		// 연산에 결과를 화면에 출력하는 프로그램을 만들어주세요.
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int num1;
		do { 

			//			System.out.println("현재값 : " + num1);
			System.out.println("숫자를 입력해주세요");
			num1 = scanner.nextInt();
			sum += num1;
			
		} while (num1 != 0);
			
			System.out.println("연산의 결과는 : " +sum+ "입니다.");
		
			// 회수가 정해진 방법
			
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println("숫자를 입력해주세요");
//			num1 = scanner.nextInt();
//		sum += num1;
//			
//		}
//		System.out.println("연산의 결과는 : " +sum+ "입니다.");
		
		
		
	}//end of main
	
}//end of class
