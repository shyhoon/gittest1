package ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMinTest1 {

	public static void main(String[] args) {
		
	Calendar calendar = Calendar.getInstance(); 
	System.out.println(calendar.getTimeInMillis()); 
																	   // 보기 불편하기 때문에 형식을 만들어서 사용
	DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 	// 날짜로 변환 방법을 지정할 수 있다	

	
	String date = dateFormat.format(calendar.getTimeInMillis());   // 현재 시간을 내가 정한 format형식으로 변환
	System.out.println(date);

	}
}
// Calendar클래스란 날짜 인스턴스
// 달력이나 시간계산등을 사용 할 때 많이 사용하는 객체 
// 싱글톤 패턴
//싱글톤 패턴이라  get메서드를 통해 가져와야한다 새로 객체생성은 불가,같은 주소값을 공유한다
//.getTimeInMillis()현재시간을 1000분의 1초로 보여주는 메서드
// 날짜 포멧 형식 구글링하면 나온다