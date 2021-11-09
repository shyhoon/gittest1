package ex1;

import java.util.Scanner;

public class Answer {
/*
	int i = 10;
	double d = 20.5;

	// 1
	// 두 수를 덧셈 연산 하여 result1 변수에 담고
	// 결과값 30.5를 출력 하세요. -자동형변환, 산술연산자

	double result1 = i + d;System.out.println(result1);

	// 2
	// result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
	// 단 변수에 저장하지 말고 수행해주세요. - 강제형변환

	System.out.println((int)result1);

	// 3
	// i 변수의 값을 -1을 뺀 후 출력하세요
	// 단, 단항 연산자 사용 - 감소연산자(복합 대입 연산자는 단항 연산자가 아니기에 될 수 없다)

	i--; // i 변수의 값에서 1을 빼라는 명령어 이다.
	System.out.println(i);

	// 4
	// d 변수에 값을 -20.5로 출력 하세요
	// 단, d 변수에 값을 변경하지 마세요 - 부호 연산자

	System.out.println(-d);

	// 5
	// 변수 i와 d, 관계 연산자를 사용해서 result2 변수를
	// 선언하고 변수에 true 값이 담기도록 식을 만들고
	// 출력하세요 - 관계 연산자 , 논리형 데이터 타입을 생각해 낼 수 있는지

	boolean result2 = (i < d);System.out.println(result2);

	int num1 = 10;
	int num2 = 30;

	// 6
	// 변수 result3을 선언하고
	// num1과 num2 변수가 숫자 50보다 큰지 논리 연산자를 사용해서 결과를 담고 출력하세요
	// 논리연산자, 관계연산자, 논리형 데이터 타입

	boolean result3 = (num1 > 50) && (num2 < 50);System.out.println(result3);

	boolean result4 = ((num1 -= 3) > 45) && ((num2 += 10) < 50);System.out.println(result4); // f
	System.out.println(num1); // 7
	System.out.println(num2); // 30

	boolean result5 = ((num1 += 4) > 43) || ((num2 -= 3) > 20);System.out.println(result5); // t
	System.out.println(num1); // 11
	System.out.println(num2); // 27

	// 7
	// num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
	// max 변수에 값을 담고 출력해주세요
	// 단, 선언과 초기화를 동시에 해주세요

	int max = (num1 > num2) ? num1 : num2;
	// 데이터 타입이 int인 이유 - 최종적으로 레터럴의 값이 정수가 나오기 때문에 int를 적어줘야 한다.
	System.out.println(max);
	int max1 = (num1 < num2) ? num2 : num1;System.out.println(max1);

	// 8.
	// if 문을 사용해서 학점을 출력해 주세요.
	// 100 ~ 90 --> A
	// 90 ~ 80 --> B
	// 80 ~ 70 --> C
	// 70 ~ 60 --> D
	// 60 ~ 0 --> F

	System.out.println("성적을 입력해 주세요: ");

	Scanner scanner = new Scanner(System.in);

	int point = scanner.nextInt();
	char result = 'Z';

	if(point<=100&&point>=90)
	{
		result = 'A';
	}else if(point<90&&point>=80)
	{
		result = 'B';
	}else if(point<80&&point>=70)
	{
		result = 'C';
	}else if(point<70&&point>=60)
	{
		result = 'D';
	}else if(point<60&&point>=0)
	{
		result = 'F';
	}else
	{
		System.out.println("잘못된 입력입니다.");
	}if(result!='Z')
	{
		System.out.println("당신의 학점은: " + result + "입니다.");
	}
	// 9.
	// 1~10까지 화면에 출력 나머지 연산자 % <-- 7 == 0이면 멈춰라
	// i == 7 --> 수정 // i 나머지 연산의 결과가 0이면 멈춰라

	for(
	int i = 1;i<11;i++)
	{

		System.out.println(i);
		if ((i % 7) == 0) {

			break;
		}

		int num1;
		int count1 = 0;

		for (num1 = 1; num1 < 11; num1++) {

		}

		// 10
		// 3의 배수이면 출력하지 마시오. 어떤값 %3 == 0 --> 3의 배수란 뜻 3으로 나눴을때 나머지가 없단 말이니까
		if (num1 % 3 == 0) {
			count1++;
			continue;

		}
		System.out.println("출력 값 : " + num1);
	}System.out.println("출력 값 : "+num1);System.out.println("3의 배수의 개수 : "+count1);

	//11
	// 상수를 적용하여 활용성을 높여보세요. 치환연습을 잘해야한다.
	// 스캐너 이용해서 MAX 값, MULTIPLE값 받아서 프로그램을 완성해 주세요.

	Scanner sc = new Scanner(System.in);

	System.out.println("MAX 값 입력 :");
	final int MAX = sc.nextInt();System.out.println("배수값 입력 : ");
	final int MULTIPLE = sc.nextInt();
	final int MIN = 21;

	int num;
	int count = 0;

	for(num=MIN;num<MAX;num++)
	{

		if (num % MULTIPLE == 0) {
			count++;
			continue;

		} // end of if

	}// end of for

	System.out.println(MULTIPLE+"의 배수의 개수 : "+count);

	//12
	// for문을 이용해서 1부터 10까지 덧셈 연산
	// 연산에 담을 결과를 위해서 변수가 필요하다.
	int sum = 0;for(
	int i = 1;i<=10;i++)
	{
		sum += i; // sum = sum + i;
		System.out.println("i의 현재값 : " + i);
	}
	//13
	// 1. 8단을 출력해주세요

	num=8;for(
	int i = 1;i<=9;i++)
	{
		System.out.println(num + " * " + i + " = " + (num * i));
	}
	//14
	// 이중 for 문으로 구구단 2~9까지 출력해 주세요.

//				
	for(
	int num = 2;num<10;num++)
	{

		for (int num1 = 1; num1 < 10; num1++) {

			System.out.println(num + "*" + num1 + "=" + num * num1);

		}
		System.out.println();
	}

	//15
	// 사용자가 0을 입력하면 프로그램을 종료 시켜라
	// 사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경시켜라

	// do ~ while
	// 스캐너를 사용 해서 사용자에 입력값을 받아서 덧셈 연산을 해주세요.
	// 연산에 결과를 화면에 출력하는 프로그램을 만들어주세요.

	Scanner scanner = new Scanner(System.in);

	int sum = 0;
	int num1;
	do{

		// System.out.println("현재값 : " + num1);
		System.out.println("숫자를 입력해주세요");
		num1 = scanner.nextInt();
		sum += num1;

	}while(num1!=0);

	System.out.println("연산의 결과는 : "+sum+"입니다.");

	// 회수가 정해진 방법

//			for(int i = 0; i < 10; i++) {
//				
//				System.out.println("숫자를 입력해주세요");
//				num1 = scanner.nextInt();
//			sum += num1;
//				
//			}
//			System.out.println("연산의 결과는 : " +sum+ "입니다.");

	//16
	// 1. 반환 값이 없는 함수 설계하기
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	//17
	// 2. 매개 변수가 없는 함수 만들기 -> 반환값 있음

	public static int calcSum() {

		int sum = 0;
		int i;
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	//18
	// 3. 반환값이 있고 매개변수를 받는 함수 만들기
	public static double addNum(double n1, double n2) {

		double result = 0.0;
		result = n1 + n2;
		return result;

	}

	//19
	// 4. 리턴값 int , 매개변수 n1 , n2 , n3 , 이름 -> intAdd

	public static int intAdd(int n1, int n2, int n3) {

		int sum = 0;
		sum = n1 + n2 + n3;
		return sum;

		// int sum = n1 + n2 + n3;
		// return sum;

		// return n1 + n2 + n3; 도 가능

	}
	//20
	// 5. 리턴값 double 매개변수 d1, d2 이름은 -> doubleAdd

	public static double doubleAdd(double d1, double d2) {

		double sum = 0.0;
		sum = d1 + d2;// 돌아가는게 머릿속에 있어야 짤 수 있다.
		return sum;
	}

	//21
	// 6. 리턴값 없음, 매개변수 String article 함수 이름은 -> printArticle
//
////	//public static void printArticle(String article/* 매개 변수의 데이터타입이 string */ {
////		//System.out.println(article);
////	}
////
//	// 함수의 사용
//
//	int num1 = 10;
//	int num2 = 20;
//
//	double total = addNum(42.123, 10.5);System.out.println("total : "+total);
//
//	sayHello("반갑습니다");
//				
//				int sum = calcSum(); //함수에 매개변수가 없기에 매개변수를 쓰면 안된다.
//				System.out.println("sum : "+ sum);
//				
//				
//				System.out.println("=======================");
//				//함수 문제 사용 4, 5, 6
//				
//				//4
//				int result1 = intAdd(5,6,7);
//				System.out.println("result1 : " + result1);
//				
//				//5
//				double result2 = doubleAdd(10.5, 0.5);
//				System.out.println(result2);
//				
//				//6
//				printArticle("기사 제목 : 날씨 좋음!");
//				
//				// 1. 시험을 친다.
//				// ex) 이순신 학생이 시험을 친다.
//	public void takeTest() {
//		System.out.println(studentName + "학생이 시험을 친다.");
//		}
//}
//}


}}
