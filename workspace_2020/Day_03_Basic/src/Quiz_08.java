import java.util.Scanner;

public class Quiz_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===1~n������ �� ���ϱ�===");

		System.out.print("n �Է� : ");
		int n = Integer.parseInt(sc.nextLine());

		int i=1;
		int sum=0;

		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1~100������ ���� "+ sum);
	}
}
