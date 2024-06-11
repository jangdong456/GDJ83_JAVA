package com.jang.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {
	
	public static void main(String[] args) {
		HashSet<Integer> ar = new HashSet<Integer>();
		
		ar.add(10);
		ar.add(8);
		ar.add(16);
		
		//인터페이스 는 하나의 타입으로 표현가능
		Iterator<Integer> ir = ar.iterator();
		
		// 하나씩 꺼내야 할 때 사용
		while(ir.hasNext()) {
			Integer num = ir.next();
			System.out.println(num+"@@");
		}
		System.out.println(ar);
		
	}
}
