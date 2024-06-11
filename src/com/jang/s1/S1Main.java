package com.jang.s1;


import com.jang.s2.Korea;

public class S1Main {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.num = 10;
		
		
		Korea korea = new Korea();
		korea.setPop(20);
		
		int p = korea.getPop();
		System.out.println(p);
		

		
		
	}
}
