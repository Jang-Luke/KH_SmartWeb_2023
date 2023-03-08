package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(45457);
		System.out.println("������ ���� �Ǿ����ϴ�...");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress()+ " �� ���� ����");
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		while(true) {
			String msg = dis.readUTF();
			System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + msg);
			
			int num1 =  Integer.parseInt(dis.readUTF());
			System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + num1);
			
			int num2 =  Integer.parseInt(dis.readUTF());
			System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + num2);
			
			if(msg.equals("+")||msg.equals("-")||msg.equals("*")) {
				if(msg.equals("+")) {
					dos.writeUTF("�� ���� �� : "  + (num1+num2));
				}else if(msg.equals("-")) {
					dos.writeUTF("�� ���� ���� : "  + (num1-num2));
				}
				else if(msg.equals("*")) {
					dos.writeUTF("�� ���� �� : "  + (num1*num2));
				}		
			}else {
				break;
			}

		}
	}
}
