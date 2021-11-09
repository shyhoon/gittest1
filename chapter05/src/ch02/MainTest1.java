package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 1 ThreeDPrinter1 객체 생성

		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial()); // 결국 .에.연산자로 제일 마지막으로 Plastic클래스로 들어간것

		System.out.println("-------------------------");

		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());

		System.out.println("-------------------------");

		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		// 1. 재료 셋팅
		printer3.setMaterial(powder);

		// 자료를 꺼내보자
		System.out.println(printer3.getMaterial());

		// 요청: 변수에 ThreePrinter3에 재료를 저장해 주세요
		// 변수이름 temp1
		Powder temp1 = (Powder) printer3.getMaterial(); // type mismatch - 타입이 안맞아서 다운캐스팅

		// 질문
		System.out.println(printer3);

	}

}
