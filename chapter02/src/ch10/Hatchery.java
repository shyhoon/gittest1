package ch10;

public class Hatchery {

	//static ���� ���
	// ��� ���� ����
	// ������ ����

	public static int zerglingCount = 1;
	
	private int hatcheryId;
	private String name;
	
	public Hatchery(int id) {
		this.hatcheryId = id;
		name = "��ó��";
	}
	
	public Zergling createZergling() {
		System.out.println("���۸��� �����մϴ�.");
		zerglingCount++;
		return new Zergling("���۸�" + zerglingCount);
	}
	
	
	// ���۸��� �����ϴ� �޼��� ������ּ���
}
