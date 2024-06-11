package com.jang.s2.util.collections.ex2;

import java.util.ArrayList;

public class BusinessCardView {
	
	public void view(ArrayList<BusinessCardDTO> bcDto) {
		for(int i=0; i < bcDto.size(); i++ ) {
			System.out.println(bcDto.get(i).getCompanyName());
			System.out.println(bcDto.get(i).getName());
			System.out.println(bcDto.get(i).getAddress());
			System.out.println(bcDto.get(i).getPhoneNum());
			System.out.println("================");
		}
	}
	
	public void serchView(ArrayList<BusinessCardDTO> bcDto) {
		
		if ( bcDto != null ) {
			System.out.println(bcDto.get(0).getCompanyName());
			System.out.println(bcDto.get(0).getName());
			System.out.println("================");
		}
	}
	
	
	
}
