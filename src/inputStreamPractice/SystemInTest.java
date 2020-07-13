package inputStreamPractice;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ют╥б : ");
		
		try {
			
			int i;
			while((i = System.in.read()) != '\n') {
				System.out.println(i);
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
//			e.printStackTrace();
		}

	}

}
