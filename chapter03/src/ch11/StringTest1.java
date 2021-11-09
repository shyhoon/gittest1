package ch11;

public class StringTest1 {

	public static void main(String[] args) {
	
		// String 선언 방식
		// heap 메모리에 인스턴스로 생성되는 경우
		String str1 = new String ("abc");

		// data=static=constant pool영역에 생성
		String str2 = "abc";
		String str3 = "abc";
		//즉 서로 메모리에 올라가는 위치가 다르다
		// heap영역에 같이 생기지만 밑에 경우는 constant pool영역에 주소값이 담기게되는건가요
		// 아니면 그냥 아예 static영역에 생긴다는 건가
		
		System.out.println(str1 == str2); //--> false 메모리 위치가 다르니까 다르다는 결과값이 나오는것
		System.out.println("===============");
		System.out.println(str2 == str3);
		
		String str4 = new String("abc");
		String str5 = new String("abc");
		
		System.out.println("------------------");
		System.out.println(str4 == str5); // 각각의 다른객체라 주소값이 다른것
		System.out.println("------------------");
		
		String str6 = "abc";
		String str7 = "abc";
		System.out.println(str6 == str7);
		// constat pool영역에서 같은 값이면 새로 만들지 않고 같은 값을 바라보게한다(참조한다)
		// 결론 : 힙 메모리는 객체가 생성될 때 마다 다른 주소값을 가지지만,
		// 상수풀에 생성된 문자열은 같은 값일 경우 모두 같으 주소 값을 가진다(같은 문자열일경우)
		
		
		
	}// end of main 
	
}// end of class
