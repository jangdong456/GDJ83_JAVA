package com.jang.lang.wrapper.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	//Controller Layer
	//Business Layer | 실제코드로 무엇을 만는다. ,데이터 전처리 후처리
	//DAO Layer
	
	private StringBuffer sb;

	
	public WeatherService() {
		this.sb = new StringBuffer();

		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.3 - 흐림 - 90");
		this.sb.append("-제주 , 1.3 - 눈 - 30");
		this.sb.append("-광주 , 9.3 - 태풍 - 10");
	}
	
	//init단어의 의미 : 무언가 초기화 하겠다 라는 의미
	
	public WeatherDTO[] init() {
		//sb에 있는것을 문자열 변수에 담아서 출력
		String info = sb.toString();
		
		info = info.replace(",","-");
		// info = info.replace(" ", "");
		
		WeatherDTO [] dtos = this.useTokenizer(info);   //this.getWeathers(info);
	
		return dtos;
	}
	
	private WeatherDTO [] useTokenizer(String info) {
		//매개변수로 받아온 문자열을 파싱하고 매개변수에 집어넣고, 
		// 배열에 담에서 리턴
		WeatherDTO [] dtos = new WeatherDTO[4];
		ArrayList<WeatherDTO> arrays = new ArrayList<WeatherDTO>();
		
//		System.out.println(info+"@@@@@@@@");

		StringTokenizer st = new StringTokenizer(info, "-");
//		System.out.println(st); // 객체
//		System.out.println(st.countTokens()); // 16
		int idx = 0;
		
		while(st.hasMoreTokens()){
//			System.out.println("while문");
			WeatherDTO weatherDTO = new WeatherDTO();
			
			String city = st.nextToken().trim(); 
			String gion = st.nextToken().trim(); 
			String staus = st.nextToken().trim(); 
			String humidity = st.nextToken().trim(); 
			
//			System.out.println("도시명 :"+city);
			weatherDTO.setCity(city);
			weatherDTO.setGion(Double.parseDouble(gion));
			weatherDTO.setStaus(staus);
			weatherDTO.setHumidity(Integer.parseInt(humidity));
			
			arrays.add(weatherDTO);
//			dtos[idx] = weatherDTO;
//			idx++;
		}

		return dtos;
	
	}
	
	private WeatherDTO [] getWeathers(String info) {
		
		String [] infos = info.split("-"); // 20 / 4
		
		WeatherDTO [] dtos = new WeatherDTO[infos.length/4];
	
		//강사님 풀이	
		int idx = 0;
		
		//방식1
		for(int i=0; i<infos.length; i= i+4) {
			WeatherDTO  weatherDTO = new WeatherDTO();
			
			weatherDTO.setCity(infos[i].trim());
			
			weatherDTO.setGion(Double.parseDouble(infos[i+1].trim()));
			
			weatherDTO.setStaus(infos[i+2].trim());		
			
			weatherDTO.setHumidity(Integer.parseInt(infos[i+3].trim()));
			
			dtos[idx] = weatherDTO;
			idx++;
		}
		return dtos;
		
		//방식2
//		for(int i=0; i<da.length; i++) {
//			WeatherDTO  weatherDTO = new WeatherDTO(); 
//			weatherDTO.setCity(putins[idx++].trim());
//			weatherDTO.setGion(Double.parseDouble(putins[idx++].trim()));
//			weatherDTO.setStaus((putins[idx++].trim()));		
//			weatherDTO.setHumidity(Integer.parseInt(putins[idx++].trim()));
//			da[i] = weatherDTO;
//		}
//		
//  	내가한 풀이		
//		String value = Arrays.toString(datas);
//		System.out.println(value);
		
//		for(int i=0; i<datas.length/4; i++) {
//				// 4개의 값이 들어가짐
////				datas[i] = ;
//			for(int j=0; j<value.length(); j++) {
//				//16개의 값이 들어가짐
//				
//				
//			}
//		}
		//trim()
//		WeatherDTO da = new WeatherDTO();
		
//		da.setCity(datas[0].trim());
//		da.setGion(Double.parseDouble(datas[1].trim()));
//		da.setStaus((datas[2].trim()));		
//		da.setHumidity(Integer.parseInt(datas[3].trim()));
	}
	
	//날씨정보를  도시명으로 검색해서 해당 날씨정보를 리턴
	
	//서울 검색하면 -> 서울의 정보를 찾아서 출력
	
	// return -> controller
	// controller -> view
	// 정보 : controller ->  service에 있음
	//, WeatherView view
	public WeatherDTO findeByCity(Scanner sc ,WeatherDTO [] city) {
		WeatherDTO weatherDTO = null;
		
		System.out.println("도시명 검색");
		String  cityName = sc.next();
		
		//서울 부산 제주 광주
		//city
		for(int i=0; i<city.length; i++) {
		  	if( cityName.equals(city[i].getCity())) {
		  		//맞다면 해당 시티에 대한 정보의 데이터를 준다.
		  		weatherDTO = city[i];
		  		break;
		  	} 
		}
		return weatherDTO; 
	}
		// controller에서 값을 받아온다. 
		// 받아온 값을 
		
	// ========== 3.날씨정보 추가 ==========
	// 메서드명 addWeather
	// 도시명 기온 상태 습도를 입력받아서 기존의 날씨정보들에 추가
	// 배열을 새로 만들어서 새로추가 => 뒤에 추가	
	
	public WeatherDTO [] addWeather(Scanner sc, WeatherDTO[] ar) { 
		WeatherDTO weatherDTO = new WeatherDTO();
		
		System.out.println("도시명을 입력해주세요");
		weatherDTO.setCity(sc.next());
		
		System.out.println("기온을 입력해주세요");
		weatherDTO.setGion(sc.nextDouble());
		
		System.out.println("날씨 상태를 입력해주세요");
		weatherDTO.setStaus(sc.next());
		
		System.out.println("습도를 입력해주세요");
		weatherDTO.setHumidity(sc.nextInt());
	
		WeatherDTO[] newAr = new WeatherDTO[ar.length+1];
		
		//기존의 배열 weather
		for(int i=0; i<ar.length; i++) {
			newAr[i] = ar[i];
			//마지막 배열에 매겨변수 받은 값을 할당
		}
		newAr[ar.length] = weatherDTO;
		
		return newAr;
	}
	
	// 이름을 검색해서 그 값이 많으면 삭제 
	// removeWeather
	// 기존 배열에서 하나를 삭제
	// 도시명을 입력받아서 일치하면 삭제
	// 반복문 continue - 현재 단계를 중단
	
	public void removeWeather(WeatherDTO [] ar) {	
		WeatherDTO weatherDTO = new WeatherDTO(); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도시명을 입력해주세요");
		String city = sc.next();
		System.out.println(ar);
		
		
		for(int i=0; i<ar.length; i++) {
			
			if(city.equals(ar[i])) {
				continue;
			}
		}
		
		
//		weatherDTO.getCity();
		
	
	}
}
