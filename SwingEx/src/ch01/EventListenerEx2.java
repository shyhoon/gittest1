package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

class MyFrame2 extends SuperMyFrame implements ActionListener { // implements는 상속할때가 아닌 기능을 추가할때 사용하자

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
		setTitle("이벤트 리스너 연습2");
		setSize(500, 500);

		for (int i = 0; i < BUTTONLENGTH; i++) {

			button.add(new JButton("이벤트 버튼" + (i + 1)));
		}
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();								// super.이부분을 넣어줘야지 부모클래스의 메서드의 내용이 실행된다
		setLayout(new FlowLayout());

		for (int i = 0; i < BUTTONLENGTH; i++) {
//			add(button[i]);
			add(button.get(i)); 							//ArrayList에서는 get메서드를 써서 불러와야한다.
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
//			System.out.println("버튼이 눌러 졌습니다.");
		JButton clickedButton = (JButton) e.getSource(); 	// getsource 의 리턴타입이 최상위클래스라서 다운캐스팅해줘야한다
		System.out.println(clickedButton.getText()); 		// e.getSource();는 이벤트가 발생한 개체를 가져오는 역할
															// .getText()는 String값을 가져온다

		if (clickedButton.getText().equals(button.get(0).getText())) {	// 문자열 비교
			System.out.println("1번 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button.get(1).getText())) {
			System.out.println("2번 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button.get(2).getText())) {
			System.out.println("3번 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button.get(3).getText())) {
			System.out.println("4번 버튼이 클릭되었습니다.");
		} else if (clickedButton.getText().equals(button.get(4).getText())) {
			System.out.println("5번 버튼이 클릭되었습니다.");
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

//button1 = new JButton("이벤트 버튼 1");
//button2 = new JButton("이벤트 버튼 2");
//button3 = new JButton("이벤트 버튼 3");
//button4 = new JButton("이벤트 버튼 4");
//button5 = new JButton("이벤트 버튼 5");

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