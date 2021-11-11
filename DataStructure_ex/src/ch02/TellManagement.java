package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TellManagement {

	// 삽입
	public static void insert(HashMap<String, Phone>map) {// 입력값을 받아 새로운 객체를 만드는것
		Phone phone;
		
		String name,address,telephone; // 한번에쓰기도 가능
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : ");
		name = s.next();
		System.out.println("주소 : ");
		address = s.next();
		System.out.println("전화번호 : ");
		telephone = s.next();
		
		phone = new Phone(name, address, telephone);
		
		map.put(phone.name, phone); 
	}
	
	// 삭제
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
		// 이름을 입력하면 해당하는 key값을찾아서 삭제key는 이름을 입력 받아서 사용
		
	}
	
	//찾기
	public static void search(HashMap<String, Phone>map) {
		String dellName;
		Scanner s = new Scanner(System.in);
		System.out.println("찾을 이름 >>");
		dellName = s.next();
		if (map.containsKey(dellName)) {
			System.out.println(dellName + ":" + map.get(dellName).telephone);
		}else {
			System.out.println(dellName + " 은 없는 사람입니다.");
		}
		// key 이름을 입력 받아서 찾고 화면에보여주세요
		
		
	}
	//전체보기
	public static void showInfo(HashMap<String, Phone>map) {
		
//		방법1
		Set<String>names = map.keySet();
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
		// 화면에 전체 정보를 뿌려 주는 기능을 만들어 주세요
		
	}
	
	
	public static void main(String[] args) {
		
		HashMap<String, Phone>map = new HashMap<String, Phone>(); // 새로운 객체를 만들걸 put하여 저장되는 공간을 만든것
		map.put("이승훈", new Phone("이승훈", "부산", "010-2333-4333"));
		map.put("이현아", new Phone("이현아", "부산", "010-2333-4333"));
		//멤서드 이용해보기
//		insert(map);
//		search(map);
		System.out.println("--------------");
//		showInfo(map);
		
		System.out.println("-------------");
//		System.out.println(map);
		
		//실행에 흐름 만들어 보기
		int muni;
		
		System.out.println("--------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("--------------");
		
		
		// 스캐너 이용해서
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
			return; // while문도 종료
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		}		
		
		
		
	}
}
