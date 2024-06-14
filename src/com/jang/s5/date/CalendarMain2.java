package com.jang.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		Calendar birth = Calendar.getInstance();
		
		birth.set(1994, 11, 07);
		// getTime() 전체 시간 출력문
		System.out.println(birth.getTime());
		// 날짜를 바꿀때는 getTimeInMillis()을 사용해서  1000* 60*60*24 하루 계산해서 한다 | 이때 타입은 long 추천
		//getTimeInMillis() 1/1000초 
		long c = ca.getTimeInMillis();
		
		System.out.println(c);
		
		long b = birth.getTimeInMillis();
		//1000* 60*60*24 하루
		b = b+(1000* 60*60*24*100L);
		birth.setTimeInMillis(b);
		System.out.println(birth.getTime());
		
		
		// 파라미터 받아오면 ca타입으로 바꾸기
		String s  = "1994-11-07";
		String[] s1 = s.split("-");
//		ca.get(Integer.parseInt(s1[0], Integer.parseInt(s1[1]) -1, Integer.parseInt(s1[2])));
		
		//문자열을 칼랜더 타입(데이터타입)으로 바꾸기
		ca = Calendar.getInstance();
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년MM월dd일 HH:mm");
		//format()을 이용해서 ca를 data타입으로 바꾸고
		String n = sd.format(ca.getTime());
		System.out.println(n);
		
		String id = UUID.randomUUID().toString();
		System.out.println(id);
	}
}
