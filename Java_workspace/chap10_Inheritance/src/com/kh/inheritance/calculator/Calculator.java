package com.kh.inheritance.calculator;

import java.util.Scanner;

public class Calculator {

	int num1,num2;
	
	//1. ���ϱ�
	public int add() {//�Ķ���� = �Ű����� ���� 2�� �־��ֱ�
		return num1 + num2;
	}
	
	//2. ����
	public int substruct() {
		return num1 - num2;
	}
	
	//3. ���ϱ�
	public int multiply() {
		return num1 * num2;
	}
	
	//4. ������
	public int divide() {
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		}
		return num1 /num2;
	}
	/*�����⿡�� �� �̿ܿ� �������� ���� �ͽ��ϴ�!!*/
}





