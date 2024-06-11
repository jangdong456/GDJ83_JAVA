package com.jang.lang;

import java.util.Scanner;

public class S2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean flag = obj1.equals(obj2);
		System.out.println(flag); 
		
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);
		
		flag = t1.equals(t2);
		System.out.println(flag);
		// equlas() 
		// 두 문자열을 비교한다. 주소가 달라고 문자값만 비교함
		
		String name = "winter";
		System.out.println("이름입력");
		String name2 = sc.next();
		String name3 = "winter";
		
		System.out.println(name == name3); // true | 생성된 heap영역에서 똑같은 이미 만들어진 문자열부터 먼저 찾고, 그 값이 동일안 주소를 반환
		System.out.println(name == name2); // false | 주소가 틀림 | sc.next()를하면 새로운 주소를 만들기 때문에 false값이 뜬다.
		System.out.println(name.equals(name2));
		
		name3 = name3 + name; // 이값은 whinterwinter 값이 나오는데 
		//  주소가 따로 만들어진다. 이미 기존에 있는 name3의 주소의 값은 winter에서 name의 값을 더하는게 아니고
		// 새로운 주소를 파서 그 주소에 winterwinter 값을 넣고 반환한다.
		//즉, string의 특징의 불변의 법칙에 의해 string의 값은 주소를 만든다.
		// 자바에서는 equals() | 자바스크립트에서는 == 

	}
}
