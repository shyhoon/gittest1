package ch03;

class Cal {
	
	public int sum(int n1, int n2) {
		return n1+n2;
		
	}
	
	public int multiply (int n1, int n2) {
		
		
		
		return n1 * n2;
	}
	
}

class Cal2 extends Cal{
	
	public int minus(int n1,int n2) {
		return n1 - n2 ;
	}
	
	
	// �������̵� (�θ� �ִ� �޼��带 �ʿ信 ���ؼ� ������ �ؼ� ��� �ϴ� ����) ������ �����޼��� �̸��� ���� �Ű������� ����̾ȵǴµ� ��ӿ����� ���� 
	// �θ� Ŭ������ �������̵��� �޼���� ������ �ʰ� �ڽĿ� �������� �޼��常 ���ȴ�
	/*public int multiply (int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0�� �Է����� ������.");
		}
		return n1 * n2;
	}*/
	//�θ� Ŭ�������� ������ �޼��� �̸��� ġ�� ctrl space������ �ڵ��ϼ��ǰ� superŰ�������
	@Override // @ �� ������̼� �������̵��°� �˷��ִ� Ű����
	public int multiply(int n1, int n2) {
			System.out.println("multiply �޼��带 �����մϴ�.");
			return super.multiply(n1, n2);
		}
//		return super.multiply(n1, n2);// �θ�Ŭ����(super)������ multiply�޼��带 ȣ���϶�� ��ɾ�
		// superŰ����
		//���� �θ�Ŭ������ �޼��尡 ���� �ʹ����ٸ� �޼��带 �� �ۼ��� �ʿ���̱׳� super.���� �θ�Ŭ������ ����ȴ�
	}
	
	
	
	
	


public class MainTest2 {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiply(10, 0));
	
		
		
		
		
		
	}


}