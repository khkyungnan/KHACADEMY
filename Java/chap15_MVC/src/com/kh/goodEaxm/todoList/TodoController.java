package com.kh.goodEaxm.todoList;

//컨트롤러 (Controller) - 모델과 뷰 간의 상호 작용을 조정합니다.
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
