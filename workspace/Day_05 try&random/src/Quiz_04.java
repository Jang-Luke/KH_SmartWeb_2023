import java.util.Scanner;

public class Quiz_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ins=0;
		int bt=0;

		while(true) {
			try {
			System.out.println("�渶 ���ӿ� ���Ű��� ȯ���մϴ�.");
			System.out.println("1.���� ����");
			System.out.println("2.�ܾ� ����");
			System.out.println("3.�ܾ� ��ȸ");
			System.out.println("4.����");
			System.out.print("�޴��� �������ּ���.>>");
			int num = Integer.parseInt(sc.nextLine());

			if(num==1) {
				System.out.println("!! �渶 ������ �����ϰڽ��ϴ� !!");
				System.out.println("1.��� ����� ������ ���� �յ� ��");
				System.out.println("2.�̹� �� ������ ���� ���� ��");
				System.out.println("3.�ֱ� �������� �ſ��� ��");
				System.out.print("���� �ϰ� ���� ���� �������ּ���.>>");
				int hol = Integer.parseInt(sc.nextLine());
				if(hol>3) {
					System.out.println("�ٽ� ������.");
				}else {
					System.out.print("�󸶸� ���� �Ͻðڽ��ϱ�?>>");		
					bt = Integer.parseInt(sc.nextLine());

					if(bt>ins) {
						System.out.println("�����ؿ�����.");
					}else if(bt<=ins) {

						int ran = (int)(Math.random()*3)+1;

						if(hol==ran) {
							System.out.println("���ÿ� �����ϼ̽��ϴ�.");
							System.out.println("�ݾ� �ι� : "+ bt*2);
							ins+=bt*2;

						}else if(hol!=ran) {
							System.out.println("���ÿ� �����ϼ̽��ϴ� �Ф���");
							ins-=bt;
							System.out.println("���� �ݾ� " + bt + "���� ��� �����̽��ϴ�.");
							System.out.println("=============================");
						}
					}
				}
			}else if(num==2) {
				System.out.print("�ܾ� ���� >>");
				ins=Integer.parseInt(sc.nextLine());
				System.out.println("=============================");

			}else if(num==3) {
				System.out.println("�ܾ��� "+ ins + "��");
				System.out.println("=============================");

			}else if(num==4) {
				System.out.println("����");
				System.out.println("=============================");
				System.exit(0);
			}else {
				continue;
			}
			}catch(Exception e) {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
}
