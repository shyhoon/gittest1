package ex1;

public class Wizard {

	// ��� ����
	// hp , power ,  name
	int 	hp;
	int 	power;
	String 	name;
	String 	skill;
	int level;
	// �����ڵ� ����� �ּ���
	public Wizard (int hp, int power, String name,String skill,int level) {
		this.hp 	= hp;
		this.power 	= power;
		this.name 	= name;
		this.skill 	= skill;
		this.level 	= level;
	}
	// �޼���
	public void hunt(Warrior warrior) {
		warrior.hurt(power);
		System.out.println(name+"�� "+skill+"�� ����Ͽ� "+power+"�� �������� "+warrior+"���� ���߽��ϴ�.");
		System.out.println(warrior+"�� "+power+" �� ���ظ� �Ծ����ϴ�.");
		 level++;
	}
	public void hurt(int damage ) {
	 this.hp -= damage;

	}
	public void showInfo() {
		System.out.println(name+"�� hp : "+hp+" level : "+level+" power : "+power+"�Դϴ�." );
	}
	// ���縦 ���� �Ѵ�.
	// ����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���
	// �ִ��� ���� ����
}
