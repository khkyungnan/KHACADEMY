package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh학생1");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		//우리 서점 국어책 11번 칸
		//우리 서점 국어책 2번째 11번 칸
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("국어책 1");
		System.out.print("KH stKim : ");
		System.out.println(stKim.serialNum);
		
		System.out.print("국어책 2 : ");
		System.out.println(khLee.serialNum);
		
		
	}
}




