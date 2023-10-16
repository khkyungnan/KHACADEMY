package com.kh.instance.cafe;

public class Cafe {
	String type;       //음료종류
	int size;            //음료 사이즈
	boolean isSugar;//설탕여부
	
	public Cafe(String t, int s, boolean is) {
		this.type = t;
		this.size = s;
		this.isSugar = is;
	}
	public void makedrink(Cafe c) {
		System.out.println("client : " +c);
		System.out.println("카페가 나왔습니다.");
		System.out.println(c);
		//System.out.println("client2 : " + client2);
		//System.out.println("client3 : " + client3);
	}
}
