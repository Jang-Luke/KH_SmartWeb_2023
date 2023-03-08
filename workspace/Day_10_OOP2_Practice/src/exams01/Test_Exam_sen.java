package exams01;

import java.util.ArrayList;
import java.util.Scanner;

import exams01.Movie;

public class Test_Exam_sen {
	public static void main(String[] args) {

		// M V C
		// Model	: �ð������� �������� ������ ���������� �����ϴ� �ڵ�
		// View 	: ����ڿ� ���� ���۵ǰ� �������� �κ�
		// Control	: ���� �� �б� ���� �ڵ�

		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		while(true) {
			System.out.println("<<Netfilx Simulator>>");
			System.out.println("1. �ű� ��ȭ ���");
			System.out.println("2. ��ȭ ��� ���");
			System.out.println("3. ��ȭ �˻� (�������� �˻�)");
			System.out.println("4. ���� ���� (�������� ����)");
			System.out.println("5. ��ȭ ���� (�������� ����)");
			System.out.println("0. ����");
			System.out.print(">>");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {

				manager.addMovie(new Movie("11111", "b", 8.0));
				manager.addMovie(new Movie("12121", "e", 9.0));
				manager.addMovie(new Movie("13141", "f", 7.0));

				//	manager.addMovie(new Movie(title,genre,score));
				//	movies[index++] = new Movie(title,genre,score);


			} else if(menu==2) {
				ArrayList<Movie> movies = manager.getMovies();

				System.out.println("����\t�帣\t����");
				for(Movie m : movies) {
					System.out.println(m.getName() + "\t"+
							m.getGan()+ "\t"+
							m.getStar());
				}
				//				for(int i =0; i< manager.getIndex(); i++) {
				//					System.out.println(movies[i].getName()+"\t"+ movies[i].getGan()+"\t"+ movies[i].getStar());
				//				}

			}else if(menu==3) {		// �˻�

				System.out.println("�˻��� ��ȭ ���� : ");
				String title = sc.nextLine();

				ArrayList<Movie> result = manager.serchByTiltle(title);

				System.out.println("����\t�帣\t����");

				if(result.size() == 0) {
					System.out.println("�ش� ������ ��ȭ�� �������� �ʽ��ϴ�.");
				}else {
					for(Movie m : result) {
						System.out.println(m.getName() + "\t"+
								m.getGan()+ "\t"+
								m.getStar());

					}

				}


				//				ArrayList<Movie> movies = manager.getMovies();
				//				System.out.println("�˻��� ��ȭ �̸� : ");
				//				String str = sc.nextLine();
				//
				//				System.out.println("����\t�帣\t����");
				//				for(Movie m : movies) {
				//					if(m.getName().equals(str)) {
				//						System.out.println(m.getName() + "\t"+
				//								m.getGan()+ "\t"+
				//								m.getStar());
				//					}		
				//				}

			}else if(menu==4) {
				System.out.println("������ ��ȭ �̸� : ");
				String title = sc.nextLine();

				int index = manager.getIndexByTitle(title);

				if(index == -1) {
					System.out.println("�ش� ������ ��ȭ�� �������� �ʽ��ϴ�.");
				}else {
					System.out.println("������ ���� : ");
					String modTilte = sc.nextLine();

					System.out.println("������ �帣 : ");
					String modGenre = sc.nextLine();

					System.out.println("������ ���� : ");
					double modScore = Double.parseDouble(sc.nextLine());

					manager.updateByIndex(index, new Movie(modTilte,modGenre,modScore));
				}

			}else if(menu==5) {
				
				System.out.println("������ ��ȭ ���� : ");
				String title = sc.nextLine();
				
				int result = manager.deleteByTitle(title);
				if(result == -1) {
					System.out.println("�����Ϸ��� ��ȭ�� �������� �ʽ��ϴ�.");
				}
				
			}else if(menu ==0) {
				System.out.println("���α׷��� ����");
				System.exit(0);
			}
		}
	}

}
