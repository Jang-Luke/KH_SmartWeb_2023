import java.io.File;
import java.util.Scanner;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FTPClient client = new FTPClient();

		he:	while(true) {
			System.out.println("=== FTP Client Program ===");
			System.out.println("1. Connect FTP Server");
			System.out.println("2. Exit Program");
			System.out.print(">>>");


			int select = Integer.parseInt(sc.nextLine());

			if(select == 1) {
				try {
					System.out.println("input ur1");
					System.out.print(">>>");
					client.connect(sc.nextLine(), 21);		// 	21�� ��Ʈ��ȣ
				} catch (Exception e) {
					System.out.println("���񽺿� ������ �� �����ϴ�.");
					e.printStackTrace();
					System.exit(0);
				}

				try {
					System.out.println("FTP Server is connected");
					System.out.print("input ID : ");

					String pass = null;
					for(int i =0; i<9999; i++) {
						try {
							String id = "java";
							pass = i+"";
									client.login(id, pass);
									
							System.out.print("input PassWord : ");
							break;
						}catch(Exception e) {
							System.out.println(pass+"�α����� �����߽��ϴ�.");
						}
					}



					//			String id = sc.nextLine();
					//			System.out.print("input PassWord : ");
					//			String pass = sc.nextLine();

					//			client.login(id,pass);
					System.out.println("Login Success!");
				}catch(Exception e) {
					System.out.println("�α��ο� �����߽��ϴ�.");
					e.printStackTrace();
				}
			}else if(select == 2) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
			while(true) {
				System.out.println("==========File==========");
				System.out.println("1. Upload File");
				System.out.println("2. Download File");
				System.out.println("3. Disconnect FTP Server");
				System.out.println("4. Delete File");
				System.out.print(">>>");
				int select2 = Integer.parseInt(sc.nextLine());

				switch(select2) {

				case 1:
					try {
						System.out.println("���ε��� ���� �̸� : ");
						String nam = sc.nextLine();
						client.upload(new File("D:\\202301Smartweb\\download\\"+nam));
						System.out.println("���ε� �Ϸ�.");
					}catch(Exception e){
						e.printStackTrace();
						System.out.println("���ε� �����߽��ϴ�.");
					}
					break;

				case 2:					
					try {
					/*	String [] names = client.listNames();	//���� �޴�

						System.out.println("���� ��� �߿� ������.");
						for(int i =0; i < names.length; i++) {

							System.out.println(names[i]);
						}*/
						
						FTPFile[] files = client.list();
						
						for(int i =0; i<files.length;i++) {
							System.out.println(files[i].getName() + "\t" + files[i].getSize());
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}

					System.out.println();
					System.out.println("�ٿ�ε��� ������ Ȯ���ڱ��� �Է����ּ���.");
					
					String str = sc.nextLine();
					System.out.println("�ٿ�ε� ���� : " + str);

					try {
						client.download(str, new File("D:\\202301Smartweb\\download\\�ٿ��.txt"));
					}catch(Exception e) {						// ���� �ٿ�
						e.printStackTrace();
						System.out.println("�ٿ�ε忡 �����߽��ϴ�.");
					}
					break;

				case 3:
					System.out.println("���� �����ϴ�.");
					System.out.println();
					try{
						client.disconnect(true);
					}catch(Exception e) {
						e.printStackTrace();
					}
					continue he;

				case 4:
					try {
						String [] names = client.listNames();	//���� �޴�

						System.out.println("���� ��� �߿� ������.");
						for(int i =0; i < names.length; i++) {

							System.out.println(names[i]);
						}
					}catch(Exception e) {
						e.printStackTrace();
					}

					System.out.print("������ ���� : ");
					try {
						String nam2 = sc.nextLine();
						client.deleteFile(nam2);
						System.out.println("���� ����"+nam2);
					}catch(Exception e) {
						System.out.println("���� ����");
					}
				}
			}
		}
	}
}
