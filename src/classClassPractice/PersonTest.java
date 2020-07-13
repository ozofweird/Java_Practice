package classClassPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException, 
												InstantiationException, IllegalAccessException,
												NoSuchMethodException, SecurityException,
												IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
//		// ���ÿ� Person�� ���� ���
//		Person person = new Person("�̸�");
//		System.out.println(person);		
		
		// ���ÿ� Person�� ���� ���
		Class c = Class.forName("classClassPractice.Person");
		
//		// ������ ȣ�� 1
//		Person person1 = (Person)c.newInstance();
//		System.out.println(person1);
		
		// ������ ȣ�� 2
		// �Ű����� String �ϳ����� ���� ������ ȣ��
		Class[] parameterTypes = {String.class};
		Constructor cons = c.getConstructor(parameterTypes);
		
		Object[] initargs = {"�׽�Ʈ"};
		Person person2 = (Person)cons.newInstance(initargs);
		
		System.out.println(person2);
		
	}

}
