package ch10;

public class MainTest1 {

	// main 함수
	public static void main(String[] args) {
		 // 추상클래스는 new할 수 없고 일반클래스만 new할 수 있다.
		// 부모타임 Calc// 자식타입 CompleteCalc
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.devide(num1, 0));
		
		// 오류를 해결해 봅시다.
//		calc.showInfo();
		((CompleteCalc)calc).showInfo(); //다운 캐스팅
		
		
		
	}
}
