package collectionPractice2;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� String TreeSet�� CompareTo�� ����ϴ°� �ƴ� MyCompare ����� ���
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		treeSet.add("�̸�2");
		treeSet.add("�̸�1");
		treeSet.add("�̸�3");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
