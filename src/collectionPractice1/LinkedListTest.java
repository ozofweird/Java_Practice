package collectionPractice1;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		// LinkedList�� �⺻������ toString ����
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.removeFirst();
		System.out.println(myList);
		myList.removeLast();
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			// set�� ��� ������ ���� ����, �ߺ� ��� �Ұ�
			String s = myList.get(i);
			System.out.println(s);
		}
	}

}
