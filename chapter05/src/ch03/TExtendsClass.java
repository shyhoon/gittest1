package ch03;

public class TExtendsClass {

	public static void main(String[] args) {
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<Powder>();
		powderPrinter.setMaterial(new Powder()); // �ٷ� �����ؼ� �ֱ�
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
//		GenericPrinter2<Water>printer2 = new GenericPrinter2<Water>();
		
		
	}
}
// <T extends Ŭ���� > ����ϱ� 
// T �ڷ����� ������ ���� �� �� ���� 
// (�������� ������ �ڷ������� �ƹ� Ŭ������ �� �� �ִ�.)
//System.out.println(powder);