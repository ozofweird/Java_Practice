package exceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
//			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			fis.close();
//			return;
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		System.out.println("프로그램 종료");
	}

}
