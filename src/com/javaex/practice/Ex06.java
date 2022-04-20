package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int one = sc.nextInt();
		System.out.print("숫자2: ");
		int too = sc.nextInt();
		
		if(one>too) {
			System.out.println("큰수: "+one+"\t\t 작은수: "+too+"입니다.");
		}else if(one<too) {
			System.out.println("큰수: "+too+"\t\t 작은수: "+one+"입니다.");
		}else {
			System.out.println("큰수: "+one+"\t\t 작은수: "+too+"입니다.");
		}
		sc.close();
	}

}
