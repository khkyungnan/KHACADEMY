package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴� " + age + " �Դϴ�.");
		
		String name;
		int phoneNumber;
		
		System.out.print("����� �̸��� �Է��ϼ���. : ");
		name = sc.next();
		System.out.print("����� ��ȣ�� �Է��ϼ���. : ");
		phoneNumber =sc.nextInt(); //-�����ʱ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " +phoneNumber + "�Դϴ�.");
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		System.out.print("�̸�1 : ");
		String name1, name2;
		name1 = sc.next(); //������ ���� ���� �ٿ����°͸�����
		System.out.println(name1);
		System.out.print("�̸�2 : ");
		name2 = sc.nextLine(); // ���� ġ�� �������� ��� 
		
		System.out.println(name2);
		
		
		
	}
}




