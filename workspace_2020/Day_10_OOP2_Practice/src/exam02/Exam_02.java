package exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_02 {

	// CafeMenu Ŭ���� ����
	// ��ǰ��ȣ (����)
	// ��ǰ�� (���ڿ�)
	// ���ݤ� (����)
	// getter / setter / construcor / ��������

	// 1001 / Americano / 2500
	// 1002 / CafeLatte / 3000

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Manager manager = new Manager();

		while(true) {
			System.out.println("< CafeMenu >>");
			System.out.println("1. ī�� �޴� ���");
			System.out.println("2. ī�� �޴� ���");
			System.out.println("3. �޴� �˻� (��������)");
			System.out.println("4. �޴� ���� (��������)");
			System.out.println("5. �޴� ���� (��������)");
			System.out.println("0. ����");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				manager.addMenu(new CafeMenu(1,"�Ƹ޸�ī��",2500));
				manager.addMenu(new CafeMenu(2,"īǪġ��",3000));
				manager.addMenu(new CafeMenu(3,"����ī��",3500));


			}else if(menu==2) {
				ArrayList<CafeMenu> cafemenu = manager.getCafe();

				System.out.println("��ȣ\t�޴�\t����");
				for(CafeMenu ca : cafemenu) {
					System.out.println(ca.getNum()+"\t"+ca.getMen()+"\t"+ca.getPrice());
				}


			}else if(menu==3) {

				System.out.println("�˻��� �޴� �̸� : ");
				String name = sc.nextLine();

				ArrayList<CafeMenu> result = manager.serchByMenu(name);

				System.out.println("��ȣ\t�޴�\t����");
				if(result.size() == -1) {
					System.out.println("�޴��� �����ϴ�.");
				}else {
					for(CafeMenu ca : result) {
						System.out.println(ca.getNum()+"\t"+ca.getMen()+"\t"+ca.getPrice());
					}
				}

			}else if(menu==4) {

				System.out.println("������ �޴� �̸� : ");
				String str = sc.nextLine();

				int index = manager.indexMenu(str);

				if(index == -1) {
					System.out.println("�޴��� �����ϴ�.");
				}else {
					System.out.println("��ȣ");
					int num = Integer.parseInt(sc.nextLine());

					System.out.println("�޴�");
					String name = sc.nextLine();

					System.out.println("����");
					int price = Integer.parseInt(sc.nextLine());

					manager.updateMenu(index, new CafeMenu(num,name,price));


				}
			}else if(menu==5) {
				
				System.out.println("������ �޴� �̸� : ");
				String st = sc.nextLine();
				
				int result = manager.deleMenu(st);
				if(result == -1) {
					System.out.println("������ �޴��� �����ϴ�.");
				}
			}

		}
	}
}

