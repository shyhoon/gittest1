package ch11;

import java.util.Calendar;

public class MainTest1 {
	public static void main(String[] args) {
		//싱글톤 패턴

//		Company company0 = new Company();
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();

		// 화면에 주소값을 출력해 보세요.
		System.out.println(Company.getInstance());
		System.out.println();
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		// 만들어낸 객체가 하나라서 전부 같은 주소값을 갖게 된다.
		// 싱글톤패턴 jdk도구
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
	
	
	
	
	
	}
	
	
	
	
	
}
