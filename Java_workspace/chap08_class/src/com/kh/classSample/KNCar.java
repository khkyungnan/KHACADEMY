package com.kh.classSample;

public class KNCar {
	//1. ���� �ʵ� �������
	String brand;     //�귣��
	String model;     //��
	int speed;        //�ӵ�
	boolean engineOn; //���� ����
	
/* ==========================================
 * ������� �ؿ��� ��� �޼���� ����
 * */
	
	//2. �����ڴ� �޼����� �Ѱ��� ����
	// ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
	public KNCar(String brand, String model) {
		System.out.println("Car ����");
		this.brand = brand; //���� KN������ ���ڴ�.
		this.model = model;//KN ���� �پ��� �𵨸� ���ڴ�.
		this.speed = 100;
		this.engineOn = true;
		
	}
	
	
	public void startEngine() { //
		//System.out.println("������ �õ��� �غ� �� �ֽ��ϴ�!");
		//���࿡ ������ true ���� �õ�
		System.out.println("������ " + brand + "�Դϴ�.");
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼ҵ� �ۼ�
		} else {//������ false �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
		
	}
	
	//���� �޼���
	public void acclerate(int amount) { 
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			speed += amount;
			System.out.println(amount + "�ӵ� "+ speed +" �Դϴ�.");
		} else {
			System.out.println("�ӵ��� �� �� ����");
		}
		
		
		
	}
}







