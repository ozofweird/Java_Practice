package interfacePractice3;

public interface Calc {

	// 컴파일 과정에서 public static final키워드가 붙음
	double PI = 3.14;
	int ERROR = -999999999;

	// 컴파일 과정에서 abstract 키워드가 붙음
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
//		myMethod();
	}

	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
//		// 인스턴스 생성 없이 호출 가능
//		myStaticMethod();
		return total;
	}

//	// Java 9 부터 제공
//	private void myMethod() {
//		System.out.println("Private 메서드");
//	}
//	
//	private static void myStaticMethod() {
//		System.out.println("Private Static 메서드");
//	}
}
