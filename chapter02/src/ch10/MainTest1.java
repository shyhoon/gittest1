package ch10;

public class MainTest1 {

	public static void main(String[] args) {// class파일안에 잠시 공간을 빌린다 static
		
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		// 문제 저글링,질럿, 마린 체력이 0또는 이하라면 사망했습니다 출력.
//		zealot1.showInfo();
//		marine1.showInfo();
//		zergling1.showInfo();

		
		zergling2.attack(marine1);
		zergling2.attack(marine2);
		zergling2.attack(marine2);
		zergling2.attack(marine2);
		zergling2.attack(marine2);
		zergling2.attack(marine2);
		zergling2.attack(marine2);

		zealot1.attack(marine2);
		zealot1.attack(marine2);
		zealot1.attack(marine2);
		zealot1.attack(marine2);
		zealot1.attack(marine2);
		zealot1.attack(marine2);
		zealot1.attack(marine2);
		marine2.showInfo();
		
//		//
//		System.out.println("---------------------------------------");
//		System.out.println("가나다");
//		System.out.println(1);
//		System.out.println(0.5);
//		System.out.println('A');
		
		
		
		
		
		
		
	}//end of main
}// end of class
