package ex1;

public class MainTest1 {

	public static void main(String[] args) {
		// ���α׷� ���� �帧�� ����� ������. ���� Ŭ������ ���α׷� ����
		
		Warrior w1 = new Warrior(1000,100,"�����","���� ������",1);
		Wizard m1 = new Wizard(500, 300, "ī����"	, "��ȥ��",1);
		
		w1.hunt(m1);
		m1.hunt(w1);
	
		w1.showInfo();
		m1.showInfo();
	}
}
