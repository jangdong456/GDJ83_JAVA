package com.jang.study3;

public class ObjectStudy1 {

	public static void main(String[] args) {
		StudyReturn sr = new StudyReturn();

		int result = sr.t1();
		sr.t2();

		System.out.println(result);

//		// 학생 객체 생성
//		// new 클래스명() - 객체 주소 반환
//		Student s = new Student(); // s의 데이터타입 Student
//		s.num = 2;
//		s.name = "iu";
//
//		System.out.println(s); // Student의 힙영역 주소
//		System.out.println(s.name);
//		System.out.println(s.kor);
//
//		Student s2 = new Student();
//		System.out.println(s2.name); // null
//
//		Student s3 = null;
//		s3 = s;
//		System.out.println(s3.name); // 실행시 오류
//		s3.name = "kwan";
//		System.out.println(s.name); // 얕은 복사
//
//		Student s4 = new Student();
//		s4.num = s.num;
//		s4.name = s.name;
//		System.out.println(s4.name);
//		s4.name = "han";
//		System.out.println(s.name); // 깊은 복사
//
//		// 멤버메서드 호출
//		// 참조변수명,메서드명();
//		// 멤버변수 사용
//		// 참조변수명 .멤버변수명
//		s.info();
//		s.info();

	}

}
