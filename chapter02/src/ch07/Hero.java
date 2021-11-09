package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;
	
	// get
	public String getName() {
		return this.name; //�׳� name�ص� ��������
		
	}
	// set
	public void setName(String name) {
		//  ����� �ڵ� �ۼ�
		if (name == null || name == "" || name.length() < 2) {// ����,������ �ΰ��̻� ��밡��
			System.out.println("�߸��� �Է� �Դϴ�. �̸��� �ٽ� �ۼ��� �ּ���.");//jdk������String������ Ÿ�Ծȿ� length��� �޼��尡 �ִ�
		}else {
			this.name = name;
		}
	}
	
	//hp, defense , leve�� ���� get,set �޼��� ����� �ּ���
	// �޼��带 �����ϴ� �ڵ� �ۼ�
	public int getHp() {
		return hp;
	}
	public double getDefense() {
		return this.defense;
	}
	public int getLevel() {
		return this.level;
	}
	
	
	
	public void setHp(int hp) {//����� �ڵ嵵 �ۼ��غ���
		if(hp < 0) {
			System.out.println("�߸��� �Է� �Դϴ�.");
		}else {
			 this.hp += hp;
		}
	}
	public void setDefense(double defense) {
		this.defense += defense;
	}
	public void setlevel(int level) {
		this.level += level;
	}

	// main �Լ� (�ڹ� ����, ���� �����Լ� ������ �ȸ��� ���⼭ ������� ���� �ִ�.)
	public static void main(String[] args) {
		// Hero ��ü ���� �� getter, setter �޼��带 ����� ������.
		Hero hero1 = new Hero();
		// new Hero(); �̷��Ը��ص� ��ü�� �����ȴ�.
		hero1.setName("�ӵ���");
		String name = hero1.getName();
		System.out.println("���� ���� �� : " + name);
		
		hero1.setHp(500);
		int hp = hero1.getHp();
		System.out.println(name+"�� ü���� : "+hp+"�Դϴ�.");
		hero1.setDefense(50.5);
		double defense = hero1.getDefense();
		System.out.println(name+"�� ������ : "+defense+ "�Դϴ�.");
		hero1.setlevel(5);
		int level = hero1.getLevel();
		System.out.println(name+"�� ������ :"+level+ "�Դϴ�.");
				
	}
	// ��������� ���� �����Ͽ� ���� ������ �� ������ oop��ü���� ���α׷��ֿ��� �޼��带 ���ؼ� �ؾ��Ѵ� 
}
