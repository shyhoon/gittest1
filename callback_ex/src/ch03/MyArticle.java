package ch03;

import java.util.Scanner;


public class MyArticle {											//콜리(호출자)

	String article; 
	WriteArticle hacker; 							// 타입을 HackerNews를하던 WriteArticle을 하던 상관없어보인다
	WriteArticle mbc; 
	WriteArticle sbs;

//	HackerNews hacker;
//	MbcNews mbc;
//	SbsNews sbs;
	
// 주소값 연결 // 변수 타입을 뭘로하던 주소값을 넣어서 연결(MyArticle에서 다른 객체로) 시켜준다는게 중요
	
//	public MyArticle(WriteArticle writearticle,WriteArticle mbc,WriteArticle sbs) {
//		this.hacker = writearticle;
//		this.mbc = mbc;
//		this.sbs = sbs;
//	}
	public MyArticle(HackerNews hacker, MbcNews mbc,SbsNews sbs) {
		this.hacker = hacker;
		this.mbc = mbc;
		this.sbs = sbs;
	}
	
	public void complete() {

		Scanner sc= new Scanner(System.in);
		article = sc.nextLine();
		mbc.printArticle(article); 						// 콜백되는 역할  // 이런식으로 콜백이 이뤄진다를 아는게 중요 
		hacker.printArticle(article); 			// 주소값이 MyArticle객체에 저장되어있으니 콜백개념으로 넘어갈 수 있는것
		sbs.printArticle(article);
	}
	
}
// 콜백메서드는 일대일로만 사용안해도되고 일대 다수로 사용도 한다
// 깃쓰다가 편집창 들어갔으면 esc -> :wq입력