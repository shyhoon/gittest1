package ch05;

import java.util.Scanner;

public class MaintTest2 {

	public static void main(String[] args) {
		
		
		final int BANANA = 1;
		final int PEACH = 2;
		
		// ��ĳ��
		// ����ڰ� �Է��� 1,2 ������ �ش��ϴ� ��ü�� ������ ȭ�鿡 ����� �ּ���
		
		System.out.println("�ٳ��� : 1 , ������ : 2" );
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���.");
		int userInput = sc.nextInt();
		
		Fruit fruit;
		
		
	    // ���� 1���̶�� �ٳ��� ��ü�� �����ϰ� 
		// showInfo �޼��带 ȣ���� �ּ���.
		
		if (userInput == BANANA) { //1 ���� �ٳ����� ������� ����� Ȱ���ϰ� �Ǵ°�
		fruit = new Banana("�ٳ���",500,100,"�±�"); // �� ĳ����
//		fruit.showInfo();
		}else {
			fruit = new Peach("������",500,100);
//			fruit.showInfo();
		}
		fruit.showInfo(); 
		// ���� ���� �ؿ� ������ �ѹ��� ������ �ѹ��� �� ���ϴ�
		// �ƴ϶�� �����Ƹ� �����ؼ� showInfo�޼��带 ����� �ּ���
		// ����ڰ� �Է��� ���� ���� �ν��Ͻ��� ���� �ٲ� �� �� �ִ�.
		
		
		
		
	}
}
