package inputStreamPractice;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ѱ۰��� ���ڿ� �б� ����
		try (FileReader fis = new FileReader("reader.txt")){
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// ����Ʈ ������ �о��� ��� ���ڿ� ���
		try (FileInputStream fis = new FileInputStream("reader.txt")) {
			
			InputStreamReader isr = new InputStreamReader(fis);
			int j;
			while((j = isr.read()) != -1) {
				System.out.print((char)j);
			}
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
