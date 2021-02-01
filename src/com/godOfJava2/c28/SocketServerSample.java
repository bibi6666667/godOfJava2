package com.godOfJava2.c28;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 데이터를 받는 '서버'의 소스코드.

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    public void startServer() {
        ServerSocket server = null;
        Socket client = null;
        // ServerSocket은 데이터를 받기 위한 클래스이며, 주로 서버에서 사용함
        // Socket은 데이터를 보내기 위한 클래스이며, 주로 클라이언트에서 사용함

        try {
            server = new ServerSocket(9999);
            // 포트번호 9999를 이용해 ServerSocket 객체 생성.
            // 이 프로그램에서 띄운 서버로 접근하려면 9999포트를 사용해야 함을 의미.
            while (true) {
                System.out.println("Server : Waiting for request.");
                client = server.accept();
                // accept() : ServerSocket을 새로운 소켓 연결(다른 원격 호출)을 기다리는 상태로 만듦.
                // 연결되면 Socket객체가 리턴됨.
                System.out.println("Server : Accepted.");
                InputStream inputStream = client.getInputStream();
                // 접속한 상대로부터 데이터를 받기 위해 Socket클래스의 getInputStream()을 호출 - InputStream객체를 리턴함
                // *반대로 접속한 상대에게 데이터를 전송하기 위해서는 getOutputStream()을 호출 - OutputStream객체를 리턴받음 - 이 스트림에 데이터를 전달함.
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while ((data = bufferedReader.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received data : " + receivedData);
                
                bufferedReader.close();
                inputStream.close();
                client.close();
                // close() : 모든 데이터 처리가 끝난 후 Socket사용이 종료됨을 알림 
                if (receivedData != null && "EXIT".equals(receivedData.toString())) {
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("----------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                    // 더 이상 소켓수신이 필요없을 때 ServerSocket의 close()를 호출함
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
