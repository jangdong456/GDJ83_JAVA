package com.jang.s2.util.lo.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {
	//파일들을 읽어오는 메소드
	public List<MenuDTO> read()throws Exception {
		//info.txt 파일 읽어오기
		// 조건1. 읽어서 파싱후 출력 라면, 3500, 500 출력 각각
		
		// 조건2. DTO들을 만든 후에 리턴
		File file = new File("C:\\study", "info.txt");

		FileReader fr = new FileReader(file);
		BufferedReader	br = new BufferedReader(fr);
		ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();
		
		boolean falg = true;
		
		
		while(falg) {
			//한줄 씩 호출
			String data = br.readLine();
			// 파일의 끝자락은 읽을게 없어서 null 값이 들어옴
			if(data == null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(data,",");
			
			while(st.hasMoreTokens()) {
				MenuDTO menuDto = new MenuDTO();
				menuDto.setMenuName(st.nextToken().trim());
				menuDto.setPrice(Integer.parseInt(st.nextToken().trim()));
				menuDto.setKcal(Integer.parseInt(st.nextToken().trim()));
				
				ar.add(menuDto);
			}
		}
		br.close();
		fr.close();
		return ar;
	}
}
