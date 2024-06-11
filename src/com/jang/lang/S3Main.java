package com.jang.lang;

public class S3Main {
	 
	public static void main(String[] args) {
		//indexOf() 
		// int ch | String string
		// 어떤 문자 값이 있으면 그 문자 값의 몇번 인덱스에 있는지 반환
		// 못찾으면 -1를 반환
		// 동일한 문자 값이 있다면 먼저 앞에 있는 문자값의 인덱스를 반환
		
		String name = "finafl.pdf";
//		System.out.println(name.indexOf("f", 0));
//		System.out.println(name.indexOf("f", 2));
//		System.out.println(name.indexOf("f", 5));
//		2. while
//			- 반복 해야할 횟수가 정해져 있지 않을 때 사용
//
//		 A. while
//			while(조건식){
//				조건식이 true 일 때 실행
//		  }
//
//		 1) 조건식 실행
//				true 라면 {   } 실행
//				1) 실행
//				2) 다시 조건식으로 이동
//
//			 false라면 while문 종료


		boolean flag = true;
		int result = 0;
		
		while(flag) {
			result = name.indexOf("f", result);
			if(result == -1) {
				break;
			}
			System.out.println(result);
			result++;
			
		}
		System.out.println("종료");

	}
}
