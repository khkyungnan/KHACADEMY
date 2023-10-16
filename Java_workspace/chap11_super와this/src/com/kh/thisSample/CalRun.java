package com.kh.thisSample;

import java.util.Scanner;

public class CalRun {
    public static void main(String[] args) {
        CarlMod cal = new CarlMod();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("첫 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        
        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();
        
        cal.num1 = num1;
        cal.num2 = num2;
        
        int result1 = cal.add();
        int result2 = cal.subtract();
        int result3 = cal.multiply();
        int result4 = cal.divide();
        
        System.out.println("Add : " + result1);
        System.out.println("Subtract : " + result2);
        System.out.println("Multiply : " + result3);
        System.out.println("Divide : " + result4);
    }
}