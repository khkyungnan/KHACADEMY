package com.kh.goodEaxm.todoList;


public class TodoListApp {
    public static void main(String[] args) {
        TodoModel model = new TodoModel();
        TodoView view = new TodoView();
        TodoController controller = new TodoController(model, view);

        System.out.println("������ To-Do ����Ʈ ���ø����̼��Դϴ�. 'exit'�� �Է��ϸ� ����˴ϴ�.");
        controller.run();
    }
}