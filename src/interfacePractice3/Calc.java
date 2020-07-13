package interfacePractice3;

public interface Calc {

	// ������ �������� public static finalŰ���尡 ����
	double PI = 3.14;
	int ERROR = -999999999;

	// ������ �������� abstract Ű���尡 ����
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
//		myMethod();
	}

	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
//		// �ν��Ͻ� ���� ���� ȣ�� ����
//		myStaticMethod();
		return total;
	}

//	// Java 9 ���� ����
//	private void myMethod() {
//		System.out.println("Private �޼���");
//	}
//	
//	private static void myStaticMethod() {
//		System.out.println("Private Static �޼���");
//	}
}
