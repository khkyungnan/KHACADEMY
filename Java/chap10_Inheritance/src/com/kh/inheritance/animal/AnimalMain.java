package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat mycat = new Cat("��߹�");
		mycat.run();
		mycat.eat();
		
		System.out.println();
		Monkey System = new Monkey("����");
		System.out();
		System.eat();
		System.sleep();
	}

}
