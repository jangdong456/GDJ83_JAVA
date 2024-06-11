package com.jang.s3;

public interface Fly extends Landing{
	
	// 접근지정자는 무조건 public만 가능
	
	//상수 final 
	
	public final int NUM =1;
//	public final static int NUM =1;
	// static 생략가능
	String NAME = "AA";
	
	
	//추상메서드로 이루어져 있다.
	// 접근지정자는 무조건 public
	// 추상이니까 그 외 지정자는 abstract
	
	// public
//	public abstract void t1();
//	public int t2();
//	abstract String t3(int num);
//	void t4();
	
	public abstract void flyAble();
	
}
