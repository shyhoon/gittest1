package ch05;

import java.util.ArrayList;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 다형성 : 배열(자료구조(arraylist같은)) 관계에서도 사용 가능
		// 하나의 변수에 연관된 데이터를 통으로 관리하기 위해 사용
		
		// 1. 
		Banana banana1 = new Banana("바나나",500,100,"태국");
		Banana banana2 = new Banana("바나나",500,100,"태국");
		Peach peach1	= new Peach("복숭아",500,100);
		
		Banana[] bananaBuKet = new Banana[2];
		bananaBuKet[0] = banana1;
		bananaBuKet[1] = banana2;


		//1분
		
//		for (Banna banana: bananaBuKet) {
//			banana.showInfo();
//		}
		
		// 복숭아
		Peach peach2 = new Peach("복숭아",500,100);
		Peach peach3 = new Peach("복숭아",500,100);
		
		// 배열 사용해서 담아 주세요
		// 배열은 2칸
		
		Peach[] peachBucket = new Peach[2];
		peachBucket[0] = peach1;
		peachBucket[1] = peach2;
		
		// for문 사용해서 showIbnfo 메서드 호출
		for (Peach peach : peachBucket) {
			peach.showInfo();
		}
		
		// 3. 다형성을 사용 한다면
		Fruit[] fruitBuket1 = new Fruit[4];
		fruitBuket1[0] = banana1;
		fruitBuket1[1] = peach2;
		fruitBuket1[2] = banana2;
		fruitBuket1[3] = peach3;
		
		for (Fruit fruit : fruitBuket1) {
			fruit.showInfo();
		}
		
		// ArrayList에서도 다형성을 이용가능
		ArrayList<Fruit> fruitBuket = new ArrayList<Fruit>();
		fruitBuket.add(banana2);
		fruitBuket.add(0, peach1);
		fruitBuket.size();
		for(Fruit banana : fruitBuket) {
			banana.showInfo();
		}
		
		
		
		
		
	}
}
