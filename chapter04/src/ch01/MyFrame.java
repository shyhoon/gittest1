package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("ù��° GUI ���α׷� �ۼ�"); 				// �������� �̸�
		setSize(400,400); 								// ������ ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// ������â ������ �ֵܼ� ���� ,���α׷� ���� ����
		setVisible(true);								// ������ â ���� ����
	}
	public static void main(String[] args) {
	
		new MyFrame(); // �޸𸮿� �ø��⸸ �Ѱ� 
		
		
		
	}
	
}
//�����ڵ� ���� ���� �����ϱ� ctrl spce�ε��°�
// GUI�����Ҷ� ��ġ���������α׷��� �߾ƴ°� �����Ҷ� ���ϴ� (�̹� ������� ��ư������ ������� ��ġ�Ұ��ΰ�)
//JFrame.EXIT_ON_CLOSE --> new�� ������ Ŭ���� �̸����� �����ϴ°� static����
//JFrame -> gui���α׷� ���� �� �ִµ���