package com.jang.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		// 내보내는 메서드 -> getOutputStream() -> 01과 을 내보내는 메서드
		OutputStream os = null;
		
		// 문자를 출력하는 메서드
		OutputStreamWriter ow = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		// 서버에서 보내온 데이터를 화면으로 만듬 
		// console에 찍어서 1번 ~~ 2번 ~~
		// 1번 학생정보리스트 2번 학생상세정보(디테일) 3번 종료
		try {


//			socket = new Socket("192.168.7.126", 8282);
			socket = new Socket("localhost", 8282);
			System.out.println("서버와연결성공");
			
			System.out.println("서버로 보낼 메세지 입력");
			
			boolean flag = true;
			
			os = socket.getOutputStream();
			
			//키보드에 쓴걸 내보냄 -> 어디에 담아서 ?
			// \r -> 다시 되돌아감
			ow = new OutputStreamWriter(os);
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			while(flag) {
				String str = sc.next();
				// 해당 소켓에다가  01를 보냄

				ow.write(str + "\r\n");
				
				//flush()  남아있는 데이터 모두 출력
				ow.flush();
				if(str.toLowerCase().equals("exit")) {
					break;
				}
				
				str = br.readLine();
			
				if (str.toLowerCase().equals("exit")) {
					break;
				}
				System.out.println(str);
			}
			
		} catch (Exception e) {
		
		} finally {
			try {
				ow.close();
				os.close();
				is.close();
				ir.close();
				br.close();
				socket.close();
				sc.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
}
