package com.jang.s4;

public class Car {
	//	static
	//	- 공통의, 클래스의
	//	- 객체를 생성하지 않고 사용 가능
	//	- 하나의 프로그램내에서 공통으로 사용 할 때
	//  - 인스턴스변수는 사용이 불가능 하다.
	
	//변수선언 형식 : 접근지정자 [그 외 지정자] 데이터타입 변수명
	public static String company;
	
	//final이 붙은 변수명들은 구분하기 위해서 대문자로 쓴다.
	// 대문자라 스네이크 기법 으로 사용한다.
	public final int MAX_PRICE;
//	{
//		this.price = 30;
//	}
	
	public Car() {
		this.MAX_PRICE = 100;
	}
	
	public static void info() {
		System.out.println(Car.company);
		
		// 밑에 코드 안되는 이유
		// 메모리 영역 M(method) | S(satck) | H(heap)
		// this가 사용하려면 객체가 있어야하는데 객체가 만들어 질수도 있고,
		// 안만들어 질수도 있기에 에러를 발생시킴	
//		System.out.println(this.price);
		System.out.println("static method");
	}
	
	public void info2() {
		// 이미 실행되기전에 만들어져 있기에 사용가능 - static은 method영역에 이미 만들어져 있다.
		Car.info();
		System.out.println(Car.company);
		final int num = 1;
		
	
	}
	
	
}
