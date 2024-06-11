package com.jang.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	private StringBuffer sb;
	private Scanner sc;
	
	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
		sc = new Scanner(System.in);
	}
	
	// ArrayList<ProductDTO> :  Generic 타입까지 해야 된다.
	public ArrayList<ProductDTO> init() {
		// return값은 배열이 아니라 arrayList로 반환
		// tokenlizer로 자르고 , 공백 trim으로 없애고 저장
		
		String meaasge = sb.toString();

		
		StringTokenizer st = new StringTokenizer(meaasge, ",");
		
		ArrayList<ProductDTO> proDto = new ArrayList<ProductDTO>();
		
		while(st.hasMoreTokens()) { 
			ProductDTO proval = new ProductDTO();
			// 지금 현재 타입이 Integer 
			// nextToken 타입 사용하려면 String 
			// st는 String 타입 | proDto 는 ProductDTO타입
			
			String price = st.nextToken().trim();
			String name = st.nextToken().trim();
			String strok = st.nextToken().trim();
			
			proval.setPrice(Integer.parseInt(price));
			proval.setName(name);
			proval.setStock(Integer.parseInt(strok));
			
			//1 줄로
//			ProductDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
			
			proDto.add(proval);
		}
		return proDto;
	}
	
	// 기존의 가방에다가 새상품을 추가
	// 기존가방에다가 받아옴
	// 메소드 선언부는 선언불가
	public void addProduct(ArrayList<ProductDTO> ar) {
		ProductDTO proDto = new ProductDTO();
		
		System.out.println("1번 상품의 가격을 추가");
		proDto.setPrice(sc.nextInt());
		
		System.out.println("2번 상품의 이름을 추가");
		proDto.setName(sc.next());
		
		System.out.println("3. 상품의 재고를 작성하시오.");
		proDto.setStock(sc.nextInt());
		ar.add(proDto);		
	}
	
	// 기존의 가방에다가 일치하는 물건의 이름을 입력받아서 삭제
	public int removeProduct(ArrayList<ProductDTO> ar) {
	
		System.out.println("상품의 이름을 입력하세요.");
		String name = sc.next();
		
		int result = 0;
		
		for(int i=0; i < ar.size(); i++) {
			if(name.equals(ar.get(i).getName())){
				ar.remove(i);
				result = 1;
				break;
			}	
		}
		return result;
	}
	
	
}
