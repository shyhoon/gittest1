        package ch05;

import java.util.Scanner;

public class ContinueTest {

	
	public static void main(String[] args) {
		
		// 예약어 continue
		// 무시하고 진행하는 continue
		
		int num1;
		int count1 = 0;
		
		for (num1 = 1; num1 < 11; num1++) {
			
			//3의 배수이면 출력하지 마시오.  어떤값 %3 == 0 --> 3의 배수란 뜻 3으로 나눴을때 나머지가 없단 말이니까
			if(num1 %3 == 0) {
				count1++;
				continue;
				
			}
			System.out.println("출력 값 : "+ num1);
		}
		System.out.println("출력 값 : "+num1);
		System.out.println("3의 배수의 개수 : " + count1);
		
		
		
	
		
		// 상수를 적용하여 활용성을 높여보세요. 치환연습을 잘해야한다.
		// 스캐너 이용해서 MAX 값, MULTIPLE값 받아서  프로그램을 완성해 주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MAX 값 입력 :");
		final int MAX = sc.nextInt();
		System.out.println("배수값 입력 : ");
		final int MULTIPLE = sc.nextInt();
		final int MIN = 21;
		
		int num;
		int count =  0;
		
		for (num = MIN; num < MAX; num++ ) {
			
		
			if (num % MULTIPLE == 0) {
				count++;
				continue;
				
			}//end of if
			
		}// end of for
		
		
		System.out.println(MULTIPLE + "의 배수의 개수 : " + count);
		

		
		
	}//end of main
}// end of class
