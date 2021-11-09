package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {
	
	JTextArea area; 													// JTextArea 글자를 한번에 많이 쓰는 녀석?
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
		
	}
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
		
	}
	private void addEventListener() {
//		area.addKeyListener(this); 								// 만약 KeyListener을 구현받았다면 다형성으로 this를 써도 가능
		area.addKeyListener(new KeyAdapter() { 							// 어댑터패턴도 디자인패턴 중 하나
			@Override
			public void keyPressed(KeyEvent e) {     					// Event e 형식이 있으면 시스템 콜백 메서드
				
				if (e.getKeyCode()== KeyEvent.VK_UP ) {
					area.append("위쪽 방향키 눌러짐");						// .append()메서드 덧붙이는 역할 
				} else if (e.getKeyCode()== KeyEvent.VK_DOWN){ 			
					area.append("아래쪽 방향키 눌러짐");		    	// .getKeyCode()메서드 이벤트발생한 키의 코드를 가져오는 역할
				} else if (e.getKeyCode()== 37) {						
					area.append("왼쪽 방향키 눌러짐");
				} else if (e.getKeyCode()==39) {
					area.append("오른쪽 방향키 눌러짐");
				}
			}
		});
		}

	// 문자를 눌렀을 때 호출, 문자키에만 반응
//	@Override
//	public void keyTyped(KeyEvent e) { 
								
//		System.out.println("keyTyped : " + e.getID());
//	}
	// 키보드를 눌렀을 때 호출, 모든 키보드에 반응
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed :" + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + ""); 									// + "" 문자열로 변환
//		area.append(e.getKeyCode()+ "\n"); 									// "\n" 문자열 한칸 띄어쓰기
		
		// 위쪽 방향키 눌러짐
		// 아래쪽 방향키
		// 왼쪽 방향키
		// 오른쪽 방향키
//		
//		if (e.getKeyCode()== KeyEvent.VK_UP ) {
//			area.append("위쪽 방향키 눌러짐");
//		} else if (e.getKeyCode()== KeyEvent.VK_DOWN){ // 좀더 의미있는 코드로 변경
//			area.append("아래쪽 방향키 눌러짐");
//		} else if (e.getKeyCode()== 37) {
//			area.append("왼쪽 방향키 눌러짐");
//		} else if (e.getKeyCode()==39) {
//			area.append("오른쪽 방향키 눌러짐");
//		}
//		
		
//		
//	}
//	// 키보드를 뗐을 때 호출 , 모든 키보드에 반응합니다.
//	@Override
//	public void keyReleased(KeyEvent e) {
////		System.out.println("keyReleased : " + e.getID());
//		
//	}
	
//	private void addEventListener() {
//		area.addKeyListener(new KeyAdapter() { 	//KeyAdapter는 추상클래스인데 왜 new를 사용하여 객체를 구현할 수 있나요?			
//			@Override
//			public void keyPressed(KeyEvent e) {     					
//				
//				if (e.getKeyCode()== KeyEvent.VK_UP ) {
//					area.append("위쪽 방향키 눌러짐");						 
//				} else if (e.getKeyCode()== KeyEvent.VK_DOWN){ 			
//					area.append("아래쪽 방향키 눌러짐");		    
//				} else if (e.getKeyCode()== 37) {						
//					area.append("왼쪽 방향키 눌러짐");
//				} else if (e.getKeyCode()==39) {
//					area.append("오른쪽 방향키 눌러짐");
//				}
//			}
//		});
//		}
//	
	
}
