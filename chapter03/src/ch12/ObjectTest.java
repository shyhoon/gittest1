package ch12;

import java.lang.*;
//많이 사용하는 기본 클래스들 속한 패키지
//프로그래밍시 import하지 않아도 자동으로 import됨
//.*은 전부를 포함한다는걸 뜻함
// 오브젝트랑 java.lang둘다 프로그래밍하지않아도 자동으로 적용된다
// 오브젝트도 java.lang에 속해있는것

class Student extends Object{
	
	@Override
	public String toString() { // toString메서드 재정의
		return "학생클래스";
	}
}
public class ObjectTest extends Object{

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1); 
		System.out.println(System.identityHashCode(s1));
		//--> 원래는 주소값이 나오지만 toString을 재정의 했기에 "학생클래스" 라고 나온다
		// 원래 주소값 : 733957003
		
		String str2 = new String("안녕하세요");
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
		//--> 원래는 주소값이 나오지만 String은 항상 toString이 재정의돼있기에 "안녕하세요가"나온다
		// --> 원래 주소값 22429093

	}// end of main
	
}
