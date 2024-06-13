package com.jang.s2.util.lo.ex1;

public class IoMain {
	
	public static void main(String[] args) {
		ReadStudy rs = new ReadStudy();
		try {
			rs.read();
			System.out.println(rs.read().get(0).getMenuName());
			System.out.println(rs.read().get(0).getPrice());
			System.out.println(rs.read().get(0).getKcal());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

