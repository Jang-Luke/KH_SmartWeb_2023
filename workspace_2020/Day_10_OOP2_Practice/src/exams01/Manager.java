package exams01;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	// Default Value (�⺻���ð�), �����ϰ� �����ڸ���� ������ ���� ����, �׵ڿ� �����ڿ��� ���������� ������.
	private ArrayList<Movie> movies = new ArrayList<Movie>();	

	public void addMovie(Movie movies) {
		this.movies.add(movies);
	}	// �ű� ��ȭ ��� ����

	public ArrayList<Movie> getMovies() {
		return movies;
	}	// ��ȭ ��� ��ȯ ����

	public ArrayList<Movie> serchByTiltle(String  title) {

		ArrayList<Movie> result = new ArrayList<>();

		for(Movie mov: movies) {
			if(mov.getName().contains(title)) {		// ������ ���� ��ȭ�� ã�Ƴ��ٸ� ���� ���� ã�Ƴ� Movie instance����ȯ
				result.add(mov); 					// result ArrayList�� �Ű� ����
			}	
		}
		return result;	// ã�� ���ϸ� null���� ��ȯ
	}

	public int getIndexByTitle(String  title) {

		for(int i =0; i < movies.size(); i++) {
			if(movies.get(i).getName().equals(title)) {
				return i;	//��ȭ�� ã���� �ش� ��ȭ�� index ��ȯ
			}
		}
		return -1;			// ��ȭ�� ã�� ���ҽ� -1 ��ȯ
	}

	public void updateByIndex(int index, Movie dst) {
		movies.set(index,dst);
	}

	public int deleteByTitle(String title){
		int index= this.getIndexByTitle(title);
		if(index == -1) {
			return index;	// �����Ϸ��� ��ȭ�� ������
							// -1�� ��ȯ�Ͽ� main���� ���
		}
		else {
			movies.remove(index);
			return 0;		//������ �ߵ�����
							// 0�� ��ȯ�Ͽ� main���� ���
		}
	}


} 


//	public void updateByTitle(Movie m, Movie dst) {
//
//		m.setName(dst.getName());
//		m.setGan(dst.getGan());
//		m.setStar(dst.getStar());
//
//	}	

/*
 * 	public void listMovie() {
		System.out.println("����\t�帣\t����");
		for(int i=0; i < index; i++) {
			System.out.println(movies[i].getName()+"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
		}	
	}

	public void searchMovie() {
		Scanner sc = Scanner(System.in);
		System.out.print("�˻��Ϸ��� ��ȭ ���� : ");
		String title = sc.nextLine();

		System.out.println("����\t�帣\t����");
		for(int i = 0; i < index; i++) {
			if(movies[i]==null) {

				if(movies[i].getName().equals(title)) {
					System.out.println(movies[i].getName() +"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
					break;
				}
			}

		}
	}
 * */
