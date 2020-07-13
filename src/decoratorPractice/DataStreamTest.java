package decoratorPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fos = new FileOutputStream("dataOutput.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("dataOutput.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			
			// 1바이트
			dos.writeByte(100);
			// 4바이트
			dos.write(100);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");;
			
			// 작성 타입에 맞춰서 출력
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
