package ex1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
/*
		int i = 10;
		double d = 20.5;

		// 1
		// 두 수를 덧셈 연산 하여 result1 변수에 담고
		// 결과값 30.5를 출력 하세요.

		double result1 = (i+d);
		System.out.println(result1);
		
		// 2
		// result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
		// 단 변수에 저장하지 말고 수행해주세요.
		System.out.println((int)result1);
		
		
		// 3
		// i 변수의 값을 -1을 뺀 후 출력하세요
		// 단, 단항 연산자 사용 - 감소연산자(복합 대입 연산자는 단항 연산자가 아니기에 될 수 없다)
		
		i--;
		System.out.println(i);
		
		// 4
		// d 변수에 값을 -20.5로 출력 하세요
		// 단, d 변수에 값을 변경하지 마세요
		
		System.out.println(-d);+
		
		// 5
		// 변수 i와 d, 관계 연산자를 사용해서 result2 변수를
		// 선언하고 변수에 true 값이 담기도록 식을 만들고
		// 출력하세요
		
		boolean result2 = (i<d);
		System.out.println(result2);
		
		// 6
		// 변수 result3을 선언하고
		// num1과 num2 변수가 숫자 50보다 큰지 논리 연산자를 사용해서 결과를 담고 출력하세요
  
		int num1 = 30;
		int num2 = 50;
		
		boolean result3 = (num1 >= 50 && num2<=50 );
		System.out.println(result3);
		
		// 7
		// num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
		// max 변수에 값을 담고 출력해주세요
		// 단, 선언과 초기화를 동시에 해주세요

		int max = (num1 < num2 ) ? num2 : num1;
				System.out.println(max);
		
		// 8
		// if 문을 사용해서 학점을 출력해 주세요.(사용자가 점수를 입력하게 만들기)
		// 100 ~ 90 --> A
		// 90 ~ 80 --> B
		// 80 ~ 70 --> C
		// 70 ~ 60 --> D
		// 60 ~ 0 --> F
				
		System.out.println(" 점수를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		
		int testscore = sc.nextInt();
		char result = 'Z';
		if ( (testscore <=100) && (testscore >= 90)) {
			result = 'A';
		}else if ((testscore<90) && (testscore >=80)) {
			result = 'B';
		}else if ((testscore<80) && (testscore >=70)) {
			result = 'C';
		}else if ((testscore<70) && (testscore >=60)) {
			result = 'D';
		}else if ((testscore<60) && (testscore >=0)) {
			result = 'F';
		}
		if(result != 'Z') {
			System.out.println("당신의 점수는" +result+ "입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		// 9 
		// 1~10까지 화면에 출력 나머지 연산자 % <-- 7 == 0이면 멈춰라
		// i == 7 --> 수정 // i 나머지 연산의 결과가 0이면 멈춰라
		for(int c =1; c <11 ; c++) {
			
			if(c %7==0) {
				
				break;
			}
			System.out.println(c);
		}
		int e;
		do {
			for(e= 1 ; e < 11 ; e++)
			System.out.println(e);
		}while(e%11 != 0) ;       								// -->for문이 끝나기전까지 계속 for문에서 돌기때문에 while문에 올때는 e는 11이되어이;ㅆ다.  
	
		// 10 다시
		// 3의 배수이면 출력하지 마시오.
		// 11
		// 상수를 적용하여 활용성을 높여보세요. 치환연습을 잘해야한다.
		// 스캐너 이용해서 MAX 값, MULTIPLE값 받아서 프로그램을 완성해 주세요.

	Scanner sc1 =  new Scanner(System.in);
		final int MAX = sc1.nextInt();             				//--> 상수선언할때 final 다음에 데이터타입을 적어줘야한다.
		int c ;
		final int MULTIPLE = sc1.nextInt();
		for(c=1 ; c<MAX ; c++) {
			
			if(c% MULTIPLE != 0) {
				System.out.println(c);
			}
		}
		
		
		// 12
		// for문을 이용해서 1부터 10까지 덧셈 연산

		for(int a = 1 ;  a <11 ; a++) {
			System.out.println(a);
		}
		
		// 13
		// 구구단 8단을 출력해주세요

		int num = 8;
		
		for (int a = 1; a < 10; a++) {
			System.out.println(num+"*"+ a +"=" +(num * a));
		}
		
		// 14
		// 이중 for 문으로 구구단 2~9까지 출력해 주세요.

		for(int a= 2; a < 10; a++) {
			
			for(int b = 1; b < 10; b++) {
				System.out.println(a + " * " + b + " = " + (a*b));
				
			}
			
		}
		
		// 15 다시
		// 사용자가 0을 입력하면 프로그램을 종료 시켜라
		// 사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경시켜라
		// do ~ while
		// 스캐너를 사용 해서 사용자에 입력값을 받아서 덧셈 연산을 해주세요.
		// 연산에 결과를 화면에 출력하는 프로그램을 만들어주세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int a;                                						//--> do while문 밖에서 변수 초기화를 
																	//해버리면 do문 안에서 0이 입력되지않고 첫 숫자로만
																	//계속 멤돌아서 끝나지 않는다 
		int sum = 0;
		do {
			a = sc.nextInt();
			sum += a;
			
		}while(a != 0); 
			System.out.println("연산의 결과는"+sum+"입니다.");
		
		
		// 16
		// 1. 반환 값이 없는 함수 설계하기                         //-> 함수생성은 메인함수에서 하면안되고 클래스에서만 해야한다. 함수사용은 메인에서
			
			public static void name (String name) {
				System.out.println(name);
				
			}

		
			
		// 17
		// 2. 매개 변수가 없는 함수 만들기 -> 반환값 있음
			public static int result () {
				int sum = 0;
				int i;
				for (i = 0; i <= 100; i++) {
					sum += i;
				}
				return sum;
			}
			
		// 18
		// 3. 반환값이 있고 매개변수를 받는 함수 만들기

		public static int sum (int num1 , int num2) {
			int sum = 0;
			sum = num1 + num2;
			return sum;
		}
		
		// 19
		// 4. 리턴값 int , 매개변수 n1 , n2 , n3 , 이름 -> intAdd

		public static int intAdd (int n1, int n2, int n3) {
			
		
			
		}
		
		// 20
		// 5. 리턴값 double 매개변수 d1, d2 이름은 -> doubleAdd

		public static double doubleAdd (double d1, double d2) {
			int sum;
			sum = d1+d2;
			return sum;
			
		}
	
		// 21
		// 6. 리턴값 없음, 매개변수 String article 함수 이름은 -> printArticle

		public static void printArticle (String article) {
			System.out.println(article);
		}
		
		// 22
		// 함수의 사용도 같이 하기
		
			*/
		// 23
		// 1. 시험을 친다.
		// ex) 이순신 학생이 시험을 친다.(멤버 변수를 선언하고 메서드를 만들어보시오)

		// 24
		// 학생이 버스를 탄다라는 객체상호작용 프로그래밍 만들기

	}

}
