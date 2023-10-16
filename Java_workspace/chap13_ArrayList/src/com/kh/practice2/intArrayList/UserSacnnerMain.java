package com.kh.practice2.intArrayList;

import java.util.Scanner;

public class UserSacnnerMain {

	public static void main(String[] args) {
		/*
		 사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
		 향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력
		*/
		//정수 입력받는 Scanner 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		
		// 배열에다가 5개의 정수를 입력하는 포문
		//초기식 : 인덱스 0으로 시작해서 하나씩 담자;
		//조건식 : 0부터~(5-1)까지 집어넣게해;
		//증감식 : 하나씩 증가시켜
		int[] numbers = new int[5];
		for(int i = 0; i <5; i++) {
			System.out.println("정수 index " + (i) + " : ");
			//System.out.println("정수 차리값" + (i + 1) + " : ");
			numbers[i] = sc.nextInt();
			//ArrayList 경우 colors.get(0)
			//배열은 [] 안에 넣음
			/*
			 * 근데 배열의 자리가 없네? 배열의 자리먼저 만들어줘야겠다
			 * 어떻게?
			 * 바깥에다가 int numers 이녀석의 배열을 만들어줘야지!
			 * 포문이 시작하기전에 전체적인 장바구니는 만들어줘야하잖아
			 */
			
			
		}
		
		//조건이 최종까지 더하는 것이기 때문에 향상된 for문 사용
		//또는 기본 for을 사용하고 싶다면 length 이용해서 출력 가능
		//		숫자1개씩	  전체숫자
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//배열의 모든 요소를 더한 결과 출력
		//합산된 결과 출력
		System.out.println("배열의 모든 요소를 더한 결과 : " + sum);
	}

}




