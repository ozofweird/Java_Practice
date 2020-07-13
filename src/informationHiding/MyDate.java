package informationHiding;

public class MyDate {

/* Default 접근 지정자의 경우 같은 패키지 내에서만 접근 가능 */
//	int day;
//	int month;
//	int year;
	
/* Public 접근 지정자의 경우 외부에서 접근 가능하며 잘못된 값에 대한 처리를 못함 */
//	public int day;
//	public int month;
//	public int year;
	
/* Private 접근 지정자의 경우 클래스 내부에서만 접근 가능하며 메소드를 통해 접근 가능*/
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
			System.out.println("Month 에러");
		} else {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		}
	}
}
