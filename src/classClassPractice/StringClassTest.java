package classClassPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		// Class 클래스 방법 1
//		Class c1 = String.class;
//		
//		// Class 클래스 방법 2 
//		String str = new String();
//		Class c2 = str.getClass();
		
		// Class 클래스 방법 3
		Class c3 = Class.forName("java.lang.String");

		// c3 클래스의  Constructor 출력
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
