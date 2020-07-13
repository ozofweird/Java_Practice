package inputStreamPractice;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("입력 후 '끝'이라고 작성 : ");
		
		try {
			
			int i;
			// 보조 스트림
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
//			e.printStackTrace();
		}

	}

}
