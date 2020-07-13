package genericPractice;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		
		System.out.println(powderPrinter.toString());
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		
		System.out.println(plasticPrinter.toString());
		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		
		System.out.println(powderPrinter.printing());
		System.out.println(plasticPrinter.printing());
		
	}

}
 