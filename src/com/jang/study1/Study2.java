package com.jang.study1;

public class Study2 {
	public static void main (String [] args) {
		//java project 기본	7.java 명명 규칙

		int age=30;
		System.out.println(age);
		
		//Reference Type (객체)
		String name="Kwan";
		Object obj = new Object(); // 레퍼런스타입
		
		//형변환 (Cascading)
		//primitive 타입끼리만 가능 (boolean 제외)
		
		//형태의 변환 (Type의 변환)
		//강제 형변환, 명시적 형변환
		//큰타입을 작은타입, 값의 변화가 있을수있다
		long num1 = 30l;
		int num2 = (int)num1;
		
		float f1 = 1.2F;
		//자동 형변환, 묵시적 형변환
		//작은 타입을 큰타입에 넣을떼
		double d1 = (double) f1; //double 생략가능
		
		
		//자동형변환
		//byte > short, char > int > long > float > double
		//수 표현의 개수 (비트조합)
		
		
		int total = 100;
		double avg = (double)total/3.0; //오른쪽 계산 후 실수에 대입
		
		avg=33.22;
		total=(int)avg*10;
		
		System.out.println(avg);
		System.out.println(total);
		
		//over flow
		byte b = 127;
		byte b2 = 1;
//		b = (byte) b+b2
		System.out.println(b+b2);
		//under flow
		byte b1=-128;
		byte b3=-1;
		System.out.println(b1+b3);
		
		
		//연산자는 같은 타입끼리만 연산 가능
		//산술연산자 : + - * / %
		System.out.println(1.2+3);
		
	}
}
