package ch05;

public class BreakTest {

	public static void main(String[] args) {
		
		//예약어 break;
		//중간에 멈추는break if와 같이씀 조건무넹 부합해야해서
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println(i);
			// 1~10까지 화면에 출력 나머지 연산자 % <-- 7 == 0이면 멈춰라
			// i == 7 --> 수정 // i  나머지 연산의 결과가 0이면 멈춰라
			if (( i % 7)== 0) {
				
				break; 
			}
			
			
		}//end of for
		
		
		
	}
	
}
