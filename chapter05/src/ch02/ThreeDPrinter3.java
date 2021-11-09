package ch02;

public class ThreeDPrinter3 {//  Object를 사용하여 제네릭 클래스 처럼 하나의 객체만 만들고 거기에 계속하여 다른 객체를 넣을 수 있지만 
							// 그렇게되면 객체와의 관계에서 상관 없는 녀석들도 접근이 가능해지기에 좋지 않다 (최상위 클래스로 모든 타입들이 접근 가능하다 
							// 그래서 제네릭을 사용하여 원하는 객체만 접근 가능하여 사용하게 한다

	private Object material ; 
	
	public Object getMaterial() {
		return material;
	}
	public void setMaterial(Object material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "안녕하세요 toString 정의 했어요";
	}
	
}
