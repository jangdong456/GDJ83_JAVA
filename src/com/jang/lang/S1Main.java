package com.jang.lang;

import java.util.Scanner;

public class S1Main {
	
	public static void main(String[] args) {				
		//import를 생략 가능한것
		// 1. 같은 패키지 내에 있으면 생략가능
		// 2. java.lang 내의 클래스를 사용할 때는 import 생략가능
		
		Scanner sc = new Scanner(System.in);
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj == obj2); //주소를 비교해서 false가 나옴 | 새로 생성시 객체의 주소가 다름
		
		String n = new String("winter"); 
		String n2 ="winter";
	
		System.out.println(n); // 참조변수 : 주소를 담고있는 변수 | 여기선 n과 n2
		                       // 참조변수를 찍으면 자동적으로 toString()메서드가 호출되어서
		                       // "winter" 값이나옴
		System.out.println(obj);
		
		System.out.println(n2.charAt(0));
		System.out.println(n2.charAt(1));
		System.out.println(n2.charAt(2));
		System.out.println(n2.charAt(3));
		System.out.println(n2.charAt(4));
		
		System.out.println("문자열 입력");
		n = sc.next();
		for(int i=0; i<n.length(); i++) {
			int ch = n.charAt(i);
			System.out.println(ch);
		}
		
		System.out.println((n.length()*1000)+"원 입니다."); 
		
	}
}
