package com.kh.tcpMain;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket serversocket = new ServerSocket(6789);
			System.out.println("!서버 대기중!");
			
			//만약에 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드작성
		while(true){
			//클라이언트와 연결대기하는 코드
			Socket client = serversocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			client.close();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
