package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int one = sc.nextInt();
		System.out.print("숫자2: ");
		int too = sc.nextInt();
		System.out.print("숫자3: ");
		int three = sc.nextInt();
		
		if(too>one && one<three) {
			System.out.println("가장 작은수는 "+one+" 입니다.");
		}else if(one>too && too<three) {
			System.out.println("가장 작은수는 "+too+" 입니다.");
		}else if(one>three && three<too) {
			System.out.println("가장 작은수는 "+three+" 입니다.");
		}
	
		
		
		sc.close();
	}

}
