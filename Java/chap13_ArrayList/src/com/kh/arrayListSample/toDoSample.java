package com.kh.arrayListSample;

import java.util.ArrayList;
/*
 * toDoSample.java
 * ArrayList �̿��ؼ� 
 * 
 * */
public class toDoSample {

	public static void main(String[] args) {
		//�� ArrayList ����
		ArrayList<String> todoList = new ArrayList<>();
		System.out.println("���� : " + todoList);//todoList : []
		
		//��� �߰�
		todoList.add("��Ա�");
		System.out.println("��Ա� �߰� : " + todoList);
		todoList.add("ī�䰡��");
		System.out.println("ī�䰡�� �߰� : " + todoList);
		todoList.add("����Ա�");
		System.out.println("����Ա� �߰� : " + todoList);
		todoList.add("��Ա�");
		System.out.println("��Ա� �߰� : " + todoList);
		todoList.add("ī�䰡��");
		System.out.println("ī�䰡�� �߰� : " + todoList);
		todoList.add("����Ա�");
		System.out.println("����Ա� �߰� : " + todoList);
		todoList.add("��Ա�");
		System.out.println("��Ա� �߰� : " + todoList);
		todoList.add("ī�䰡��");
		System.out.println("ī�䰡�� �߰� : " + todoList);
		todoList.add("����Ա�");
		System.out.println("����Ա� �߰� : " + todoList);
		todoList.add("��Ա�");
		System.out.println("��Ա� �߰� : " + todoList);
		todoList.add("ī�䰡��");
		System.out.println("ī�䰡�� �߰� : " + todoList);
		todoList.add("����Ա�");
		System.out.println("����Ա� �߰� : " + todoList);
		
		// ��� ���� Ȯ��
		int size = todoList.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		//�ε����� ����Ͽ� ��ҿ� ��������
		String firstTodoList = todoList.get(0);
		System.out.println("1��° ���� ���� : " + firstTodoList);
		String sTodoList = todoList.get(2);
		System.out.println("2��° ���� ���� : " + sTodoList);
		
		//��� �����Ұž�
		todoList.set(1,"��ϱ�");
		System.out.println("����üũ : " + todoList);
		todoList.set(2,"���ڱ�");
		System.out.println("����üũ : " + todoList);
		//��� ����
		todoList.remove(1);
		System.out.println("��ϱ� ����Ȯ�� : " + todoList);
		
		// ArrayList ��ȸ�ؼ� ������
		for(String aaaaaaaa:todoList) {
			System.out.println("���ϸ�� :" + aaaaaaaa);
		}
		
		//�ߺ��� ���� ����
		//ArrayList ����
		todoList.clear();
		System.out.println("��� �� ���� ���� : " + todoList);
	}

}



