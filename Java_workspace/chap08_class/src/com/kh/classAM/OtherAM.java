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
		//AM ����
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		
		//am.privateMethod(); //�ٸ� Ŭ������ �����ϱ� ������ ����� �ȵ�!
	}
	
	
}
