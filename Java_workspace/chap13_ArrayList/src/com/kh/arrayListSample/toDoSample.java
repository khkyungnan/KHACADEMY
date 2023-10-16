package com.kh.arrayListSample;

import java.util.ArrayList;
/*
 * toDoSample.java
 * ArrayList 이용해서 
 * 
 * */
public class toDoSample {

	public static void main(String[] args) {
		//빈 ArrayList 생성
		ArrayList<String> todoList = new ArrayList<>();
		System.out.println("할일 : " + todoList);//todoList : []
		
		//요소 추가
		todoList.add("밥먹기");
		System.out.println("밥먹기 추가 : " + todoList);
		todoList.add("카페가기");
		System.out.println("카페가기 추가 : " + todoList);
		todoList.add("저녁먹기");
		System.out.println("저녁먹기 추가 : " + todoList);
		todoList.add("밥먹기");
		System.out.println("밥먹기 추가 : " + todoList);
		todoList.add("카페가기");
		System.out.println("카페가기 추가 : " + todoList);
		todoList.add("저녁먹기");
		System.out.println("저녁먹기 추가 : " + todoList);
		todoList.add("밥먹기");
		System.out.println("밥먹기 추가 : " + todoList);
		todoList.add("카페가기");
		System.out.println("카페가기 추가 : " + todoList);
		todoList.add("저녁먹기");
		System.out.println("저녁먹기 추가 : " + todoList);
		todoList.add("밥먹기");
		System.out.println("밥먹기 추가 : " + todoList);
		todoList.add("카페가기");
		System.out.println("카페가기 추가 : " + todoList);
		todoList.add("저녁먹기");
		System.out.println("저녁먹기 추가 : " + todoList);
		
		// 요소 개수 확인
		int size = todoList.size();
		System.out.println("할일 목록의 크기 : " + size);
		
		//인덱스를 사용하여 요소에 접근하자
		String firstTodoList = todoList.get(0);
		System.out.println("1번째 할일 수정 : " + firstTodoList);
		String sTodoList = todoList.get(2);
		System.out.println("2번째 할일 수정 : " + sTodoList);
		
		//요소 수정할거야
		todoList.set(1,"운동하기");
		System.out.println("수정체크 : " + todoList);
		todoList.set(2,"잠자기");
		System.out.println("수정체크 : " + todoList);
		//요소 제거
		todoList.remove(1);
		System.out.println("운동하기 제거확인 : " + todoList);
		
		// ArrayList 순회해서 요소출력
		for(String aaaaaaaa:todoList) {
			System.out.println("할일목록 :" + aaaaaaaa);
		}
		
		//중복된 할일 제거
		//ArrayList 비우기
		todoList.clear();
		System.out.println("모든 할 일을 제거 : " + todoList);
	}

}



