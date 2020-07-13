package innerClassPractice;

class OuterClass {
	
	private int oNum = 10;
	private static int soNum = 20;
	private InnerClass innerClass;
	
	public OuterClass() {
		innerClass = new InnerClass();
	}
	
	// �ν��Ͻ� ���� Ŭ����
	// static ���� Ŭ������ �ƴϹǷ� �ܺ� Ŭ���� ���� �� ������
	// static ���� Ŭ������ �ƴϹǷ� ���� Ŭ������ static ������� ���� �Ұ�
	class InnerClass {
		int iNum = 100;
		
		void innerTest() {
			System.out.println("InnerClass ȣ��");
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
