package com.jang.s5.date;

public class Single {
	
	
	//SingleTone(싱글톤) | 어플리케이션 내에서 딱 1개만 객체라는걸 ..
	private static Single single;
	
	int num = 10;
	
	private Single() {
		
	}
	
	//객체를 1나만 만들고 싶을때 이런 형식으로 씀 
	public static Single get() {
		if(single == null) {
			single.single = new Single();
		}
		return single.single;
		
	}
}
