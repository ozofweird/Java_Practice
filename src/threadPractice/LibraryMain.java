package threadPractice;

import java.util.ArrayList;

class Library {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public Library() {
		books.add("å1");
		books.add("å2");
		books.add("å3");
	}
	
	// lendBook���� wait�� ���� InterruptedException ó���� throws
	public synchronized String lendBook() throws InterruptedException {
		
		Thread th = Thread.currentThread();
		while(books.size() == 0) {
//			//�л��� ���� å�� ���� ���
//			return null;
			System.out.println(th.getName() + " waiting start");
			wait();
			System.out.println(th.getName() + " waiting end");
		}
		String title = books.remove(0);
		System.out.println(th.getName() + " : " + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread th = Thread.currentThread();
		
		books.add(title);
//		notify();
		notifyAll();
		System.out.println(th.getName() + " : " + title + " return");
	}
}

class Student extends Thread {

	public void run() {
		
		try {
			String title = LibraryMain.lib.lendBook();

			// å�� �������� �ɷ� ����
			if(title == null) return;
			
			sleep(5000);

			LibraryMain.lib.returnBook(title);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static Library lib = new Library();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}
