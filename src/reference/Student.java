package reference;

public class Student {
	
	// Package Private 접근 지정자 (Default)
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName+ "의 총점은 " + total);
	}

}
