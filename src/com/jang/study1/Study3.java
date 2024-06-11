package com.jang.study1;

public class Study3 {
	
	public static void main (String [] args) {
		//연산자: + - * / %
		// + 산술,연결연산자
		//   문자열 + primitive > 문자열
		//sysout + crtl + space
		System.out.println("1"+1);
		System.out.println(1+"1"+1);
		System.out.println(1+'a'+"1"); //문자형 > 자동형변환
		
		
		//물건을 고르고 물건의 총합계 돈을 내고 결제
		int total = 25370;
		int don = 50000;
		//잔돈계산
		int jandon = don-total;
		
		//만원 개수
		int man = 0;
		
		int ch = 0;
		int baek = 0;
		int sib = 0;
		
		
		man = jandon/10000;
		ch = jandon%10000/1000;
		baek = jandon%1000/100;
		sib = jandon%100/10;
		
		
		System.out.println("잔돈: "+jandon);
		System.out.println("만원: "+man+"장");
		System.out.println("천원: "+ch+"장");
		System.out.println("백원: "+baek+"개");
		System.out.println("십원: "+sib+"개");
		
		
	}

}
