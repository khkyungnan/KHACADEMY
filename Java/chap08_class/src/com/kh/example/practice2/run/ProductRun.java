package com.kh.example.practice2.run;
//improt�� ���� 1ȸ�� �� ���� �ۼ�
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
/*
 		System.out.println("��ǰ�� : " + pname);
		System.out.println("����   : " + price + "��");
		System.out.println("�귣��  : " + brand);
 * */
	public static void main(String[] args) {
		// Product ���� 3�� �ϰ�
		//���� ��ǰ�� ���� �귣��� ����ϱ�
		
		Product product1 = new Product("����",7900,"DJ");
		System.out.println("Product ���� : ");
		product1.information();
		
		Product product2 = new Product("����",8900,"CJ");
		System.out.println("Product ���� : ");
		product2.information();
		
		Product product3 = new Product("����",9900,"BJ");
		System.out.println("Product ���� : ");
		product3.information();
	}

}
