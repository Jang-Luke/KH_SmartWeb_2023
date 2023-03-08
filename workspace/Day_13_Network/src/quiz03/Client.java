package quiz03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		Socket client = new Socket("192.168.50.67", 11116);

		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		while (true) {
			System.out.println("<<����ó ���� ���α׷�>>");
			System.out.println("1. ����ó �ű� ���");
			System.out.println("2. ����ó ��� Ȯ��");
			System.out.println("3. �˻� (�̸����� �˻�)");
			System.out.println("4. ����ó ���� (ID�� ����)");
			System.out.println(">>");
			int menu = Integer.parseInt(sc.nextLine());
			dos.writeInt(menu);

			if (menu == 1) {
				System.out.print("ID�� �Է��ϼ���>> ");
				int id = Integer.parseInt(sc.nextLine());
				dos.writeInt(id);

				System.out.print("�̸��� �Է��ϼ���>> ");
				String name = sc.nextLine();
				dos.writeUTF(name);

				System.out.print("��ȣ�� �Է��ϼ���>> ");
				String phone = sc.nextLine();
				dos.writeUTF(phone);

				dos.flush();

			} else if (menu == 2) {
				String pars = dis.readUTF();
				System.out.println("����ó ���");
				System.out.println(pars);

				//				String parsedContacts = dis.readUTF();
				//				System.out.println("����ó ���");
				//				System.out.print(parsedContacts);

			}else if(menu==3) {
				System.out.println("�˻��� �̸� : ");
				String par = sc.nextLine();
				dos.writeUTF(par);
				dos.flush();

				System.out.println("ID\t�̸�\t��ȣ");
				String pa = dis.readUTF();
				System.out.print(pa);

			}else if(menu==4) {
				System.out.println("������ ID");
				int par = Integer.parseInt(sc.nextLine());
				dos.writeInt(par);
				dos.flush();

				if(dis.readInt()==-1) {
					System.out.println("���� ����");
				}else {	
					System.out.println("�����Ϸ�");
				}
			}
			
			String a = dis.readUTF();
			if(a.equals("ack")) {
				System.out.println("�Ϸ�");
			}
			System.out.println();
		}

	}
}
