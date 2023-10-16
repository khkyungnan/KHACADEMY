package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("아메리카노",2,true);
		Cafe client2 = new Cafe("카페라떼",3,false);
		Cafe client3 = new Cafe("제로콜라",1,true);
		/*
		System.out.println("client1 : " + client1);
		System.out.println("client2 : " + client2);
		System.out.println("client3 : " + client3);
		*/
		//client1.makedrink(client1);
	}

}
