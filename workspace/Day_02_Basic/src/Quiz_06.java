import java.util.Scanner; // ��Ʈ�� ����Ʈ O

public class Quiz_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("�ι�° ���� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("�� ���� ���� : "+ (num1+num2));
	/*	
		// �� ������ �Է¹޾� ������ ����� ����ϴ� ���α׷���  �ۼ����ּ���.
		System.out.print("ù��° ������ �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.print("�ι�° ������ �Է����ּ��� : ");
		String str2 = sc.nextLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println("�� ���� ���� : "+ (num1+num2));
		*/
	}

}
