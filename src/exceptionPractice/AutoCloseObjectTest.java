package exceptionPractice;

public class AutoCloseObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(AutoCloseObject obj = new AutoCloseObject()) {
			// ���� ���� �߻�
			throw new Exception();
			
		} catch (Exception e) {
			// ���� ���� �߻� �� ���
			System.out.println(e);
		}
	}

}
