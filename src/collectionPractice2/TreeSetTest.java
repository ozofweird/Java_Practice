package collectionPractice2;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("�̸�2");
		treeSet.add("�̸�1");
		treeSet.add("�̸�3");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
