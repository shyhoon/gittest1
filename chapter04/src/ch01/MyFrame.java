package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("첫번째 GUI 프로그램 작성"); 				// 프레임의 이름
		setSize(400,400); 								// 프레임 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 프레임창 꺼지면 콘솔도 종료 ,프로그램 완전 종료
		setVisible(true);								// 프레임 창 실행 유무
	}
	public static void main(String[] args) {
	
		new MyFrame(); // 메모리에 올리기만 한것 
		
		
		
	}
	
}
//원시코드 보는 연습 많이하기 ctrl spce로들어가는거
// GUI공부할때 배치관리자프로그램을 잘아는게 개발할때 편하다 (이미 만들어진 버튼같은걸 어떤식으로 배치할것인가)
//JFrame.EXIT_ON_CLOSE --> new를 쓰기전 클래스 이름으로 접근하는것 static변수
//JFrame -> gui프로그램 만들 수 있는도구