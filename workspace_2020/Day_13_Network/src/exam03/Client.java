package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("192.168.50.7",25040);
		
		// 1. Ŭ���̾�Ʈ�� ������ �����Ѵ�.
		
		// 2. Ŭ���̾�Ʈ�� ���� +,-,*,/�� �ϳ��� �Է��Ͽ� ������ �����Ѵ�.
		
		// 3. Ŭ���̾�Ʈ�� ���ڸ� �ϳ� �Է��Ͽ� ������ �����Ѵ�.
		
		// 4. Ŭ���̾�Ʈ�� ���ڸ� �ϳ��� �Է��Ͽ� ������ �����Ѵ�.
		
		// 5. ������ Ŭ���̾�Ʈ�� ������ �����͵��� ���� �޾� �� ���ڿ� ���Ͽ� 2������ ���۵� ������ ó���ϰ�
		//		�� ����� Ŭ���̾�Ʈ�� ��ȯ�Ѵ�.
		
		// 6. ���� ������ ������ �ݺ��Ѵ�.
		
		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);
		
		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		
		while(true) {
//			JOptionPane.showInputDialog("Ŭ���̾�Ʈ���� ���� �޼���")
			String st = sc.nextLine();
			dos.writeUTF(st);
			dos.flush();
			
			String s =dis.readUTF();
			System.out.println("�������� �� �� : " + s);
		
		}
		
		
	}
}
