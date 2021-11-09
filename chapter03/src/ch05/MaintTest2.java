package ch05;

import java.util.Scanner;

public class MaintTest2 {

	public static void main(String[] args) {
		
		
		final int BANANA = 1;
		final int PEACH = 2;
		
		// 스캐너
		// 사용자가 입력한 1,2 받으면 해당하는 객체에 정보를 화면에 출력해 주세요
		
		System.out.println("바나나 : 1 , 복숭아 : 2" );
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		int userInput = sc.nextInt();
		
		Fruit fruit;
		
		
	    // 만약 1번이라면 바나나 객체를 생성하고 
		// showInfo 메서드를 호출해 주세요.
		
		if (userInput == BANANA) { //1 말고 바나나를 적어야지 상수를 활용하게 되는것
		fruit = new Banana("바나나",500,100,"태국"); // 업 캐스팅
//		fruit.showInfo();
		}else {
			fruit = new Peach("복숭아",500,100);
//			fruit.showInfo();
		}
		fruit.showInfo(); 
		// 위에 말고 밑에 적으면 한번만 적으면 한번만 더 편하다
		// 아니라면 복숭아를 생성해서 showInfo메서드를 출력해 주세요
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽게 바꿔 줄 수 있다.
		
		
		
		
	}
}
