public class AnimalMain {
	public class Dog {
		//�ν��Ͻ� ����
		String name; //�������� �̸�
		int age;	// �������� ����
		
		//������ �޼���
		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
			//name = "0";
			//age = 0;
		}
		
		//��� �޼���
		public void printInfo() {
			System.out.println("�������̸� : "+ name);
			System.out.println("���������� : " + age);
		}
		
	}


	public static void main(String[] args) {
		//Dog Ŭ������ ��ü(=�ν��Ͻ���ü) ����
		Dog myDog = new Dog("�۸���", 3);
		Dog yourDog = new Dog("�п���",2);
			
		myDog.printInfo();
		yourDog.printInfo();

	}

}
