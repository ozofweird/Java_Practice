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

//	// Externalizable �޼���
//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		// TODO Auto-generated method stub
//		// oos.writeObject()�� ���� ���� ���� �޼���
//	}
//
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		// ois.readObject()�� ���� ���� ���� �޼���
//	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personLee = new Person("�̼���", "�����Ͼ�");
		Person personKim = new Person("������", "������");
		
		// ���� (����ȭ)
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch (IOException e) {
			System.out.println(e);
		}
//		System.out.println("���� �Ϸ�");
		
		// �б� (������ȭ)
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
//			// �ٿ�ĳ���� EOFException ����
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
		
//		System.out.println("�б� �Ϸ�");
	}

}
