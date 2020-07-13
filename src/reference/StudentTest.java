package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student(100, "이순신");
		studentLee.setKoreaSubject("국어", 90);
		studentLee.setMathSubject("수학", 80);
		
		studentLee.showStudentInfo();
	}
}
