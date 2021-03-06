package ch01;

import java.util.Iterator;

public class ArrayMainTest3 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는 강물처럼","파울로코엘료"	);
		Book book2 = new Book(2, "플러터UI실전","김근호"	);
		Book book3 = new Book(3, "무궁화꽃이피었습니다","김진명"	);
		Book book4 = new Book(4, "리딩으로리드하라","이지성"	);
		Book book5 = new Book(5, "사피엔스","유발하라리"	);
		
		
		// 문제 
		//1. 배열을 이요해서 shoppingCart 변수(배열)에 객체를 담아 봅시다.
		
		Book[] shoppingCart = new Book[5];
		
		// 2. 사고싶은 책을 장바구니에 담아 봅시다 3개만
		
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book5;
				
		// 3. 장바구니에 담은 정보를 화면에 출력 하세요
		
		System.out.println(shoppingCart[0]);
		System.out.println(shoppingCart[1]);
//		System.out.println(shoppingCart[2].showInfo()); <--?
		//PrintStream 형식의 Println(boolean) 메서드는 인수(void)에 적용할 수 없습니다.
		// println메서드는 void와 쓸 수 없다는말인거같은데 왜??


		
		shoppingCart[0].showInfo();
		shoppingCart[1].showInfo();
		shoppingCart[2].showInfo();
		
		
//		for (int i = 0; i < shoppingCart.length; i++) {
//			shoppingCart[i].showInfo(); 
//			}
//		// for 오류 수정해주세요.
//		for (int i = 0; i < shoppingCart.length; i++) {
//			if(shoppingCart[i] != null) {
//			shoppingCart[i].showInfo(); 
//			//null point execption- shoppingCart의 값이 null 이면 생성되지 않은건데 생성되지 않은 객체의 메서드를 사용 할수 없으니까 오류가 나는것이다 
//			} 
//		}
//		
		//4.
		
		shoppingCart[0] = book5;
		
		// 5. 인덱스 1번째에 book3 추가 해 주세요
		// 0, 1 = book3 ,   1 --> 2, 2--> 3, 3 -->4
		
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;
		

		
		// 삭제 -> 배열에 담겨 있는 값을 제거할려면 null을 쓴다
		// 3번째 인덱스를 지워 보세요.
		
		shoppingCart[3] = null;
		
		// 배열에 추가를 할려면 직접 인덱스 연산을 하나씩 밀면서 처리 해야 해서 시간이 많이든다.
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo(); 
				} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
