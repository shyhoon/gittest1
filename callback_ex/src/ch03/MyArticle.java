package ch03;

import java.util.Scanner;

//�ݸ�(ȣ����)
public class MyArticle {

	String article; // �������̽��� �����ؾ߸�?
	WriteArticle hacker;
	WriteArticle mbc;
	WriteArticle sbs;
	
	// �ּҰ� ����
	public MyArticle(WriteArticle hacker,WriteArticle mbc,WriteArticle sbs) {
		this.hacker = hacker;
		this.mbc = mbc;
		this.sbs = sbs;
	}
	
	public void complete() {
		// ��ĳ�ʸ� ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ���� ���� �ּ���.
		// nextline
		Scanner sc= new Scanner(System.in);
		article = sc.nextLine();
		mbc.printArticle(article);
		hacker.printArticle(article);
		sbs.printArticle(article);
	}
	
}
