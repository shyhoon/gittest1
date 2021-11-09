package ch03;

import java.util.Scanner;

public class MainTest6 {
public static void main(String[] args) {
	// 삼항 연산자 (가동성을 높여주고 편리하다 연습해서 꼭 익히자 )
	// 조건식 ? 결과1 : 결과2;
	
	int num1 = (5 > 3) ? 10 : 20;
	System.out.println(num1);
	
	int num2 = (5 < 3) ? 10 : 20;
	System.out.println(num2);
	
	//JDK 만들어준 도구를 이용해 봅시다.(Scanner-어떠한 입력값을 받을 수 있게해주는 도구)
	int max; 
	System.out.println("입력 받은 두 수중 큰 수를 출력 하세요.");
	Scanner scanner = new Scanner(System.in);// new라는 예약어다 (키워드)
	System.out.println("입력 1 : ");
	int x = scanner.nextInt();
	System.out.println("입력 2 : ");
	int y = scanner.nextInt();
	
	// 삼항 연산자 식
	max = ( x > y ) ? x : y;
	
	System.out.println("큰 숫자는 : " + max + " 입니다.");
	
}
}
