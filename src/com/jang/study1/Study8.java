package com.jang.study1;

import java.util.Scanner;

public class Study8 {
	
	
	public static void main (String [] args) {
		//이중 for
		
		//FPS
		//총알 30발, 탄창 3개
		
		//1. 단발, 2. 점사
		//탕 30번, 타타탕 10번
		
		Scanner sc = new Scanner(System.in);
		

		for (int j=0;j<3;j++) {
			System.out.println("");
			System.out.println("1번 단발, 2번 점사");
			
			int bullet = sc.nextInt();
			int count = 10;
			String sound = "타타탕";
			
			if(bullet==1) {
					count=30;
					sound="탕";
			}
			for (int i=0;i<count;i++) {
				System.out.println(sound);
			}
		}//i for 끝
		}
	}



