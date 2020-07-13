package arrayPractice;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 90);
		studentLee.addSubject("수학", 70);
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("영어", 90);
		studentKim.addSubject("수학", 100);
		studentKim.showStudentInfo();
	}

}
