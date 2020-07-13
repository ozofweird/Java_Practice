package lamdaPractice;

public class MyMaxNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명이기 때문에 해당 인터페이스가 호출될 경우 함수 이름 사용 안함
		// 익명이기 때문에 메서드가 하나만있어야함
		// return 문이 하나 이기 때문에 중괄호 생략
//		MyMaxNumber max = (x, y) -> { return (x >= y)?x : y; };
		MyMaxNumber max = (x, y) -> (x >= y)?x : y;
		System.out.println(max.getMaxNumber(10, 20));

	}

}
