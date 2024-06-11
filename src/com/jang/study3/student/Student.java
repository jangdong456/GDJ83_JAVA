package com.jang.study3.student;

public class Student {

	// 학생의 구성, 멤버변수(인스턴스 변수)
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 변수 선언 공식 데이터타입+변수명
	// 객체 생성 공식 new 클래스명 ()
	// 메서드 선언 공식
	// public static void main(String []args)
	// )까지 메서드 선언부,헤더
	// 접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수들 선언]){메서드 바디,내용}

	public void info() {
		int num = 10; // 스택영역의 지역변수
		System.out.println("info 실행");
	}

}
