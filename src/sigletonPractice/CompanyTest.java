package sigletonPractice;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Company company = new Company();
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// �ΰ��� �ּҰ� ����
		System.out.println(company1);
		System.out.println(company2);
		
	}

}
