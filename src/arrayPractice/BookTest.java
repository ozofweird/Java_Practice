package arrayPractice;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];

		// �迭�� �ּҰ��� ����
		library[0] = new Book("����1", "����1");
		library[1] = new Book("����2", "����2");
		library[2] = new Book("����3", "����3");
		library[3] = new Book("����4", "����4");
		library[4] = new Book("����5", "����5");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println("���� �迭�� �� �ּҰ�: " + library[i]);
			library[i].showBookInfo();
		}
	
	}

}
