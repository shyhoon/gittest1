package ch01;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	private ArrayList<JButton> buttons = new ArrayList<>(); // Ÿ���߷��̵Ǿ <>�ȿ� ��� �ȴ�
	private final int MAX_COUNT = 6;

	public GridLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("GridLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400, 400);
		for (int i = 0; i < MAX_COUNT; i++) { // <= ��ư�� ����ؾ��ϴ� ��ư�� ����
			buttons.add(new JButton((i + 1) + "")); // ���ʴ�� ����

		}
	}

	private void setInitLayout() {
		// �׸��� ���̾ƿ��� ��� ���� ��ġ�Ҷ� ���
		setVisible(true);
		setLayout(new GridLayout(2, 3));
		
		for (int i = 0; i < buttons.size(); i++) { // MAX_COUNT = buttons.size
			add(buttons.get(i));
		}
//		add(buttons.get(0));
//		add(buttons.get(1));
//		add(buttons.get(2));
//		add(buttons.get(3));
//		add(buttons.get(4));
//		
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
//�����ڵ� ���� Ȯ���غ���
// Ŭ���� �ȿ� ���� �� �ִ� ������
//������ �����ϰų� ���ÿ� �ʱ�ȭ�ϴ°�,�޼���,�����ڸ� ����� �� �ִ�.  
//���� ���°� �Լ� �ȿ����� ������ �ȿ����� ����