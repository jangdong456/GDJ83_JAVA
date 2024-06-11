package com.jang.study2;

import java.util.Scanner;

public class S2_1 {
	public static void main(String[] args) {

		// 각 인덱스 번호에 값을 키보드로 입력

		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + 1 + "번째 값 입력");
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("배열의 크기를 입력");
		int j = sc.nextInt();

		int[] ar2 = new int[j]; // 같은 타입의 변수도 넣을수있음

		System.out.println(ar2.length);
	}
}
