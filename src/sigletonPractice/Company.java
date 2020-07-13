package sigletonPractice;

public class Company {

	private static Company instance = new Company();
	
	// 외부에서 생성자를 사용할 수 없음
	private Company() { }
	
	// 외부에서 사용가능한 메서드
	// 일반 메서드의 경우 인스턴스가 하나 생성이 되어야만 호출이 가능하지만 외부에서 상관없이 사용할 수 있도록 static으로 설정
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
