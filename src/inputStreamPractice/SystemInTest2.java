package inputStreamPractice;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Է� �� '��'�̶�� �ۼ� : ");
		
		try {
			
			int i;
			// ���� ��Ʈ��
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '��') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
//			e.printStackTrace();
		}

	}

}
