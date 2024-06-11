package com.jang.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		
		ProductService ps = new ProductService();
		
		ArrayList<ProductDTO> ar = ps.init();
//		ps.addProduct(ar);
		int result = ps.removeProduct(ar);
		
		if(result > 0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		for (int i=0; i< ar.size(); i++) {
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());
		}
		
	}
}
