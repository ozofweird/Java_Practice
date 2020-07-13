package inputStreamPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data;
			data++;
		}
		
		try (FileOutputStream fos = new FileOutputStream("data.txt", true);
				FileInputStream fis = new FileInputStream("data.txt")){
			
			fos.write(bs);
			
			int ch;
			while((ch = fis.read()) != -1) {
				System.out.println((char)ch);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}

}
