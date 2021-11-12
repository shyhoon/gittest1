package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest3 {

	public static void main(String[] args) {
		
		Map map0;
		//map 계열
		// key와 value 구조로 데이터를 저장한다 
		
		//HashMap null값 허용
		HashMap<String, String>map1 = new HashMap<>();			// key와 value모두 String타입
		
		//Hashtable null값 사용 불가
		Hashtable<String, String>map2 = new Hashtable<>();
		
		// 값을 추가 하는 방법 
		map1.put("A01", "김포공항정문"); 							// 데이터를 담을때 add가 대신 put메서드를 쓴다
		map1.put("A02", "김포공항후문");							// map계열은 key값 중복 불가 
		map1.put("A03", "김포공항로비");							// 값을 추가할때 데이터타입을 맞춰줘야한다
		map1.put("B01", "인천공항정문");
		map1.put("B02", "인천공항후문");
		map1.put("B03", "인천공항로비");
		map1.put("C01", null);
		System.out.println(map1);
		
//		map2.put("D01", null); // null값을 허용하지 않으므로 오류
		System.out.println(map2);
		
		//값 출력 방법
		System.out.println("---------------------");
		System.out.println(map1.get("A01"));					// get(key)메서드 사용하여 key값으로 접근
		System.out.println(map1.get("A02"));
		System.out.println(map1.get("A03"));
		
		// 삭제방법
		System.out.println("--------------------");
		System.out.println(map1.remove("C01"));
		map1.clear();
		System.out.println(map1);
		
		// 사이즈 확인 방법
		System.out.println(map1.size());
		System.out.println(map1);
		
		// map 계열 for문 사용 방법
		// java.util.Map.Entry
		for (Entry<String,String> entry : map1.entrySet()) {
			System.out.println("key:" + entry.getKey() + "value :" + entry.getValue());
		}
		System.out.println("--------------------");
		for (String key : map1.keySet()) {           			
			System.out.println(key + ":"+map1.get(key)); 			//.get(key) key의 value 값을 반환
			
			
		}
	}
}
