package interfacePractice4;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Customer sell()");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Customer buy()");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Customer order()");
		
//		// Buy�� �⺻ �޼��带 ����, Sell�� �⺻ �޼��带 ����, ���� �����Ǹ� ����
//		Buy.super.order();
	}
	
	public void sayHello() {
		System.out.println("Customer sayHello()");
	}

}
