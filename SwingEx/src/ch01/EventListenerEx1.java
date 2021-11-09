package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener{
	// ����ڰ� ��ư�� ������ �̺�Ʈ�� �޾Ƽ� �޼��带 ���� 
	JButton button;
	JButton button2;
	
	// �޼��带 �̷������� �����ؼ� ����ϴ°� �������� ���������� ���ؼ� ���
	public MyFrame1() {
		initData(); 
		setInitLayout();
		addEventListener();// ���� initData();�� ���� �Ʒ��� ���� nullpointexception�� �Ͼ�� �ڵ��� �帧�� ���������� �Ʒ��⶧����
	}

	private void initData() {
		setTitle("�̺�Ʈ ������ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("button1");
		button2 = new JButton("button2");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
		add(button2);
	}
	private void addEventListener() {    // �̺�Ʈ�� ��´� , ������ ĳġ�Ѵٴ� �ǹ�/ 
		button.addActionListener(this); // JButton�� �޼���,button�� ActionListener�� ����ϴ� �޼��� ,��ư�� ������ �ý��ۿ� �˷��޶�� �ǹ�
		button2.addActionListener(this); // this�� �� �ڽ�/addActionListener �̺�Ʈ�� ����ϴ� ����
	}

	@Override
	public void actionPerformed(ActionEvent e) { // �׼��� ���ϸ� ������ �Ѵٴ� �޼��� ,addActionListener�� ������ �ĺ��Ǹ� actionPerformed�� ����
		System.out.println("�ý��� �ݹ� ����");		// ActionListener�� ����������� ��밡��
		System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�."); // �ϴ� �׼��� ���ϴ°� �ý��ۿ��� �˾ƾ��ϴϱ� addActionListener(this);�� �߰��ؾ��Ѵ�
		System.out.println(e);			//actionPerforme�޼����� e��  ȯ�������� �˷��ش� ��ư 1�� ���ȴ��� ��ư 2�����ȴ����� ���� �ٸ����ڱ׷� Ȱ��
												// 
		
	}
	
	
	// �̺�Ʈ �����ʸ� �ϸ� ����ڰ� ��ư�� �������� �˷��޶�°�,�ݹ� ���Ѵ޶�°�- �ݹ�޼��� ,�ý��� �ݹ� 
	
}


public class EventListenerEx1 {
	public static void main(String[] args) {
	
		new MyFrame1();
	}
	
	
}
