package methodOverride;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee = new Customer(10010, "Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
		customerKim.bonusPoint = 10000;
		
		Customer customerAhn = new VIPCustomer(10020, "Kim");
		customerAhn.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		int priceAhn = customerAhn.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		System.out.println(customerAhn.showCustomerInfo() + "지불금액은 " + priceAhn + "원 입니다.");
		
	}

}
