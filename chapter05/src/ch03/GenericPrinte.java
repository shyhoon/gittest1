package ch03;

public class GenericPrinte <T> { 

	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString �������̵�
	@Override
	public String toString() {
		return material.toString();
	}
	
	
}

//���׸� ������
// T��� ��ü ���ڸ� ��� E - element, K- Key , V-value
// �ڷ��� �Ű����� (type paramater)
//T�� �ַ� ���,T�� �ӽð� �ƹ����̳� ���� �� �ִ� 