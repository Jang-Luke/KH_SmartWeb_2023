import java.util.Scanner;

public class Quiz_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("�̸� : ");
		String name = sc.nextLine();	//��� �Է��� ������ ���� �Է°���.
		
		System.out.print("���� : ");
		int kor = sc.nextInt();			//���ۿ��� ���ڸ� ������ \r\n�� �Ȳ���.
		// sc.nextInt()���� sc.nextline(); �������� \r\n ó������.
		
						
/*		String name = sc.nextLine();
		
		double kor = Integer.parseInt(sc.nextLine()); // ���ԵǸ鼭 �ڿ� .0�� ���δ� (���θ��)
		// Double.parseDouble(); �Է��� �Ҽ������� �ް������ �������� ������ ����ؾ���.
		int eng = Integer.parseInt(sc.nextLine());
		int math = Integer.parseInt(sc.nextLine());		
		
		double sum = (kor+eng+math);
		double avg = sum/3;
		
		System.out.println("======================");
		System.out.println("�̸� : "+ name);
		System.out.println("======================");
		System.out.println("���� : "+ kor);
		System.out.println("���� : "+ eng);
		System.out.println("���� : "+ math);
		System.out.println("======================");
		System.out.println("�հ� : "+ sum);
		System.out.println("��� : "+ avg);
*/
		
		
	}
}
