package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame implements ActionListener{
		
	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
	
	Color[] colors = new Color[] {Color.RED,Color.YELLOW,Color.BLUE,Color.GREEN};
	ArrayList<JButton> buttons = new ArrayList<JButton>(); // ��� ����Ʈ ����� ���ÿ� �ʱ�ȭ?
	String[] colorName = new String[]{"������","�����","�Ķ���","�ʷϻ�"};
	
	final int BUTTON_SIZE = 4;
	final int PANEL1_BUTTON_SIZE = 2;
	final int PANEL2_BUTTON_SIZE = 4;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	@Override
	protected void initData() {
		super.initData();
		setTitle("�̺�Ʈ ������ ���� 3");
		setSize(500,500);
		borderLayout =  new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();

		for (int i = 0; i <BUTTON_SIZE; i++) {
			buttons.add(new JButton(colorName[i]));
		}
//		button1 = new JButton();
//		button2 = new JButton("�����");
//		button3 = new JButton("�Ķ���");
//		button4 = new JButton("�ʷϻ�");
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();     
		setLayout(borderLayout);
		panel1.setBackground(Color.GRAY);				//.setBackground(Color.GRAY); ���� �������ִ� �޼���
		panel1.setPreferredSize(new Dimension(500,400)); // .setPreferredSize(new Dimension()); �г��� ũ�⸦ �����ϴ� �޼���
		add(panel1,BorderLayout.NORTH);
		
		panel2.setBackground(Color.WHITE);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500,100));
		add(panel2);
		
//		panel1.add(button1);	//�гο� ���̷��� 
//		panel1.add(button3);
		for (int i = 0; i < PANEL1_BUTTON_SIZE; i++) {
			panel1.add(buttons.get(i)); 
			// �߿�!!!!!!!!!!!!!!!!!! ������ arraylist�� ȣ���Ϸ��� buttons[i]�� �ƴ϶� get()�޼���!!!!�� ����Ͽ� buttons.get(i)�ؼ� �����;��Ѵ�!!!!
		}
		for (int i = 2; i < PANEL2_BUTTON_SIZE; i++) {
			panel2.add(buttons.get(i));
		}
		
//		panel2.add(button2);
//		panel2.add(button4);
	}
	
	@Override
	protected void addEventListener() {
//		button1.addActionListener(this);
//		button2.addActionListener(this);
//		button3.addActionListener(this);
//		button4.addActionListener(this);
		for (int i = 0; i < BUTTON_SIZE; i++) {
			buttons.get(i).addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//1�� ��ư�� ���� ������ panal1������ ���������� ����
		//2�� ��ư�� ����������  panal2������ ��������� ����
		JButton clickedButton = (JButton)e.getSource();
		
		for (int j = 0; j < BUTTON_SIZE; j++) {
			if(clickedButton.getText().equals(colorName[j])) {
				panel1.setBackground(colors[j]);
			}
		} 
//		if (clickedButton.getText().equals(buttons.get(0).getText())) {
//			panel1.setBackground(Color.RED);
//		} else if (clickedButton.getText().equals(buttons.get(1).getText())) {
//			panel2.setBackground(Color.YELLOW);
//			
//		} else if (clickedButton.getText().equals(buttons.get(2).getText())) {
//			panel1.setBackground(Color.BLUE);
//			
//		} else if (clickedButton.getText().equals(buttons.get(3).getText())) {
//			panel2.setBackground(Color.GREEN);
//			
//		}
//		
		
	}
	// �����Լ�
	public static void main(String[] args) {
		
		new ColorChangeFrame();
		
		
		
		
		
		
		
		
		
		
		
	}
}//end of class
