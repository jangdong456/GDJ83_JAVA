package com.jang.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilejangMain {
	
	public static void main(String[] args) {
		// 이번엔 반대로
		// 문자열 -> 문자 -> 01
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String fileName = sc.next();
		
		//e, E가 입력되면 종료
		
		File file = new File("C:\\study", fileName);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);
			
			
			boolean flag = true;
			
			while(flag) {
				System.out.println("입력하세요");
				String s = sc.next();
				
				if(s.toLowerCase().equals("e")) {
					break;
				}
				
				fw.write(s + "\r\n");
			
			}
	
			} catch (IOException e){
				e.printStackTrace();
			} finally {
				try {
					fw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("종료");
			
	}
}

// fw = new FileWriter(file, false); | 불리언 타입을 false넣으면 기존값 삭제 새로운 값을 넣음
// fw = new FileWriter(file, true); | true 하면 뒤에 이어 붙여짐
// buffer의 용량이 정해져있음 
// 버퍼에 abc집어넣었는데 빈공간이 3칸이있으면 다음게 3칸초과 값이면 안들어가져서 에러뜸
// 그래서 flush(); 를 해서 buffer 강제로 비워줌
// fw.write(s + "\r\n"); ->   \r\n -> 써줘야함 \r 의미 찾아보기 
