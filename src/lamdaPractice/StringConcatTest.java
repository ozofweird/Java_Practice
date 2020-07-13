package lamdaPractice;

public class StringConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concat concat1 = new Concat();
		concat1.makeString("hello", "world");
		
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + ", " + s2);
		concat2.makeString("hello", "world");
		
		// ���� ��ü ���� ���α׷����� ���� ������ �͸� ���� Ŭ������ ���
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
