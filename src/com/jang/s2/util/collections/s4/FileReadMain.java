package com.jang.s2.util.collections.s4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//파일내용을 볼수있는 메서드 : FileReader
public class FileReadMain {

	public static void main(String[] args) {
		File file = new File("C:\\study", "study.java");
		
		FileReader fr = null;
		
		//문자를 모아서 문자열로 만들어주는 클래스
		BufferedReader br = null;
		
		// Main에서는 try catch로  | 다른 클래스에서는 throws 로 
		//FileReader
		try {
			fr = new FileReader(file);
			//반환이 int여서 형변환을 char로 시켜야함
			br = new BufferedReader(fr);
			
			// 한줄만 읽는거라 while문을 사용해서 마지막 값이 null이면 끝까지 왔다는 뜻
			while(true) {
				//한줄 읽는 메서드 -> readLine()
				String s = br.readLine();
				System.out.println(s);
				if( s == null ) {
					break;
				}
			}
		//Exception 한번만 이용하려고 부모 입셉션을 이용한다.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		// finally 예외가 발생하든 발생하지 않던 무조건 하라는 의미 이다. -> 보통 자원 해제를 많이함 : 보통 연결된 역순으로 함 | try catch문과 같이사용함
		} finally {
			try {
				// close() -> 자원연결한걸 해제하려고 
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}
	
}
