package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int income;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.income += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�̰�, ������ " + income + "�Դϴ�.");
	}
}
