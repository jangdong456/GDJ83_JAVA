package com.jang.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
	
	// 1번이 오면 학생정보를 보내줌  string으로 -> 하나의 리스트로 
	// 2번 학생정보 중에서 그 학생의 정보만 보내줌
	// 3번 종료
	// 서버는 계속 기다리는 상태 종료되면 안된다. -> 2중 while문
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		
		// Nestwork
		// 통신을 하려면 상대방의 IP와 Port 번호가 필요
		// 자바에서는 이걸 Socket 으로 표현한다.
		// ip:port => Socket
		// Nestwork 통신은 Socket끼리 1:1 통신이다. -> 여러명 통신을 못한다.
		
		// close() 시키려고 초기화 해줌
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		
		Scanner scanner = new Scanner(System.in); 
		
		try {
			ss = new ServerSocket(8282);
			while(true) {
				// 서버를 열고 Client 접속을 기다림
				// ServerSocket(포트번호) 소켓끼리 연결도와주는 연결다리 
				System.out.println("서버실행 후 클라이언트 기다리는중");
				
				// 서버쪽으로 종이컵 만들어서 주는거
				sc = ss.accept();
								
				boolean flag = true;
				
				System.out.println("client 연결성공");
				//클라이언트에서 보낸 값 가져온다
				is = sc.getInputStream();				
				// 가져온걸 읽는다
				ir =  new InputStreamReader(is);
				// buffer(주머니)에 담는다.
				br = new BufferedReader(ir);				
				// 담은 버퍼의 readLine()메서드를 통해서 읽는거
				
				// 01로 내보냄
				os = sc.getOutputStream();
				// 01을 담는다.
				ow = new OutputStreamWriter(os);
				
				while(flag) {
					//클라이언트에서 받는거 
					String msg = br.readLine();
					if (msg.toLowerCase().equals("3")) {
						System.out.println("종료");
						break;
					}
					System.out.println("해린님이 보내신거 : " + msg);
					
					if(msg.equals("1")) {
	
						
						System.out.println("클라이언트 보낼거 입력");
						
//						msg = scanner.next();

						ow.write(studentService.studentList()+"\r\n");
						ow.flush();
						break;
					}
					
					if(msg.equals("2")) {
						System.out.println("들어옴?@@@@@@@");
						if(msg.equals("1")) {
							String list1 = "1-동국-170-남성";
							ow.write(list1+"\r\n");
							ow.flush();
							break;
						} else if(msg.equals("2")) {
							System.out.println("2222222222");
							String list2 = "2-철수-160-여성";
							ow.write(list2+"\r\n");	
							ow.flush();
							break;
						} else if(msg.equals("3")) {
							String list3 = "3-둘리-150-남성";	
							ow.write(list3+"\r\n");
							ow.flush();
							break;
						} else if(msg.equals("4")) {
							String list4 = "4-또희-140-여성";	
							ow.write(list4+"\r\n");
							ow.flush();
							break;
						}
					if(msg.equals("3")) {
						break;
					}
						
						
						
//						if() {
//							ow.write();
//							ow.flush();
//							break;
//						}
						
					}
					System.out.println(msg);
					
					System.out.println("클라이언트 보낼거 입력");
					msg = scanner.next();
					
					ow.write(msg + "\r\n");
					ow.flush();
					
					if(msg.toLowerCase().equals("3")) {
						System.out.println("종료");
						break;
					}
				}
				
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				os.close();
				ow.close();
				sc.close();
				ss.close();
				
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}


