package cooperation;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus100 = new Bus(100);
		Subway subway200 = new Subway(200);
		
		Student studentLee = new Student("�̼���", 10000);
		studentLee.takeBus(bus100);
		studentLee.showStudentInfo();

		Student studentKim = new Student("������", 20000);
		studentKim.takeSubway(subway200);
		studentKim.showStudentInfo();
		
	}

}

