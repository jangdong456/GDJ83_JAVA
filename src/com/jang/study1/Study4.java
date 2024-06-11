package com.jang.study1;

import java.util.Scanner;

public class Study4 {
	public static void main (String [] args) {
		//키보드와 연결 준비
		//한번만 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");//0이상의 정수입력
		
		int num = sc.nextInt();
		int result = num+num/4*6;
		
		System.out.println(num);
		System.out.println(result);
		
		System.out.println("프로그램을 종료합니다.");
		
		
		//1>1
		//2>2
		//5>11
		//7>13
	}
}
