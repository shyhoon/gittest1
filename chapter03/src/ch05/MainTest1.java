package ch05;

public class MainTest1 {
	public static void main(String[] args) {
		
		Banana banana = new Banana("�ٳ���",500,100,"�±�");
		Peach peach = new Peach("������",500,100);
		
			banana.showInfo();
			peach.showInfo();
			
			// �ڹٿ��� �������̶� 
			// �θ� Ÿ�� �ν��Ͻ� ������ �ڽ� ��ü�� ������ �� �ִ�
			Fruit fruit = new Banana("�ٳ���",500,100,"�±�"); // �� ĳ����  fruit�� �ּҴ� �ٳ����ε�
			// ��ӱ����� �ƴϸ� ����� �� ����.
			// �θ� �ڽ� ���迡�� ��� �����ϴ�.
			// ���ǿ��� �ٳ��� = ������ ���������� ����=�ٳ����� �������� �ʴ´ٿ� �Ȱ��ٰ� ����ȴ�.
			
			// �� ���� �������� �ʴ´�.
			// �� �ڽ� �ν��Ͻ� ������ (��������) �θ� �ν��Ͻ��� ���� ��ų �� ����.
//			Banana banna2 = new Fruit(); 
	}
}
