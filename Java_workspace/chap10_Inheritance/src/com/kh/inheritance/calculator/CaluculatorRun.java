package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CaluculatorRun extends CaluculatorForMod {

	public static void main(String[] args) {
<<<<<<< HEAD
=======
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		CaluculatorForMod cal = new CaluculatorForMod();
		//cal.num1 = num1;
		//cal.num2 = num2;
		//CaluculatorForMod cal = new CaluculatorForMod();
		System.out.println("add = " + cal.add());
		System.out.println("mul =  " + cal.multiply());
		System.out.println("mod = " + cal.mod(num1,num2));
		
		/* scanner 이용해서 코드 변경하기 */
/*
>>>>>>> 42146806e042c1bd15a9d379a914dafd6221e446
		CaluculatorForMod cal = new CaluculatorForMod();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc.nextInt();

		cal.num1 = a;
		cal.num2 = b;
		
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		int result5 = cal.mod(cal.num1, cal.num2);
		System.out.println("Add : " + result1);
		System.out.println("sub : " + result2);
		System.out.println("mul : " + result3);
		System.out.println("div : " + result4);
<<<<<<< HEAD
		System.out.println("mod : " + result5);
		
=======
		System.out.println("div : " + result5);
		*/
>>>>>>> 42146806e042c1bd15a9d379a914dafd6221e446
		
	}

}
