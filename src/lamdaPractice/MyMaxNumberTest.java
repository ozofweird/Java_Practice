package lamdaPractice;

public class MyMaxNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �͸��̱� ������ �ش� �������̽��� ȣ��� ��� �Լ� �̸� ��� ����
		// �͸��̱� ������ �޼��尡 �ϳ����־����
		// return ���� �ϳ� �̱� ������ �߰�ȣ ����
//		MyMaxNumber max = (x, y) -> { return (x >= y)?x : y; };
		MyMaxNumber max = (x, y) -> (x >= y)?x : y;
		System.out.println(max.getMaxNumber(10, 20));

	}

}
