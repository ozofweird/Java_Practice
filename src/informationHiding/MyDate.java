package informationHiding;

public class MyDate {

/* Default ���� �������� ��� ���� ��Ű�� �������� ���� ���� */
//	int day;
//	int month;
//	int year;
	
/* Public ���� �������� ��� �ܺο��� ���� �����ϸ� �߸��� ���� ���� ó���� ���� */
//	public int day;
//	public int month;
//	public int year;
	
/* Private ���� �������� ��� Ŭ���� ���ο����� ���� �����ϸ� �޼ҵ带 ���� ���� ����*/
	private int day;
	private int month;
	private int year;
	
	boolean isValid;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if(month < 0 || month > 12) {
			isValid = false;
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid == false) {
			System.out.println("Month ����");
		} else {
			System.out.println(year + "�� " + month + "�� " + day + "��");
		}
	}
}
