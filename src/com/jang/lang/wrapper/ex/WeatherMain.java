package com.jang.lang.wrapper.ex;

public class WeatherMain {
	
	public static void main(String[] args) {
		//DTO (Data Transfer Object) | 데이터를 담고 있는 객체
		//VO  (Value Object)
		WeatherController wc = new WeatherController();
		
		WeatherService ws = new WeatherService();
		
		
		wc.strat();
//		ws.removeWeather();
		
	}
}
