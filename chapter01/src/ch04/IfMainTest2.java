package ch04;

import java.util.Scanner;

public class IfMainTest2 {
//메인함수
	public static void main(String[] args) {

		System.out.println("성적을 입력해 주세요: ");

		Scanner scanner = new Scanner(System.in);

		int point = scanner.nextInt();
		char result = 'Z';

		// 문제 1. if 문을 사용해서 학점을 출력해 주세요.
		// 100 ~ 90 --> A
		// 90 ~ 80 --> B
		// 80 ~ 70 --> C
		// 70 ~ 60 --> D
		// 60 ~ 0 --> F

		if(point <= 100 &&  point >=90) {
			result='A';
		}else if (point < 90 &&  point >=80) {
			result='B';
		}else if (point < 80 &&  point >=70) {
		result='C';
		}else if (point < 70 &&  point >=60) {
			result='D';
		}else if( point <60 && point >=0) {
		result='F';
		}else {
			System.out.println("잘못된 입력입니다.");
			}
		if (result != 'Z') {
		System.out.println("당신의 학점은: "+result+ "입니다.");
		}
		
		
		
		
		if (point <= 100 && point >= 90) {
			result = 'A'; // System.out.println(" 우리의 학점은:" + result + "입니다."); 이런 코드는 수정이나 양면에서 효율성에서 떨어질
							// 수 있다
		} else if (point < 90 && point >= 80) {
			result = 'B';
		} else if (point < 80 && point >= 70) {
			result = 'C';
		} else if (point < 70 && point >= 60) {
			result = 'D';
		} else if (point < 60 && point >= 0) {
			result = 'F';                                    //값만 변경된것 출력은 X
//		} else {
//			System.out.println(result = '오류');
		}
		// 둘다 참일경우 여야하므로 논리연산자에서 논리곱이 들어가야한다
					// 입력이 잘못 되었때를 대비해서 방어코드를 작성 할 수 있어야한다
					// else는 조건식이 필요없고 수행문만 적어주면 된다.
		if (result != 'Z') {
			System.out.println("당신에 학점은 : " + result + "입니다. "); //값이 출력
		} else {
			System.out.println("입력을 잘못 하였습니다.");
			}
	}// end of main
}// end of class
