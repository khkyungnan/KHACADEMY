package com.kh.thisSample;
/*
 * 		int x = 10; //���� x �� 10�� �Ҵ�
		
		x = 20;
	//	y = x;
		System.out.println("y : " + y);
		
		int[] list1 = {1,2,3};
		int[] list2 = list1; //list2  list1
 this   ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü(=�ν��Ͻ�)�� �ּҰ� ����
 this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
*/

class MyClass {
	int myField; // this.myField
	
	//ù ��° ������
	MyClass() {
		//this.myField = 0; //this() ����ؼ� �ٸ� ������ ȣ��
		this(0);
	}
	//�� ��° ������
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField�� �� : " + this.myField);
	}
}
public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); //ù ��° ������ ȣ��
		MyClass obj2 = new MyClass(10); //�� ��° ������ ȣ��
		
		obj1.printValue();
		obj2.printValue();
	}

}






