package exams01;

public class Exam_01 {

	// Movie Ŭ���� ����
	// ��ȭ ����
	// �帣
	// ����
	// ���� ���� ������ , getter / setter / constructor ��� ����
	// custom ��Ű���� �ۼ����ּ���.
	public static void main(String[] args) {

//		Movie mov = new Movie("���ϸ� ","���� ",9.0);	
//		Movie mov2 = new Movie("���� ","��� ",8.42);
//		System.out.println(mov.getName()+mov.getGan()+mov.getStar());		
//		System.out.println(mov2.getName()+mov2.getGan()+mov2.getStar());
		
//		Movie [] movies = new Movie[2];		// movie ���� 2�������, ���� x 
		Movie [] movies2 = new Movie[] {
	//			new Movie("�ƹ�Ÿ2","SF/�׼�",8.82), 
	//			new Movie("�ָ�","����",9.99)
				};
	//	movies2[1].setStar(100);
		
		for(int i =0; i< movies2.length; i++) {	
			System.out.println(movies2[i].getName()+"/"+movies2[i].getGan()+"/"+movies2[i].getStar());
		}
			
	}
}
