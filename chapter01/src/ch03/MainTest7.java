package ch03;

public class MainTest7 {
public static void main(String[] args) {

	// ���� ���� ������
	// ���� �����ڿ� �ٸ� �����ڰ� �Բ� ���

	int num1 = 1;
//	num1 = num1 + 10; 

	num1 += 10;// num1�� �ߺ��Ǵϱ� �ߺ��� ���ֱ����� ���տ����ڸ� ���

	System.out.println(num1);

	int num2 = 1;
//	num2 = num2 - 10;
//	--> ���� ���� �����ڷ� ����
	num2 -= 10;
	System.out.println(num2);
	// num2������ ���� ���� -9�̴�.

	// num2 ������ ���ϱ� 2�� �ؼ� num2 ���� ������� ��� �ּ���.
	// ��, ���� ���Կ����ڸ� ���
	num2 *= 2;
	System.out.println(num2);
	num2 = num2 * 2;

	// num2 ������ ������ 2�� �ؼ� num2 ���� ������� ��� �ּ���.
	// ��, ���� ���Կ����ڸ� ���
	num2 /= 2;
	System.out.println(num2);
	num2 = num2 / 2;

	// num2 ������ ������ ������ 2�� �ؼ� num2 ���� ������� ��� �ּ���.
	// ��, ���� ���Կ����ڸ� ���

	num2 %= 2;
	System.out.println(num2);
	num2 = num2 % 2;
}
}
