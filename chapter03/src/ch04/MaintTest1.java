package ch04;


public class MaintTest1 {
	
	public static void main(String[] args) {

	
	Warrior warrior1 = new Warrior("���� ", 100);
	// heap������ ������ �ȿ� ����ε� ���� ����?
	//heap���� �ȿ� ���� "WarriorŸ�� ��ü������ ���� ��"���� ��ӹ��� HeroŬ������ �����Ͱ� �ִ°ǰ�?
	Wizard wizard1 = new Wizard("������ ", 50);
	Archer archer1 = new Archer("�ü� ", 100);
	
	
	String name = warrior1.name; // hero
	int hp = warrior1.hp; // hero
	warrior1.attack("����");// hero
 
	
	warrior1.comboAttack();// hero
	
	warrior1.comboAttack()	; //warrior

	}
}