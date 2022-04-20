package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String lean = sc.next();
		System.out.print("숫자1: ");
		double one = sc.nextDouble();
		System.out.print("숫자2: ");
		double too = sc.nextDouble();
		
		if(too>0) {
			switch(lean) {
				case "+":
					System.out.println("결과는: "+(one+too));
					break;
					
				case "-":
					System.out.println("결과는: "+(one-too));
					break;
					
				case "*":
					System.out.println("결과는: "+(one*too));
					break;
					
				case "/":
					System.out.println("결과는: "+(one/too));
					break;
					
				default :
					System.out.println("계산할 수 없는 기호입니다.");
					break;
			}
		}else {
			System.out.println("계산할 수 없습니다.");
		}
		sc.close();
	}
}