package com.jang.s4.io;

import java.io.File;

public class FileMain2 {
	
	//study2 폴더를 삭제 -> 그안에거 삭제
	public static void main(String[] args) {
		File file = new File("C:\\study2");
		
		File[] list = file.listFiles();
	
		for(File s :list) {
			System.out.println(s.delete());
		}
		file.delete();
		
	}
	
}
