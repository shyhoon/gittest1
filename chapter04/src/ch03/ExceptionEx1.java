package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			
			for (int i = 0; i < 10; i++) {         	// 예외가 발생할 코드를 try문에 작성
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {// error의 약자 e라고 매개변수 명을 많이 쓴다
			System.out.println(e);					// 어떤예외가 발생했는지 출력
			System.out.println("예외가 발생함");		// 실행도중 오류 
		}

		System.out.println("비정상 종료되지 않았습니다."); 	

		

	}
	// 오류가 나도 예외처리를 하게되면 프로그래밍이 종료 되지 않고 계속 실행되어 진다!!!
}
//for (int i = 0; i < 10; i++) {
//System.out.println(arr[i]);
//}
// == 배열의 범위를 벗어난걸 요구
//신텍스 에러는 문법적 오류