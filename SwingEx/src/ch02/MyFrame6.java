package ch02;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}	
	
	private void initData() {
		setTitle("��� Ŭ���� �̿�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
	}
	private void setInitLayout() {
		setVisible(true);
		
	}
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener()); 		// ����Ŭ������ ����Ҷ� new�� ����ؼ� �Լ��ȿ��� ����
	}

	private class MyMouseListener extends MouseAdapter{ 
		@Override										 
		public void mouseClicked(MouseEvent e) {		
			int x = e.getX();
			int y = e.getY();
			System.out.println("X ��ǥ �� : "+ x);
			System.out.println("Y ��ǥ �� : "+ y);
		}
	}
	
	
	
	// �����Լ�
	public static void main(String[] args) {
		new MyFrame6();
		
		
	}// end of main
}// end of class
// ���� Ŭ���� ����
// �߻�Ŭ������ new Ű���带 ����� �� ���� . --> Ŭ������ Ÿ�����θ� �����Ѵ�.
// ����� �����̶� �߻�޼��� �� �����ϰ� (�Ϲ� �޼���� �� ��ȯ) {�������}
// ��� Ŭ������ �ʿ��� �޼��常 ����� �� �ִ� ����
// ����Ŭ������ Ŭ�����ϱ� ����� ���� �� �ִ�.

// jdk���� �̹� ��������ִ� Ŭ����
//MouseAdapter���� ������ �������̽����� �޼��带 ���� �Ϲݸ޼���� �����ּ� �ʿ��Ѱ͸� ������(�������̵�)�ؼ� ���
//MouseAdapter�� �߻�Ŭ������ �������̽�ó�� �����ϴ°� �ƴϰ� ������θ� �ȴ� ���� MyFrame6������ �̹� JFrame�� ��ӹ޾Ƽ� 
//���̻� ��ӹ��� ���ϹǷ� ����Ŭ������ ����� �� ����Ŭ������ MouseAdapter�� ��ӹ�����