package com.kh.classAM;

//import com.kh.classAM.AM;
/*
 publicMethod;
 protectedMethod;
 defaultMethod;
 privateMethod;
 * */
public class OtherAM {
	public static void main(String[] args) {
		final int a = 1;
		System.out.println("a  :" + a);
		//AM 생성
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		
		//am.privateMethod(); //다른 클래스에 존재하기 때문에 출력이 안됨!
	}
	
	
}
