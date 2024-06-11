package com.jang.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;

public class Collection2 {
	
	public void useList(List<Integer> ar) {
		
		//기존 for문  -> (초기식;조건식;증감식){}
		//향상된 for문 -> for(꺼낼데이터타입 변수명 : collection의 참조변수명) {}
		// 몇번째 인덱스가 안보이기에  받는 타입의 값 끝까지 갈때가지 사용한다.
		// 그냥 꺼내오기만 하면 된다면 심플하게 for문을 사용한다.
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		for(Integer n : ar) {
			System.out.println(n);
		}
	}
	
	public void useMap(Map<String, Integer> map) {
		map.get(map);
	}
}
