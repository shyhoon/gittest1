package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ��Ŀ ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		MbcNews mbcNews = new MbcNews();
		SbsNews sbsNews = new SbsNews();
		// ��� �ۼ�
		MyArticle article = new MyArticle(hackerNews,mbcNews,sbsNews);
		article.complete();
		
	}
}
