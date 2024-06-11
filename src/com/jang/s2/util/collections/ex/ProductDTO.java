package com.jang.s2.util.collections.ex;

//데이터 모을 곳 = DTO
public class ProductDTO {
	
	private Integer price; // 레퍼런스 타입이라 null을 집어 넣을수 있음 | 제품의 가격
	private String name; // 제품의 이름
	private Integer Stock; // 수량
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStock() {
		return Stock;
	}
	public void setStock(Integer strok) {
		this.Stock = strok;
	}

	
}
