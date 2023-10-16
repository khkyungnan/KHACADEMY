package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.NumFormatException();

	}
	public void ArithException() {
		// int dividend / divisor �������� �� ����ó�� 
		int dividend = 100;
		int divisor = 0;
		try {
			int result = dividend/divisor; //0���� ������ �õ�
			System.out.println(result);
		} catch(ArithmeticException aa) {
			System.out.println(aa.getMessage());
		}
		
	}

	public void NPException() {
		String text = "Hello World";
		String subText = null;
		//int length = text.length(); //Hello world ���� ���
		
		try {
			//indexOf subText �� �ִ� null ���� ������ ���ڿ� �˻�
			int length = text.indexOf(subText);
			System.out.println(length);
		} catch(NullPointerException n) {
			System.out.println("NullPointerException ���� �߻� :"+n.getMessage());
			
		}
	}
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			//�������� ������ ���ڿ��� ������ ��ȯ
			System.out.println(number);
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		
	}
}
