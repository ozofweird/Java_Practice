package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// ����� ������� ���� ��� �� ��޿� �´� ���ǹ��� ����ؾ���
//		if (gold)
//		else (silver)
//		else (diamond)
//		...
		
		Customer customerLee = new GoldCustomer(10010, "Lee");
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.ShowCustomerInfo());
	}

}
