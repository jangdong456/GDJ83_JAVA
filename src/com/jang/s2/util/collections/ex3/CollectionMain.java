package com.jang.s2.util.collections.ex3;

import java.util.List;

public class CollectionMain {
	public static void main(String[] args) {
		
		Collection1 c1 =new Collection1();
		Collection2 c2 =new Collection2();
		
//		ArrayList<Integer> ar = c1.makeList();
		List<Integer> ar = c1.makeList();
		c2.useList(ar);
		//위에 두줄을 한줄로 사용하려면
		c2.useList(c1.makeList());
		
		// 한줄 -> 보내고 끝내면 1줄
		// 두줄 -> 보내고 또 사용하려면 2줄
	}
	
}
