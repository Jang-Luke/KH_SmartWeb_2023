import java.util.Scanner;

public class Quiz_07 {
	public static void main(String[] args) {

		// System.exit(0); ������� ���α׷��� ��������. �ݺ����� ���.
		
		Scanner sc = new Scanner(System.in);

		while(true) {	// ���ѹݺ��� while(true) ���´�.
			System.out.print("2~9���� ���� (0 -> ����) : ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("====������ ��� ���α׷�====");
			System.out.println();

			if(num == 0) {
				System.out.println("�������� �����մϴ�.");
				System.exit(0);
			}
			if(1 < num && num < 10 ) {
				int i = 1;
				while(i < 10) {
					System.out.println(num + " * "+ i +" = " + (num * i));
					i++;
				}
			}else {
				System.out.println("������ ������ϴ�.");
			}
		}
	}
}
