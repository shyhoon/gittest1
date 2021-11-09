package ch04;

public class IfMainTest {
//메인함수
	public static void main(String[] args) {
		
		// 제어문(=조건문) if 
		// 주어진 조건에 따라서 실행이 이뤄 지도록 구현한다.
		// 만약 ...이라면
		
		boolean flag = false;
		
		// if 문 단독 사용방법  
		// 조건식이 true 일대만 실행
		if (flag) {
			System.out.println("조건식 결과가  true이면 실행 된다.");
			
		}// end of if
		
		// if else 문
		//두개중 하나는 반드시 실행
		if(flag) {
			System.out.println("true 이면 실행");
		}else {
			System.out.println("flse 이면 실행");
		}
		
		
		// if else if else 문
		// 반드시 하나라도 수행해야하면 else문을 추가하면 된다/ 실행 안된도되면 else문 추가안해도된다.
		int point = 40;
		if ( point >= 90) {
			System.out.println("A 학점 입니다.");
		} else if ( point >= 80 ) {
			System.out.println("B 학점 입니다.");
		} else if  (point >= 70) {
			System.out.println("C 학점 입니다.");
		} else if (point >= 60) {
		 System.out.println("D 학점 입니다.");
		} else {
			System.out.println("F 학점 입니다.");
		}
		
		
		
		
		
		
		
		
	}//end of main
	
	
}// end of class
