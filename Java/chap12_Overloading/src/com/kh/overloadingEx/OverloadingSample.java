package com.kh.overloadingEx;
/*
 * java ������ ����µ� 
 * ���ϸ� : OverSample.java �����
 * �����ε� 5�� ����� �޼��� 5�� ����ϱ�
 * */
public class OverloadingSample {
	//������ ����
	public int sum(int a, int b) {
		return a+b;
	}

	//�� ���� ������ ����
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	//�� ���� �Ǽ��� ����
	public double sum(double a, double b) {
		return a+b;
	}
	public double sum(double a, double b,double c) {
		return a+b+c;
	}
	public double sum(double d, double e, double f, double g, double h) {
		return d+e+f+g+h;
	}
	public static void main(String[] args) {
		OverloadingSample obj = new OverloadingSample();
		
		// �޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.sum(10,20));
		System.out.println("�� ������ �� : " + obj.sum(10, 20, 30));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5,10.5));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5,10.5, 10.5,10.5));
	}

}
