package ch08;

import java.util.Scanner;

public class MainTest1 {
	
	//�����Լ�
	public static void main(String[] args) {
		Zealot zealot1 =  new Zealot("����");
		Marine marine1 = new Marine("����1");
		Zergling zergling1 = new Zergling("���۸�1");
		
		//��ĳ�ʸ� ����ؼ� ���࿡ �帧�� ����� ������.
		// 1 ������ ������ �����Ѵ�.
		// 2 ������ ���۸� �����Ѵ�.
		// 3 ���۸��� ������ �����Ѵ�.
		
		// --> 1 2 3 ���� ����
		// � ����� �����Ұ��� 123
		System.out.println("���ڸ� �Է��� �ּ���");
		Scanner sc = new Scanner(System.in);
		 int userInput = sc.nextInt();
		   final int ZEALOT_ACTION = 1;
		   final int MARINE_ACTION = 2;
		   final int ZEARGLING_ACTION = 3;
		   final int GAME_END= 4;
		
		
		// ����� ����Ͽ� ���� ������ �ڵ�
		if( userInput == ZEALOT_ACTION) {
			zealot1.attack(marine1);
		}else if (userInput == MARINE_ACTION){
			marine1.attack(zergling1);
		}else if (userInput ==ZEARGLING_ACTION){
			zergling1.attack(zealot1);
		}else if (userInput == GAME_END) {
			System.out.println("������ ����Ǿ����ϴ�.");
		}
		

		

		
	}
}
