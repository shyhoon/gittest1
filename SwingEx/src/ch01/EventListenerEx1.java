package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener{
	// 사용자가 버튼을 누르면 이벤트를 받아서 메서드를 동작 
	JButton button;
	JButton button2;
	
	// 메서드를 이런식으로 정리해서 사용하는게 가독성과 유지보수를 위해서 사용
	public MyFrame1() {
		initData(); 
		setInitLayout();
		addEventListener();// 만약 initData();가 여기 아래로 오면 nullpointexception이 일어난다 코드의 흐름은 위에서부터 아래기때문에
	}

	private void initData() {
		setTitle("이벤트 리스너 연습");
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
	private void addEventListener() {    // 이벤트를 듣는다 , 동작을 캐치한다는 의미/ 
		button.addActionListener(this); // JButton의 메서드,button에 ActionListener를 등록하는 메서드 ,버튼을 누르면 시스템에 알려달라는 의미
		button2.addActionListener(this); // this는 나 자신/addActionListener 이벤트를 등록하는 역할
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 액션을 취하면 뭔가를 한다는 메서드 ,addActionListener로 동작이 식별되면 actionPerformed가 실행
		System.out.println("시스템 콜백 실행");		// ActionListener을 구현해줘야지 사용가능
		System.out.println("버튼이 클릭 되었습니다."); // 일단 액션을 취하는걸 시스템에서 알아야하니까 addActionListener(this);를 추가해야한다
		System.out.println(e);			//actionPerforme메서드의 e는  환경정보도 알려준다 버튼 1이 눌렸는지 버튼 2가눌렸는지에 따라 다른동자그로 활용
												// 
		
	}
	
	
	// 이벤트 리스너를 하면 사용자가 버튼을 눌렀을때 알려달라는것,콜백 시켜달라는것- 콜백메서드 ,시스템 콜백 
	
}


public class EventListenerEx1 {
	public static void main(String[] args) {
	
		new MyFrame1();
	}
	
	
}
