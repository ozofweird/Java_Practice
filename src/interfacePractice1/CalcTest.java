package interfacePractice1;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteCalc calculator = new CompleteCalc();
		
		System.out.println(calculator.add(10, 10));
		System.out.println(calculator.substract(10, 10));
		System.out.println(calculator.times(10, 10));
		System.out.println(calculator.divide(10, 10));
		calculator.showInfo();
	}

}
