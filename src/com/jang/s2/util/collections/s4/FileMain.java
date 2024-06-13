package com.jang.s2.util.collections.s4;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		
		//파일에다가 입출력하기전에 먼저 정보를 알아야함
		// 파일정보 담고있는 객체가 필요함
		// 그게 File class
		
		// "C:\\study" 에서 \\ 은 무엇을 뜻하나 ? => 특수용도?? 알아봐야함 
		
		// "C:\\study" 정보를가져와서 file 객체를 담음
		File file = new File("C:\\study");
		
		// exists() 메소드 : 실제로 있냐 없냐 | true false
		System.out.println(file.exists());
		
		//is로 시작하는 메서드는 boolean 타입이다.
		// isDirectory() : 폴더가 맞냐 아니냐 라는 메서드
		System.out.println(file.isDirectory());
		
		// isFile() : 파일인지 아닌지 파악하는 메서드
		System.out.println(file.isFile());
		
		// getName() : 파일의 이름 출력
		System.out.println(file.getName());
		
		// file.length() : 파일의 용량 출력
		System.out.println(file.length());
		System.out.println("============================");
		
		// 생성자 값 : string string -> 하위??
//		file = new File("C:\\study", "test.txt");
		
		// 앞의경로는 폴더 : C:\\study | 
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		
		if(!file.exists()) {			
			//  file.mkdir() : 있으면 안만들어지고 없으면 만들어진다
			file.mkdir();
		}
		
		// 폴더가 안만들어짐 왜 ? -> 먼저 자식폴더 부터 만드는데 -> 마지막 경로인 student 를 만드려고 하는데 부모인 sub2가 없기에 못만들어짐
		file = new File("C:\\study\\sub2\\student");
//		file.mkdir();	
		
		// mkdirs() -> 이 메서드는 만들어짐  sub2\\student 폴더 두개가 만들어짐
		file.mkdirs();
		
		file = new File("C:\\study\\test.text.txt");
		// delete() 삭제
		file.delete();
		
		// 안사라짐 왜 ? - > 폴더를 삭제하려면 안에 파일및 다른것들이 없어져야함
		file = new File("C:\\study\\sub2");
		file.delete();
		
		// list() -> 해당 폴더의 목록을 보여줌 : 파일명, 폴더명 등등 
		file = new File("C:\\study");
		String[] list = file.list();
		
		
		System.out.println(file.listFiles());
		File[] test = file.listFiles();
		
		for(File s : test) {
			if(s.isDirectory()) {
				System.out.println("파일입니다.");
			}else if(s.isFile()) {
				System.out.println("폴더입니다.");
			}	
		}	
	
	}	
}
