package com.kh.finalSample;

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class TCPServer {
	
	public static void main(String[] args) throws Exception {
		
	ServerSocket server = new ServerSocket(2222);
	System.out.println("[서버 연결 대기 중]");
	 while(true) {
		 
		Socket client = server.accept();
		System.out.println("[서버 연결 완료]");
		InputStream inStream = client.getInputStream();
		Scanner sc = new Scanner(inStream);
		OutputStream outStream = client.getOutputStream();
		PrintStream printstream = new PrintStream(outStream);
		printstream.flush();
		client.close();
	 	}
	}
}