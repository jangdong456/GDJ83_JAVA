package com.jang.s5.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Calendar 는 상속받음 -> 오버라이딩
public class CalendarMain {

	public static void main(String[] args) {
		// GregorianCalendar() 
		Calendar ca = new GregorianCalendar();
		
		// getInstance() -> Calendar객체를 리턴
		//현재 시간과 날짜 정보가 만들어짐 | 객체를 만든 시점에
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		// get -> 클래스명.변수명
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH)+1);
		System.out.println(ca.get(Calendar.DATE));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		
		Date date = ca.getTime();		
		System.out.println(date);
		Single single = Single.get();
		
		Calendar future = Calendar.getInstance();
		
		// MONTH 는 값을 넣을때는 -1 뺀 월 을 쓴다. 가져올땐 +1 한다.
		future.set(Calendar.DATE, future.get(Calendar.DATE)+17);
		
	
		System.out.println(future.getTime());
	
	}
	
}
