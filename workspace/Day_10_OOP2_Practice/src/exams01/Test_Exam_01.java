package exams01;

import java.util.Scanner;

public class Test_Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie [] movies = new Movie[5];
		int index=0;

		while(true) {
			System.out.println("<<Netfilx Simulator>>");
			System.out.println("1. �ű� ��ȭ ���");
			System.out.println("2. ��ȭ ��� ���");
			System.out.println("3. ��ȭ �˻� (��������)");
			System.out.println("4. ��ȭ ���� ����");
			System.out.println("5. ���� ");
			System.out.println("0. ����");
			System.out.print(">>");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				if(movies[index]==null) {

					System.out.println("��ȭ ���� : ");
					String title = sc.nextLine();
					System.out.println("��ȭ �帣 : ");
					String genre = sc.nextLine();
					System.out.println("��ȭ ���� : ");
					double score = Double.parseDouble(sc.nextLine());

					movies[index] = new Movie(title,genre,score);
					index++;
				}

			} else if(menu==2) {
				
				 System.out.println("����\t�帣\t����");
				for(int i =0 ; i < index; i++) { //movies[i] != null; index�� ��ä��� ������ ����.
					System.out.println(movies[i].getName()+"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
				}
			}else if(menu==3) {
				System.out.println("�˻��Ϸ��� ��ȭ ���� : ");
				String title = sc.nextLine();

				System.out.println("����\t�帣\t����");
	            for(int i = 0; i < index; i++) {
	               if(movies[i].getName().equals(title)) {
	                  System.out.println(movies[i].getName() +"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
	               }
	            }


			}else if(menu==4) {
				System.out.println("�����ϰ��� �ϴ� ��ȭ ���� : ");
				String title = sc.nextLine();
				for(int i=0; i< index; i++) {
					if(movies[i].getName().equals(title)) {
						System.out.println("������ ���� : ");
						String updateTitle = sc.nextLine();
						
						System.out.println("������ �帣 : ");
						String updateGenre = sc.nextLine();
						
						System.out.println("������ ���� : ");
						double updateScore = Double.parseDouble(sc.nextLine());

						movies[i] = new Movie(updateTitle,updateGenre,updateScore);
						break;
					}
				}
			}else if(menu ==5) {
				System.out.println("������ ��ȭ ���� : ");
				String title = sc.nextLine();

				for(int i=0; i<index; i++) {
					if(movies[i].getName().equals(title)) {
						for(int j = i; j < index; j++) {
							if(j==index-1) {
								movies[j] = null;
								index--;
								break;
							}
							movies[j] = movies[j+1];
						}
					}
				}
			}else if(menu ==0) {
				System.out.println("���α׷��� ����");
				System.exit(0);
			}

		}
	}
}
