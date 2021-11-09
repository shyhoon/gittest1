package ch01;

public class Zealot {
	
	private int power;
	private int hp;
	private String name;
	
	public Zealot(String name) {
		this.name 	= name;
		this.power 	= 10;
		this.hp 		= 100;
	}
	public void showInfo() {
		System.out.println("===����â===");
		System.out.println("�̸�: "		+ this.name);
		System.out.println("=========");
		System.out.println("���ݷ�: "	+ this.power);
		System.out.println("ü��: "		+ this.hp);
	}

	public void beAttacked(int power) {
		this.hp -= power;
		if( (this.hp != 0) || (this.hp < 0) ) {
			System.out.println("������ �׾����ϴ�.");
		}
		

	}
	/*// ���� �մϴ� -> ������ ������ �����ϴ� ����
	// �ٸ� ��ü�� ��ȣ�ۿ� - �޼���� ����  ���� ����
	public void attackMarine (Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
	public void attackZergling (Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zergling.beAttacked(power);
	}
*/
	public String getName() {
		return name;
	}
	
	
	// �޼��� �����ε��� ����� ����
	// �޼��� �̸��� ���Ƶ� �����Ϸ��� �޼��� �̸��� �Ű������� �̸�,������ Ȯ���Ͽ� ���� �̸��̾ �����Ѵ�
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
	
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName+ "�� �����մϴ�.");
		zergling.beAttacked(power);
	}
	
	
	
	
}
