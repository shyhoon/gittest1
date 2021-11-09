package ch05;

public class WhileMainTest {
//메인함수
	public static void main(String[] args) {
		
		// 1 ~ 10 까지 덧셈 연산
		
		int num = 1;
		int sum = 0;
		
		while(  num <= 10 ) {
			System.out.println(" num현재 값 : " + num);
			sum += num;
			System.out.println(" sum현재 값 : " + sum);
			num++; 
			System.out.println(" num현재 값 : " + num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//시간들여서 나오는 속도 조절
			
		}//end of while
		
		System.out.println(" 연산에 결과값은 : " + sum + "입니다");
		
		
	
		
		
		
		
	}//end of main
	
}// end of class
