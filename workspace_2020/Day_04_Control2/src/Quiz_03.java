import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mon=3000;
		int co=0;
		int sa=0;
		int m=0;

		int cocont=1000;
		int sacont=800;
		int mcont=1500;

		while(true) {
			System.out.println("<< ���Ǳ� �ùķ����� >>");
			System.out.println("������� �����ϼ���.");
			System.out.println("1. �ݶ�(1000) 2. ���̴�(800) 3. �Ž���(1500) 4. ����[0. ����ǰȮ��]");


			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				if(mon>=cocont) {
					System.out.println("�ݶ� �����߽��ϴ�.");
					co++;
					System.out.println("�ݶ� : " + co + "��");
					mon-=cocont;
					System.out.println("������ : "+ mon + "\n");
				}else if(mon < cocont) {
					System.out.println("�������� �����մϴ�." + "\n");
				}
			}else if(menu==2) {
				if(mon>=sacont) {
					System.out.println("���̴ٸ� �����߽��ϴ�.");
					sa++;
					System.out.println("���̴� : " + sa + "��");
					mon-=sacont;
					System.out.println("������ : "+ mon + "\n");
				}else if(mon<sacont) {
					System.out.println("�������� �����մϴ�." + "\n");
				}
			}else if(menu==3) {
				if(mon>=mcont) {
					System.out.println("�޽����� �����߽��ϴ�.");
					m++;
					System.out.println("�޽� : " + m + "��");
					mon-=mcont;
					System.out.println("������ : "+ mon + "\n");
				}else if(mon<mcont) {
					System.out.println("�������� �����մϴ�." + "\n");
				}
			}else if(menu==4){
				System.out.println("����");
				System.exit(0);			
			}else if(menu==0) {
				System.out.println("<< ����ǰ ��� >>");
				System.out.println("������ : " + mon + "��");
				System.out.println("�ݶ� : "+ co + "��");
				System.out.println("���̴� : "+ sa + "��");
				System.out.println("�Ž��� : "+ m + "��");
				System.out.println("==================");
				System.out.println();
			}
		}
	}
}
