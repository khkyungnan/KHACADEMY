package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);//���� Ŭ����(Animal)�� ����� �����ϴ� �� ���
	//���� ��ϴ�.
	}
	
	public void run() {
		System.out.println(getName() + "�����̿ͼ� �޸���!");
	}
	@Override 
	//animal�� �����ִ� eat�� ����� �ȿ����� �ٽ� ���Ǹ� ������.
	public void eat() {
		System.out.println(getName() + " �Դµ� �߰��� �������� ������");
	}
}
