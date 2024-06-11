package com.jang.study3.ex1;

public class GameController { // 메뉴

	public void start() {
		// 몬스터 생성 1마리, 3마리
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.CreateMonster();

		System.out.println(m.name);
		System.out.println(m.lv);

		Monster[] monsters = mf.CreateMonsterGroup();

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("===============================");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].lv);
		}
	}
}
