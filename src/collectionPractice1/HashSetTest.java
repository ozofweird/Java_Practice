package collectionPractice1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		// ArraryList�� ��� �ߺ� ���� ������� ��µ�
		set.add("�̸�1");
		set.add("�̸�2");
		set.add("�̸�3");
		set.add("�̸�1");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
