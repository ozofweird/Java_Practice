package otherStreamPractice;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		// DataInput, DataOutput Stream �������̽� ���
		rf.writeInt(100);
		// 4 ����Ʈ
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		rf.writeUTF("�ȳ��ϼ���");
		
		// filePointer�̱� ������ ���� rf�� "�ȳ��ϼ���"��ġ
		// �ٽ� ó�� ��ġ�� �̵��ϱ� ���� seek ���
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
