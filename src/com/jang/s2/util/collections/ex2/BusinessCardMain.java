package com.jang.s2.util.collections.ex2;

public class BusinessCardMain {
	// 명함 관리 프로그램
	// DTO 에서 명함 정의 하기
	// 기본정보 출력 추가 삭제 수정
	public static void main(String[] args) {
		
		BusinessCardService bcs = new BusinessCardService();
		BusinessCardController bcc = new BusinessCardController();
		
		
		bcs.init();
		bcc.start();
		
	}
}
