package ch02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivityEx1 extends JFrame implements CallBackBtn2{

	
	
	int count;
	int multipleCount;
	JLabel label;
	
	public MainActivityEx1() {
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
	}
	
	@Override
	public void clickedAddBtn() {
		System.out.println(" 더하기 콜백 받았습니다");
		count++;
		label.setText(count +"");
		
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("빼기 콜백 받았습니다");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedMultipleBtn() {
		System.out.println("곱하기 콜백 받았습니다");
		multipleCount = count * count;
		this.count = multipleCount;
		label.setText(count + "");
	}

}
