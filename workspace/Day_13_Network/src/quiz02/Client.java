package quiz02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket client = new Socket("192.168.50.7", 11115);

		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner sc = new Scanner(System.in);

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);


		while(true) {
			// 1. Ŭ���̾�Ʈ�� ������ �����Ѵ�.

			// 2. Ŭ���̾�Ʈ�� ����� ����ID (1001~1100)�� �Է��Ͽ� ������ �����Ѵ�.
			String st = sc.nextLine();
			dos.writeUTF(st);

			// 2. Ŭ���̾�Ʈ�� ����� �̸��� �Է��Ͽ� ������ �����Ѵ�.
			String name = sc.nextLine();
			dos.writeUTF(name);

			// 4. Ŭ���̾�Ʈ�� ����� ����ó(��ȭ��ȣ)�� �Է��Ͽ� ������ �����Ѵ�.
			String num = sc.nextLine();
			dos.writeUTF(num);
			dos.flush();

			// 5. ������ Ŭ���̾�Ʈ�� ���� ���޵� 3���� �����͸� Contact Instance�� �����.
			//		Contact [�������� ����]
			//		id, name, phone 3������ ���Ͽ� 
			//		getter/setter/constructor/default constructor �� ������.

			// 6. ������ ������� �ν��Ͻ��� ������ ���� ���� �ν��Ͻ��� Manager���� �����Ͽ�
			//		Contact�� �����ϴ� ArrayList �� �����Ѵ�.
			//		( ���� �� �� , ArrayList�� ���� ��� �����Ͱ� �ִ��� Server Console�� ����ϼ���.)

			// 7. ������ �Ϸ� �� ��, ������ Ŭ���̾�Ʈ���� ���� �Ϸ��� �ǹ��� ack �� ��ȯ�Ѵ�.

			// 8.Ŭ���̾�Ʈ�� ack�� ��ȯ�Ǹ�, ����ڿ��� "����Ϸ�" �޼����� ����Ѵ�.
			
			String a = dis.readUTF();
			if(a.equals("ack")) {
				System.out.println("����Ϸ�");
			}
			// 9. 2 ~ 8 �������� �۾��� ���� �ݺ��Ѵ�.	


		}
	}

}
