package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스를 선언한다.
interface CallbackBtnAction {
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedMultipleBtn();
	// 매개 변수로 값 전달 가능
	public void passValue(int value);
	
	//3개 메서드

}// end of interface


// 콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의한다.
class MainActivity extends JFrame implements CallbackBtnAction{

	int count;
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
	public void clickedAddBtn() {
		// 콜백되어지는 메서드 : 
		System.out.println(this.getClass().getName()+ "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스 콜백 받았습니다.");
		count--;
		label.setText(count+ "");
		
	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("곱하기 콜백 받았습니다.");
		int countMultiple = this.count *this.count;
		this.count = countMultiple;
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		System.out.println("value 값을 전달 받음 :" + value);
		label.setText(value + "");
	}

}// end of mainActivity



// 콜리 (호출자):콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnMultiple;
	JButton btnPassValue;
	// 버튼 3개 생성
	//1. 멤버 변수로 선언을 해 준다.
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		//중요!!
		this.callbackBtnAction = callbackBtnAction;
		
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
	public void actionPerformed(ActionEvent e) {

//		System.out.println("더하기 버튼이 클릭 되었습니다");
		
		// 1. 버튼 구분
		JButton targetBtn = (JButton) e.getSource();
		if (targetBtn == btnAdd) {
			// 더하기 버튼
			callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus){
			// 빼기 버튼
			callbackBtnAction.clickedMinusBtn();
			
		} else if(targetBtn == btnMultiple) {
			
			callbackBtnAction.clickedMultipleBtn();
		}else if(targetBtn == btnPassValue) {
			
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
