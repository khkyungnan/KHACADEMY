package com.kh.goodEaxm.todoList;

import java.util.List;
import java.util.Scanner;

//뷰 (View) - 사용자 인터페이스를 표시하고 입력을 처리합니다.
class TodoView {
 public void displayItems(List<String> items) {
     System.out.println("To-Do 리스트:");
     for (int i = 0; i < items.size(); i++) {
         System.out.println((i + 1) + ". " + items.get(i));
     }
 }

 public String getInput() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("추가할 항목을 입력하세요: ");
     return scanner.nextLine();
     
 }
}

