package ch08;

public abstract class Unit {

	protected int power; 
	protected int hp;
	protected String name;


	public void showInfo() {
		System.out.println("===����â===");
		System.out.println("�̸�: " + this.name);
		System.out.println("=========");
		System.out.println("���ݷ�: " + this.power);
		System.out.println("ü��: " + this.hp);
	}

	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(this.name + "��(��)" + targetName + "�� �����մϴ�.");
		unit.beAttacked(power);
	}
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "�� �׾����ϴ�.");
			this.hp = 0;
		}

	}
	public String getName() {
		return this.name;
	}
}
// protected �������������ڸ� ����ϸ� �ش� Ŭ������ ��ӹ޴� Ŭ������ ��� ������ ���� �����ϴ� 