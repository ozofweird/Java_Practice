package interfacePractice4;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ϲ������� ������ΰ� �켱�� �� �������̽� Ÿ������ ����
		Queue bookQueue = new BookShelf();
		bookQueue.inQueue("����1");
		bookQueue.inQueue("����2");
		bookQueue.inQueue("����3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());

	}

}
