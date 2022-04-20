package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int age;
		//선언을 해준이유는 메모리는 단기기억이라 if안에서만 기억하고
		// 나옴가동시에 잊어버려 밖에서 기억하도록 선언을 해준것이다
		
		Scanner sc = new Scanner(System.in);
		//나이 15, 19, 20, 21, 100
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");//20미만값은 (15 19)
		}else {
			System.out.println("\'2번그룹\'");//20초과값은 본인포함(20 21 100)
		}
		System.out.println("입니다.");
		
		sc.close();
		}
	}


