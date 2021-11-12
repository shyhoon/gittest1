package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TellManagement {

	// 삽입 메서드
	public static void insert(HashMap<String, Phone>map) {				// key는 String타입 
		Phone phone;													// value는 Phone타입 
		
		String name,address,telephone; 									// 한번에 변수선언도 가능
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : ");
		name = s.next();
		System.out.println("주소 : ");
		address = s.next();
		System.out.println("전화번호 : ");
		telephone = s.next();
		
		phone = new Phone(name, address, telephone);					// 객체 생성
		
		map.put(phone.name, phone); 					// 값을 추가할때 key와 value값의 데이터타입을 지켜줘야한다
	}
	// 삭제 메서드
	public static void delete(HashMap<String, Phone>map) {
		
		String dellName;
		Scanner s = new Scanner(System.in);
		System.out.println("삭제할 이름 >>");
		dellName = s.next();
		if (map.containsKey(dellName)) {
			map.remove(dellName);
		}else {
			System.out.println(dellName + "은 등록되지 않은 이름입니다.");
		}
	}
	//찾기 메서드
	public static void search(HashMap<String, Phone>map) {
		String searchName;
		Scanner s = new Scanner(System.in);
		System.out.println("찾을 이름 >>");
		searchName = s.next();
		if (map.containsKey(searchName)) {
			System.out.println(searchName + ":" + map.get(searchName).telephone);
		}else {
			System.out.println(searchName + " 은 없는 사람입니다.");
		}
	}
	//전체보기 메서드
	public static void showInfo(HashMap<String, Phone>map) {
		
//		방법1
		Set<String>names = map.keySet();							// keySet메서드를 사용하여 iterator활용
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + " " + person.telephone);
		}
//		방법2
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key).telephone);
		}
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Phone>map = new HashMap<String, Phone>();				// 저장되는 공간을 만든것
		map.put("이승훈", new Phone("이승훈", "부산", "010-2333-4333"));				// 공간에 값 입력
		map.put("이현아", new Phone("이현아", "부산", "010-2333-4333"));
		//메서드 이용
		insert(map);
		search(map);
		showInfo(map);
		System.out.println(map);
		
		//활용
		int muni;
		
		System.out.println("--------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("--------------");
		
		
		// 스캐너 이용
		String number;
		Scanner s = new Scanner(System.in);

		
		while(true) {
			System.out.println("추가 0,삭제 1, 찾기 2, 전체보기는 3, 종료 4");
			number = s.next();
		switch (number) {
		case "0": 
			insert(map);
			break;
		case "1" :
			delete(map);
			break;
		case "2" :
			search(map);
			break;
		case "3" :
			showInfo(map);
			break;
		case "4" :
			System.out.println("종료되었습니다.");
			return; 															// while문도 종료
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		}		
		
		
		
	}
}
