package com.kh.practice2.intArrayList;

import java.util.Scanner;

public class UserSacnnerMain {

	public static void main(String[] args) {
		/*
		 ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
		 ���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���
		*/
		//���� �Է¹޴� Scanner �����
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���.");
		
		// �迭���ٰ� 5���� ������ �Է��ϴ� ����
		//�ʱ�� : �ε��� 0���� �����ؼ� �ϳ��� ����;
		//���ǽ� : 0����~(5-1)���� ����ְ���;
		//������ : �ϳ��� ��������
		int[] numbers = new int[5];
		for(int i = 0; i <5; i++) {
			System.out.println("���� index " + (i) + " : ");
			//System.out.println("���� ������" + (i + 1) + " : ");
			numbers[i] = sc.nextInt();
			//ArrayList ��� colors.get(0)
			//�迭�� [] �ȿ� ����
			/*
			 * �ٵ� �迭�� �ڸ��� ����? �迭�� �ڸ����� �������߰ڴ�
			 * ���?
			 * �ٱ����ٰ� int numers �̳༮�� �迭�� ����������!
			 * ������ �����ϱ����� ��ü���� ��ٱ��ϴ� �����������ݾ�
			 */
			
			
		}
		
		//������ �������� ���ϴ� ���̱� ������ ���� for�� ���
		//�Ǵ� �⺻ for�� ����ϰ� �ʹٸ� length �̿��ؼ� ��� ����
		//		����1����	  ��ü����
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//�迭�� ��� ��Ҹ� ���� ��� ���
		//�ջ�� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : " + sum);
	}

}




