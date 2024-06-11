package com.jang.lang.wrapper.ex;

public class WeatherDTO {
	//DTO의 모든 멤버변수는 private 설정
	//Getters/Setters 필요 -> 외부에서 접근 할수 있도록 하기 위해서
	//생성자는 여러개 만들어도 상관없지만 기본생성자는 필수
	
	//도시명
	private String city;
	
	//기온
	private double gion;
	
	//날씨정보
	private String staus; 
	
	//습도
	private int humidity;



	public String getCity() {
		
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println(city);
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}


	
	
}
