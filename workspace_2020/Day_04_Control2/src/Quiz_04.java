import java.util.Scanner;

public class Quiz_04 {
	
	public static int validNum(String msg) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			try {
				System.out.print(msg);
				num = Integer.parseInt(sc.nextLine());
				return num;						
			}catch(Exception e) {
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.println("===���� ���α׷�===");

			System.out.print("������ �Է�(+,-,*,/) : ");
			String st = sc.nextLine();
			
			if(st.equals("q")){
				System.out.println("�����մϴ�.");
				System.exit(0);
			}else if(st.equals("+") || st.equals("-") ||
					st.equals("*") || st.equals("/")) { 
				
				int num1 = validNum("ù ��° ���� �Է� : ");
				int num2 = validNum("�� ��° ���� �Է� : ");
				
				
				
	/*			while(true) {
					try {

						System.out.print("ù ��° ���� �Է� : ");
						num1 = Integer.parseInt(sc.nextLine());
						break;	// ���� ���� �Է� �� �� ���ѷ��� Ż��						
					}catch(Exception e) {
						System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
					}
				}

				while(true) {
					try {

						System.out.print("�� ��° ���� �Է� : ");
						num2 = Integer.parseInt(sc.nextLine());
						break;	// ���� ���� �Է� �� �� ���ѷ��� Ż��						
					}catch(Exception e) {
						System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
					}
				} */

				int sum=num1+num2;
				int sub=num1-num2;
				int mul=num1*num2;
				double div=(num1/(double)num2);

				System.out.println("==== ��� ====");
				if(st.equals("+")) {
					System.out.println(num1 + "+" + num2 + "=" + sum + "\n");

				}else if(st.equals("-")) {
					System.out.println(num1 + "-" + num2 + "=" + sub + "\n");

				}else if(st.equals("*")) {
					System.out.println(num1 + "*" + num2 + "=" + mul + "\n");

				}else if(st.equals("/")) {
					//	System.out.printf("%d * %d = %.2f \n", num1, num2, div);
					System.out.println(num1 + "/" + num2 + "=" + div + "\n");
				}
			}else {
				System.out.println("�����ڸ� �ٽ� �Է����ּ���.");
			}
		}
	}
}
