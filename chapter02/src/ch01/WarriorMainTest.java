package ch01;

public class WarriorMainTest {

	
	// ����� Ŭ������ ����ϴ� �� �ڵ�
	public static void main(String[] args) {
		
		int height; // main�̶�� �Լ��ȿ� �Ҽӵ� height -> ��������( main�ȿ� �����ϴ� ���� /�Լ� �� or �޼��� �ȿ� �ִ°�)
		
		
		// apa
		
		Warrior w1 = new Warrior(); // heap ���� �޸𸮿����� w1��� ��ü�� �ϳ� �����
		w1.height = 200; 
		w1.power = 100;
		w1.name = "����1";
		w1.color  = "�ʷϻ�";
		
		System.out.println(w1.height);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);
		
		Warrior w2 = new Warrior(); // heap ���� �޸𸮿����� w2��� ��ü�� �ϳ��� �����
		w2.height = 100;
		w2.power = 50;
		w2.name = "��������1";
		w2.color = "������";
		
		System.out.println(w2.height);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);
		
		
		
	}//end of main
	
}//end of class
