package com.jang.s2.util.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain2 {
	
	public static void main(String[] args) {
		// instanceof 어떤 타입이냐 ?
		// 만약에 integer 하고 string 둘다 값을 넣고 싶다면
		// <Object> 해서
		// if문써서 interger 맞냐 ? string 맞냐 해서 구분
		
		String n = "123";
		
		Object obj = n;
		
		System.out.println(obj instanceof Integer);
		System.out.println(obj instanceof String);
		
		
		//로또 번호
		// 1-45 : 6개
		Random random = new Random();
		int num = random.nextInt(45)+1; // |0부터 출력됨 | 0이 나오면 안되기에 뒤에 +1를 붙임 
		
		
		
		//home 숙제 반복문(While) 활용해서 중복제거 해보기 | ArrayList 활용해서 중복제거해보기 
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		
//		while(list.size() !=6) {
//			
//		}
//		
//		int [] ar = new int[6];
//		
//		for(int i=0; i<ar.length; i++) {
//			ar[i] = random.nextInt(45)+1;
//			
//		}
//		for(int i=0; i<ar.length; i++) {
//			System.out.println(ar[i]);
//		}
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(hs.size() != 6) {
			
			hs.add(random.nextInt(45)+1);
		}
		System.out.println(hs);
		
		
		
		
	}
}
