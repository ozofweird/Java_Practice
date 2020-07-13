package lamdaPractice;

public class StringConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concat concat1 = new Concat();
		concat1.makeString("hello", "world");
		
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + ", " + s2);
		concat2.makeString("hello", "world");
		
		// 실제 객체 지향 프로그램에서 람다 동작은 익명 내부 클래스를 사용
		StringConcat concat3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1 + ", " + s2);
			}
			
		};
		
		concat3.makeString("hello", "world");
	}

}
