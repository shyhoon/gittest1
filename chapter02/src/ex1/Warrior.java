package ex1;

public class Warrior {
	// ��� ����
	// hp , power , name
	int hp;
	int power;
	String name;
	String skill;
	int level;
	// �����ڵ� ����� �ּ���
	public Warrior(int hp, int power, String name, String skill,int level) {
		this.hp		= hp;
		this.power	= power;
		this.name 	= name;
		this.skill 	= skill;
		this.level	= level;
	}
	// �޼���
	public void hunt(Wizard wizard) {
		wizard.hurt(power);
		System.out.println(name+"�� "+skill+"�� ����Ͽ� "+power+"�� �������� "+wizard.name+"���� ���߽��ϴ�.");
		System.out.println(wizard.name+"�� "+power+" �� ���ظ� �Ծ����ϴ�.");
		level++;
	}
	public void hurt(int damage) {
		this.hp -= damage;
		
	}
	public void showInfo() {
		System.out.println(name+"�� hp : "+hp+" level : "+level+" power : "+power+"�Դϴ�." );
	}
	// �����縦 ���� �Ѵ�. ��ü�� ��ü��ȣ�ۿ��ϰԵ� �غ���
	// ����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���

}
