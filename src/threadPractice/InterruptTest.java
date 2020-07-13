package threadPractice;

public class InterruptTest extends Thread {

	@Override
	public void run() {
		
		int i;
		for(i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("wake");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterruptTest test = new InterruptTest();
		test.start();
		
		// 실행되고 5초간 holding이 되어지는 것이 아닌 바로 예외처리
		test.interrupt();
		
		System.out.println("end");
	}

}
