package ch03;

public class MainTest5 {
public static void main(String[] args) {
	// 논리 연산자( && , || )엠퍼센트, 버티컬바
	//관계 연산자와 혼합하여 많이 사용 됨
	// 연산에 결과가 true, false
	
	int num1 = 10;
	int num2 = 20;
	
	//1.논리 곱 (&&)
//									true			true = true
	boolean flag1 = (num1 > 0) && (num2 > 0);
//	  								true			false = false
	boolean flag2 = (num1 > 0) && (num2 < 0);
	// 둘다 true(참) 일때, true 를 반환
	
	
	//2. 논리 합 ( || )
	boolean flag3 = (num1  < 0 ) || (num2 > 0);
	
	boolean flag4 = (num1 > 0) || (num2 > 0);
	// 둘 중 하나라도 true 이면 , 연산에 결과는 true 반환 한다.
	
	System.out.println(flag4);
	
	System.out.println("-----------------------------");
	
	
	// num3 = 10 /솔트서킷에볼루션


}
}
