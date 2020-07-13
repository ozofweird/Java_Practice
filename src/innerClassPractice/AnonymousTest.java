package innerClassPractice;

class OuterClass4 {
	int oNum = 10;
	static int soNum = 20;
	
	// 지역 내부 클래스에서 MyRunnable 클래스 명이 한번만 사용됨
	Runnable getRunnable(int i) {
		
		int num = 100;
		return new Runnable() {

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
		};
	}
	
	// 단 하나의 인터페이스나 추상클래스일 경우 클래스명 없이 new 키워드를 통해 생성 가능
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runner run() 호출");
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
