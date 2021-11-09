package ch03;

public class Warrior {

	// 멤버변수 설계/*변수 이름을 만들때 소문자로 쓰자 중간에 대문자는 괜찮다*/
	
	public String name; /* public을 언제쓰고 언제 안쓰는지?*/
	public int power; 
	public String weapon;
	public String species;
	
	
	
	// 멤버 함수 /*메서드 이름도 소문자로 하고 의미가 명확하게 쓰자*/
	
	public void warriorCondition() { /* void는 static을 쓰지 않는다*/
		System.out.println( name + " 의 상태는 기분이 좋습니다 ");
	}
	
//	public static int warriordamage(int num1 , int num2) {
//		
//		int sum =  num1 + num2;
//				return  sum;
//				System.out.println(sum);
//	}
//	
}
