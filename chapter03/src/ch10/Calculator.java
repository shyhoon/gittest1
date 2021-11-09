package ch10;

public abstract class  Calculator implements/*구현하다*/ Calc{

	@Override
	public int add(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}

	@Override
	public int substract(int num1, int num2) {
		int substract = num1 - num2;
		return substract;
	}


}
