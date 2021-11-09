package ch03;

import java.io.FileInputStream;

public class ExceptionEx2 {

	public static void main(String[] args) {

		FileInputStream fis;

		try {
			fis = new FileInputStream("a1.txt");
		} catch (ArrayIndexOutOfBoundsException e) { 		// 예외가 배열관련일때 잡힌다
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (Exception e) { 							// exception은 최상위 예외클래스라서 다 걸린다
			System.out.println("예외 처리");					// 따라서 보통 Exception을 처리할 예외타입으로 정한다
			return; 										// 리턴문이 있어도 finally구문은 실행된다.
		} finally {
													// try문이 실행되면 반드시 실행, 위쪽 코드에 오류가 있어도 실행
			System.out.println("반드시 실행됩니다.");
		}

		System.out.println("비정상 종료가 되지 않았습니다."); 

	
		
	}
} // catch문 여러개 겹쳐 사용 가능 if else처럼
