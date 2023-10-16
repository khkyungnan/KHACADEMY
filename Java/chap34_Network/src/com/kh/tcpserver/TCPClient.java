package com.kh.tcpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception{
		//서버 주소와 포트 번호로 소켓 생성
		//서버 주소와 포트번호는 내가 연결하고자 하는 포트와 동일해야함
		Socket s = new Socket("localhost", 6789);
		System.out.println("Client conncet Server");
		
		// 보낼 때 코드
		OutputStream o = s.getOutputStream();
		PrintStream p = new PrintStream(o);
		p.print("hello server \n");
		System.out.println("Client -> Server");
		p.flush();
		
		//서버로부터 읽어옴 
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is); // Scanner도 2byte처리를 위한 보조.
		System.out.println("Server : " + sc.nextLine() );

		
		s.close();  // 서버와 연결끊기
		System.out.println("Client byte server");
	}
}