package ex1;

import java.util.Scanner;

public class Answer {
/*
	int i = 10;
	double d = 20.5;

	// 1
	// �� ���� ���� ���� �Ͽ� result1 ������ ���
	// ����� 30.5�� ��� �ϼ���. -�ڵ�����ȯ, ���������

	double result1 = i + d;System.out.println(result1);

	// 2
	// result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���
	// �� ������ �������� ���� �������ּ���. - ��������ȯ

	System.out.println((int)result1);

	// 3
	// i ������ ���� -1�� �� �� ����ϼ���
	// ��, ���� ������ ��� - ���ҿ�����(���� ���� �����ڴ� ���� �����ڰ� �ƴϱ⿡ �� �� ����)

	i--; // i ������ ������ 1�� ����� ��ɾ� �̴�.
	System.out.println(i);

	// 4
	// d ������ ���� -20.5�� ��� �ϼ���
	// ��, d ������ ���� �������� ������ - ��ȣ ������

	System.out.println(-d);

	// 5
	// ���� i�� d, ���� �����ڸ� ����ؼ� result2 ������
	// �����ϰ� ������ true ���� ��⵵�� ���� �����
	// ����ϼ��� - ���� ������ , ���� ������ Ÿ���� ������ �� �� �ִ���

	boolean result2 = (i < d);System.out.println(result2);

	int num1 = 10;
	int num2 = 30;

	// 6
	// ���� result3�� �����ϰ�
	// num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� ����� ��� ����ϼ���
	// ��������, ���迬����, ���� ������ Ÿ��

	boolean result3 = (num1 > 50) && (num2 < 50);System.out.println(result3);

	boolean result4 = ((num1 -= 3) > 45) && ((num2 += 10) < 50);System.out.println(result4); // f
	System.out.println(num1); // 7
	System.out.println(num2); // 30

	boolean result5 = ((num1 += 4) > 43) || ((num2 -= 3) > 20);System.out.println(result5); // t
	System.out.println(num1); // 11
	System.out.println(num2); // 27

	// 7
	// num1�� num2 �� �� ū ���� ���� �����ڸ� ����ؼ�
	// max ������ ���� ��� ������ּ���
	// ��, ����� �ʱ�ȭ�� ���ÿ� ���ּ���

	int max = (num1 > num2) ? num1 : num2;
	// ������ Ÿ���� int�� ���� - ���������� ���ͷ��� ���� ������ ������ ������ int�� ������� �Ѵ�.
	System.out.println(max);
	int max1 = (num1 < num2) ? num2 : num1;System.out.println(max1);

	// 8.
	// if ���� ����ؼ� ������ ����� �ּ���.
	// 100 ~ 90 --> A
	// 90 ~ 80 --> B
	// 80 ~ 70 --> C
	// 70 ~ 60 --> D
	// 60 ~ 0 --> F

	System.out.println("������ �Է��� �ּ���: ");

	Scanner scanner = new Scanner(System.in);

	int point = scanner.nextInt();
	char result = 'Z';

	if(point<=100&&point>=90)
	{
		result = 'A';
	}else if(point<90&&point>=80)
	{
		result = 'B';
	}else if(point<80&&point>=70)
	{
		result = 'C';
	}else if(point<70&&point>=60)
	{
		result = 'D';
	}else if(point<60&&point>=0)
	{
		result = 'F';
	}else
	{
		System.out.println("�߸��� �Է��Դϴ�.");
	}if(result!='Z')
	{
		System.out.println("����� ������: " + result + "�Դϴ�.");
	}
	// 9.
	// 1~10���� ȭ�鿡 ��� ������ ������ % <-- 7 == 0�̸� �����
	// i == 7 --> ���� // i ������ ������ ����� 0�̸� �����

	for(
	int i = 1;i<11;i++)
	{

		System.out.println(i);
		if ((i % 7) == 0) {

			break;
		}

		int num1;
		int count1 = 0;

		for (num1 = 1; num1 < 11; num1++) {

		}

		// 10
		// 3�� ����̸� ������� ���ÿ�. ��� %3 == 0 --> 3�� ����� �� 3���� �������� �������� ���� ���̴ϱ�
		if (num1 % 3 == 0) {
			count1++;
			continue;

		}
		System.out.println("��� �� : " + num1);
	}System.out.println("��� �� : "+num1);System.out.println("3�� ����� ���� : "+count1);

	//11
	// ����� �����Ͽ� Ȱ�뼺�� ����������. ġȯ������ ���ؾ��Ѵ�.
	// ��ĳ�� �̿��ؼ� MAX ��, MULTIPLE�� �޾Ƽ� ���α׷��� �ϼ��� �ּ���.

	Scanner sc = new Scanner(System.in);

	System.out.println("MAX �� �Է� :");
	final int MAX = sc.nextInt();System.out.println("����� �Է� : ");
	final int MULTIPLE = sc.nextInt();
	final int MIN = 21;

	int num;
	int count = 0;

	for(num=MIN;num<MAX;num++)
	{

		if (num % MULTIPLE == 0) {
			count++;
			continue;

		} // end of if

	}// end of for

	System.out.println(MULTIPLE+"�� ����� ���� : "+count);

	//12
	// for���� �̿��ؼ� 1���� 10���� ���� ����
	// ���꿡 ���� ����� ���ؼ� ������ �ʿ��ϴ�.
	int sum = 0;for(
	int i = 1;i<=10;i++)
	{
		sum += i; // sum = sum + i;
		System.out.println("i�� ���簪 : " + i);
	}
	//13
	// 1. 8���� ������ּ���

	num=8;for(
	int i = 1;i<=9;i++)
	{
		System.out.println(num + " * " + i + " = " + (num * i));
	}
	//14
	// ���� for ������ ������ 2~9���� ����� �ּ���.

//				
	for(
	int num = 2;num<10;num++)
	{

		for (int num1 = 1; num1 < 10; num1++) {

			System.out.println(num + "*" + num1 + "=" + num * num1);

		}
		System.out.println();
	}

	//15
	// ����ڰ� 0�� �Է��ϸ� ���α׷��� ���� ���Ѷ�
	// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ������Ѷ�

	// do ~ while
	// ��ĳ�ʸ� ��� �ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ������ ���ּ���.
	// ���꿡 ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���.

	Scanner scanner = new Scanner(System.in);

	int sum = 0;
	int num1;
	do{

		// System.out.println("���簪 : " + num1);
		System.out.println("���ڸ� �Է����ּ���");
		num1 = scanner.nextInt();
		sum += num1;

	}while(num1!=0);

	System.out.println("������ ����� : "+sum+"�Դϴ�.");

	// ȸ���� ������ ���

//			for(int i = 0; i < 10; i++) {
//				
//				System.out.println("���ڸ� �Է����ּ���");
//				num1 = scanner.nextInt();
//			sum += num1;
//				
//			}
//			System.out.println("������ ����� : " +sum+ "�Դϴ�.");

	//16
	// 1. ��ȯ ���� ���� �Լ� �����ϱ�
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	//17
	// 2. �Ű� ������ ���� �Լ� ����� -> ��ȯ�� ����

	public static int calcSum() {

		int sum = 0;
		int i;
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	//18
	// 3. ��ȯ���� �ְ� �Ű������� �޴� �Լ� �����
	public static double addNum(double n1, double n2) {

		double result = 0.0;
		result = n1 + n2;
		return result;

	}

	//19
	// 4. ���ϰ� int , �Ű����� n1 , n2 , n3 , �̸� -> intAdd

	public static int intAdd(int n1, int n2, int n3) {

		int sum = 0;
		sum = n1 + n2 + n3;
		return sum;

		// int sum = n1 + n2 + n3;
		// return sum;

		// return n1 + n2 + n3; �� ����

	}
	//20
	// 5. ���ϰ� double �Ű����� d1, d2 �̸��� -> doubleAdd

	public static double doubleAdd(double d1, double d2) {

		double sum = 0.0;
		sum = d1 + d2;// ���ư��°� �Ӹ��ӿ� �־�� © �� �ִ�.
		return sum;
	}

	//21
	// 6. ���ϰ� ����, �Ű����� String article �Լ� �̸��� -> printArticle
//
////	//public static void printArticle(String article/* �Ű� ������ ������Ÿ���� string */ {
////		//System.out.println(article);
////	}
////
//	// �Լ��� ���
//
//	int num1 = 10;
//	int num2 = 20;
//
//	double total = addNum(42.123, 10.5);System.out.println("total : "+total);
//
//	sayHello("�ݰ����ϴ�");
//				
//				int sum = calcSum(); //�Լ��� �Ű������� ���⿡ �Ű������� ���� �ȵȴ�.
//				System.out.println("sum : "+ sum);
//				
//				
//				System.out.println("=======================");
//				//�Լ� ���� ��� 4, 5, 6
//				
//				//4
//				int result1 = intAdd(5,6,7);
//				System.out.println("result1 : " + result1);
//				
//				//5
//				double result2 = doubleAdd(10.5, 0.5);
//				System.out.println(result2);
//				
//				//6
//				printArticle("��� ���� : ���� ����!");
//				
//				// 1. ������ ģ��.
//				// ex) �̼��� �л��� ������ ģ��.
//	public void takeTest() {
//		System.out.println(studentName + "�л��� ������ ģ��.");
//		}
//}
//}


}}
