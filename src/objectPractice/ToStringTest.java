package objectPractice;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("제목1", "저자1");
		System.out.println(book);
		
		String str = new String("str");
		System.out.println(str.toString());
	}

}
