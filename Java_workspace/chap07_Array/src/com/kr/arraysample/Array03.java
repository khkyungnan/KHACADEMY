package com.kr.arraysample;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		/*
		 * �ȳ��ϼ��� -> �ȳ��ϼ�
		 1. ���ڿ��� �Է� �޾� 
		 2. ���� �ϳ��ϳ� �迭�� �ְ�
		 3. ���ڿ��� �� �� �� �ִ��� ������
		 4. �˻��� ���� scanner
		 5. �� ��° �ε����� ��ġ�ϴ���
		 6. �ε��� ����ϱ�
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");//1. ���ڿ��� �Է� �޾�
		String inputString = sc.next();
		
		//2. ���� �ϳ� �ϳ� �迭�� �ִ´�.
		//String �ȿ� �ִ� ���ڵ��� �迭�� ��´�. 
		//char ���̶�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
		//String �ȿ� char�迭�� ������ִ� �༮ => toCharArray
		// ex) String �ȳ��ϼ��� = {'��','��','��','��','��'}
		char[] charArray = inputString.toCharArray();
		//inputString �� ���� ���ڰ� ��
		
		//3. ���ڿ��� �� �� �� �ִ��� ����üũ
		int arrLength = charArray.length;
		System.out.println("���ڿ� ���� üũ : "+arrLength);
		
		//3-1 �˻��� ���� scanner�� ����ؼ� ���ڰ˻��ϱ�
		System.out.println("�ѱ��ڸ� �Է��ϼ���.");
		char searchChar = sc.next().charAt(0);
		System.out.println("ù ���� : " + searchChar);
		
		//4. ���ڿ��� � ���� ����ִ��� Ȯ��
		//System.out.println("charArray[0] : " + charArray[0]);
		for(int i = 0; i < arrLength; i++) {
			//���� ���̶�� ���ڰ� �� ��°�� ����ִ��� �ʹ� �ñ���
			//���࿡ �迭�� ����ִ� ���ڿ� �˻��� ���ڰ� �Ȱ��� ����ٸ�!
			if(charArray[i] == searchChar) {
				System.out.println("charArray [ " + i + " ]");
			} else if (charArray[i] != searchChar ) {
				System.out.println("���� ġŲ �Ԉ�");
			}

		}
		
	}

}







