package com.jang.s4;

public class S4Main {
	
	public static void main(String[] args) {
		// main() 메소드에서 사용하려면
		//company변수 의 주소를 알수 없기에 해당 class 를 가지고옴
		//클래스명.변수명
		//클래스 변수명 이라고 부름
		Car.company ="";
		System.out.println(Car.company);
		
		//클래스명.메서드명
		Car.info();
		
		double a = Math.abs(1.2);
		System.out.println(a);
	}
}
