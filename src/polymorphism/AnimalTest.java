package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		// �ϳ��� �޼��尡 ���� �ڷ����� ������ �Ǿ �ٸ� ����� ����
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
//		for(Animal animal : animalList) {
//			animal.move();
//		}
		
		AnimalTest test = new AnimalTest();
		test.downCasting(animalList);
	}
	
	public void downCasting(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);
			
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBooks();
			} else if (ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			} else if (ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
