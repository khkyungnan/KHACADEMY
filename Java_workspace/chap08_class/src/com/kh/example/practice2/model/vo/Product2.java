package com.kh.example.practice2.model.vo;

public class Product2 {
/*

+  Product()
+  information() : void

 * */
	private String pname;
	private int    price;
	private String brand;
	
	public Product2(String pname, int price, String brand) {
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
	//3. ���� ��� �޼ҵ� �����
	//+ information() : void 
	public void information() {
		//sysout + ctrl + space => �ڵ��ϼ�
		System.out.println("��ǰ�� : " + pname);
		System.out.println("����   : " + price + "��");
		System.out.println("�귣��  : " + brand);
	}
}
