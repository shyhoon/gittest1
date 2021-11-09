package ch03;

public class GenericPrinte <T> { 

	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString 오버라이드
	@Override
	public String toString() {
		return material.toString();
	}
	
	
}

//제네릭 설계방법
// T라는 대체 문자를 사용 E - element, K- Key , V-value
// 자료형 매개변수 (type paramater)
//T를 주로 사용,T는 임시값 아무값이나 들어올 수 있다 