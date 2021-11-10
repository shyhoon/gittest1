package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		MbcNews mbcNews = new MbcNews();
		SbsNews sbsNews = new SbsNews();
		// 기사 작성
		MyArticle article = new MyArticle(hackerNews,mbcNews,sbsNews);
		article.complete();
		
	}
}
