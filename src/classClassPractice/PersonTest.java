package classClassPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException, 
												InstantiationException, IllegalAccessException,
												NoSuchMethodException, SecurityException,
												IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
//		// 로컬에 Person이 있을 경우
//		Person person = new Person("이름");
//		System.out.println(person);		
		
		// 로컬에 Person이 없을 경우
		Class c = Class.forName("classClassPractice.Person");
		
//		// 생성자 호출 1
//		Person person1 = (Person)c.newInstance();
//		System.out.println(person1);
		
		// 생성자 호출 2
		// 매개변수 String 하나만을 가진 생성자 호출
		Class[] parameterTypes = {String.class};
		Constructor cons = c.getConstructor(parameterTypes);
		
		Object[] initargs = {"테스트"};
		Person person2 = (Person)cons.newInstance(initargs);
		
		System.out.println(person2);
		
	}

}
