import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���ɸ޴��� �����ϼ���.");
		System.out.println("1.��ġ�� 2.�������� 3.������");
		System.out.print(">>");
		
		// ������ �޴��� ����, ����� ���� �̸��� ����ϴ� ���α׷� �ۼ�
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("���ε���");
		}else if(menu == 2) {
			System.out.println("�Ϲ��� ���");
		}else if(menu == 3) {
			System.out.println("����");
		}else {
			System.out.println("���Ը� ����ּ���.");
		}
	}
}
