package innerClassPractice;

class OuterClass2 {
	
//	private int oNum = 10;
	private static int soNum = 20;
	
	// 외부 클래스 생성 여부와 관계없이 사용 가능
	static class InnerClass2 {
		int iNum = 100;
		static int siNum = 200;
		
		void innerTest() {
			System.out.println("InnerClass2 호출1");
			// oNum의 경우 OuterClass2가 생성되어야지 사용 가능
//			System.out.println(oNum);
			System.out.println(soNum);
			System.out.println(iNum);
			System.out.println(siNum);
			System.out.println("=================");
		}
		
		static void innerTest2() {
			System.out.println("InnerClass2 호출2");
			System.out.println(soNum);
			//  iNum의 경우 InnerClass2가 생성되어야지 사용 가능
//			System.out.println(iNum);
			System.out.println(siNum);
			System.out.println("=================");
		}
	}

}

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
		innerClass2.innerTest();
		
		OuterClass2.InnerClass2.innerTest2();

	}

}
