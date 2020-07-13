package inputStreamPractice;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileWriter fw = new FileWriter("writer.txt", true)){
			
			fw.write('A');
			char[] buf = {'B', 'C', 'D', 'E', 'F'};
			fw.write(buf);
			fw.write("안녕하세요");
			fw.write(buf, 2, 2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
//		try (FileOutputStream fos = new FileOutputStream("writer.txt", true)){
//			
//			OutputStreamWriter osw = new OutputStreamWriter(fos);
//			osw.write("OutputStreamWriterTest");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}

}
