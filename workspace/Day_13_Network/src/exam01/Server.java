package exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;
class ReadThread extends Thread{
	public void run() {
		while(true) {
			try {
				String msg = Server.dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + msg);
			} catch (IOException e) {
				break;
			}
		}
	}
}
public class Server {
	public static DataInputStream dis;
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(45453);
		Socket socket = server.accept(); 				// ��ī�带 �ֽ�(���ο� ���ѷ��� 45453 �����ϸ� �극��ũ)
		System.out.println(socket.getInetAddress()+ " �� ���� ����");

		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner sc = new Scanner(System.in);

		InputStream is = socket.getInputStream();
		dis = new DataInputStream(is);
		
		new ReadThread().start();

		while(true) {
			System.out.println("Ŭ���̾�Ʈ���� ���� �޼��� : ");
			dos.writeUTF(sc.nextLine());
			dos.flush();


//			JOptionPane.showInputDialog(dis.readUTF());
		}
	}
}





//		
//		dos.flush();
//		JOptionPane.showMessageDialog(null, msg);
//		System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + msg);
//		String msg = dis.readUTF();
//		System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + msg);