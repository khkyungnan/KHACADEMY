package com.kh.goodEaxm.todoList;

import java.util.List;
import java.util.Scanner;

//�� (View) - ����� �������̽��� ǥ���ϰ� �Է��� ó���մϴ�.
class TodoView {
 public void displayItems(List<String> items) {
     System.out.println("To-Do ����Ʈ:");
     for (int i = 0; i < items.size(); i++) {
         System.out.println((i + 1) + ". " + items.get(i));
     }
 }

 public String getInput() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("�߰��� �׸��� �Է��ϼ���: ");
     return scanner.nextLine();
     
 }
}

