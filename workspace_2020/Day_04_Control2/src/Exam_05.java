import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޼����� �Է��ϼ��� : ");
		String msg = sc.nextLine();
		
		if(msg.equals("Apple")) {		// equals : ���ڿ� ��.
			System.out.println("��� �Դϴ�.");
		}else if(msg.equals("Strawberry")) {
			System.out.println("���� �Դϴ�.");
		}else {
			System.out.println("�޼����� Ȯ���� �� �����ϴ�.");
		}
		
	}
}
