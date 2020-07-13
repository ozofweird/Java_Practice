package staticPractice;

public class Student {

	public int studentID;
	public String studentName; 
	public String address;
	
	public static int serialNum = 1000;
	
	public Student() {
		serialNum++;
	}

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address + ", " + serialNum);
	}

	public String getStudentName() {
		return studentName;
	}
}
