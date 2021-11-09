package ch01;

public class Zergling {

	private int power;
	private int hp;
	private String name;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("===����â===");
		System.out.println("�̸�: " + this.name);
		System.out.println("=========");
		System.out.println("���ݷ�: " + this.power);
		System.out.println("ü��: " + this.hp);
	}

	public void beAttacked(int power) {
		this.hp -= power;
		if ( (this.hp != 0) || (this.hp < 0) ) {
			System.out.println("���۸��� �׾����ϴ�.");
		} 

	}
	/*
	// 1. ���۸��� ������ �����մϴ�.
	public void attackZealot(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zealot.beAttacked(power);
	}

	// 2. ���۸��� ������ �����մϴ�.
	public void attackMarine(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		marine.beAttacked(power);
	}
	*/
	public String getName() {
		return name;
	}
	
	//1. �޼��� �����ε��� ����� ���� 2��
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		marine.beAttacked(power);
	}
	
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zealot.beAttacked(power);
	}
}
