package chap06_for;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// 구구단 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt(); //2
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt(); //4
		
		int result = 0; //최초 값을 0으로 줍니다. 
		for (int i = 1; i <= num2; i++) {
			result += num1;
			System.out.println(num1 + " * " + i + " = " + result);
		}
		
			
		
		
	}

}




