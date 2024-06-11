package com.jang.lang;

public class Test {
	int age = 10;
	double num = 3.1;
	
	@Override
	public boolean equals(Object obj) {
		Test t = (Test)obj;
		
		if(this.age == t.age && this.num == t.num) {
			return true;
		}else {
			return false;			
		}	
	}
}
