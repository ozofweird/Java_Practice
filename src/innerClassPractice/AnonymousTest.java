package innerClassPractice;

class OuterClass4 {
	int oNum = 10;
	static int soNum = 20;
	
	// ���� ���� Ŭ�������� MyRunnable Ŭ���� ���� �ѹ��� ����
	Runnable getRunnable(int i) {
		
		int num = 100;
		return new Runnable() {

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
		};
	}
	
	// �� �ϳ��� �������̽��� �߻�Ŭ������ ��� Ŭ������ ���� new Ű���带 ���� ���� ����
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runner run() ȣ��");
		}
	};
}

public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass4 outerClass = new OuterClass4();
		
		Runnable runnable = outerClass.getRunnable(20);
		runnable.run();
		
		outerClass.runner.run();
	}

}
