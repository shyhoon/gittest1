package ch01;

public class Marine {
	
	private int power;
	private int hp;
	private String name;
	
	public Marine(String name) {
		this.name 	= 	name;
		this.power	= 	5;
		this.hp		=	100;
		
	}
	public void showInfo() {
		System.out.println("===����â===");
		System.out.println("�̸�: "		+ this.name);
		System.out.println("=========");
		System.out.println("���ݷ�: "	+ this.power);
		System.out.println("ü��: " 	+ this.hp);
	}
	// ���� ���մϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
//		if( (this.hp != 0) || (this.hp < 0) ) {
//			System.out.println("������ �׾����ϴ�.");
//		}
		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp=0;
		}
	}
	/*
	//1. ������ ������ �����մϴ�.
	public void attackZealot(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zealot.beAttacked(power);
	}
	//2. ������ ���۸��� �����մϴ�.
	public void attackZergling(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zergling.beAttacked(power);
	}
	*/
	//getName
	
	public String getName() {
		return name;
	}
	//1. �޼��� �����ε��� ����� ���� 2��
	public void attack (Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zealot.beAttacked(power);
	}
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zergling.beAttacked(power);
	}
	
	
	
}
