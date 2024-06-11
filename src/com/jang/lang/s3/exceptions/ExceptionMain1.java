package com.jang.lang.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//예외처리 하는 이유 - 지속적으로 사용할수있게
		try {
			int num = 10;
			
			System.out.println("숫자입력");
			int num2 = sc.nextInt();
			
			System.out.println(num / num2);
			//throw new ArithmeticException();
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		} catch(InputMismatchException e) {
			System.out.println("숫자 이외에는 입력할수 없습니다");
		
			//부모인 Exception으로 하나의 캐치로 할수있다.
		} catch(Exception e) {
			// Exception에서 안잡히면 Throwable에서 잡는다.
		} catch(Throwable e) {
			
		}

		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); => 무엇때문에 에러가 났는지 알아야되기 때문에 사용한다.
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
