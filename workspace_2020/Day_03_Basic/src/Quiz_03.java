import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100���� �Է� : " );
		int num = Integer.parseInt(sc.nextLine());
	
		System.out.println("=========���=============");
		
		
		if(1 <= num && 100 >= num) {
			if(num % 2 == 0) {
				System.out.println("�Է��� ���� ¦���Դϴ�.");
			}else if(num % 2 == 1) {
				System.out.println("�Է��� ���� Ȧ���Դϴ�.");
			}else {
				System.out.println("����");
			}
		}else {
			System.out.println("1~100���� ���ڸ� �Է����ּ���.");
		}
	}
		
	}

