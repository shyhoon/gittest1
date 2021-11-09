package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

class MyFrame2 extends SuperMyFrame implements ActionListener { // implements�� ����Ҷ��� �ƴ� ����� �߰��Ҷ� �������

	final int BUTTONLENGTH = 5;

	ArrayList<JButton> button = new ArrayList<>();

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	@Override
	protected void initData() {
		super.initData();				
		setTitle("�̺�Ʈ ������ ����2");
		setSize(500, 500);

		for (int i = 0; i < BUTTONLENGTH; i++) {

			button.add(new JButton("�̺�Ʈ ��ư" + (i + 1)));
		}
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();								// super.�̺κ��� �־������ �θ�Ŭ������ �޼����� ������ ����ȴ�
		setLayout(new FlowLayout());

		for (int i = 0; i < BUTTONLENGTH; i++) {
//			add(button[i]);
			add(button.get(i)); 							//ArrayList������ get�޼��带 �Ἥ �ҷ��;��Ѵ�.
		}
	}

	@Override
	protected void addEventListener() {

		for (int i = 0; i < BUTTONLENGTH; i++) {
			button.get(i).addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//			System.out.println("��ư�� ���� �����ϴ�.");
		JButton clickedButton = (JButton) e.getSource(); 	// getsource �� ����Ÿ���� �ֻ���Ŭ������ �ٿ�ĳ����������Ѵ�
		System.out.println(clickedButton.getText()); 		// e.getSource();�� �̺�Ʈ�� �߻��� ��ü�� �������� ����
															// .getText()�� String���� �����´�

		if (clickedButton.getText().equals(button.get(0).getText())) {	// ���ڿ� ��
			System.out.println("1�� ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button.get(1).getText())) {
			System.out.println("2�� ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button.get(2).getText())) {
			System.out.println("3�� ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button.get(3).getText())) {
			System.out.println("4�� ��ư�� Ŭ���Ǿ����ϴ�.");
		} else if (clickedButton.getText().equals(button.get(4).getText())) {
			System.out.println("5�� ��ư�� Ŭ���Ǿ����ϴ�.");
		}

	}

}


public class EventListenerEx2 {
	public static void main(String[] args) {

		new MyFrame2();

	}
}
//JButton button1;
//JButton button2;
//JButton button3;
//JButton button4;
//JButton button5;

//button1 = new JButton("�̺�Ʈ ��ư 1");
//button2 = new JButton("�̺�Ʈ ��ư 2");
//button3 = new JButton("�̺�Ʈ ��ư 3");
//button4 = new JButton("�̺�Ʈ ��ư 4");
//button5 = new JButton("�̺�Ʈ ��ư 5");

//add(button1);
//add(button2);
//add(button3);
//add(button4);
//add(button5);

//button1.addActionListener(this);    
//button2.addActionListener(this);
//button3.addActionListener(this);
//button4.addActionListener(this);
//button5.addActionListener(this);