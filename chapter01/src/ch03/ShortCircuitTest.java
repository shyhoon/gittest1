package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		
		
		int num1 = 5;
		int i = 0;
		
//		boolean value = ((num1 = num1 + 10) < 10) && (( i = i + 2) < 10);
		boolean value = ((num1 += 10) < 10) && (( i += 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);// 숏서킷에볼루션이라 뒷부분은 굳이 평가를 하지 않아서 값이 안담겨서 0이다
		
		value = ((num1 = num1 + 10 ) < 10 ) || (( i = i +2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
