package ch10;

public interface Calc {

	double IP = 3.14; //(static final �����Ȱ�)
	int ERROR = -99999;
	
	// �߻� �޼���
	// add, �Ű����� num1 ,num2 + 
	// substract �Ű�����  num1 num2 -
	// times �Ű����� num1 ,num2 *
	// devide �Ű����� num1 ,num2 /
	// ���� Ÿ���� int
	// void showInfo
	int add (int num1 , int	 num2) ;
	int substract (int num1, int num2);
	int times (int num1,int num2);
	int devide(int num1 ,int num2)	;
	
}
