package exam03;

public class Exam_03 {

	// Contact Ŭ���� ����
	// �̸� ��ȭ��ȣ �̸���
	// getter / setter / constructor / ��������
	
	// ȫ�浿 / 01012344321 / hong@naver.com
	// ������ / 01090062139 / stj@gmail.com
	
	public static void main(String[] args) {
		
		Contact con = new Contact("ȫ�浿","01012344321", "hong@naver.com");
		
		System.out.println(con.getName()+"/"+con.getNum()+"/"+con.getMail());
		
		Contact con2 = new Contact("������","01090062139", "hong@naver.com");
		System.out.println(con2.getName()+"/"+con2.getNum()+"/"+con2.getMail());
		
		
	}
		
}
