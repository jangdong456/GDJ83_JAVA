package com.jang.s2;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age; 
		
	}
	
	
	// setter getter 라고 부름
	public void setAge(int age) {
		// 멤버변수 -> this 는 Member 클래스를 가르킨다.
		this.age = age; 
		System.out.println(this.age);
		
	}
	
	public int getAge() {
		return this.age;
	}
}
