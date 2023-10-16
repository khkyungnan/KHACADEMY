package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ���
 						�־��� ������(�⺻:����)�� ������� ���ڿ��� ��ū���� �и�
 * */
	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
		//stm.STExam();
		//stm.stExam2();
		//stm.stExam4();
		//stm.stExam5();
		//stm.stExam6();
		stm.stringtoMath();
	}
	public void STExam() {
		String text="apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		//tokenizer.
		//hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam3() {
		//- �����ڸ� ����ؼ� text ����� - �����ڷ� ��� ����ϱ�
		String text = "apple-banana-grape-orange";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam4() {
		//- �����ڸ� ����ؼ� text �����  , �����ڷ� ��� ����ϱ�
		String text = "apple ,banana ,grape ,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, " ,");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam5() {
		//Ư�� �ܾ� �����ϰ� �����ڷ� �и�
		String text = "This is a test. But not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
				System.out.println(word);
			}
		}
	}
	public void stExam6() {
		//��¥ �����ڷ� �и�
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println(year+"�� "+month+"�� "+day+"��");
		//System.out.println();
		//System.out.println(day+"��");
	}
	public void stringtoMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.matches("\\d+(\\.\\d+)?")){
				System.out.println("Number:" + token);
			}
		}
	}
}




