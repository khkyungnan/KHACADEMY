package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 p = new PracticeMain2();
		p.practice4();
		p.practice5();
	}
	public void practice1() {
		//���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");//������ ������
		sb.append("������ ������");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		//���ڿ� ������ reverse
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	public void practice3() {
		//���ڿ� ���� inser ? ����
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(10, "? ����");
		System.out.println(sb.toString());
		
	}
	public void practice4() {
		//���ڿ� ��ü replace(,,);
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.replace(7, 11,"Python");
		System.out.println(sb.toString());
	}
	public void practice5() {
		//���ڿ� ���� delete(,,);
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.delete(7,11);
		System.out.println(sb.toString());
	}
}
