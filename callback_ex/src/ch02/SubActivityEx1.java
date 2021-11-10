package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivityEx1 extends JFrame implements ActionListener{

	JButton btnAdd;
	JButton btnMinus;
	JButton btnMultiple;
	
	CallBackBtn2 callBackBtn2;
	
	public SubActivityEx1(CallBackBtn2 callBackBtn2) {
		this.callBackBtn2 = callBackBtn2;
	
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnMultiple = new JButton("곱하기 버튼");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnMultiple);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMultiple.addActionListener(this);
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton eventBtn = (JButton) e.getSource();
		
		if (eventBtn == btnAdd) {
			callBackBtn2.clickedAddBtn();
		} else if(eventBtn == btnMinus){
			callBackBtn2.clickedMinusBtn();
		}else if(eventBtn == btnMultiple) {
			callBackBtn2.clickedMultipleBtn();
		}
	}
	
}
