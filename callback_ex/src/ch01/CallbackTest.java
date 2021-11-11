package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


interface CallbackBtnAction {										// 인터페이스 선언
	public abstract void clickedAddBtn();

	public void clickedMinusBtn();

	public void clickedMultipleBtn();

	// 매개 변수로 값 전달 가능
	public void passValue(int value);

}// end of interface

class MainActivity extends JFrame implements CallbackBtnAction {	// 콜백 받는 객체 (구현한 인터페이스 재정의)

	int count; 														// 재정의할때 쓸 멤버변수들
	int c1;																
	JLabel label;													

	public MainActivity() {											
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);

	}

	@Override
	public void clickedAddBtn() {									// 콜백되어지는 메서드
		 
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스 콜백 받았습니다.");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("곱하기 콜백 받았습니다.");
		int countMultiple = this.count * this.count;
		this.count = countMultiple;
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		System.out.println("value 값을 전달 받음 :" + value);
		label.setText(value + "");
	}

}// end of mainActivity


class SubActivity extends JFrame implements ActionListener {// 콜리 (호출자)
														// :콜백 받는 객체의 주소값을 알고 있어야 메서드를 호출 가능
	JButton btnAdd;
	JButton btnMinus;
	JButton btnMultiple;
	JButton btnPassValue;

	CallbackBtnAction callbackBtnAction; 						// 콜백 받는 객체의 주소값을 넣을 공간

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요!!
		this.callbackBtnAction = callbackBtnAction; // 콜백할 객체를 메서드 밖으로 꺼내어 다른 메서드가 사용하게 만들기
													// 다형성으로 CallbackBtnAction를 가지고있는 MainActivity
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnMultiple = new JButton("곱하기 버튼");
		btnPassValue = new JButton("값 전달 버튼");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		btnAdd.addActionListener(this);
		add(btnMinus);
		btnMinus.addActionListener(this);
		add(btnMultiple);
		btnMultiple.addActionListener(this);
		add(btnPassValue);
		btnPassValue.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) { //SubActivity에서 이벤트를 확인하면 MainActivity로 콜백되며실행

		JButton targetBtn = (JButton) e.getSource();
		
		if (targetBtn == btnAdd) {
			callbackBtnAction.clickedAddBtn(); 							// MainActivity의 메서드로 콜백
		} else if (targetBtn == btnMinus) {
			callbackBtnAction.clickedMinusBtn();
		} else if (targetBtn == btnMultiple) {
			callbackBtnAction.clickedMultipleBtn();
		} else if (targetBtn == btnPassValue) {
			callbackBtnAction.passValue(100);
		}
	}
}

public class CallbackTest {
	public static void main(String[] args) {

		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);

	}
}
//항상 창의적으로 배운걸 토대로 새로운걸 만들어봐야지 실력이 는다
	// 남는시간에 응용을해서 뭔가를 만들어보자


// 콜백 받는 코드
// 인터페이스를 만들어서 구현하여 재정의하고  누군가가 재정의한 메서드를 호출하면 재정의한 메서드 실행
// 서로 다른객체가 콜백을 통해서 상호작용하게 만든다


