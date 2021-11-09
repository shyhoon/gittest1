package ch01;

public class ArrayMainTest {
	public static void main(String[] args) {
	
//		 배열
//		 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다.
//		 변수가 하나의 데이터 를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한것이라 할수있다.
		
		int number = 10; // 변수선언 방법 (스택 영역에 생성
		
//		 "배열 선언" 방법 (무언가를 "담을 바구니"를 만드는것 )
		int[]	arr1 = new int[3];			//1. 방법을 주로 권장
		int arr2[ ]		=	new int[10];	//2. 방법
		//int를 담을 수 있는 배열을 선언 heap영역에 int타입의 3개의 칸을 생성과 arr1이라는 이름을 붙임  
		
//		 초기화 하는 방법 (값을 넣는 방법)
		arr1[0] 	= 33; 							// 0번째 칸에 33을 넣겠다는 명령어
		arr1[1]	=	10;
		arr1[2]	=	11; 						// 2번째 칸에 11을 넣겠다는 명령어
		
//		모든 프로그램에서 인덱스는 0부터 시작 , 배열안에 있는 값을 빨리 찾기위해 인덱스를 사용
//		배열의 크기(n)와 인덱스의 마지막번호는 다르다, 인덱스의 마지막번호 = n - 1
//		ex. 788의 마지막 인덱스 번호 는 787
		
		// 배열 선언과 동시에 초기화
		int[] numbers1 = new int[] {11,20,30}; // 배ㅔ열의 크기는 3 
		int[] numbers2 = {10,50,100};             // 둘다 똑같이 배열을 만드는것
		
		// 출력 방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]); 
		System.out.println(numbers1 ); //주소값담기는것
		System.out.println(arr1);
		// c r u d 
		
		
		//
		String[ ] strArr =  new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";
		String[] strArr1 = {"울라프","카서스","렝가"};
		System.out.println(strArr1.length);
		System.out.println(strArr1[0]);
		System.out.println(strArr1[1]);
		System.out.println(strArr1[2]);
		// 1. 화면에 0,1,2,3,4, 출력해주세요. 단 for문 사용 금지
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		System.out.println(strArr[4]);
		
		System.out.println(strArr.length); // strArr의 길이
		
		
		// 코드 수정 null값을 출력하지 마세요.
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}
		
		// 모든 프로그래밍 언어에서는 index는 0 부터 시작합니다.
		// 배열을 사용할때 보통 for문과 관계해서 많이 사용 합니다.
		
//		new int[22]; // 길이 22 , 인덱스의 크기 21
//		new int[74]; // 길이 74 ,73
//		new int[283];//	길이 283, 인덱스의 크기 282
		
		
		
		
		
		
		
		
		
		
		
}// end of main
}// end of class
