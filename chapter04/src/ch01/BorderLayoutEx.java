package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = { "��", "����", "��", "��", "��" };
	String[] directions = { BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.EAST,
			BorderLayout.WEST };

	// A.B�̸� �ϳ��� �����Ѵ�
	// BorderLayout.NORTH�̸� BorderLayout�̶� NORTH�� ���ε��ΰ� �ƴϰ� �ϳ��ΰ�
	// BorderLayout������ NORTH�� �����϶�� ��ɾ�
	// ���� NORTH�� ������Ÿ�Ը� �˸�ȴ�
	// ���� �����ڵ带 Ȯ���غ��� NORTH�޼���� static�̶� ��ü�� �������ص� Ŭ�����������Ͽ� �ٷ� ��� �����ϴ�.

	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayout ����"); // = super.setTitle("BorderLayout ����);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		borderLayout = new BorderLayout();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
			// 0 <- (��),1<-(����),...
		}
	}

	private void setInitLayout() { 
		setVisible(true); 
		// for
//		super.add(buttons[1],BorderLayout.NORTH);
//		super.add(buttons[1],BorderLayout.CENTER);
//		super.add(buttons[2],BorderLayout.SOUTH);
//		super.add(buttons[3],BorderLayout.EAST);
//		super.add(buttons[4],BorderLayout.WEST);

		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i]);
		}

	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
// gui���α׷��� ���鶧�� �׻� Ʋ�� ���� ������(������� �Ͻô� ���·� ����)