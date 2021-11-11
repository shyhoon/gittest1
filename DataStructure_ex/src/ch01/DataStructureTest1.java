package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student{
	String name;
	int grade;
	
}
public class DataStructureTest1 {

	public static void main(String[] args) {
		
		List list0;
		// List 하위계열들 중 하나가 어레이 리스트
		// ctrl t 는 계층도를 보여준다
		// 같은 리스트(인터페이스)에 있는 클래스들은 표준화 되어있다,쓰는 방법이 같다  전부 list인터페이스를 구현해둬서
		
		// 순서가 있고(인덱스) 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> member = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		// 리스트 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3)); // aslList 메서드 사용 
		
		// 값 추가
		list.add(3);	// index 0
		list.add(null);	// index 1번째
		list.add(1, 10);// index 1번째에 10을 삽입(null은 인덱스 2번으로 밀려 난다)
		
		System.out.println("값 확인 :" + list); // to string 을 재정의해서 주소값이 아닌 값이 나온다
		
		// 값 삭제 방법
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);
		
//		list.clear();
//		System.out.println("값 삭제 확인 : " + list);
		
		// 값 출력 방법
		System.out.println("값 출력 방법 : " + list.get(1));
		
		for (Integer i : list) {
			System.out.println("for 사용방법 :" + i);
		}
		
		// while 사용방법(어레이 리스트에서 while사용)
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		Iterator<Integer> iter = list.iterator(); // list를 Iterator로 바꿔준다
		
		//true,false
		while(iter.hasNext()) { // .hasNext() 다음요소가 있는지 확인하는 역할, 있으면 true 없으면 false를 반환
			System.out.println("while 사용 방법 :" + iter.next()); // .next()
			
		}
		
		// 값 검색방법
		System.out.println(list.contains(1)); // .contains() ()안의 값 포함유무를 true false로 반환
		System.out.println(list.contains(10));
		// ()값이 있으면 인덱스의 번호를 반환,없으면 -1을 반환 하는 녀석.
		System.out.println(list.indexOf(10)); // 1번째 인덱스에 있다
		System.out.println(list.indexOf(300)); // 없으면 -1을 반환 한다
		System.out.println(list.indexOf(3));	// 0번째 인덱스에 잉ㅆ다.
		
		// 문제 1
		ArrayList<String> names = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		//이름을 입력하면 names리스트에 저장ㅇ  while로

		boolean flag = true;
		while(flag) {
			String name = sc.nextLine();
			if (name.equals("종료")){// .equals는 문자열 비교 , 연산자는 숫자비교할때 사용
				flag = false;
			}else{
				names.add(name);
			}
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		// 0눌러 종료하면 화면에 입력한 이름을 표시
		
		
		
		
		
		
		
		
		
		
	}
}
