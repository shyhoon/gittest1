package ch03;

import java.util.Scanner;

//콜리(호출자)
public class MyArticle {

	String article; // 인터페이스를 공유해야머?
	WriteArticle hacker;
	WriteArticle mbc;
	WriteArticle sbs;
	
	// 주소값 연결
	public MyArticle(WriteArticle hacker,WriteArticle mbc,WriteArticle sbs) {
		this.hacker = hacker;
		this.mbc = mbc;
		this.sbs = sbs;
	}
	
	public void complete() {
		// 스캐너를 사용해서 사용자 입력값을 받고 콜백 메서드를 실행 시켜 주세요.
		// nextline
		Scanner sc= new Scanner(System.in);
		article = sc.nextLine();
		mbc.printArticle(article);
		hacker.printArticle(article);
		sbs.printArticle(article);
	}
	
}
