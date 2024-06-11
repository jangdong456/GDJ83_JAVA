package com.jang.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pw를 입력");
		String pw = sc.next();
		
		//문제
		//pw에 대문자가 1개 이상 있어야 한다. 검사해야함
		//1글자씩 꺼내와서 대문자가 맞냐 아니야 비교후
		
		// 문자열을 추출해야함 사용 subString();
		// 맞으면 pw ok
		// 틀리면 다시 return
		
		// 여기서 인덱스 번호를 알아야 해서 
		//  indexOf()
//		String result = "";
//		result = pw.substring(0);
//		
//		charAt
//		
//		// result담은 문자열 을 한글자 한글자씩 비교해봐야함
//		String[] ar = new String[result.length()];
//		
//		for(int i=0; i<result.length(); i++) {
//			ar
//		}
//	
//		boolean flag = true;
//		while(flag) {
//			
//			Character.isUpperCase();
//			
//		}
		
		// 강사님 풀이
//		String result = "최소 1이상의 대문자가 있어야함";
//		for(int i=0; i<pw.length(); i++) {
//			char ch = pw.charAt(i);
//			if(Character.isUpperCase(ch)) {
//				result="통과";
//				break;
//			}
//		}
//		System.out.println(result);
		
		// 추가문제 
		// 비밀번호가
		//비번길이는 최소 6자 글자 이상
		//대소문자1개 이상, 숫자 1개 이상이 있어야함
		// 숫자 입니까 ? 메서드 -> isDigit()
		
		//강사님 풀이
		String result = "최소 1이상의 대문자가 있어야함";
		//방식 1
		
//		int upper = 0; // 대문자 
//		int lower = 0; // 소문자
//		int digit = 0; // 숫자
		
		//방식2
		
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		
		for(int i=0; i<pw.length(); i++) {
			char ch = pw.charAt(i);
			if(Character.isUpperCase(ch)) {
//				upper++;
				upper = true;
			}else if(Character.isLowerCase(ch)) {
//				lower++;
				lower = true;
			}else if(Character.isDigit(ch)) {
//				digit++;
				digit = true;
			}else {
				
			}
		}
		
		if(upper && lower && digit) {
			System.out.println("통과");
		}else {
		System.out.println("fail");
		}
		
		
//		if(upper>0 && lower>0 && digit>0) {
//			System.out.println("통과");
//		}else {
//			System.out.println("fail");
//		}

		System.out.println(result);
	}
}
