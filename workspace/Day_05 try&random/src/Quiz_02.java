import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===���� �� �� ���߱�===");
		System.out.print("���ڸ� �Է����ּ���(1.�ո�/2.�޸�) : ");
		while(true){

			while(true) {
				try {
					int num = Integer.parseInt(sc.nextLine());

					double rand = Math.random();
					if(num==(int)(rand*3)+1) {

						System.out.println("������ϴ�.");
						System.out.println("---------------------->restart");

					}
					else {
						System.out.println("��! Ʋ�Ƚ��ϴ�!");
					}
					break;
				}catch(Exception e) {
					System.out.println("�ٽ��Է��� �ּ���.");
				}

			}

		}
	}
}
