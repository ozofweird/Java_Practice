package innerClassPractice;

class OuterClass2 {
	
//	private int oNum = 10;
	private static int soNum = 20;
	
	// �ܺ� Ŭ���� ���� ���ο� ������� ��� ����
	static class InnerClass2 {
		int iNum = 100;
		static int siNum = 200;
		
		void innerTest() {
			System.out.println("InnerClass2 ȣ��1");
			// oNum�� ��� OuterClass2�� �����Ǿ���� ��� ����
//			System.out.println(oNum);
			System.out.println(soNum);
			System.out.println(iNum);
			System.out.println(siNum);
			System.out.println("=================");
		}
		
		static void innerTest2() {
			System.out.println("InnerClass2 ȣ��2");
			System.out.println(soNum);
			//  iNum�� ��� InnerClass2�� �����Ǿ���� ��� ����
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
