package ch03;

public class TExtendsClass {

	public static void main(String[] args) {
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<Powder>();
		powderPrinter.setMaterial(new Powder()); // 바로 생성해서 넣기
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
//		GenericPrinter2<Water>printer2 = new GenericPrinter2<Water>();
		
		
	}
}
// <T extends 클래스 > 사용하기 
// T 자료형의 범위를 제한 할 수 있음 
// (제한하지 않으면 자료형으로 아무 클래스나 올 수 있다.)
//System.out.println(powder);