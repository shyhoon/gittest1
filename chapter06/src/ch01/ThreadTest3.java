package ch01;


class MyThread3 extends Thread{
	
	@Override
	public void run() { // �����尡 �ؾ��� ���� ���� �޼���
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread()); //.currentThread()�� ���� �۵��ϴ� �����尡 �����ΰ� �˷��ִ� ����
		}
		
		
	}
	
	
	
}




public class ThreadTest3 {
	
	// ���� ������
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		// �۾��� 3�� ����
		
		MyThread3 thread3 = new MyThread3();
		MyThread3 thread4 = new MyThread3();
		MyThread3 thread5 = new MyThread3();
		
		// �۾��� ���� ���� �ּ���
		thread3.start();
		thread4.start();
		thread5.run();
		
		
	}// end of main
}// end of class
