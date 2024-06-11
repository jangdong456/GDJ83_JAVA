package com.jang.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {

		// 로그인 검증
		// id=1234, pw=5678
		// 로그인 시도 전에 1.로그인, 2.종료
		// 사용자의 id와 pw를 입력 받아서 로그인 시도를 N번 시도
		// 틀릴면 로그인 실패 출력, 로그인 성공 > 성공 출력하고 반복문 종료

		// 반복문 종료 후 종료선택 햇다면 프로그램 종료
		// 로그인 성공 후 반복문 종료 > 게임 시작

		// MMORPG:
		// 시작 레벨 1 시작 15 만렙
		// 골드: 0 시작
		// 1 > 2 3마리 2 > 3 6마리
		// 3 > 4 9마리 4 > 5 12마리
		// 14> 15 42마리
		// 보상금 5레벨 1000골드, 10레벨 2000골드, 만렙 3000골드

		// 현재 레벨, 골드 출력 후 종료

		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean flag = true;

		while (flag) {
			System.out.println("1. 로그인, 2. 종료");
			int giveup = sc.nextInt();

			if (giveup == 1) {
				System.out.println("ID를 입력하세요");
				int iden = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int pass = sc.nextInt();

				if (iden != id || pass != pw) {
					System.out.println("로그인 실패");
				} else {
					flag = false;
					System.out.println("로그인 성공");
					break;
				}

			} else {
				System.out.println("프로그램 종료");
				break;
			} // giveup true
		} // while문 종료

		if (flag == false) {
			System.out.println("");
			System.out.println("게임시작");
			System.out.println("");

			int lv = 1;
			int gold = 0;

			while (lv < 15) {
				System.out.println("레벨: " + lv + " Lv");
				System.out.println("골드: " + gold + " Gold");
				System.out.println("1.사냥터 2.게임종료");
				int dun = sc.nextInt();

				if (dun == 1) {
					int count = lv * 3;
					for (int k = 0; k < count; k++) {
						System.out.println("");
						System.out.print("사냥!");
					} // 사냥 for문
					System.out.println("");
					System.out.println("레벨 업!");
					lv++;
				}
				for (int i = 1; i < 4; i++) {
					if (lv == i * 5) {
						gold += 1000;
					}
				} // lv for문 종료
			}
			System.out.println("최종");
			System.out.println("레벨: " + lv + " Lv");
			System.out.println("골드: " + gold + " Gold");
			System.out.println("게임 종료");
		}

	}
}
