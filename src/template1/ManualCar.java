package template1;

public class ManualCar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 방향을 조작합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("브레이크를 밟아서 정지합니다.");
	}

}
