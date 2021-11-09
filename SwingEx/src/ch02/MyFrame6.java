package ch02;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}	
	
	private void initData() {
		setTitle("어뎁터 클래스 이용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
	}
	private void setInitLayout() {
		setVisible(true);
		
	}
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener()); 		// 내부클래스를 사용할땐 new를 사용해서 함수안에서 생성
	}

	private class MyMouseListener extends MouseAdapter{ 
		@Override										 
		public void mouseClicked(MouseEvent e) {		
			int x = e.getX();
			int y = e.getY();
			System.out.println("X 좌표 값 : "+ x);
			System.out.println("Y 좌표 값 : "+ y);
		}
	}
	
	
	
	// 메인함수
	public static void main(String[] args) {
		new MyFrame6();
		
		
	}// end of main
}// end of class
// 내부 클래스 생성
// 추상클래스는 new 키워드를 사용할 수 없다 . --> 클래스에 타입으로만 존재한다.
// 어댑터 패턴이란 추상메서들 다 구현하고 (일반 메서드로 다 변환) {비워놓음}
// 어뎁터 클래스는 필요한 메서드만 사용할 수 있는 역할
// 내부클래스도 클래스니까 상속을 받을 수 있다.

// jdk에서 이미 만들어져있는 클래스
//MouseAdapter안의 구현한 인터페이스들의 메서드를 전부 일반메서드로 만들어둬서 필요한것만 재정의(오버라이드)해서 사용
//MouseAdapter는 추상클래스라서 인터페이스처럼 구현하는게 아니고 상속으로만 된다 따라서 MyFrame6에서는 이미 JFrame을 상속받아서 
//더이상 상속받지 못하므로 내부클래스를 만들고 그 내부클래스에 MouseAdapter를 상속받은것