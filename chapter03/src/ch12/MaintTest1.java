
package ch12;

public class MaintTest1 {

	
	public static void main(String[] args) {
		
		Book book1 = new Book(1,"데미안","헤르만 헤세1");
		Book book2 = new Book(1,"데미안","헤르만 헤세2");
		
		System.out.println(book1 == book2);
		
		// equals메서드는 String 주소값을 비교할때 많이 쓴다.
		// 필요에따라 재정의하여 사용
		boolean result = "a".equals("a"); // a와 a는 같으니까 true 라고 나온다
		System.out.println(result);
		System.out.println("a" == "a");
		System.out.println("--------------");
//		boolean r1 = "1".equals("2") ; 
		
		// equals 메서들 재정의 했다 (book클래스 안에서 )
		if(book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		}else {
			System.out.println("다른 책입니다.");
		}
		
		
		System.out.println("a" == "a");

	}
}
// 객체지향 핵심과정 정리해보기 블로그 1~11까지만