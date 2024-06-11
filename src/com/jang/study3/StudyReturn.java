package com.jang.study3;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선언])
	// void 되돌려줄 값이 없다
	// return 타입 제한없음
	public int t1() {
		int num = 3;
		int num2 = 6;
		int result = num * num2;

		// 리턴의 데이터 개수 딱 하나만 가능
		return result; // 리턴 후 메서드 종료
	}

	public void t2() {
		Random random = new Random();
		// 0이상 10미만의 점수 하나를 램덤하게 리턴
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return; // 가능하지만 데이터X
		} else
			System.out.println(num);
	}
}
