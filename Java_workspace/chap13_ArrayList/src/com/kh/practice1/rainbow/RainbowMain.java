package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
	/*
		ArrayList �̿��ؼ� ���ֳ����ĳ���
		���� 3ȸ 1,3,5 ->��, ����, �׸� ����
		���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
		���� for�� �̿��ؼ� ���� ����ϱ�
		�� �� ��� �� �� ��
	*/
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println("colors" + colors);
		
		//1. ���ֳ����ĳ���
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		System.out.println("��ü���� : " + colors);
		
		//2. ���� 3ȸ 1,3,5 ->��, ����, �׸� ����
		colors.set(1, "��");
		colors.set(3, "����");
		colors.set(4, "�׸�");
		System.out.println("���� : " + colors);
		
		//3. ���ϱ� 2ȸ ->��, [���ο�],�׸�,[�����Ķ�]
		colors.add(2, "���ο�");
			//System.out.println("���� : " + colors);
		//colors.add(null)
		//���ο� �� ���� �׸� [�����Ķ�]
		//3-1.��� �� ���� ���� //
		/*
		colors.remove(3);
		System.out.println("�� ���� : " + colors);
		colors.remove(3);
		System.out.println("���� ���� : " + colors);
		*/
		//3-2.��� ��,[���ο�],�׸�,[�����Ķ�]
		colors.add(6, "�����Ķ�");
			//System.out.println("�����Ķ� ���� : " + colors);
		//4. ���� for�� �̿��ؼ� ���� ����ϱ�
		for(String AAA : colors) {
			System.out.println(AAA);
		}
		
		//������. ���� ��� �� �� ��
		//1. �ε��� �̿��ؼ� �ڸ� ���
		colors.set(7, "��");
		System.out.println("���� ��� "+colors.get(0)+" "+colors.get(7)+" "+colors.get(8));
		//2. �ʱ�ȭ �� ���
		ArrayList<String> rainbow = new ArrayList<>();
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		System.out.println("���� ��� " +rainbow.get(0)+" " + rainbow.get(1) + " " + rainbow.get(2));
		//System.out.println("�� �� ��");
		
	}

}




