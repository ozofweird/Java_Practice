package innerClassPractice;

class OuterClass3 {
	int oNum = 10;
	static int soNum = 20;
	
	Runnable getRunnable(int i) {
		
		// ���������� ���ȭ(final)�Ǳ⿡ �� ������ �� �� ����
		int num = 100;
		
		// ���� ���� Ŭ����
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("MyRunnableClass ȣ��");	
				System.out.println(num);
				System.out.println(i);
				System.out.println(oNum);
				System.out.println(OuterClass3.soNum);
				System.out.println("=================");
			}
			
		}
		
		return new MyRunnable();
	}
}

public class LocalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass3 outerClass = new OuterClass3();
		// getRunnable �޼��带 ȣ���ϰ� ����
		Runnable runnable = outerClass.getRunnable(20);
		
		// run�� �������� ȣ�� ���� (���������� ��� ���ȭ�� ��)
		runnable.run();
	}

}
