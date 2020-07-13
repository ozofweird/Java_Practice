package otherStreamPractice;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		System.out.println();
		
		Coffee kenaLatte = new Latte(new KenyaAmericano());
		kenaLatte.brewing();
		
		System.out.println();
		
		// ���� ���ο��� ��� ������Ʈ�� ����
		Coffee kenaMocha = new Mocha(new Latte(new KenyaAmericano()));
		kenaMocha.brewing();
		
		System.out.println();

		Coffee etiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
		etiopiaMocha.brewing();

		
	}

}
