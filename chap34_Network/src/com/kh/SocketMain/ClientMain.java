package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {

		//서버의 연결하기 위한 소켓을  생성
		Socket socket = new Socket("localHost",5678);
		
		//서버로 데이터를 보내기 위한 출력 스트림 생성
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		//서버로 부터 데이터를 받기 위한 출력 스트림 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		while((userInputString = userInput.readLine())!=null) {
			
			//사용자 입력값을 서버로 전송하겠습니다.
			out.println(userInputString);
			
			String serverResponse = in.readLine();
			System.out.println("서버 대답 : "+serverResponse);
		}
		socket.close();
		userInput.close();
	}

}
