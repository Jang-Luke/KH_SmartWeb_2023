
public class Exam_02 {

	public static void main(String[] args) {
		
		//��������
		
		double rand = Math.random();	// 0 ~ 1.0 ������ �Ǽ��� �������� ����
		System.out.println((int)(rand*10));	// ���� 0 ~ 9 ��� �ڵ�
		System.out.println((int)(rand*6) + 1 ); 	// �ֻ��� 1 ~ 6
		
		// 37 ~ 52 ������ ������ ����Ϸ���?
		// ���� ���� ����
		// ���ϰ��� �ϴ� ������ �ּҰ��� x
		// ���ϰ��� �ϴ� ������ �ִ밪�� y
		// (Y-X+1)+X
		// (52-37+1)+37
		System.out.println((int)(rand));
		
	}
}
