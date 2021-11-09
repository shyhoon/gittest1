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
	ArrayList<JButton> buttons = new ArrayList<JButton>(); // 어레이 리스트 선언과 동시에 초기화?
	String[] colorName = new String[]{"빨간색","노란색","파란색","초록색"};
	
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
		setTitle("이벤트 리스너 연습 3");
		setSize(500,500);
		borderLayout =  new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();

		for (int i = 0; i <BUTTON_SIZE; i++) {
			buttons.add(new JButton(colorName[i]));
		}
//		button1 = new JButton();
//		button2 = new JButton("노란색");
//		button3 = new JButton("파란색");
//		button4 = new JButton("초록색");
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();     
		setLayout(borderLayout);
		panel1.setBackground(Color.GRAY);				//.setBackground(Color.GRAY); 색을 지정해주는 메서드
		panel1.setPreferredSize(new Dimension(500,400)); // .setPreferredSize(new Dimension()); 패널의 크기를 지정하는 메서드
		add(panel1,BorderLayout.NORTH);
		
		panel2.setBackground(Color.WHITE);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500,100));
		add(panel2);
		
//		panel1.add(button1);	//패널에 붙이려면 
//		panel1.add(button3);
		for (int i = 0; i < PANEL1_BUTTON_SIZE; i++) {
			panel1.add(buttons.get(i)); 
			// 중요!!!!!!!!!!!!!!!!!! 생성된 arraylist을 호출하려면 buttons[i]가 아니라 get()메서드!!!!를 사용하여 buttons.get(i)해서 가져와야한다!!!!
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
		
		//1번 버튼이 눌러 졌으면 panal1색상을 빨간색으로 변경
		//2번 버튼이 눌러졌으면  panal2색상을 노란색으로 변경
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
	// 메인함수
	public static void main(String[] args) {
		
		new ColorChangeFrame();
		
		
		
		
		
		
		
		
		
		
		
	}
}//end of class
