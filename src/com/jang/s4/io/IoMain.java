package com.jang.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {
	
	public static void main (String[] args) {
		// Scanner 역할
		
		// 01010 -> bit를 받고 | 문자 로 바꾸고 | 문자열로 바꿈

		// bit를 받는다.
		InputStream is = System.in;
		
		//char | 문자 들을 처리하는 애들임
		InputStreamReader ir = new InputStreamReader(is);
		
		// String 만드는애
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력하세요");
		String s = "";
		try {
			// 한줄 읽어오라는 메서드
			s = br.readLine();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		// 위에 3가지를 실행된다면 입력받을 준비가 끝났다.라는 의미
		System.out.println(s);
		
	}
}
