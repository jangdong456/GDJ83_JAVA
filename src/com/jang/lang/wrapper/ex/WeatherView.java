package com.jang.lang.wrapper.ex;

public class WeatherView {

	//view
	
	public void view(WeatherDTO weatherDTO) {
		
		if(weatherDTO != null) {
			System.out.println(weatherDTO.getCity());
			System.out.println(weatherDTO.getGion());
			System.out.println(weatherDTO.getStaus());
			System.out.println(weatherDTO.getHumidity());
			
			System.out.println("================");
		}else {
			System.out.println("없음");
		}
	}
	
	//날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO [] dtos) {
		for(int i=0; i<dtos.length; i++) {
			System.out.println(dtos[i].getCity());
			System.out.println(dtos[i].getGion());
			System.out.println(dtos[i].getStaus());
			System.out.println(dtos[i].getHumidity());
			System.out.println("================");
		}
	}
}
