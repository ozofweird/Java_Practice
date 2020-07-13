package genericPractice;

public class GenericPrinter<T extends Material> {

	// Plastic�� ���� �ְ� Powder�� �� �� ����, ���
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	public String printing() {
		return material.doPrinting();
	}
	
}
