package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {

	MyPanel myPanel;

	public MyFrame1() {
		inItData();
		setInitLayout();
	}

	private void inItData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();

	}

	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}

	// ���� Ŭ���� // Ŭ�����ȿ� �� �ٸ� Ŭ������ �����ϴ� ����/�ϳ��� Ŭ���������� � Ŭ������ ����Ϸ����Ҷ� ���
	// static(���� ���� Ŭ����), static������ (�ν��Ͻ�,����Ŭ����)
	static class MyPanel extends JPanel { // �гο� �޼��带 �������Ͽ� �׸��� �׸������� �г� Ŭ������ ���� ����°�
											// MyFrame1������ ����Ұ��̱⿡ ����Ŭ������ �ۼ� ->�������� �ϱ⵵ ��������
		@Override
		public void paint(Graphics g) { // JPanel�� �ִ� paint��� �޼���

			g.drawLine(300, 30, 150, 150);
			g.drawLine(300, 30, 450, 150);
			g.drawRect(150, 150, 300, 300);

		}

	}

	public static void main(String[] args) {
		new MyFrame1();
	}
}
