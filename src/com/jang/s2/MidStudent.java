package com.jang.s2;



public class MidStudent extends Student {
	//중학생
	private int history;
	
	public MidStudent() {
		// super 이용하려면 맨위로 써야한다.
		// super는 부모의 객체를 찾아 갈 때 쓴다.
		// 근데 잘 안씀
		super();
	}
	
	public void midInfo() {
		super.info();
		System.out.println(this.history);
	}
	
	
	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
}
