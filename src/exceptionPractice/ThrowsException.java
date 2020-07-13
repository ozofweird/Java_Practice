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
		
		// Exception의 개수 만큼 try - catch문 생성
		// Throws로 미뤄진 예외를 처리
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			// Default Exception으로 앞에서 처리되지 않은 모든 예외를 처리
			// 가장 최상위 클래스인 만큼 가장 마지막 블록에 위치해야함
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}

}
 