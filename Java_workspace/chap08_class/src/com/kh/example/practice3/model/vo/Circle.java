package com.kh.example.practice3.model.vo;
public class Circle {
	//�ʵ�(�������)
	double PI = 3.14; //������
	int radius = 1;	  //������
	
	//������
	public Circle() {
		//�⺻ ������, �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
	}
	
	//�޼ҵ�
	public void incrementRadius() {
		radius++;
		System.out.println("radius : " + radius);
	}
	public void getAreaOfCircle() {
		 double area = PI * radius * radius;
		 System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		 System.out.println("���� ������: " + radius);
	}
}
