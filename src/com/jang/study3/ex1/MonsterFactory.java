package com.jang.study3.ex1;

import java.util.Random;

public class MonsterFactory {

	public Monster CreateMonster() {
		Monster m = new Monster();

		return m;
	}

	public Monster[] CreateMonsterGroup() {
		Random random = new Random();
		int count = random.nextInt(5) + 2;
		Monster[] monsters = new Monster[count];

		for (int i = 0; i < count; i++) {

			Monster m = new Monster();

			monsters[i] = m;
		}

		return monsters;

	}

}
