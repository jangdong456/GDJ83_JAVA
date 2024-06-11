package com.jang.study3.student;

import java.util.Scanner;

public class StudentService {

	public Student[] makeStudent() {

		Scanner sc = new Scanner(System.in);
		// 같은 데이터 타입을 묶는것
		System.out.println("학생의 수를 입력하세요.");
		int count = sc.nextInt();

		// 학생들을 모을 배열을 리턴
		Student[] students = new Student[count];
		// students에 Student타입이 들어가야할 count만큼의 배열을 힙영역에 생성 후 주소 대입

		for (int i = 0; i < count; i++) {

//			students[i] = new Student();
			// 힙영역의 Student타입만 대입가능한 students배열안에 i순으로 Student라는 클래스가있는 인스턴스변수의 주소를 대입한다

			Student s = new Student();

			System.out.println(i + 1 + "번째 이름 입력");
			s.name = sc.next();
			System.out.println(students[i].name + "의 번호 입력");
			s.num = sc.nextInt();
			System.out.println(students[i].name + "의 국어점수 입력");
			s.kor = sc.nextInt();
			System.out.println(students[i].name + "의 영어점수 입력");
			s.eng = sc.nextInt();
			System.out.println(students[i].name + "의 수학점수 입력");
			s.math = sc.nextInt();

			s.total = s.kor + s.eng + s.math;

			s.avg = s.total / 3;

			students[i] = s;

		}

		return students;

	}

}
