package ch03;

public class GenericPrinter2<T extends Material> { // T에 들어갈 타입은 Material을 상속받는 녀석만 가능하다는 강제성 부여

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString(); // 리턴값이 String이므로 toString에 접근하면 리턴값이String으로 충족이 된다
	}

}
// alrt shift s ->o get,setter단축키