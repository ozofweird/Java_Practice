package interfacePractice1;

public interface Calc {

	// ������ �������� public static finalŰ���尡 ����
	double PI = 3.14;
	int ERROR = -999999999;

	// ������ �������� abstract Ű���尡 ����
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}
