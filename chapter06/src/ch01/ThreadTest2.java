package ch01;

class MyThreadEx2 extends Thread{							// Thread�� java.lang��Ű���� �־ ���� import���ص� ��밡��
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
		System.out.println(Thread.currentThread());
	}
	
	@Override
	public void run() {								   	
		int i;
		for ( i = 0; i < 50; i++) {
			
			System.out.println(name+ ":" + i + "\t"); 	
			
			try {												// ��κ� �ؾ��ϴ¿���ó���� �ڹٿ��� �˷��ش�
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}// end of run
	
}// end of MyThreadEx2

public class ThreadTest2 {
	// ���� ������(=�����Լ�)(�굵 �۾���)
	public static void main(String[] args) {					// �޼���� ���������� �Ʒ��� �帧����
		
		System.out.println(Thread.currentThread());				// static�޼���� Ŭ�����̸���������
		System.out.println("���ξ����� ����");
		
		MyThreadEx2 th1 = new MyThreadEx2("�۾��� 1");			// �۾��ڰ� �θ��̶� ���ε��� ����
		th1.start();  											// �����忡 �۾��� �����ϴ� ��ɾ�

//		for (int i = 0; i < 50; i++) {
//			System.out.println("test :" + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} //0.2
//		}

		System.out.println("���� ������ ����");  
		
	}// end of main
	
}// end of class
// �ϳ��� �� �۾��ڸ� ����� ���ؼ� �����带 ���
// �� �ٸ� �۾��ڰ� �����ҰŴ�  run�޼��忡�� �ۼ��Ѵ�
// ���� �������� �۾� �켱������ ���� �� �ִ� �׳� �̷� ������ �ִٰ� ���� , �̰� Ȱ���ؼ� ���� ���� �ʴ´�
// �����忡 �켱������ �� �� �ִ� �켱������ 0~10���� ���ڰ� ���� �� �� �켱������ ���� main������� �켱������ 5


//�����带 ����� 
//�۾��ڸ� ����� ���ؼ��� Thread�� ����Ѵ�
//������ run�̶�� �޼��忡 �ۼ��Ѵ�
//���(������ �۾��ڸ� ��û�ؼ� ��� ���� ��ų���� run�̶� �޼��带 ��� ����޼��尡 �������� �����ִ� �༮ , 

//MyThreadEx2 th2 = new MyThreadEx2("�۾���2");				//�۾��� �� ����
//th2.start();
//
//MyThreadEx2 th3 = new MyThreadEx2("�۾���3");
//th3.start();
//