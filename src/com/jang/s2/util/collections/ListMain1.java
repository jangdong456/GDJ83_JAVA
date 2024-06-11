package com.jang.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;


//인터페이스의 구조
//상속 과 메서드

//List Set은 Collection을 상속받음 -> Collection타입
//Collection :
//	List 
//	
//	Set
//	
//	Map

public class ListMain1 {

	public static void main(String[] args) {
		
		// 기능은 비슷하나 자료구조 때문에 따로 만듬
		//ArrayList : 단순하게 붙일때는 실행속도가 빠름 , 하지만 중간에 삽입,삭제시 느려진다. 
		// 장점 
		//  - 데이터의 접근이 빠름 (추가)
		//  - 꺼내오는 것이 빠름
		// 단점 
		// - 중간에 삽입,삭제시 느려진다. 
		// {1,2,3,4} 인덱스 1삭제시 ->1인덱스 자르고 {1} {3,4} 를 복사하고 , 다시 새로운 배열생성후 값을 넣음 {1,3,4}
		
		//LinkedList : 주소를 활용한다
		// 장점
		// - 중간에 삽입,삭제시 빠르다.
		// 주소값{1}주소값{2}주소값{3} 형식의 자료구조이다. 그래서, 중간에 있는 애들은 삭제 추가시 주소값만 변경시켜주면 되어서 빠르다.
		// 단점
		// - 데이터 접근이 느림
		// - 무엇가를 찾아갈때 앞에 있는 주소값을 보고 순차적으로 찾아가야 되기때문에 느림
		
		
		//무언가 모을려고 하는 메서드
		// 배열 타입 신경안써도됨 자동적으로 auto boxing으로인해 변경되서 저장됨
		// 배열 길이 안정해도됨
		ArrayList ar = new ArrayList();
		
		String name = "winter";
		
		int num = 2;
		ar.add(name);
		ar.add(num); // 자동으로 Integer로 바꼈다가 다시 object로 바껴서 들어감
		ar.add(3.12); // Double
		ar.add('a'); //
		ar.add(false); //
		ar.add(num); // 동일한 변수 출력 허용함
		
		// 1번 인덱스에 "test" 데이터 값을 넣는다.
		ar.add(1, "test");
		
		// set : 해당 인덱스의 데이터를 수정해라
		ar.set(0, 'c');
		
		ar.remove(0);
		ar.remove(2); // 값이 같은걸 찾아가서 지움
		
		ar.clear();
	
		// ArrayList 의 length는 size()메소드를 사용 | size() = length()
		for(int i=0; i < ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
		
		LinkedList lk = new LinkedList();
		lk.add("ad");
		
		
	}
}