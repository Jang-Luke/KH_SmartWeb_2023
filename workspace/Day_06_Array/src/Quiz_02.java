import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[3];
		int [] kor = new int[3];
		int [] eng = new int[3];
		int [] sum = new int[3];
		int [] div = new int[3];


		for(int i=0; i < name.length; i++) {
			System.out.print((i+1)+"��° �л� �̸� : ");
			name[i] = sc.nextLine();
			
			System.out.print(name[i]+" �л� ���� : ");
			kor[i]=Integer.parseInt(sc.nextLine());
			
			System.out.print(name[i]+"�л� ���� : ");
			eng[i]=Integer.parseInt(sc.nextLine());

			sum[i] = kor[i]+eng[i];
			div[i] = (sum[i]/2);			
		}

		System.out.println("�̸�\t����\t����\t�հ�\t���");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + sum[i] + "\t" + (float)div[i]);

		}
	}

}
