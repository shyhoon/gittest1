package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame{
	
	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel(" hello java ~ ");
		label.setSize(150,50); 								// 크기가 작으면 글자가 짤리기도 한다
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		
		label.setLocation(12,40);							// .setLocation 위치를지정해주는 메서드
	};

	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {			// MouseListener 원래 인터페이스지만 익명구현객체로 생성
			
			// 마우스가 떨어졌을 때 실행되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			// 마우스가 눌러 졌을 때 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			// 마우스가 나갔을 때 실행되는 메서드
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			// 마우스가 들어 왔을 때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			// 마우스가 클릭 되었을 때 실행되는 메서드
			@Override
			public void mouseClicked(MouseEvent e) {		// e는 마우스가 클릭되었을때의 환경정보를 갖고있다 
				System.out.println(e.getX() + ": 좌표값 X"); 	// e.getX() e의 x좌표를 가져오는 메서드 
				System.out.println(e.getY() + ": 좌표값 Y");
				
				label.setLocation(e.getX(),e.getY());		
			}
		});
		
	}
	
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		new MyFrame5();
	}
}
