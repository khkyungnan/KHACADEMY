package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 p = new PracticeMain2();
		p.practice4();
		p.practice5();
	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");//Àú³áÀº ¹¹¸ÔÁö
		sb.append("Àú³áÀº ¹¹¸ÔÁö");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ inser ? ¤¾¤¾
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.insert(10, "? ¤¾¤¾");
		System.out.println(sb.toString());
		
	}
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.replace(7, 11,"Python");
		System.out.println(sb.toString());
	}
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete(,,);
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.delete(7,11);
		System.out.println(sb.toString());
	}
}
