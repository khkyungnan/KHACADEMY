package com.kh.goodEaxm.todoList;

//��Ʈ�ѷ� (Controller) - �𵨰� �� ���� ��ȣ �ۿ��� �����մϴ�.
class TodoController {
 private TodoModel model;
 private TodoView view;

 public TodoController(TodoModel model, TodoView view) {
     this.model = model;
     this.view = view;
 }

 public void run() {
     while (true) {
         view.displayItems(model.getItems());

         String input = view.getInput();
         if (input.equalsIgnoreCase("exit")) {
             break;
         }

         model.addItem(input);
     }
 }
}
