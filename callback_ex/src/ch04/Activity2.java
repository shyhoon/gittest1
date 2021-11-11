package ch04;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity2 extends JFrame{
	
	String name;
	JPanel panel;
	CallbackCheckPosition checkPosition;							// 익명클래스가 담긴다
	

	public Activity2(String name) {									// 콜리 (호출자),생성자
		this.name = name;
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		setVisible(true);
		add(panel);
		panel.setBackground(Color.yellow);
		
		// 마우스 리스너 생성
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				// 방어적 코드
				if (checkPosition != null) {
					checkPosition.checkPosition(x, y);     // Activity1 익명클래스의 checkPosition메서드 실행
				}
			}
		});
	}
	
	// 메서드를 통해서 연결 // 주소값을 생성자의 매개변수에서 못받는 경우가 생기기도 하는데 그럴경우는 메서드를 통해서 주소값을 받을 수 있다
	
	public void setCallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
		this.checkPosition = callbackCheckPosition; 		
	}
	
	
}
