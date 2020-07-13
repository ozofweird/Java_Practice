package collectionPractice1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		// ArraryList일 경우 중복 허용과 순서대로 출력됨
		set.add("이름1");
		set.add("이름2");
		set.add("이름3");
		set.add("이름1");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
