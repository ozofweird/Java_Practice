package sigletonPractice;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Company company = new Company();
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// 두개의 주소가 동일
		System.out.println(company1);
		System.out.println(company2);
		
	}

}
