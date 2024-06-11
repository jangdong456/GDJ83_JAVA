package com.jang.lang;

public class S5Main {

	public static void main(String[] args) {
		// split()
		// 어떤 기준으로 분리하겠다.
		String name = " winter ";
//		System.out.println(name);
//		System.out.println(name.length());
//		name.trim();
		
		name = "winter-24-서울";
		//파싱 : 하나의 문자열을 여러개 문자열로 나눈것
		name = name.replace("*", "-");
		String [] datas = name.split("-");
		
		for(int i=0; i<datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		// valueOf();
		//String 타입으로 바꾸는 메서드
		String s = String.valueOf(10.21111111);
		System.out.println(s);
	}
}
