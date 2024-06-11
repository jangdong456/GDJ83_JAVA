package com.jang.study2;

public class S2 {

	public static void main(String[] args) {

		// 메모리영역 구분
		// 메서드 영역 - 스태틱변수 = 클래스변수
		// 스택 영역 : 메서드 실행 될 때 영역 FILO - 지역변수
		// 힙 영역 - 인스턴스변수 (자동으로 초기화됨)

		// 배열선언
		// 모으려고 하는 데이터타입명 [] 변수명 = new 모으려고 하는 데이터타입명 [개수]

		int[] ar = new int[3];
		// ar - 실제 데이터의 주소를 가지고있어 참조변수라 부름
		// int[] - 스택 영역에 만든다
		// new - 힙영역에 만든다

		int[] ar2 = { 1, 2, 3 }; // 데이터가 있는 경우

		System.out.println(ar); // int[3] 배열 주소

		String[] names = new String[2];
		System.out.println(names); // String[2] 배열 주소

		System.out.println(ar[0]);
		System.out.println(names[0]);

		ar[0] = 50;
		ar = ar2; // 같은 int 배열 타입
		System.out.println(ar[0]);

	}

}
