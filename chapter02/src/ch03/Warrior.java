package ch03;

public class Warrior {

	// ������� ����/*���� �̸��� ���鶧 �ҹ��ڷ� ���� �߰��� �빮�ڴ� ������*/
	
	public String name; /* public�� �������� ���� �Ⱦ�����?*/
	public int power; 
	public String weapon;
	public String species;
	
	
	
	// ��� �Լ� /*�޼��� �̸��� �ҹ��ڷ� �ϰ� �ǹ̰� ��Ȯ�ϰ� ����*/
	
	public void warriorCondition() { /* void�� static�� ���� �ʴ´�*/
		System.out.println( name + " �� ���´� ����� �����ϴ� ");
	}
	
//	public static int warriordamage(int num1 , int num2) {
//		
//		int sum =  num1 + num2;
//				return  sum;
//				System.out.println(sum);
//	}
//	
}
