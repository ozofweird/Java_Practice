package objectPractice;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// Object로 업캐스팅 된 매개변수를 다운캐스팅을 수행
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "Lee");
		Student studentLee2 = studentLee;
		System.out.println(studentLee);
		System.out.println(studentLee2);
		
		Student studentLee3 = new Student(100, "Lee");
		System.out.println(studentLee3);
		
		System.out.println(studentLee.equals(studentLee3));
		
		System.out.println(studentLee2.hashCode());
		System.out.println(studentLee3.hashCode());
	} 

}
