import java.io.IOException;

public class Exam_06 {
	public static void main(String[] args) throws IOException { 
													// IOException�� ������
/*		System.out.print("�� ���ڸ� �Է����ּ��� : "); 	// read();�Է����� �ȳ��ؾ���.
		int input = System.in.read();				// �Էµ� ����(int��) �ϳ� , �Է°��� input�� �������ִ�.
	//	char ch = (char)input;
		
		System.out.println("�Է��Ͻ� ������ " + (char)input + " �ƽ�Ű�ڵ� 10������ " + input + " �Դϴ�.");
	*/	// �����������̽� UI
		
		System.out.print("�� ���ڸ� �Է����ּ��� : ");
		int input1 = System.in.read();
		System.out.println("�Է��� ���ڴ� : " + input1);
												// A�Է��ϸ� A \r\n ���� �Է��̵Ǿ 3��°������ �ԷºҰ�.
		System.out.print("�� ���ڸ� �Է����ּ��� : ");
		int input2 = System.in.read();
		System.out.println("�Է��� ���ڴ� : " + input2);
		
		System.out.print("�� ���ڸ� �Է����ּ��� : ");
		int input3 = System.in.read();
		System.out.println("�Է��� ���ڴ� : " + input3);
		
		System.out.print("�� ���ڸ� �Է����ּ��� : ");
		int input4 = System.in.read();
		System.out.println("�Է��� ���ڴ� : " + input4);
		
	}
}
