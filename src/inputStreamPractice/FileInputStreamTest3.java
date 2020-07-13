package inputStreamPractice;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AutoCloseable
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			int i;
			byte[] bs = new byte[10];
			while( (i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
//				System.out.println();
				
				// 버퍼의 개수는 i가 가지고 있음
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
