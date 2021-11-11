package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class HackerNews implements WriteArticle{					// 콜백을 받는 객체

	
	private String printDate() { 									// 날짜를 찍어주는 메서드
		DateFormat formater = new SimpleDateFormat("yyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());	// 체이닝 기법
	} // end of printDate

	@Override 
	public void printArticle(String article) { 						// 콜백 되어지는 메서드
		System.out.println("***HackerNews***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
	}
	
}
