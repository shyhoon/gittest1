package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {

	JButton button;
	JButton button2;

	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�͸�����ü ����غ���");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("�̺�Ʈ ��� �� ���");
		button2 = new JButton("�̺�Ʈ ��� �� ���2");

	}

	private void setInitLayout() {
		setVisible(true);
//		setLayout(new FlowLayout()); 					
		add(button, BorderLayout.NORTH); 				
		add(button2, BorderLayout.SOUTH);

	}

	private void addEventListener() {

//		 ������ implements��ActionListener�� �����ϰ� this�� �ڱ��ڽ��� �����ѵ� ������
//		 addActionListener��()�ȿ� ������Ÿ���� ActionListener�� ()�ȿ� new ActionListener�� ����ؼ� 
//		 �޼��� ���������θ� �����ص� �ȴ�
//		 addMouseListener(new MouseListener()�� ���� ����
		
		ActionListener ac = new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) { 
															 
				System.out.println("��ư Ŭ����");
				System.out.println("���� �˾Ƽ� ���� �ڵ� �ۼ����ּ���");
			}
		};



		// �̷��Ե� ����
		button.addActionListener(ac);
		button2.addActionListener(ac);

	}
//		button.addActionListener(new ActionListener() {
//			
//			// �߻�޼��带 �Ϲݸ޼���� ����
//			 public void actionPerformed(ActionEvent e){
//				 
//			 }
//		});

		
		
		
//		
//		button.addActionListener(new ActionListener() {   
//			@Override									 
//			public void actionPerformed(ActionEvent e) { 
//				System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�.");
//			}
//		});
//		button2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�.2");
//			}
//		});
//
//	}

	public static void main(String[] args) {

//		�͸� Ŭ����(�ν��Ͻ� ������ ���� ������(���� ������ �ȵ��ִٴ� ��) �����ؼ� ����Ҽ��� ����)
		new MyFrame4();

//		�ν��Ͻ� ������ �����Ǿ��־ �����ؼ� ��� ����
		MyFrame4 mf = new MyFrame4();
		mf.button.setText("�ȳ��ϼ���");
	}

}
// �͸� ���� ��ü
// ��ȸ���� �������̽��� �͸� ���� ��ü�� ����� ����� �� �ִ�.
// �������� �̺�Ʈ �����ʸ� ����Ҷ����� ������ �����ʸ� ����������ϴµ� �׷��� ������ �������̽����� �߻�޼��尡 �ʹ� ���⶧���� ������
// ������ϴ°� �ʹ� ��������
//
// �ý��� �ݹ� : �̺�Ʈ�� �߻��ϸ� �� �޼��尡 ȣ��ǰ� e�� �̺�Ʈ�� ȯ�������� ����,�ڵ�����̳����� ��������

// ���̾ƿ��� �����Ͽ� ���										
// ���̾ƿ��� ������ϰ� ���	
// ���̾ƿ� ������ ���ϸ� �⺻�� BorderLayout�� �ȴ�
// ���� BorderLayout�� ������ ���� ���ص� �̷��� ��� ����








