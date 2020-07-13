package exceptionPractice;

public class AutoCloseObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(AutoCloseObject obj = new AutoCloseObject()) {
			// 강제 예외 발생
			throw new Exception();
			
		} catch (Exception e) {
			// 강제 예외 발생 시 출력
			System.out.println(e);
		}
	}

}
