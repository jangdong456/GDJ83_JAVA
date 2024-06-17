package com.jang.s6.network;

public class StudentService {
	
	private StudentDAO studentDAO;
	
	public StudentService() {
		studentDAO = new StudentDAO();
	}
	
	public String studentList() {
		String names = "1-동국-170-남성-2-철수-160-여성-3-둘리-150-남성-4-또희-140-여성";
		
		return names;
		
	}
	
	public String detail() {
		String list1 = "1-동국-170-남성";
		String list2 = "2-철수-160-여성";
		String list3 = "3-둘리-150-남성";
		String list4 = "4-또희-140-여성";
	}
}
