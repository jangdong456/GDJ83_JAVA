package com.jang.study3.ex1;

public class MakeMonster {

	public static void main(String[] args) {
		Monster monster1 = new Monster();

		monster1.hp = 30000;
		monster1.lv = 30;
		monster1.sp = "오크";
		monster1.exp = 1000;
		monster1.name = "오크 대장장이";

		Axe axe1 = new Axe();
		axe1.name = "나무도끼";
		axe1.damage = 500;
		axe1.range = 10;
		axe1.dura = 20;
		axe1.enchant = 2;

		monster1.axe = axe1;

		System.out.println(monster1.axe.name);

		axe1 = new Axe();
		axe1.name = "황금도끼";

		System.out.println(monster1.axe.name); // monster1 axe에 axe1의 값이 대입되어있음

		Monster monster2 = new Monster();
		monster2.axe = axe1;

	}
}
