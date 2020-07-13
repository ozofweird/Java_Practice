package classClassPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		// Class Ŭ���� ��� 1
//		Class c1 = String.class;
//		
//		// Class Ŭ���� ��� 2 
//		String str = new String();
//		Class c2 = str.getClass();
		
		// Class Ŭ���� ��� 3
		Class c3 = Class.forName("java.lang.String");

		// c3 Ŭ������  Constructor ���
		Constructor[] cons = c3.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}

		System.out.println();
		
		Method[] methods = c3.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
	}

}
