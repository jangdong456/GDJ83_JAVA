package com.jang.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "winter,10, iu,20, hani,30, 철수,40 ,영희,50";
		
		StringTokenizer st = new StringTokenizer(names, ","); //여러개가 있을때 사용
		
		System.out.println(st.countTokens());
		
		// 반복 횟수가 정해지지 않았을 때 while문 사용
		// 다음 토큰(문자열)이 있는지 없는지 살펴보는 메서드 | hasMoreTokens() -> return값 | true , false
		while(st.hasMoreTokens()) {
			
			// nextToken() -> return값 | String
			String name = st.nextToken();
			String age = st.nextToken();
			System.out.println(name.trim());
			
		}
		
	
	}
}
