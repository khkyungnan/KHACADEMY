package com.kh.example.practice4.model.vo;

public class Student {
	//1. ��� ����
	private int grade;
	private int classroom; 
	private String name;
	private double height;
	private char gender;
	  
	// 2. ������ Student()
	public Student() {
		//�ʱ�ȭ ���� �̿��� �� �ʵ� �ʱ�ȭ �ʱ�ȭ�� {}
		{
			grade = 1; //grade�� 1�� �ʱ�ȭ
			classroom = 2;//classroom 2�� �ʱ�ȭ
			name = "�ڼ�ö"; //name �̸� �ʱ�ȭ
			height = 180.5; //Ű 180.5 �ʱ�ȭ
			gender = '��';	//���� '��' ���� �ʱ�ȭ
		}
	}
	//3. ��� �޼ҵ� + information() : void
	public void information() {
		System.out.println("�г� : " + grade);
		System.out.println("��   : " + classroom);
		System.out.println("�̸�  : " + name);
		System.out.println("Ű   : " + height);
		System.out.println("����  : " + gender);
	}
}







