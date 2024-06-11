package com.jang.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		//substring(); 
		// 문자열 추출
		
		Scanner sc = new Scanner(System.in);
		
//		String name = "slrgnslrgnl";
		//ex) 3번부터 문자열 끝까지 추출 
        //String result = name.substring(3);
		
		//index 3~6사이에 문자 추출 | 실제 추출된 인덱스 번호는 3~5 이다.
//		String result = name.substring(3,6);
//		System.out.println(result);
		
		// 문제 
		// 확장자만 출력하기
		System.out.println("파일명을 입력하세요. 확장자 포함");
		String name = sc.next();
	
		// .의 인덱스 번호를 먼저 찾고 그 뒤에 length를 통해서 글자수 파악한뒤에
		// 문자열 추출
		String result = "";
		int idx = name.lastIndexOf(".");
		result = name.substring(idx +1);
//		System.out.println(result);
		
		//문제
		//jpg,png,gif,jpeg,jiff
		//확장자 5개 중에 파일이면 img파일이고, 아니면 다른 확장자
		
		//문자열 비교 equal 활용하기
		// boolean flag = obj1.equals(obj2);
		
		//문자열을 추출해서 equal 사용해서 
		
		String [] file = {"jpg","png"};
		
		for(int i=0; i<file.length; i++) {
			if(result == file[i]) {
				System.out.println("맞음");
				return;
			}
			System.out.println("아님");
			return;
		}
				
//		if(name.equals(result)) {
//			System.out.println("img파일입니다.");
//			return;
//		}System.out.println("img파일 아닙니다.");		
		
	}
}
