package ch03;

public class GenericPrinter2<T extends Material> { // T�� �� Ÿ���� Material�� ��ӹ޴� �༮�� �����ϴٴ� ������ �ο�

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString(); // ���ϰ��� String�̹Ƿ� toString�� �����ϸ� ���ϰ���String���� ������ �ȴ�
	}

}
// alrt shift s ->o get,setter����Ű