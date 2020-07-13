package lamdaPractice;

interface PrintString {
	void showString(String str);
}

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintString lamdaStr = s -> System.out.println(s);
		lamdaStr.showString("hello world1");
		
		showMyString(lamdaStr);
		
		PrintString lamdaReturn = returnString();
		lamdaReturn.showString("hello world3");
	}
	
	// main에서 부를 수 있도록 static으로 정의
	public static void showMyString(PrintString p) {
		p.showString("hello world2");
	}

	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}
}
