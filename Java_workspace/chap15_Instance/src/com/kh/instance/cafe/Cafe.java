package com.kh.instance.cafe;

public class Cafe {
	String type;       //��������
	int size;            //���� ������
	boolean isSugar;//��������
	
	public Cafe(String t, int s, boolean is) {
		this.type = t;
		this.size = s;
		this.isSugar = is;
	}
	public void makedrink(Cafe c) {
		System.out.println("client : " +c);
		System.out.println("ī�䰡 ���Խ��ϴ�.");
		System.out.println(c);
		//System.out.println("client2 : " + client2);
		//System.out.println("client3 : " + client3);
	}
}
