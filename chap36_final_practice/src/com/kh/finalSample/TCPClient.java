package com.kh.finalSample;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient{

	public static void main(String[] args) throws Exception  {
		
		String serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP,2222);
		
		
		//클라이언트와 통신을 위한 입출력 스트림 설정
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream out = socket.getOutputStream();
		
		String msg = "안녕 서버";
		out.write(msg.getBytes());
		out.flush();
		
		socket.close();
	}
		
}
