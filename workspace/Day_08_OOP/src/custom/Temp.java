package custom;

public class Temp {
	public int a;				// Instance Member field 
	public static int b;		// Class Member field �������� 

	public void func1() {
		a=20;
		b=20;
	}

	public static void func2() {
		b = 20;
	}
}

// static : main �� ������ �Ŀ� �ٷ� ���� (��밡��)
//		    �޸� ȿ������ ������
//		    ���α׷��� ������ ���� ����ؾ��ϴ°͸� static���.

// Instance : �ν��Ͻ��� new Ŭ������ ����� ����.
// 			  �ν��Ͻ��� Ŭ������ ���������ʴ´�. �ν��Ͻ��� a�� ���´�. a�� b�� �ּҸ� �����.
//			  �ν��Ͻ��� b�� ���� x, main����� data������ b����.

