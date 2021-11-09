package ch02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {

	JButton button;
	JButton button2;

	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("익명구현객체 사용해보기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("이벤트 등록 후 대기2");

	}

	private void setInitLayout() {
		setVisible(true);
//		setLayout(new FlowLayout()); 					
		add(button, BorderLayout.NORTH); 				
		add(button2, BorderLayout.SOUTH);

	}

	private void addEventListener() {

//		 원래는 implements로ActionListener를 구현하고 this로 자기자신을 가리켜도 되지만
//		 addActionListener의()안에 데이터타입이 ActionListener라서 ()안에 new ActionListener를 사용해서 
//		 메서드 내부적으로만 생성해도 된다
//		 addMouseListener(new MouseListener()도 같은 이유
		
		ActionListener ac = new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) { 
															 
				System.out.println("버튼 클릭됨");
				System.out.println("추후 알아서 구분 코드 작성해주세요");
			}
		};



		// 이렇게도 가능
		button.addActionListener(ac);
		button2.addActionListener(ac);

	}
//		button.addActionListener(new ActionListener() {
//			
//			// 추상메서드를 일반메서드로 구현
//			 public void actionPerformed(ActionEvent e){
//				 
//			 }
//		});

		
		
		
//		
//		button.addActionListener(new ActionListener() {   
//			@Override									 
//			public void actionPerformed(ActionEvent e) { 
//				System.out.println("버튼이 클릭 되었습니다.");
//			}
//		});
//		button2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("버튼이 클릭 되었습니다.2");
//			}
//		});
//
//	}

	public static void main(String[] args) {

//		익명 클래스(인스턴스 변수가 없기 때문에(변수 지정이 안돼있다는 말) 접근해서 사용할수는 없다)
		new MyFrame4();

//		인스턴스 변수가 지정되어있어서 접근해서 사용 가능
		MyFrame4 mf = new MyFrame4();
		mf.button.setText("안녕하세요");
	}

}
// 익명 구현 객체
// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수 있다.
// 여러가지 이벤트 리스너를 사용할때마다 각각의 리스너를 구현해줘야하는데 그러면 각각의 인터페이스들의 추상메서드가 너무 많기때문에 재정의
// 해줘야하는게 너무 많아진다
//
// 시스템 콜백 : 이벤트가 발생하면 이 메서드가 호출되고 e에 이벤트의 환경정보가 담긴다,코드수행이끝나면 없어진다

// 레이아웃을 선언하여 사용										
// 레이아웃을 선언안하고 사용	
// 레이아웃 선언을 안하면 기본인 BorderLayout이 된다
// 따라서 BorderLayout은 선언을 따로 안해도 이렇게 사용 가능








