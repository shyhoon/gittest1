package ch02;

public class TypeConversion {
	
	public static void main(String[] args) {
		
	

	//데이터의 형변환
	//바이트 크기가 작은것에서 큰것으로는 자동형변환이 이뤄지고 
	//바이트 크기가 큰것에서 작은것으로는 강제형변환을 해줘야한다.
	
	int inum1=100;
	
	double dnum1 = inum1;
	System.out.println(dnum1);
	
	double cnum1 = 200;
	int enum1 = (int)cnum1;
	System.out.println(enum1
			);
	
	double aValue;

	int bValue;

	

	aValue=0.5;

	bValue=(int)10.1;

	System.out.println(bValue);
	
	
	
	
	}
	
}
