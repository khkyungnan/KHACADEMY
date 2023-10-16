package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
	/*
		ArrayList 이용해서 빨주노초파남보
		수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
		더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
		향상된 for문 이용해서 색상 출력하기
		최 후 출력 빨 파 보
	*/
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println("colors" + colors);
		
		//1. 빨주노초파남보
		colors.add("빨");
		colors.add("주");
		colors.add("노");
		colors.add("초");
		colors.add("파");
		colors.add("남");
		colors.add("보");
		System.out.println("전체색상 : " + colors);
		
		//2. 수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
		colors.set(1, "블랙");
		colors.set(3, "브라운");
		colors.set(4, "그린");
		System.out.println("수정 : " + colors);
		
		//3. 더하기 2회 ->블랙, [옐로우],그린,[연한파랑]
		colors.add(2, "옐로우");
			//System.out.println("수정 : " + colors);
		//colors.add(null)
		//옐로우 노 브라운 그린 [연한파랑]
		//3-1.방법 노 브라운 삭제 //
		/*
		colors.remove(3);
		System.out.println("노 삭제 : " + colors);
		colors.remove(3);
		System.out.println("브라운 삭제 : " + colors);
		*/
		//3-2.방법 블랙,[옐로우],그린,[연한파랑]
		colors.add(6, "연한파랑");
			//System.out.println("연한파랑 수정 : " + colors);
		//4. 향상된 for문 이용해서 색상 출력하기
		for(String AAA : colors) {
			System.out.println(AAA);
		}
		
		//마지막. 최후 출력 빨 파 보
		//1. 인덱스 이용해서 자리 출력
		colors.set(7, "남");
		System.out.println("최후 출력 "+colors.get(0)+" "+colors.get(7)+" "+colors.get(8));
		//2. 초기화 후 출력
		ArrayList<String> rainbow = new ArrayList<>();
		rainbow.add("빨");
		rainbow.add("남");
		rainbow.add("보");
		System.out.println("최후 출력 " +rainbow.get(0)+" " + rainbow.get(1) + " " + rainbow.get(2));
		//System.out.println("빨 남 보");
		
	}

}




