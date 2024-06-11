package com.jang.s2.util.collections;

import java.util.ArrayList;

public class ListTest {

	public void info(ArrayList<String> ar) {
		
		//타입이 안맞아서 문제가 발생하다. obj 타입 으로는 활용할수있는게 적기때문이다.
		// 그래서 Generic 이 나옴
		// Generic : 타입을 제한 시킨다.
		// E       : 변수 

		for(int i=0; i< ar.size(); i++) {
			String obj = ar.get(i);

		}
	}
	
}
