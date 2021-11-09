package ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 스트링을 채팅이나 문자가 계속 일어날때ㅐ는 메모리 자원 낭비가 많이 심해서 그럴경우 빌더나 버퍼를 사용한다
		// StringBuilder, StringBuffer 활용
		// 내부적으로 가변적인 char[]를(캐릭터타입 배열)을 멤버 변수로 가짐.
		// 문자열을 여러번 연결하거나 변경할 때 사용하면 유용 하다.
		// StringBuffer는 멀티쓰레드 프로그래밍에서 동기화를 보장
		// 단일 쓰레드 프로그램(지금 배우고있는것들)에서는 StringBuilder 사용하기를 권장
		
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder); // java
		System.out.println(System.identityHashCode(builder)); //주소값:22429093
		
		System.out.println("---------------------");
		
		builder.append(android); 
		System.out.println(builder); // javaandroid
		System.out.println(System.identityHashCode(builder)); //주소값:22429093 변경없다

		
		// append 메서드
		// 값을 추가하여 기존 값을 변경해주는 메서드 , 주소변경이 없다
		builder.append("안녕하세요");
		System.out.println(builder);
		builder.append("반갑습니다");
		builder.append("hi");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		// 형변환할때 toString();
//		String tempStr = builder; 
		// builder의 데이터타입은 StringBuilder , tempStr의 데이터타입은 String이라서 형변환을 시켜줘야한다
		String tempStr = builder.toString(); // .toString(); -> String타입으로 변환하라는 메서드
		System.out.println(tempStr);
				
		
	}
}
