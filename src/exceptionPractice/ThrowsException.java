package exceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsException test = new ThrowsException();
		
		// Exception�� ���� ��ŭ try - catch�� ����
		// Throws�� �̷��� ���ܸ� ó��
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// Default Exception���� �տ��� ó������ ���� ��� ���ܸ� ó��
			// ���� �ֻ��� Ŭ������ ��ŭ ���� ������ ��Ͽ� ��ġ�ؾ���
			System.out.println(e);
		}
		System.out.println("���α׷� ����");
	}

}
 