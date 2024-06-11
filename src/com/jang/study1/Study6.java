package com.jang.study1;

public class Study6 {
	public static void main(String [] args) {
		
		int total = 256;
		int avg = total/3;
		
		//평균 90 이상 A
		//평균 80 이상 B
		// ~ 60 이하 F
		// switch case 사용
		
		
		
		switch (avg/10) { //앞자리수만 빼옴
		case 9:
			System.out.println("A");
			int n=10;
		break;
		case 8:
			System.out.println("B");
		break;
		case 7:
			System.out.println("C");
		break;
		case 6:
			System.out.println("D");
		break;
		default:
			System.out.println("F");
		
		}
		
		
		
	}
}
