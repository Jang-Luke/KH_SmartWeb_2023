import java.util.Scanner;

public class Up_Down {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
	he:	while(true) {
			System.out.println("==Up & Down Game==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("> ");
			int select = Integer.parseInt(sc.nextLine());

			double ran = (int)(Math.random()*99+1);
			
			switch(select) {
			case 1:
				System.out.println("<< Game Start >>");
				while(true) {

					System.out.print("Input Number : ");
					int player = Integer.parseInt(sc.nextLine());

					if(ran > player) {
						System.out.println(" << UP >>");
					}else if(ran < player) {
						System.out.println("<< Down >>");
					}else if(ran == player) {
						System.out.println("<< ���� >>");
						count+=1;
						continue he;
					}
				}
			case 2:
				System.out.println("�̱�Ƚ���� : " + count + "ȸ �Դϴ�.");
				break;
			case 3:
				System.out.println("������ �����մϴ�.");
				System.exit(0);
				break;
			default :
				System.out.println("�ٽ� ������ �ּ���.");
			} 	
		}
	}
}

