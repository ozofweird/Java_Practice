package exceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FileInputStream�� AutoCloseable ����
		try (FileInputStream fis = new FileInputStream("a.txt")){
				
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 
		
		System.out.println("���α׷� ����");
	}

}
