package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest2 {

	
	public static void main(String[] args) {
		
	Set set0;
	// set계열 
	// 순서가없고 중복할수 없다
	
	HashSet<Integer> set1 = new HashSet<>();
	set1.add(1);
	set1.add(1);												// 중복값
	set1.add(2);
	set1.add(3);
	set1.add(3);												// 중복값 // 중복하면 덮어쓰기된다
	
	System.out.println("set1 :" + set1);
	//사이즈 값
	System.out.println("사이즈 확인 :" + set1.size());
	// 삭제
	set1.remove(1);
	set1.clear();
	System.out.println(set1);
	
//	for (int i = 0; i < set1.size(); i++) {
//		System.out.println("set1값 확인 :" + i); 				// set은 순서가 없어서 이런식으로 전부 가져올 수 없다
//	}
	
	// while문 사용 방법
	Iterator<Integer> iter = set1.iterator();
	while(iter.hasNext()) {
		System.out.println("값 확인 :" + iter.next());
	}
	// 내부에 값이 있는지 확인
	System.out.println(set1.contains(3));

	HashSet<Integer>set2 = new HashSet<>();

	//set2사이즈가 6개면 완료
	// 아니라고 하면 한번 더 동작
	boolean flag = true;
	while(flag) {
		set2.add(getRandomNumber());
		if(set2.size()==6) {
			flag=false;
		}
	}
//	set2.add(getRandomNumber());
//	set2.add(getRandomNumber());
//	set2.add(getRandomNumber());
//	set2.add(getRandomNumber());
//	set2.add(getRandomNumber());
//	set2.add(getRandomNumber());

	System.out.println(set2);
	System.out.println(set2.size());
	
	}// end of main
	
	public static int getRandomNumber() {
		
		Random random = new Random();
		int value = random.nextInt(45)+1;
		return value;
	}
}
