package com.kr.arraysample;

public class Array04 {

	public static void main(String[] args) {
		// Array ����
		// 						  0       1      2      3       4 
		String[] inturnArray = {"��泭","�踻��","ȫ�浿","��ö��","������"};
		
		inturnArray[3] = "���ѳ�";
		System.out.println("��ö�����  "+inturnArray[3]);
		
		/*
		 *  ���� String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		 *  ������� �ٳ��� 
		 *  ���⿡�� ����
		 *  Ű������ ����
		 *  �޷п��� ��
		 *    �ֿ��� ������
		 */
		
		//          length   �� 5�� (1 ~ 5) 
		//		   index		0     1     2     3     4 
		String[] fruitArray = {"*","*","Ű��","�޷�","��"};
		 fruitArray[0] = "*"; //������� �ٳ��� 
		 fruitArray[1] = "*"; //  ���⿡�� ����
		 fruitArray[2] = "����";//  Ű������ ����
		 fruitArray[3] = "��";//  �޷п��� ��
		 fruitArray[4] = "������";//    �ֿ��� ������

		 System.out.println("0 : " + fruitArray[0]);
		 System.out.println("1 : " + fruitArray[1]);
		 System.out.println("2 : " + fruitArray[2]);
		 System.out.println("3 : " + fruitArray[3]);
		 System.out.println("4 : " + fruitArray[4]);
		 
	}

}






