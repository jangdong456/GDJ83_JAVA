package com.jang.lang.wrapper;

import java.util.Scanner;

public class Wapper3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");

		String jumin = sc.next();
		// 문제1
		// 조건
		// 1.성별을 검증1
//		char ch = ju
		
//		
//		if( ch == '1' || ch =='3') {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		
		// 문제2
		// 나이 계산
		// 2024년 에서 - 출생년 
		// 내가 푼 풀이
//		String num = jumin.substring(0,2);
		
		//		if( ch == '0' || ch == '1' || ch == '2') {
		//		num = "20"+ ch + ch1; // 2021
		//		Integer.parseInt(num); 
		//		num = int 2024 - num;
		//		
		//		System.out.println(num);
		//	}
		
		//강사님 풀이
//		String num = jumin.substring(0,2);
//		int y = Integer.parseInt(num);
//		
//		int r =1900;
//		if (ch == '3' || ch == '4') {
//			r=2000;
//		}
//		
//		int year = r + Integer.parseInt(y);
//		System.out.println(2024 - year);

	
		// 문제3
		// 주민번호 유효성 검증
		// 각 자리 곱해주기
		// 9   4   1  1  0  7 - 1   2  3  4  5  6  7  
		// *2 *3 *4 *5 *6 *7    *8 *9 *2 *3 *4 *5 마지막7은 검증용 숫자
		// 18 12  4 5 0 49      8  18 27 16 0 6
		// 합산 = 163 | 182%11 
		// 총합을 11로 나눈 나머지를 구함  => 9
		// 나머지를 11로 뺀 결과값을 검증용 숫자와 같은지 비교 
		// 11로 뺀 결과값이 2자리수 라면 
		// 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자랑 비교
		
		//13자리 | integer = 10자리 까지만 됨
//		String num1 = jumin.substring(0,6); //string 941107
//		String num2 = jumin.substring(6,13); 1234567
//		long fulNum = Long.parseLong(num); // Long
		
//		int fulNum1 = Integer.parseInt(num1);
//		int fulNum2 = Integer.parseInt(num2);
		
//		for문은 값을 추출 하고 싶을때 배열로 밖에 안된다 ?
		
//		int sm = 0;
//		for(int i=0; i<jumin.substring(0,6).length(); i++) {	
//			char num1 = jumin.charAt(i);
//			//prime.. type 과 연결하면 = 문자열이 된다.
//			int intNum1 = Integer.parseInt(num1+"");
//
//			sm = sm + intNum1*(i+1); //9 8 3 4 0 42
//		}
//		System.out.println(sm);
//		String a = jumin.substring(13); // charAt 으로 꺼내오기
//		System.out.println(a+"@@@@");
//		System.out.println("@@");
//		int b = Integer.parseInt(a);
//		
//		// 합산 했으니 ; 합산값과 %  
//		if( sm < 10 ) {
//			if(sm == b) {
//				System.out.println("유효한 주민등록번호 입니다.");
//				return;
//			}System.out.println("유효하지 않는 주민등록번호 입니다.");
//			
//		}else if( sm >= 10 ) {
//			int test = sm%10;
//			if(test == b) {
//				System.out.println("유효한 주민등록번호 입니다.");
//				return;
//			}System.out.println("유효하지 않는 주민등록번호 입니다.");
//		}
//		
		// 강사님 풀이
		int c =2;
		int sum = 0;
		
		for(int i=0; i < jumin.length()-1; i++) {
			char n1 = jumin.charAt(i);
			if(i == 6) { // (n1 == '-') 조건식 이것도 가능 
				continue; //continue : 그 즉시 중단하고 위로 올라가라는 코드
			}
			String n2 =String.valueOf(n1);
			int num1 = Integer.parseInt(n2);
			sum = sum + num1*c;
			c++;
			if(c>9) {
				c=2;
			}
		}
		
		sum = sum % 11 ; // sum%=11; 이것도 가능
		sum = 11 - sum;
		if( sum >= 10 ) {
			sum = sum % 10;
		}
		
		int a = Integer.parseInt(String.valueOf(jumin.charAt(13)));
		
		if(sum == a) {  // jumin.charAt(jumin.length()-1) | jumin.charAt(13) =>하지만 여긴 char타입이라 int로 변환 시켜줘야함
			System.out.println("유효한 주민번호");			
		}else {
			System.out.println("재발급");			
		}
	}
}
