import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �����ϴ� ������ �����Դϱ�?");
		System.out.println("1.��� 2.���� 3.����");
		System.out.print(">>");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1 || menu == 2 || menu == 3) {
			
			if(menu == 1) {
				System.out.println("����� ����� Apple �Դϴ�.");
			}else if(menu == 2){	//���Ӽ� ����
				System.out.println("����� ����� mango �Դϴ�.");
			}else if(menu ==3 ){
				System.out.println("����� ����� Strawberry �Դϴ�.");
			}
		}else {
			System.out.println("�޴��� �ٽ� ���ÿ�.");
		}
		
		
	}
}
