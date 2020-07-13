package decoratorPractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			// 현재 시간
			milliseconds = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			// 복사 걸린 시간
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("시간 : " + milliseconds);
	}

}
