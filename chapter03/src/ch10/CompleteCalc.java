package ch10;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		int times = num1 * num2;
		return times;
	}

	@Override
	public int devide(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		}else {
			return num1 / num2;
			
		}
	}

	
	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}

}
