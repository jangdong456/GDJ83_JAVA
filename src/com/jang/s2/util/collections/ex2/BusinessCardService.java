package com.jang.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BusinessCardService {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public BusinessCardService() {
		this.sb = new StringBuffer();
		
		this.sb.append("회사명1, 이름1, 주소1, 1111111,");
		this.sb.append("회사명2, 이름2, 주소2, 2222222,");
		this.sb.append("회사명3, 이름3, 주소3, 3333333");
	}
	
	public ArrayList<BusinessCardDTO> init() {
		String info = sb.toString();
		
		StringTokenizer stizer = new StringTokenizer(info, ",");
		ArrayList<BusinessCardDTO> ar = new ArrayList<BusinessCardDTO>();
		
		while(stizer.hasMoreTokens()) {
			BusinessCardDTO bcDto = new BusinessCardDTO();
			
			bcDto.setCompanyName(stizer.nextToken().trim());
			bcDto.setName(stizer.nextToken().trim());
			bcDto.setAddress(stizer.nextToken().trim());
			bcDto.setPhoneNum((Integer.parseInt(stizer.nextToken().trim())));
			
			ar.add(bcDto);
		}
		return ar;
	}
	
	public void addinfo(ArrayList<BusinessCardDTO> ar) {
		BusinessCardDTO bcDto = new BusinessCardDTO();
		System.out.println("명함정보 추가");
		System.out.println("1.회사명 입력");
		bcDto.setCompanyName(sc.next());
		System.out.println("2.이름 입력");
		bcDto.setName(sc.next());
		System.out.println("3.주소 입력");
		bcDto.setAddress(sc.next());
		System.out.println("4.휴대폰 번호 입력");
		bcDto.setPhoneNum(sc.nextInt());
		
		ar.add(bcDto);
	}
	
	public int removeinfo(ArrayList<BusinessCardDTO> ar) {
		System.out.println("명함정보 삭제");
		System.out.println("회사의 이름을 입력하세요.");
		String name = sc.next();
		
		int result = 0;
		
		for(int i=0; i < ar.size(); i++) {
			if(name.equals(ar.get(i).getCompanyName())){
				ar.remove(i);
				result = 1;
				break;
			}	
		}
		return result;
	}
	
	public BusinessCardDTO serchinfo(ArrayList<BusinessCardDTO> ar, Scanner sc) {
		System.out.println("명함정보 검색");
		System.out.println("회사명을 입력하세요");
		
		String infosc = sc.next();
		
		BusinessCardDTO serchName = null;
		
		for(int i=0; i<ar.size(); i++) {
			if(infosc.equals(ar.get(i).getCompanyName())) {
				serchName = ar.get(i);
				break;
			}
		}return serchName;
	}
	
}
