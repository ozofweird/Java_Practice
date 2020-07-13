package collectionPractice2;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("이름2");
		treeSet.add("이름1");
		treeSet.add("이름3");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
