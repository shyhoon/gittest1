package ch03;

import java.util.Scanner;


public class MyArticle {											//�ݸ�(ȣ����)

	String article; 
	WriteArticle hacker; 							// Ÿ���� HackerNews���ϴ� WriteArticle�� �ϴ� �������δ�
	WriteArticle mbc; 
	WriteArticle sbs;

//	HackerNews hacker;
//	MbcNews mbc;
//	SbsNews sbs;
	
// �ּҰ� ���� // ���� Ÿ���� �����ϴ� �ּҰ��� �־ ����(MyArticle���� �ٸ� ��ü��) �����شٴ°� �߿�
	
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
		mbc.printArticle(article); 						// �ݹ�Ǵ� ����  // �̷������� �ݹ��� �̷����ٸ� �ƴ°� �߿� 
		hacker.printArticle(article); 			// �ּҰ��� MyArticle��ü�� ����Ǿ������� �ݹ鰳������ �Ѿ �� �ִ°�
		sbs.printArticle(article);
	}
	
}
// �ݹ�޼���� �ϴ��Ϸθ� �����ص��ǰ� �ϴ� �ټ��� ��뵵 �Ѵ�
// �꾲�ٰ� ����â ������ esc -> :wq�Է�