package arrayPractice;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];

		// 硅凯俊 林家蔼阑 持澜
		library[0] = new Book("力格1", "历磊1");
		library[1] = new Book("力格2", "历磊2");
		library[2] = new Book("力格3", "历磊3");
		library[3] = new Book("力格4", "历磊4");
		library[4] = new Book("力格5", "历磊5");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println("泅犁 硅凯俊 甸绢埃 林家蔼: " + library[i]);
			library[i].showBookInfo();
		}
	
	}

}
