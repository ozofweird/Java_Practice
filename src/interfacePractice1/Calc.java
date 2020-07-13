package interfacePractice1;

public interface Calc {

	// 컴파일 과정에서 public static final키워드가 붙음
	double PI = 3.14;
	int ERROR = -999999999;

	// 컴파일 과정에서 abstract 키워드가 붙음
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}
