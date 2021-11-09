package ch01;

import javax.swing.JFrame;

// Runnable�������̽��� �����Ͽ� Thread ���
class MyRunable1 extends JFrame implements Runnable { // Runnable �������̽��� Ȱ���ؼ� �����带 ������� �ִ�
														
	@Override
	public void run() {

		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");				// tab���ݸ�ŭ ����ִ³༮
		}
	}

}

public class RunableTest1 {
	// ���ξ����� 
	public static void main(String[] args) {
		
		MyRunable1 myRunable1 = new MyRunable1(); 
		
		// Runable ������ ��ü�� Thread�� �����ؼ� �Ű������� ��� �����带 �����Ѵ�.
		Thread thread1 = new Thread(myRunable1);
		thread1.start();

		Thread thread2 = new Thread(myRunable1);
		thread2.start();

	}
}
