package com.jang.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessCardController {
 // 1번일떄 머할거냐 2번 일때 머할거냐
	private ArrayList<BusinessCardDTO> bcDto;
	private BusinessCardService bcService;
	private BusinessCardView bcView;
	private Scanner sc;
	
	public BusinessCardController() {
		this.sc = new Scanner(System.in);
		this.bcService = new BusinessCardService();
		this.bcDto = this.bcService.init();
		this.bcView = new BusinessCardView();
	}
	
	public void start() {
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 명함정보 전체출력");
			System.out.println("2. 명함정보 회사명");
			System.out.println("3. 명함정보를 추가");
			System.out.println("4. 명함정보를 삭제");			
			System.out.println("5. 종료");
			int select = sc.nextInt();
			
			if(select == 1) {
				this.bcView.view(bcDto);
			}
			if(select == 2) {
				this.bcService.serchinfo(bcDto, sc);
//				this.bcView.serchView(bcDto);
				
			}
			if(select == 3) {
				this.bcService.addinfo(bcDto);
			}
			if(select == 4) {
				this.bcService.removeinfo(bcDto);
			}
			if(select == 5) {
				System.out.println("종료");	
				return;
			}
		}
	}
}
