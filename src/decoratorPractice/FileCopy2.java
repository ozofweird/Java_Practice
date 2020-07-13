package decoratorPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Socket socket = new Socket();
		// 바이트 단위를 문자 단위로 변경
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		br.readLine();
	}

}
