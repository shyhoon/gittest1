package ch05;

public class WhileMainTest3 {

	public static void main(String[] args) {
		
		// do ~ while
		int input = 10;
		int sum = 0;
		
		do {
			
			System.out.println("현재 값 : " + input);
			sum += input;
			// 식을 만들어 봅시다.
			
			input--;
//			input = input -1
//			input -= 1
			
			
		}while(input != 0);
		
		System.out.println("연산에 결과는 : " +sum+ "입니다.");
		
		
		
		
		
	}
	
}
