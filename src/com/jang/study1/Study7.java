package com.jang.study1;

import java.util.Scanner;

public class Study7 {
	public static void main (String [] args) {
		//반복문 - for, while
		//for (초기식;조건식;증감식){}
		//while (조건식)
		//do{}while();
		//break, continue
		//3과목의 점수를 입력 받아 합계구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i=0;i<3;i++) {
			int num = sc.nextInt();
			//sum=num+sum;
			sum+=num;
		}
		
		//'a' - 'z' 출력
		char c=97;
		for (int i=0;i<26;i++) {
			System.out.println(c);
			c++;
		}
		for (int i='a';i<'z';i++) {
			System.out.println((char)i);
			c++;
		}
		System.out.println(sum);
		System.out.print("abc");
		System.out.println("def");
		System.out.print("123");
	}
}
