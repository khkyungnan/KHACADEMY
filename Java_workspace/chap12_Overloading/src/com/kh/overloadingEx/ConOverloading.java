package com.kh.overloadingEx;

public class ConOverloading {
	
	private String name;
	private int age;
	
	//������ 5�� �����!
	//1. �Ű������� ���� ������
	public ConOverloading() {
		name = "no name";
		age = 0;
	}
	
	//2. �̸��� �ʱ�ȭ �ϴ� ������
	public ConOverloading(String newName) {
		this.name = newName;
		this.age = 0;
	}

	//3. �̸��� ���̸� �ʱ�ȭ�ϴ� ������
	public ConOverloading(String newName, int newAge) {
		this.name = newName;
		this.age = newAge;
	}
	//4. �̸��� ���� �������� ���̴� �ʱ�ȭ �ϴ� ������!
	public ConOverloading(int newAge) {
		this.name = "no name";
		this.age = newAge;
	}

	public static void main(String[] args) {
		//��ü���� �ν��Ͻ� ����
		ConOverloading obj1 = new ConOverloading();
		ConOverloading obj2 = new ConOverloading("�̸�");
		ConOverloading obj3 = new ConOverloading("3��",3);
		ConOverloading obj4 = new ConOverloading(4);
		

	}

}
