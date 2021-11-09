package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		
		Powder powder = new Powder();
		Plastic plastic =  new Plastic();
		
		GenericPrinte<Powder> genericPrinter1 = new GenericPrinte<>(); // 여러 자료형으로 사용될 수 있는 genericPrinter1
		
		genericPrinter1.setMaterial(powder);
		
		// 재료 꺼내기
		Powder tempPowder =  genericPrinter1.getMaterial(); // Object로 타입을 지정했을때는 다운캐스팅을 해줘야했지만 타입을 제네릭으로하면 그럴필요가 없어진다
		System.out.println(tempPowder);
		
		System.out.println("--------------------------");
		// 문제 1.  플라스틱으로 제네릴 클래스를 선언하고 재료 셋팅후 재료를 꺼내 보자
		
		GenericPrinte<Plastic> genericPrinter2 = new GenericPrinte<>();
		
		genericPrinter2.setMaterial(plastic);
		System.out.println(genericPrinter2.getMaterial());// 동일한 결과도출
		System.out.println(genericPrinter2); //동일한 결과도출 ,genericPrinter2에 tostring을 재정의했기에 주소값이 아니라 재정의한리턴값이 나온다
		
		System.out.println("--------------------------");
		//GenericPrinter toString();
		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);
		
		// 제네릭의 특징 실제 자료형을 선언하는시점에 자료형 매개변수(대체문자)가 형이변환되어 동작이 되어 진다
		// 제네릭도 상속 가능 
		// T에 다 들어갈 수 이"ㅆ지만 상속을하면 아무거나 다 넣지 못하게 활용할 수 있따
	}
	
}
