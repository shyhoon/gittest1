package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 한번 생성된 String은 불변(immutable)
		// abc를 만들고 d를 추가하려면 새로 abcd를 만들어야한다
		
		//String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성된다.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java); //java
		System.out.println(System.identityHashCode(java));// 주소값 :22429093
		//System.identityHashCode 주소값 확인하는 메서드
		
		System.out.println("-------------------");
		
		// java = java + android;
		java = java.concat(android);
		// concat메서드 - 연결해주겠다는 메서드
		System.out.println(java); //javaAndroid

		System.err.println(System.identityHashCode(java));// 주소값 : 733957003
		
		
		// 이렇게되면 채팅하거나 하면 메모리의 낭비가 심해지기 때문에 다른 녀석을 사용 
	}
}
