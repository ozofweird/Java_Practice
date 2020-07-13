package otherStreamPractice;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		// DataInput, DataOutput Stream 인터페이스 기반
		rf.writeInt(100);
		// 4 바이트
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		// filePointer이기 때문에 현재 rf는 "안녕하세요"위치
		// 다시 처음 위치로 이동하기 위해 seek 사용
		rf.seek(0);
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();		
	}

}
