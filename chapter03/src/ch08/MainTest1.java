package ch08;

import java.util.Scanner;

public class MainTest1 {
	
	//메인함수
	public static void main(String[] args) {
		Zealot zealot1 =  new Zealot("질럿");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		//스캐너를 사용해서 실행에 흐름을 만들어 보세요.
		// 1 질럿이 마린을 공격한다.
		// 2 마린이 저글링 공격한다.
		// 3 저글링이 질럿을 공격한다.
		
		// --> 1 2 3 선택 유닉
		// 어떤 대상을 선택할건지 123
		System.out.println("숫자를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		 int userInput = sc.nextInt();
		   final int ZEALOT_ACTION = 1;
		   final int MARINE_ACTION = 2;
		   final int ZEARGLING_ACTION = 3;
		   final int GAME_END= 4;
		
		
		// 상수를 사용하여 좀더 괜찮은 코딩
		if( userInput == ZEALOT_ACTION) {
			zealot1.attack(marine1);
		}else if (userInput == MARINE_ACTION){
			marine1.attack(zergling1);
		}else if (userInput ==ZEARGLING_ACTION){
			zergling1.attack(zealot1);
		}else if (userInput == GAME_END) {
			System.out.println("게임이 종료되었습니다.");
		}
		

		

		
	}
}
