package constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		studentKim.showStudentInfo();
		
		Student studentYue = new Student(100, "���缮");
		studentYue.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
