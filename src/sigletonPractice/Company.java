package sigletonPractice;

public class Company {

	private static Company instance = new Company();
	
	// �ܺο��� �����ڸ� ����� �� ����
	private Company() { }
	
	// �ܺο��� ��밡���� �޼���
	// �Ϲ� �޼����� ��� �ν��Ͻ��� �ϳ� ������ �Ǿ�߸� ȣ���� ���������� �ܺο��� ������� ����� �� �ֵ��� static���� ����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
