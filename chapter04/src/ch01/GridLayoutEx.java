package ch01;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	private ArrayList<JButton> buttons = new ArrayList<>(); // 타입추론이되어서 <>안에 없어도 된다
	private final int MAX_COUNT = 6;

	public GridLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("GridLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400, 400);
		for (int i = 0; i < MAX_COUNT; i++) { // <= 버튼을 사용해야하니 버튼을 생성
			buttons.add(new JButton((i + 1) + "")); // 차례대로 담긴다

		}
	}

	private void setInitLayout() {
		// 그리드 레이아웃은 행과 열로 배치할때 사용
		setVisible(true);
		setLayout(new GridLayout(2, 3));
		
		for (int i = 0; i < buttons.size(); i++) { // MAX_COUNT = buttons.size
			add(buttons.get(i));
		}
//		add(buttons.get(0));
//		add(buttons.get(1));
//		add(buttons.get(2));
//		add(buttons.get(3));
//		add(buttons.get(4));
//		
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
//원시코드 자주 확인해보기
// 클래스 안에 들어올 수 있는 문법은
//변수를 선언하거나 동시에 초기화하는거,메서드,생성자만 사용할 수 있다.  
//식을 쓰는건 함수 안에서나 생성자 안에서만 가능