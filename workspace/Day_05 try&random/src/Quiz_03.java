import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			while(true) {		// switch������ �ٽ��غ���
				try {		
					System.out.println("===���� ���� �� ����===");
					System.out.print("���ڸ� �����ϼ���(1.����/ 2.����/ 3.��) : ");
					int num = Integer.parseInt(sc.nextLine());
					int rand = (int)(Math.random()*3)+1;
					
					
					if(num==1) {
						System.out.println("����� ������ �½��ϴ�.");
					}else if(num==2) {
						System.out.println("����� ������ �½��ϴ�.");
					}else if(num==3) {
						System.out.println("����� ���� �½��ϴ�.");
					}else {
						System.out.println("�߸��Է��Ͽ����ϴ�.");
						continue;
					}

					if(rand==1) {		// ����Ǽ��� �����ֱ�
						System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
					}else if(rand==2) {
						System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
					}else if(rand==3) {
						System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
					}

					if((num==1 && rand==3)||(num==2&&rand==1)||(num==3&&rand==2)) {
						System.out.println("����� �̰���ϴ�.");
					}else if(num==rand) {
						System.out.println("�����ϴ�.");
					}else{
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					}
					break;
				}catch(Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
				}
			}
		}	

	}

}



