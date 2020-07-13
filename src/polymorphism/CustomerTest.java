package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 상속을 사용하지 않을 경우 각 등급에 맞는 조건문을 사용해야함
//		if (gold)
//		else (silver)
//		else (diamond)
//		...
		
		Customer customerLee = new GoldCustomer(10010, "Lee");
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.ShowCustomerInfo());
	}

}
