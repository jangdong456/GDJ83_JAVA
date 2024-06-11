package com.jang.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {
	
	public static void main(String[] args) {
		
		
		
		HashMap<String, Integer> map = new HashMap();
		
		// put() 집어넣는 메서드 - put(키,벨류)
		
		System.out.println(map.isEmpty());
		map.put("k1", 1);
		map.put("k2", 2);
		
		System.out.println(map.size());
		
		//get(키값); 
		System.out.println(map.get("k1"));
		//containsKey("키값"); 키값이 있냐 없냐 
		System.out.println(map.containsKey("k1"));
		// containsValue(값); 값이 있냐 없냐
		System.out.println(map.containsValue(2));
		System.out.println(map);
		
		// 키값으로만 삭제가능
		//map.remove("k2");
		// 키값 벨류값이 일치해야 삭제가능
		//map.remove("k2,2);
		
		// 전체삭제
		// map.clear();
		
		//중복을 허용하면 안되니까 set타입으로 바꾼다 | set은 근데 get을 할수가 없이게 iterator()메서드를 이용해야 한다.
		// keySet() -> Set string으로 리턴
		// iterator() -> 이 메서드를 해야 값을 get 할수있다.
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k +" : "+ v);

		}
	}
	
}
