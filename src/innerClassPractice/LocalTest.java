package innerClassPractice;

class OuterClass3 {
	int oNum = 10;
	static int soNum = 20;
	
	Runnable getRunnable(int i) {
		
		// 내부적으로 상수화(final)되기에 값 변경을 할 수 없음
		int num = 100;
		
		// 지역 내부 클래스
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("MyRunnableClass 호출");	
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
		// getRunnable 메서드를 호출하고 끝남
		Runnable runnable = outerClass.getRunnable(20);
		
		// run은 언제든지 호출 가능 (지역변수들 모두 상수화가 됨)
		runnable.run();
	}

}
