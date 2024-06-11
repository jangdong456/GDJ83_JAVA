package com.jang.lang.wrapper;

public class Wapper1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		Integer i = new Integer("10");
		
		int num = 10;
		
		// static 이면 객체생성이 필요없다.
		
		//숫자를 문자열로 만드는 메서드
		//parseInt();
		int n = Integer.parseInt("10");
		Long.parseLong("10L");
		
		//wrpper
		num = 10;
		//auto boxing | primitive type 타입을 같은 타입으로 만든다
		// integer 타입으로 감싸서 만들자 -> wrpper
		Integer n1 = num;
		
		// auto unboxing | wrpper 타입을 privte 타입으로 바꾼다. 
		// 클래스를 없애놓고 값을 집어넣는다.
		num = n1;
		
		// is로 시작하는 메서드는 전부다 boolean 형식으로 반환한다.
		
		
		
	}
}
