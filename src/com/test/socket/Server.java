package com.test.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(4700);
		} catch (Exception e) {
			System.err.println("can not listen to " + e);
		}

		Socket socket = null;
		try {
			socket = serverSocket.accept();
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(is);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}
}
