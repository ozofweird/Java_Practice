package stringClassPractice;

public class StringImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java = new String("java");
		String android = new String("android");
		// concat ��
		System.out.println(System.identityHashCode(java));
		
		// concat ��
		java = java.concat(android);
		System.out.println(System.identityHashCode(java));
		
	}

}
