package ex1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
/*
		int i = 10;
		double d = 20.5;

		// 1
		// �� ���� ���� ���� �Ͽ� result1 ������ ���
		// ����� 30.5�� ��� �ϼ���.

		double result1 = (i+d);
		System.out.println(result1);
		
		// 2
		// result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���
		// �� ������ �������� ���� �������ּ���.
		System.out.println((int)result1);
		
		
		// 3
		// i ������ ���� -1�� �� �� ����ϼ���
		// ��, ���� ������ ��� - ���ҿ�����(���� ���� �����ڴ� ���� �����ڰ� �ƴϱ⿡ �� �� ����)
		
		i--;
		System.out.println(i);
		
		// 4
		// d ������ ���� -20.5�� ��� �ϼ���
		// ��, d ������ ���� �������� ������
		
		System.out.println(-d);+
		
		// 5
		// ���� i�� d, ���� �����ڸ� ����ؼ� result2 ������
		// �����ϰ� ������ true ���� ��⵵�� ���� �����
		// ����ϼ���
		
		boolean result2 = (i<d);
		System.out.println(result2);
		
		// 6
		// ���� result3�� �����ϰ�
		// num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� ����� ��� ����ϼ���
  
		int num1 = 30;
		int num2 = 50;
		
		boolean result3 = (num1 >= 50 && num2<=50 );
		System.out.println(result3);
		
		// 7
		// num1�� num2 �� �� ū ���� ���� �����ڸ� ����ؼ�
		// max ������ ���� ��� ������ּ���
		// ��, ����� �ʱ�ȭ�� ���ÿ� ���ּ���

		int max = (num1 < num2 ) ? num2 : num1;
				System.out.println(max);
		
		// 8
		// if ���� ����ؼ� ������ ����� �ּ���.(����ڰ� ������ �Է��ϰ� �����)
		// 100 ~ 90 --> A
		// 90 ~ 80 --> B
		// 80 ~ 70 --> C
		// 70 ~ 60 --> D
		// 60 ~ 0 --> F
				
		System.out.println(" ������ �Է��� �ּ���.");
		Scanner sc = new Scanner(System.in);
		
		int testscore = sc.nextInt();
		char result = 'Z';
		if ( (testscore <=100) && (testscore >= 90)) {
			result = 'A';
		}else if ((testscore<90) && (testscore >=80)) {
			result = 'B';
		}else if ((testscore<80) && (testscore >=70)) {
			result = 'C';
		}else if ((testscore<70) && (testscore >=60)) {
			result = 'D';
		}else if ((testscore<60) && (testscore >=0)) {
			result = 'F';
		}
		if(result != 'Z') {
			System.out.println("����� ������" +result+ "�Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		// 9 
		// 1~10���� ȭ�鿡 ��� ������ ������ % <-- 7 == 0�̸� �����
		// i == 7 --> ���� // i ������ ������ ����� 0�̸� �����
		for(int c =1; c <11 ; c++) {
			
			if(c %7==0) {
				
				break;
			}
			System.out.println(c);
		}
		int e;
		do {
			for(e= 1 ; e < 11 ; e++)
			System.out.println(e);
		}while(e%11 != 0) ;       								// -->for���� ������������ ��� for������ ���⶧���� while���� �ö��� e�� 11�̵Ǿ���;����.  
	
		// 10 �ٽ�
		// 3�� ����̸� ������� ���ÿ�.
		// 11
		// ����� �����Ͽ� Ȱ�뼺�� ����������. ġȯ������ ���ؾ��Ѵ�.
		// ��ĳ�� �̿��ؼ� MAX ��, MULTIPLE�� �޾Ƽ� ���α׷��� �ϼ��� �ּ���.

	Scanner sc1 =  new Scanner(System.in);
		final int MAX = sc1.nextInt();             				//--> ��������Ҷ� final ������ ������Ÿ���� ��������Ѵ�.
		int c ;
		final int MULTIPLE = sc1.nextInt();
		for(c=1 ; c<MAX ; c++) {
			
			if(c% MULTIPLE != 0) {
				System.out.println(c);
			}
		}
		
		
		// 12
		// for���� �̿��ؼ� 1���� 10���� ���� ����

		for(int a = 1 ;  a <11 ; a++) {
			System.out.println(a);
		}
		
		// 13
		// ������ 8���� ������ּ���

		int num = 8;
		
		for (int a = 1; a < 10; a++) {
			System.out.println(num+"*"+ a +"=" +(num * a));
		}
		
		// 14
		// ���� for ������ ������ 2~9���� ����� �ּ���.

		for(int a= 2; a < 10; a++) {
			
			for(int b = 1; b < 10; b++) {
				System.out.println(a + " * " + b + " = " + (a*b));
				
			}
			
		}
		
		// 15 �ٽ�
		// ����ڰ� 0�� �Է��ϸ� ���α׷��� ���� ���Ѷ�
		// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ������Ѷ�
		// do ~ while
		// ��ĳ�ʸ� ��� �ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ������ ���ּ���.
		// ���꿡 ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���.

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int a;                                						//--> do while�� �ۿ��� ���� �ʱ�ȭ�� 
																	//�ع����� do�� �ȿ��� 0�� �Էµ����ʰ� ù ���ڷθ�
																	//��� �⵹�Ƽ� ������ �ʴ´� 
		int sum = 0;
		do {
			a = sc.nextInt();
			sum += a;
			
		}while(a != 0); 
			System.out.println("������ �����"+sum+"�Դϴ�.");
		
		
		// 16
		// 1. ��ȯ ���� ���� �Լ� �����ϱ�                         //-> �Լ������� �����Լ����� �ϸ�ȵǰ� Ŭ���������� �ؾ��Ѵ�. �Լ������ ���ο���
			
			public static void name (String name) {
				System.out.println(name);
				
			}

		
			
		// 17
		// 2. �Ű� ������ ���� �Լ� ����� -> ��ȯ�� ����
			public static int result () {
				int sum = 0;
				int i;
				for (i = 0; i <= 100; i++) {
					sum += i;
				}
				return sum;
			}
			
		// 18
		// 3. ��ȯ���� �ְ� �Ű������� �޴� �Լ� �����

		public static int sum (int num1 , int num2) {
			int sum = 0;
			sum = num1 + num2;
			return sum;
		}
		
		// 19
		// 4. ���ϰ� int , �Ű����� n1 , n2 , n3 , �̸� -> intAdd

		public static int intAdd (int n1, int n2, int n3) {
			
		
			
		}
		
		// 20
		// 5. ���ϰ� double �Ű����� d1, d2 �̸��� -> doubleAdd

		public static double doubleAdd (double d1, double d2) {
			int sum;
			sum = d1+d2;
			return sum;
			
		}
	
		// 21
		// 6. ���ϰ� ����, �Ű����� String article �Լ� �̸��� -> printArticle

		public static void printArticle (String article) {
			System.out.println(article);
		}
		
		// 22
		// �Լ��� ��뵵 ���� �ϱ�
		
			*/
		// 23
		// 1. ������ ģ��.
		// ex) �̼��� �л��� ������ ģ��.(��� ������ �����ϰ� �޼��带 �����ÿ�)

		// 24
		// �л��� ������ ź�ٶ�� ��ü��ȣ�ۿ� ���α׷��� �����

	}

}
