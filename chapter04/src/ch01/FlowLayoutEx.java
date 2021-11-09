package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{

	// 공간 생성
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	final int JBUTTONS_SIZE = 6;
	
	// 레이아웃 틀 만들기
	
	//1. 생성자
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	//2. 값을 초기화해주는 메서드
	private void initData() {
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT,1,10)); // -->배치관리자 layout방식 선택

		for (int i = 0;i<JBUTTONS_SIZE; i++) {
			System.out.println("i"+i);
		buttons.add(new JButton((i+1)+"번째 버튼"));
	}
	}// end of initData

	// 3. 값을 수정하는 메서드
	private void setInitLayout() {
		setVisible(true);
	
//		add(buttons[0]); // add는 생성된 버튼(컴퍼넌트)을 붙이겠다는 걸 의미 
//		add(buttons[1]);

		for (int i = 0;i<JBUTTONS_SIZE; i++) {
			add(buttons.get(i)); // .연산자는 제일 마지막거가 결과값
		}
		
		int i = 0;
		for (JButton jButton : buttons) {
			add(buttons.get(i));
			i++;
		}
		
	}// end of setInitLayout

		
}//  end of MyFrame2

public class FlowLayoutEx {

	public static void main(String[] args) {
		
		new MyFrame2();
		
		
		
	}
}

// 문제 해결능력 C R U D
// 분할앤정복방식 <-- 문제 해결 방식 하나씩 짤라서 구글링하며 해결 
// 1. 생성방법
// 2. 값을 추가하는 방법
// 3. 값을 추가하는 방법


//배열을 사용해서 변경해주세요.

//private JButton button1;
//private JButton button2;
//private JButton button3;
//private JButton button4;
//private JButton button5;
//private JButton button6;
//

//JButton button1 = new JButton();
//JButton button2 = new JButton();
//JButton button3 = new JButton();
//JButton button4 = new JButton();
//JButton button5 = new JButton();
//JButton button6 = new JButton();
//private JButton[] buttons1 = new JButton[]{button1,button2,button3,button4};
//private JButton[] buttons = new JButton[6];



//buttons[0] = button1;
//buttons[1] = button2 ;
//buttons[2] = button3 ;
//buttons[3] = button4;
//buttons[4] = button5;
//buttons[5] = button6 ;


//	 클래스는 설계도인데 클래스에서 실행문을 사용하여 프로그램을 실행 시킬 수 없다 실행문은 생성자나 함수안에서만 사용 가능하다
// 	그래서 클래스에선 sysout도 할 수 없다.
// 순서대로 실행되는건 생성자나 함수 안에 넣어야한다 클래스안에 실행문을 넣으면 실행문이 실제로 런타임 중에 정확히 어느 시점에 실행되는지 정하기도 모호

//1.	private JButton[] buttons1 = new JButton[]{button1,button2,button3,button4}; 
// 이 경우는 생략된 생성자 안에서 이뤄진 실행문이라서 가능한것
//2.	private JButton[] buttons2;
//	private MyFrame2() {
//		this.buttons2 = new JButton[6];
//		buttons[0] = button1;
//		buttons[1] = button2 ;
//		buttons[2] = button3 ;
//		buttons[3] = button4;
//		buttons[4] = button5;
//		buttons[5] = button6 ;
//} // 1번과 2번의 코드는 같은거다 생성자에서 했어야하는걸 줄여서 할 수 있게 해주는 문법이다.

// 그러면 어떤것을 실행문이라고 하나?
//클래스에서는 변수 선언문은 가능

// for문 변경
// 배열을 사용하는 방법
//buttons[0] = new JButton("1번째 버튼");
//buttons[1] = new JButton("2번째 버튼");
//buttons[2] = new JButton("3번째 버튼");
//buttons[3] = new JButton("4번째 버튼");
//buttons[4] = new JButton("5번째 버튼");
//buttons[5] = new JButton("6번째 버튼");

//for (int i = 0; i < buttons.length; i++) {
//	buttons[i] = new JButton();
//	System.out.println(i+"번째 버튼");
//}


// ArrayList 사용하는 방법1
// for문 변경
// ArrayList는 처음사이즈가 0입니다.
//buttons.add(new JButton ("1번째 버튼"));
//buttons.add(new JButton ("2번째 버튼"));
//buttons.add(new JButton ("3번째 버튼"));
//buttons.add(new JButton ("4번째 버튼"));
//buttons.add(new JButton ("5번째 버튼"));
//buttons.add(new JButton ("6번째 버튼"));

//int i = 0;
//for (JButton jButton : buttons) { //--> foreach문은 인덱스에 접근하지 못하므로 여기선 사용하면 안된다
//	jButton =  new JButton();
//	i++;
//	System.out.println(  i+"번째 버튼");
//}



//for (int i = 0;  i< buttons.length; i++) {
//	add(buttons[i]);
//	System.out.println(i+"번재 버튼");
//}



//add(buttons.get(0)); 
//add(buttons.get(1)); 
//add(buttons.get(2)); 
//add(buttons.get(3)); 
//add(buttons.get(4)); 

