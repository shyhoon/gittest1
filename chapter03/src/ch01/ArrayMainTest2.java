package ch01;

public class ArrayMainTest2 {
	public static void main(String[] args) {
		//������ �����͸� ������ ��Ƽ� �����ϱ� ���� ��
		int[]/*int������ Ÿ���� ���� �� �ִ� �����̶���*/ nums = new int[12];
		
		// ������ ���� �� �ִ� �迭�� 12ĭ ������ּ���
		Zealot[] /* ���� ������ Ÿ���� ������ �ִ� ������ ����� �ΰڴܸ�*/zealots = new Zealot[12]; 
		//���� 12
		Marine[] marines = new Marine[12];
		// ���۸� 12
		Zergling[] zerglings = new Zergling[12];
		
		// �迭�� for���� �Բ� ���� ���
		
		for(int i= 0 ; i < zealots.length; i++) {
			zealots[i] = new Zealot("����" + (i + 1) ); // �̷����ؼ� �̸��� ���� 
		} // end of for
		// zealots[i] ���⿡�� new�� ���� ���� ������ �ּҰ��� ����(�׳� new�� ���� �ּҰ��� ���ٰ� �ϱ�)
		// �ּҰ��� ��������� .�����ڸ� ��� ����(.�����ڸ� ���� heap������ ��ü�� �� �� �ִ�)
		// 1 ���� ���� ����
		
		for(int i = 0 ; i < marines.length; i++) {
			marines[i] =  new Marine("����"+ i	);
		}
		
		// 2 ���� ���۸� ����
		
		for(int i = 0 ; i< zerglings.length; i++) {
			zerglings[i] = new Zergling("���۸�" + i);
		}
		
		
		System.out.println(zealots[11].getName());
		
		// 3 ���� 12 ������ ������ ����� �ּ���. for �� ���
		for(int i= 0; i < zealots.length; i++) {
				zealots[i].showInfo();// i�� �ּҰ��� ���� �ִپ�
			
		}
		
		
		
	}
}
