package abstractPractice1;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		Computer myNotebook = new MyNotebook();
		myNotebook.display();
		myNotebook.turnOff();
	}

}
