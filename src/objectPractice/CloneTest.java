package objectPractice;

class BookClone implements Cloneable {
	
	String title;
	String author;
	
	public BookClone(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		BookClone book = new BookClone("제목1", "저자1");
		BookClone book2 = (BookClone)book.clone();
		
		System.out.println(book);
		System.out.println(book2);
	}

}
