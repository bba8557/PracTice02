package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		if(0<age && age<18) {
		/*if(0 < age < 18) 오류나는 이유
		  if는 true 혹은 false로 나타낼수 있는데 저래서는 답을할수없다
		  해결방안으로 앤드연산자를 이용하여 둘다 true 일땐 true로 나타낼수있다*/	
		
			System.out.println("청소년 입니다.");
		}
	}

}
