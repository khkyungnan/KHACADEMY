package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add �غ��� ���� ��� �ߺ��� �� add �ؾ���
		pList.add("��");
		pList.add("��");
		pList.add("��");
		pList.add("��");
		
		for(String a : pList) {
			System.out.println(a);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� ���� ��� �ߺ��� �� add �ؾ���
		pSet.add("a");
		pSet.add("b");
		pSet.add("c");
		pSet.add("a");
		for(String s : pSet) {
			System.out.println(s);
		}
	}
	public void practiceMap() {
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("��",1);
		pMap.put("��",2);
		pMap.put("��",3);
		for(String a : pMap.keySet()) {
			int num = pMap.get(a);
			System.out.println(a + " : " + num);
		}
		
	}
}
