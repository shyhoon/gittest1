package ch03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

class MyException {

	String fileName;

	public MyException(String fileName) {
		this.fileName = fileName;
	}

	// throws란 //예외를 사용자에게 처리하도록 던진것
	public String readFile() throws IOException {// IOException부분을 사용자가 예외처리하라고 던지는것 

		FileInputStream fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");

		return dbType;

	}

}

public class ExceptionEx3 {

	public static void main(String[] args) {

		// 객체생성
		MyException exception = new MyException("a.txt");

		// throws는 사용자 입장에서 예외처리를 직접 해결해야한다
		try {
			String temp = exception.readFile();
			System.out.println("temp :" + temp);
		} catch (IOException e) {
			System.out.println("파일이 업습니다. 파일을 확인해 주세요");
		}
	

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in); 	// 스캐너를 가져와서 통로를 열어둔건데 스캐너가 비정상적으로 실행될때 
			int userInput = scanner.nextInt();	//trycatch문을 사용하여 닫으라고 할 수 있다
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally {
			scanner.close();
		}

	}
}
