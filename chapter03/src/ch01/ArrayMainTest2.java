package ch01;

public class ArrayMainTest2 {
	public static void main(String[] args) {
		//연관된 데이터를 통으로 모아서 관리하기 위한 것
		int[]/*int데이터 타입을 담을 수 있는 공간이란말*/ nums = new int[12];
		
		// 질럿을 담을 수 있는 배열을 12칸 만들어주세요
		Zealot[] /* 질럿 데이터 타입을 담을수 있는 공간을 만들어 두겠단말*/zealots = new Zealot[12]; 
		//마린 12
		Marine[] marines = new Marine[12];
		// 저글링 12
		Zergling[] zerglings = new Zergling[12];
		
		// 배열은 for문과 함께 많이 사용
		
		for(int i= 0 ; i < zealots.length; i++) {
			zealots[i] = new Zealot("질럿" + (i + 1) ); // 이렇게해서 이름을 구분 
		} // end of for
		// zealots[i] 여기에는 new를 통해 만든 질럿의 주소값이 담긴다(그냥 new를 쓰면 주소값이 담긴다고 암기)
		// 주소값이 담겨있으니 .연산자를 사용 가능(.연산자를 통해 heap영역의 객체로 들어갈 수 있다)
		// 1 문제 마린 생성
		
		for(int i = 0 ; i < marines.length; i++) {
			marines[i] =  new Marine("마린"+ i	);
		}
		
		// 2 문제 저글링 생성
		
		for(int i = 0 ; i< zerglings.length; i++) {
			zerglings[i] = new Zergling("저글링" + i);
		}
		
		
		System.out.println(zealots[11].getName());
		
		// 3 질럿 12 마리의 정보를 출력해 주세요. for 문 사용
		for(int i= 0; i < zealots.length; i++) {
				zealots[i].showInfo();// i는 주소값을 갖고 있다쓰
			
		}
		
		
		
	}
}
