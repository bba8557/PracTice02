package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int one = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int too = sc.nextInt();
		
		int share = one/too;
		int rest = one%too;
		int share2 = too/one;
		int rest2 = too%one;
		
		if(share>rest) {
			System.out.println("몫: "+share);
			System.out.println("나머지: "+rest);
		}else if(share2>rest2){
			System.out.println("몫: "+share2);
			System.out.println("나머지: "+rest2);
		}else {
			System.out.println("몫: "+share);
			System.out.println("나머지: "+rest);
			System.out.println("몫: "+share2);
			System.out.println("나머지: "+rest2);
		}
		sc.close();
	}
}
