 package ch01;

import javax.swing.JFrame;

class MyRunable2 extends JFrame{
	
	int grade= 10;
	
	public MyRunable2() {
//		runable.run(); // .strat�� �ȵǴ� ������ Thread�� ��ӹ��� �ʾƼ� 
		
	}
	
	// �ڹ� ����
	// ������ü
	Runnable runable = new Runnable() { // Runnable�� 
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // end of for
			
		}// end o run
	};
	
	
}





public class RunableTest2 {

	public static void main(String[] args) {
	
		MyRunable2 myRunable2 = new MyRunable2();
		// ���� 1. ��ü ������ ���ÿ� run�޼��带 ���� ���� �ּ���.	(run�޼��带 ���ο��� ����)
		// ���� 2. �ܺο��� run�޼��� ���� ���� �ּ���.			(run�޼��带 �ܺο��� ����)
		myRunable2.runable.run();
		
	}
}// end of class
