package com.godOfJava2.c28;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

// 데이터를 보내는 '클라이언트'의 소스코드.

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    public void sendSocketSample() {
        for (int i = 0; i < 3; i++) {
            sendSocketData("I liked java at " + new Date());
        }
        sendSocketData("EXIT");
    }

    public void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client : Connecting");
            socket = new Socket("127.0.0.1", 9999);
            // IP번호와 포트번호를 갖는 Socket생성자로 객체를 생성 및 접속함.
            // 127.0.0.1이라는 IP번호는 '같은 장비'임을 의미함. 포트번호 9999는 서버쪽에 지정한 포트와 동일해야 함.
            System.out.println("Client : Connect status = " + socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            // getOutputStream() : 데이터를 서버에 보내기 위해 호출하는 메소드. OutputStream객체를 리턴함.
            // 리턴값인 OutputStream에 데이터를 넣어 서버로 전송한다.
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);
            System.out.println("Client : Sent data");
            bufferedOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                    // 데이저를 전송한 후 close()를 사용해 소켓 연결을 닫는다.
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
