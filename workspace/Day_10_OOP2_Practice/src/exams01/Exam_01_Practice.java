package exams01;

import java.util.Scanner;

public class Exam_01_Practice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Movie [] mov = new Movie[100];		// new������ �ν��Ͻ��� �����.
											// Movie �� ����ʵ尡 ����. name,gan,star
	
		while(true) {
			System.out.println("<<Netfilx Simulator>>");
			System.out.println("1. �ű� ��ȭ ���");
			System.out.println("2. ��ȭ ��� ���");
			System.out.println("0. ����");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());


			if(menu==1) {
				for(int i=0; i<mov.length; i++) {
					if(mov[i]==null) {
						mov[i] = new Movie();
						// ��ȭ ����
						System.out.print("�ű� ��ȭ ���� : ");
//						mov[i].setName();

						//��ȭ �帣
						System.out.print("�ű� ��ȭ �帣 : ");
//						mov[i].setGan();
						//���� 
						System.out.print("�ű� ��ȭ ���� : ");
//						mov[i].setStar();
						//���� 3������ �Է� �޾Ƽ�
						// Movie �ν��Ͻ��� �����غ�����.
						System.out.println(mov[i].getName()+"\t"+mov[i].getGan()+"\t"+mov[i].getStar());
						break;
					}  
				}
			}else if(menu ==2) {	// ��ȭ �߰��� ����Ʈ
				System.out.println("����"+"\t"+"�帣"+"\t"+"����");
				for(int i =0; i<mov.length ; i++) {
					if(mov[i]==null) {
						break;
					}
					System.out.println(mov[i].getName()+"\t"+mov[i].getGan()+"\t"+mov[i].getStar());
				}

			}else if(menu ==0) {
				System.out.println("Netfilx �� ���� �մϴ�.");
				System.exit(0);
			}else {
				System.out.println("�޴� ��ȣ�� �ٽ� Ȯ�����ּ���.");
			}
		}

	}
}
