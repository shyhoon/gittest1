package ch01;

public class ThreadTest1 {

	//���� �Լ� <-- ���� ������(���� �椡���Ѱ� �۵���Ű��)
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(500); // static�޼��� ,500���� 1�ʶ��� = 0.5�ʵ��� ���� �ٽ� for������ �ϴ°� �ݺ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end of for
		
		
		
	}//end of main
}// end of class
//���μ����� ũ���̳� �׸��� ���� ���α׷��� ����Ű�� ram������ �ö󰡴°� ���� 
// ������ �۾� �ϳ��� ������ �������� �Ѵ�
// ��Ƽ ������� ���� ������� �����۾��� �ϴ°�
// cpu������ �ѹ��� �۾��� �����ϹǷ� �����尡 �������� �ѹ��� �۾��� �̷����°� �ƴ� �Դٰ����ϸ� �۾����Ѵ�