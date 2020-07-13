package innerClassPractice;

class OuterClass {
	
	private int oNum = 10;
	private static int soNum = 20;
	private InnerClass innerClass;
	
	public OuterClass() {
		innerClass = new InnerClass();
	}
	
	// 인스턴스 내부 클래스
	// static 내부 클래스가 아니므로 외부 클래스 생성 후 생성됨
	// static 내부 클래스가 아니므로 내부 클래스에 static 멤버변수 선언 불가
	class InnerClass {
		int iNum = 100;
		
		void innerTest() {
			System.out.println("InnerClass 호출");
			System.out.println(oNum);
			System.out.println(soNum);
			System.out.println(iNum);
			System.out.println("=================");
		}
	}
	
	public void usingInnerClass() {
		innerClass.innerTest();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClass = new OuterClass();
		outerClass.usingInnerClass();
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.innerTest();
	}

}
