package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// ArrayList 선언

		// 데이터를 담을 공간 만들기
		// ! ArrrayList 는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다.
		ArrayList<Book>/* 자료형 타입 */ shoppingCart = new ArrayList<Book>();

		// 추가 방법 1
		// 데이터 추가하기
		shoppingCart.add(book1); // 0 //데이터가 순서대로 추가
		shoppingCart.add(book2); // 1
		shoppingCart.add(book3); // 2
		shoppingCart.add(book4);// 3

		System.out.println(shoppingCart.size());
		// 화면에 출력
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo(); // .에. 알아둘것
		}

		
		System.out.println("---------------------------");
		// 추가 방법 2
		shoppingCart.add(2, book5); //  .add(인덱스 번호) , (넣을 객체 이름)) 
		// for문 2번째 방법(foreach)
		for (Book b : shoppingCart) { // 만들어진 shoppingCart의 개수만큼 반복하여 b값에 넣는다 
			b.showInfo();
		}// foreach문 설명 그냥 암기
		// for ( (자료형타입) (이름) : (배열이름)){}  
		
		
		System.out.println("---------------------------");
		// 삭제 하기
		shoppingCart.remove(0); // 삭제할 인덱스 번호 입력
		// foreach

//		shoppingCart.clear(); // 전부 삭제 
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		
		
		System.out.println("---------------------------");
		// 수정하기 (set메서드 사용
		shoppingCart.set(2, book1); //( 변경할 인덱스 번호와 넣을 객체명 / 2번째 인덱스를 book1으로 변경
		// for each문 생성해서 화면에 출력
		for (Book book : shoppingCart) {
			book1.showInfo();
		}
		// foreach문은 인덱스에 접근하지 못한다 따라서 중간에 수정이 안되기때문에 단순히 처음부터 끝까지 반복을 해야할때 사용
		// 직접적으로 값을 가공해야할때 인덱스로 접근할 수 있는  for문을 사용
		// C R U D 프로그래밍의 기본 원리,뼈대
		// create , read , update , delete

	}
}
