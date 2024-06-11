package com.jang.s2.util.collections.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection1 {

	public List<Integer> makeList() {
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		LinkedList<Integer> ar = new LinkedList<Integer>();
		List<Integer> ar = new ArrayList<Integer>();
		
		//위에처럼 타입 무엇을 만드든 return 값을 부모타입으로 반환하면 된다. -> List 타입
		
		ar.add(1);
		ar.add(2);
		
		return ar;
	}
	
	public Map<String, Integer> makeMap() {
		HashMap ar = new HashMap();
		return ar;
	}
	
}
