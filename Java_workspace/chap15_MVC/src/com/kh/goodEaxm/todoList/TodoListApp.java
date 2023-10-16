package com.kh.goodEaxm.todoList;


public class TodoListApp {
    public static void main(String[] args) {
        TodoModel model = new TodoModel();
        TodoView view = new TodoView();
        TodoController controller = new TodoController(model, view);

        System.out.println("간단한 To-Do 리스트 애플리케이션입니다. 'exit'을 입력하면 종료됩니다.");
        controller.run();
    }
}