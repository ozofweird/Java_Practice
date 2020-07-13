 package arrayPractice;

public class BookCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		// 배열에 주소값을 넣음
		library[0] = new Book("제목1", "저자1");
		library[1] = new Book("제목2", "저자2");
		library[2] = new Book("제목3", "저자3");
		library[3] = new Book("제목4", "저자4");
		library[4] = new Book("제목5", "저자5");
		
//		// 얕은 복사
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
//		
//		// library, copyLibrary의 주소값이 같으므로 값 변경시 동일한 값으로 복사됨 
//		library[0].setTitle("Title");
//		library[0].setAuthor("Author");

		// 깊은 복사
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0; i < copyLibrary.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		// 향상된 포문
		for (Book book : library) {
			book.showBookInfo();
		}
		System.out.println("==================");
		for (Book book : copyLibrary) {
			book.showBookInfo();
		}

	}

}
