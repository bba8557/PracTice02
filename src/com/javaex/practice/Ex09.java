package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int one = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int too = sc.nextInt();
		
		if(one%too==0) {
			System.out.println(too+"는(은) "+one+" 의 약수입니다.");
		}else if(too%one==0) {
			System.out.println(one+"는(은) "+too+" 의 약수입니다.");
		}else {
			System.out.println(one+"는(은) "+too+" 의 약수가 아닙니다.");
		}
		
		sc.close();
	}

}
