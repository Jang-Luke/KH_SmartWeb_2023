package exams;

import custom.Temp;

public class Exam_04 {
	
	public void func() {
		int a =10;
	}
	
	public static void main(String[] args) {
		
		Temp t1 = new Temp();
		Temp t2 = new Temp();
//		t1 = null;			// �ν��Ͻ� �����

		t1.a=30;
		t2.a=20;
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		
		t1.b =30;
		Temp.b = 335;
		System.out.println(t2.b);
		
		// �������� -> stack �޸�
		// �Ű����� -> stack �޸�
		// ������� -> heap �޸�
		// �������� -> data �޸�
		
	}
}
