package ch05;

public class WhileMainTest {
//�����Լ�
	public static void main(String[] args) {
		
		// 1 ~ 10 ���� ���� ����
		
		int num = 1;
		int sum = 0;
		
		while(  num <= 10 ) {
			System.out.println(" num���� �� : " + num);
			sum += num;
			System.out.println(" sum���� �� : " + sum);
			num++; 
			System.out.println(" num���� �� : " + num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�ð��鿩�� ������ �ӵ� ����
			
		}//end of while
		
		System.out.println(" ���꿡 ������� : " + sum + "�Դϴ�");
		
		
	
		
		
		
		
	}//end of main
	
}// end of class