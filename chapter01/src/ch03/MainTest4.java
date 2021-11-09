package ch03;

public class MainTest4 {
	public static void main(String[] args) {
		// 관계 연산자
				// 관찰에 결과가 참, 거짓인지 판별할 때 사용한다.
				// 결과값은 오직 true, false 이다.
				
				int num1 = 5;
				int num2 = 3;
				
				boolean value1 = (num1 < num2);//가독성을 위해 소괄호 넣어준다
				System.out.println(value1);
				
				boolean value2 = (num1 > num2);
				System.out.println(value2);
				
				boolean value3 = (num1 == num2);
				System.out.println(value3);
				
				boolean value4 = (num1 != num2);
				System.out.println(value4);
				//관계연산자를 주어로 보고 주어가 말하는게 사실인지 거짓인지를 생각
				
				System.out.println(num1 < num2);
				System.out.println(num1 <= num2);
				System.out.println(num1 = num2);
				System.out.println(num1 < num2);
				
				
	}

}
