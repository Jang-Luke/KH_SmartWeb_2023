import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		String str = sc.nextLine(); 	 // �Է»��� ����, �����Է��ϸ� ������ ���� ����
		
		int num = Integer.parseInt(str); // parseInt : �Ұ�ȣ �ȿ��ִ°��� ���ڷ� �м��϶�.
		System.out.println(num + 15);
	
	}
}
