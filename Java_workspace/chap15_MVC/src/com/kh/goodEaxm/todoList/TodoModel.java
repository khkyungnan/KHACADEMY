package com.kh.goodEaxm.todoList;

import java.util.ArrayList;
import java.util.List;

// 모델 (Model) - To-Do 항목을 관리합니다.
class TodoModel {
    private List<String> items;

    public TodoModel() {
        items = new ArrayList<>();
    }

    public boolean addItem(String item) {
    	boolean flag = false;
    	if(!isExistItem(item)){
    	flag = true;
    	        items.add(item);
    	}
    	return flag;
    }

	public boolean isExistItem(String item){
	  return items.contains(item);
	}
    public List<String> getItems() {
        return items;
    }
}
