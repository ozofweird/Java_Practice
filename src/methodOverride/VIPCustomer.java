package methodOverride;

public class VIPCustomer extends Customer {

//	private int agentID;
	double salesRatio;
	
//	public VIPCustomer() {	
//		super(0, null);
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
//		return super.calcPrice(price);
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

}
