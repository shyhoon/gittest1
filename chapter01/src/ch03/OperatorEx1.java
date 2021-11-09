package ch03;

public class OperatorEx1 {
public static void main(String[] args) {

	
	int i = 10;
	double d = 20.5;

	// 1
	// 두 수를 덧셈 연산 하여 result1 변수에 담고
	// 결과값 30.5를 출력 하세요. -자동형변환, 산술연산자
	
	double result1 = i + d;
	System.out.println(result1);
	
	// 2
	// result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
	// 단 변수에 저장하지 말고 수행해주세요. - 강제형변환
	
	System.out.println((int)result1);

	// 3
	// i 변수의 값을 -1을 뺀 후 출력하세요
	// 단, 단항 연산자 사용 - 감소연산자(복합 대입 연산자는 단항 연산자가 아니기에 될 수 없다)

	i --; // i 변수의 값에서 1을 빼라는 명령어 이다.
	System.out.println(i);
	
	// 4
	// d 변수에 값을 -20.5로 출력 하세요
	// 단, d 변수에 값을 변경하지 마세요 - 부호 연산자
	
	System.out.println(-d);
	
	// 5
	// 변수 i와 d, 관계 연산자를 사용해서 result2 변수를 
	// 선언하고 변수에 true 값이 담기도록 식을 만들고
	// 출력하세요 - 관계 연산자 , 논리형 데이터 타입을 생각해 낼 수 있는지

	boolean result2 = (i < d );
	System.out.println(result2);

	int num1 = 10;
	int num2 = 30;
	
	// 6
	// 변수 result3을 선언하고
	// num1과 num2 변수가 숫자 50보다 큰지 논리 연산자를 사용해서 결과를 담고 출력하세요
	// 논리연산자, 관계연산자, 논리형 데이터 타입
	
	boolean result3 = ( num1 > 50 ) && ( num2 < 50);
	System.out.println(result3);
	
	boolean result4 = ( (num1 -= 3) > 45) && ( (num2 += 10) < 50);
	System.out.println(result4); //f
	System.out.println(num1); // 7 
	System.out.println(num2); // 30
	
	boolean result5 = ((num1 += 4) >43) || ((num2 -= 3) > 20);
	System.out.println(result5); //t
	System.out.println(num1); // 11
	System.out.println(num2); // 27
	

	// 7
	// num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
	// max 변수에 값을 담고 출력해주세요
	// 단, 선언과 초기화를 동시에 해주세요

     int max = (num1 > num2) ? num1 : num2; 
     //데이터 타입이 int인 이유 - 최종적으로 레터럴의 값이 정수가 나오기 때문에 int를 적어줘야 한다.
     System.out.println(max);
	int max1 = (num1 < num2) ? num2 : num1;
	System.out.println(max1);
	
	
	
}
}
