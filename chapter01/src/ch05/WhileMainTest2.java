package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
	// 상수를 써보자
		
		final int VALUE = 100;
		int num1 = 1;
		int sum1 = 0;
		
		while(num1 <= VALUE ) {
			sum1 = sum1 + num1;
			num1++;
		}
		System.out.println("결과값 :" + sum1);
		
		
		
		System.out.println("---------------------------------------------");
		
		// 상수에 담는 값을 스캐너를 사용해서 코드를 수정해 주세요.
//		System.out.println("성적을 입력해 주세요: ");
//		Scanner scanner = new Scanner(System.in);
//		int point = scanner.nextInt();
	
		System.out.println("덧셈 값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		
		
		final int LIMIT_VALUE1 = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE1) {
			
			sum = sum + num;
			num++;
			
		}
		System.out.println("결과값 :" + sum);
		
	}
}
