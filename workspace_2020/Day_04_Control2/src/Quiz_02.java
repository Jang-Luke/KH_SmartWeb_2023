import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=0;
		int a;

		System.out.println("***ATM �ùķ�����***");
		System.out.println("1.�ܾ���ȸ");
		System.out.println("2.�Ա��ϱ�");
		System.out.println("3.����ϱ�");
		System.out.println("4.�����ϱ�");
		System.out.print(">>");

		while(true) {

			while(true) {
				try {
					a = Integer.parseInt(sc.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("�ٽ� �Է����ּ���.");
				}
			}


			if(a==1) {
				System.out.println("�ܾ� : " + i);	

			}else if(a==2) {
				while(true) {
					try {
						System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
						int j = Integer.parseInt(sc.nextLine());

						System.out.println(j+"���� �ԱݵǾ����ϴ�.");
						i+=j;
						break;
					}catch(Exception e) {
						System.out.println("�ݾ��� ���ڷ� �Է��ؾ� �մϴ�.");
					}
				}
			}else if(a==3) {
				while(true) {
					try {
						System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");	
						int k = Integer.parseInt(sc.nextLine());

						if(k<i) {
							System.out.println(k+"���� ��ݵǾ����ϴ�.");
							i-=k; 
						}else if(k>i){
							System.out.println("�ܾ��� �����մϴ�.");
						}
						break;
					}catch(Exception e) {
						System.out.println("�ݾ��� ���ڷ� �Է��ؾ� �մϴ�.");
					}
				}
			}else if(a==4) {
				System.out.println("�����ϱ�");
				System.exit(0);
			}else {
				System.out.println("�ٽô����ּ���.");			
			}

		}
	}
}			


/*	switch(a) {
				case 1:
					System.out.println("�ܾ���ȸ ����� ����");
					break;
				case 2:
					System.out.println("�Ա��ϱ� ����� ����");
					break;
				case 3:
					System.out.println("����ϱ� ����� ����");
					break;
				case 4:
					System.out.println("�����ϱ� ����");
					System.exit(0);
					break;
				default :
					System.out.println("�ٽ� �����ּ���.");
				}*/

/*	if(a==1) {
				System.out.println("�ܾ���ȸ ����� ����");	
			}else if(a==2) {
				System.out.println("�Ա��ϱ� ����� ����");	
			}else if(a==3) {
				System.out.println("����ϱ� ����� ����");	
			}else if(a==4) {
				System.out.println("�����ϱ�");	
			}else {
				System.out.println("�ٽô����ּ���.");
			} */

