package ch06; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener{

	
	JButton button;
	LottoPanel lottoPanel;
	LottoNumber lottoNumber;
	int[]lotto = new int [LottoNumber.LOTTO_NUM_SIZE]; 						// 생성과동시에 초기화
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("로또 번호 생성기");
		setSize(600,400);
		button = new JButton("++로또번호 생성++");
		lottoPanel = new LottoPanel();
		lottoNumber = new LottoNumber();
	}
	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.gray);
		add(button,BorderLayout.NORTH);
		add(lottoPanel,BorderLayout.CENTER);
	}
	private void addEventListener() {
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) { 							// 시스템 콜백
		// 6자리 랜덤 숫자가 배열로 넘어온다
		lotto = lottoNumber.getLottoNumber();
		repaint(); 								// 같은 클래스에 내부클래스가 있으서 코드의 흐름대로 밑에 있는 내부클래스가 실행되며 repaint
	}
	
	class LottoPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Font font = new Font("궁서체", Font.BOLD,20);						// Font
			g.setFont(font);
			
			if (lotto[0]==0) { 											// 아무런 값을 주지않았고 데이터타입이 int라 기본값이 0
				g.drawString("로또 버튼을 클릭하세요", 180, 180);
				return; 											// 밑에의 코드는 수행되지 않고 즉시 종료 안그러면 000000패널표시
			}
			int xPoint = 150;
			for (int i = 0; i < lotto.length; i++) {
				g.drawString(lotto[i]+"", xPoint, 150);
				xPoint+=50;
			}
		}
		
	}
	public static void main(String[] args) {
		new LottoFrame();
	}
	
	
	
	
}
