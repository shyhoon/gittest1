package ch05;

public class ForMainTest3 {

	//메인함수
	public static void main(String[] args) {
		
		// 1부터 9까지 반복 /이중포문 포문안에 포문을 작성
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 1; j <= 9; j++) {
//				}
//	}
		 // 이중 for 문으로 구구단 2~9까지 출력해 주세요.
			
//			
		for( int num = 2; num <10; num++) {
			
			for(int num1 = 1; num1 < 10; num1++) {
				
				System.out.println(num + "*" +num1+ "=" + num * num1);
				
			}
			System.out.println();
		}
//		
		
		 // 삼중 for문
		int num1 =  0 ;
		for (num1 = 2; num1 <= 9; num1++) { 	                          
	
			for (int i = 3; i <= 9; i++ ) {
				
				for (int j = 4; j <= 9; j++) {
					System.out.println(num1 +" * " + i + " * " + j + "=" + (num1*i*j));
				}
				System.out.println();
			}
			
			
	}
		
	}//end of main
		
	}// end of class
