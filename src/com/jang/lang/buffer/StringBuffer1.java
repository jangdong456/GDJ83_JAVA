package com.jang.lang.buffer;

public class StringBuffer1 { 
	
	public static void main(String[] args) {
		
		//  StringBuffer -> 문자열을 누적 하고 싶을 때
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		sb2.append(false);
		
		sb.append("winter");
		sb.append("in");
		
		// 상속받은 값을 바꿨다 -> 오버라이딩
		String result = sb.toString();
		System.out.println(sb);
		System.out.println(result);
		
	}
}
