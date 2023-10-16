package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는 " + age + " 입니다.");
		
		String name;
		int phoneNumber;
		
		System.out.print("당신의 이름을 입력하세요. : ");
		name = sc.next();
		System.out.print("당신의 번호를 입력하세요. : ");
		phoneNumber =sc.nextInt(); //-넣지않기
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " +phoneNumber + "입니다.");
		
		//내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		System.out.print("이름1 : ");
		String name1, name2;
		name1 = sc.next(); //공백을 받지 않음 붙여쓰는것만가능
		System.out.println(name1);
		System.out.print("이름2 : ");
		name2 = sc.nextLine(); // 엔터 치기 전까지를 출력 
		
		System.out.println(name2);
		
		
		
	}
}




