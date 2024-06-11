package com.jang.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	// 초기화
	private WeatherDTO [] dtos; // SerVice
	private WeatherService weatherService;
	private WeatherView weatherView;
	private Scanner sc; 
	//start 메서드
	//dtos의 초기화는 WeatherController의 생성자 내에서 초기화
	//1. 날씨전체정보출력
	//2. 종료
	
	//생성자 만드는법 | 접근지정자 클래스명(){}
	public WeatherController(){
		this.weatherService = new WeatherService(); //new 생성자: 값을 초기화(변경) -> 객체생성 -> 
		this.weatherView = new WeatherView();
		this.dtos = this.weatherService.init(); // 메서드 호출
		//배열시 몇개를 불러올지 모르니 new Weather[0]; 해봤자 의미없다.
		this.sc = new Scanner(System.in);
	}
	
	public void strat() {
		// 받아와서 생성자 초기화
		boolean flag = true;
		while(flag) {
			System.out.println("1. 날씨정보 전체출력");
			System.out.println("2. 날씨정보 도시명");
			System.out.println("3. 날씨정보를 추가");
			System.out.println("4. 날씨정보를 삭제");			
			System.out.println("5. 종료");
			int select = sc.nextInt();
			
			if(select ==1) {
				this.weatherView.view(dtos); // this.dtos면 지역변수가 같은애가 있으면 사용한다.
			
			}else if(select == 2) {
				WeatherDTO weatherDTO = weatherService.findeByCity(this.sc, this.dtos);
				weatherView.view(weatherDTO);
			
			}else if(select == 3) {
				 dtos = weatherService.addWeather(sc, dtos);
			
			}else if (select == 4) {
//				WeatherDTO weatherDTO = weatherService.removeWeather(this.dtos);
			}
			
			
			else {
				System.out.println("종료");
				break; // while 종료 되고 밑에 실행될 코드가 있을시 
//				return; // 메서드 자체 종료
			}
		}
	}
}
