package inputStreamPractice;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// true일 경우 append 가능
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}

}
