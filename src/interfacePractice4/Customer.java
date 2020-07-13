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
		
//		// Buy의 기본 메서드를 쓸지, Sell의 기본 메서드를 쓸지, 직접 재정의를 할지
//		Buy.super.order();
	}
	
	public void sayHello() {
		System.out.println("Customer sayHello()");
	}

}
