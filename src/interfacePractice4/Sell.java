package interfacePractice4;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
