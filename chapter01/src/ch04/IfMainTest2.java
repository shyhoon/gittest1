package ch04;

import java.util.Scanner;

public class IfMainTest2 {
//�����Լ�
	public static void main(String[] args) {

		System.out.println("������ �Է��� �ּ���: ");

		Scanner scanner = new Scanner(System.in);

		int point = scanner.nextInt();
		char result = 'Z';

		// ���� 1. if ���� ����ؼ� ������ ����� �ּ���.
		// 100 ~ 90 --> A
		// 90 ~ 80 --> B
		// 80 ~ 70 --> C
		// 70 ~ 60 --> D
		// 60 ~ 0 --> F

		if(point <= 100 &&  point >=90) {
			result='A';
		}else if (point < 90 &&  point >=80) {
			result='B';
		}else if (point < 80 &&  point >=70) {
		result='C';
		}else if (point < 70 &&  point >=60) {
			result='D';
		}else if( point <60 && point >=0) {
		result='F';
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
			}
		if (result != 'Z') {
		System.out.println("����� ������: "+result+ "�Դϴ�.");
		}
		
		
		
		
		if (point <= 100 && point >= 90) {
			result = 'A'; // System.out.println(" �츮�� ������:" + result + "�Դϴ�."); �̷� �ڵ�� �����̳� ��鿡�� ȿ�������� ������
							// �� �ִ�
		} else if (point < 90 && point >= 80) {
			result = 'B';
		} else if (point < 80 && point >= 70) {
			result = 'C';
		} else if (point < 70 && point >= 60) {
			result = 'D';
		} else if (point < 60 && point >= 0) {
			result = 'F';                                    //���� ����Ȱ� ����� X
//		} else {
//			System.out.println(result = '����');
		}
		// �Ѵ� ���ϰ�� �����ϹǷ� �������ڿ��� ������ �����Ѵ�
					// �Է��� �߸� �Ǿ����� ����ؼ� ����ڵ带 �ۼ� �� �� �־���Ѵ�
					// else�� ���ǽ��� �ʿ���� ���๮�� �����ָ� �ȴ�.
		if (result != 'Z') {
			System.out.println("��ſ� ������ : " + result + "�Դϴ�. "); //���� ���
		} else {
			System.out.println("�Է��� �߸� �Ͽ����ϴ�.");
			}
	}// end of main
}// end of class
