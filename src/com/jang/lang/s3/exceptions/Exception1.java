package com.jang.lang.s3.exceptions;

public class Exception1 {
	
	
	// throws
	// 에러가 발생하면 이걸 return 하겠다 라는 의미
	public void ex1(int num) throws ArithmeticException, Exception {
		
		int n = 20;
		
		System.out.println(n/num);
		
	}
	
}
