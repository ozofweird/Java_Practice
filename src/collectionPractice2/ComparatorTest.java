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

		// 원래 String TreeSet의 CompareTo를 사용하는게 아닌 MyCompare 방식을 사용
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		treeSet.add("이름2");
		treeSet.add("이름1");
		treeSet.add("이름3");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
