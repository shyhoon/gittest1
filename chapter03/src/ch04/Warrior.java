package ch04;

public class Warrior extends Hero{ // ���� ������ �ڵ� ���ذ�
	
	public Warrior(String name, int hp) {
		super(name, hp); // �θ� �ִ� �� ȣ�� super = hero �� �ִ� �������� 
		// ��ӹ޴� ���忡�� super�� ����Ͽ� �����ڸ� ��������� �θ�Ŭ������ �ִ� �����ڿ� �Է��̵ȴ�.
	}

	public void comboAttack(){
		System.out.println("2�� ����!");
	}
}
// ��ӱ����� ���鶧�� ���� Ŭ������ ���� �������� ��ӱ����� ���� �ǰԵ� ������ �������� ���� ����� ���߿� �� �����ؾ��� �� �ֵ�