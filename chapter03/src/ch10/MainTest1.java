package ch10;

public class MainTest1 {

	// main �Լ�
	public static void main(String[] args) {
		 // �߻�Ŭ������ new�� �� ���� �Ϲ�Ŭ������ new�� �� �ִ�.
		// �θ�Ÿ�� Calc// �ڽ�Ÿ�� CompleteCalc
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.devide(num1, 0));
		
		// ������ �ذ��� ���ô�.
//		calc.showInfo();
		((CompleteCalc)calc).showInfo(); //�ٿ� ĳ����
		
		
		
	}
}
