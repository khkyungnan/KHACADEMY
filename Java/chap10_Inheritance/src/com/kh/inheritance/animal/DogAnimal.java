package com.kh.inheritance.animal;

public class DogAnimal {

		//�ν��Ͻ� ����
		String name; //�������� �̸�
		int age;	// �������� ����
		
		//������ �޼���
		public DogAnimal(String name, int age) {
			this.name = name;// this Ű���带 ����ؼ� �ν��Ͻ� ������ ���� �Ҵ�
			this.age = age;// this Ű���带 ����ؼ� �ν��Ͻ� ������ ���� �Ҵ�
			//name = "0";
			//age = 0;
		}
		
		//��� �޼���
		public void printInfo() {
			System.out.println("�������̸� : "+ name);
			System.out.println("���������� : " + age);
		}
		
	


	public static void main(String[] args) {
		//Dog Ŭ������ ��ü(=�ν��Ͻ�) ����
		DogAnimal myDog = new DogAnimal("�۸���", 3);
		DogAnimal yourDog = new DogAnimal("�п���",2);
		
//������ ��ü(=�ν��Ͻ�)�� �ν��Ͻ� ���� �����ؼ� ������ ���
		myDog.printInfo();
		yourDog.printInfo();

	}

}
