package serialPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	String name;
	transient String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + job;
	}

//	// Externalizable 메서드
//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		// TODO Auto-generated method stub
//		// oos.writeObject()에 대한 로직 구현 메서드
//	}
//
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		// ois.readObject()에 대한 로직 구현 메서드
//	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		// 쓰기 (직렬화)
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch (IOException e) {
			System.out.println(e);
		}
//		System.out.println("쓰기 완료");
		
		// 읽기 (역직렬화)
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
//			// 다운캐스팅 EOFException 오류
//			if (ois.readObject() instanceof Person) {
//				Person p1 = (Person)ois.readObject();
//				Person p2 = (Person)ois.readObject();
//				
//				System.out.println(p1);
//				System.out.println(p2);
//				
//			} else {
//				System.out.println("Not instanceof Person");
//				return;
//			}
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
//		System.out.println("읽기 완료");
	}

}
