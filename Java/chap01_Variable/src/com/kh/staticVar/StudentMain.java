package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh�л�1");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		//�츮 ���� ����å 11�� ĭ
		//�츮 ���� ����å 2��° 11�� ĭ
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("����å 1");
		System.out.print("KH stKim : ");
		System.out.println(stKim.serialNum);
		
		System.out.print("����å 2 : ");
		System.out.println(khLee.serialNum);
		
		
	}
}




