package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true; 												// flag���� ���� . � ���࿡ ����� �ƴ´�

	@Override
	public void run() {

		while (flag) {
			System.out.print("-");

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}// end of run
}// end of class

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println("�۾��ڸ� ���� �ϰڽ��ϴ�.");
		
		MyThread1 thread1 = new MyThread1();				// main�����尡 ����Ǿ� ���ο� �۾��ڸ� ����� ���θ��� �۾��ڵ� ����
		thread1.start();

		System.out.println("0���� �Է��ϸ� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
//		int userInput = scanner.nextInt();
//		do { 												// ó�� userInput�Ѱ����� do while�� �ȿ��� ��� ���ѹݺ��̵ȴ�
//			if (userInput == 0) {
//				thread1.flag = false;
//			}
//		} while (userInput != 0);

		int input;
		do {
			 input= scanner.nextInt();
			if (input == 0) {
				thread1.flag=false;
			}
		} while (input != 0);
	}
}


//�̷��Ŀ� �����α׷� ���� �����̶� ���Ͱ� ���´�
// ���� 3.
// do while ����ؼ� �ѹ� �߸��Է��ص� �ٽ� �Է��ϸ� ���� �� �ְ�
// �ڵ带 ����©�� �𸣸� ���Ҿ������������ ���� �Ẹ��
// 1. do while �����
// 2. do �ȿ� � �ڵ尡 ���� �����ؼ� �ۼ�
// 3. while ���� ���ǽ��� ����

//if(userInput==0) {
//thread1.stop();// ���׾����� deprecated(���̻� ���� ���� ���� ����) ������ ����� ���ִ� �༮ �ظ��ؼ� ��������� ������� ��
//				// .stop()�������带 ���߰��ϴ� ����
//thread1.flag = false; // ���� .stop�� �Ⱦ��� �ٸ� ����� ����
//}