package interfacePractice4;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반적으로 기능적인걸 우선할 때 인터페이스 타입으로 선언
		Queue bookQueue = new BookShelf();
		bookQueue.inQueue("제목1");
		bookQueue.inQueue("제목2");
		bookQueue.inQueue("제목3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());

	}

}
