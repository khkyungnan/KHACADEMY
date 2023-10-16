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
		//���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
		//���� �ּҿ� ��Ʈ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ���
		Socket s = new Socket("localhost", 6789);
		System.out.println("Client conncet Server");
		
		// ���� �� �ڵ�
		OutputStream o = s.getOutputStream();
		PrintStream p = new PrintStream(o);
		p.print("hello server \n");
		System.out.println("Client -> Server");
		p.flush();
		
		//�����κ��� �о�� 
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is); // Scanner�� 2byteó���� ���� ����.
		System.out.println("Server : " + sc.nextLine() );

		
		s.close();  // ������ �������
		System.out.println("Client byte server");
	}
}