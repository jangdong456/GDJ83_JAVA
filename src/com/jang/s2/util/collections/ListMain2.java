package com.jang.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		
		// Generic : 타입을 제한을 둔다. 
		// e       : 변수 
		// < >     : 꺽새 안에 타입을 쓴다. 
		// 쓰는 이유
		//  - 타입의 안정성이 생긴다.
		ArrayList<String> ar = new ArrayList<String>();
		
		// 뒤에 꺽새 생략가능
		ArrayList<Integer> ar2 = new ArrayList();
		ar2.add(10);
		
		
//		ArrayList ar = new ArrayList();
		
		ar.add("first");
//		ar.add(2);
//		ar.add('c');
//		ar.add(true);
		
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// 다형성 때문에 형변환을 해줘야함
		// Object형식이라 그럼
		String name = (String)ar.get(0);
		
	}
}
