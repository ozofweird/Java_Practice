 package arrayPractice;

public class BookCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		// �迭�� �ּҰ��� ����
		library[0] = new Book("����1", "����1");
		library[1] = new Book("����2", "����2");
		library[2] = new Book("����3", "����3");
		library[3] = new Book("����4", "����4");
		library[4] = new Book("����5", "����5");
		
//		// ���� ����
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
//		
//		// library, copyLibrary�� �ּҰ��� �����Ƿ� �� ����� ������ ������ ����� 
//		library[0].setTitle("Title");
//		library[0].setAuthor("Author");

		// ���� ����
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0; i < copyLibrary.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		// ���� ����
		for (Book book : library) {
			book.showBookInfo();
		}
		System.out.println("==================");
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}

	}

}
