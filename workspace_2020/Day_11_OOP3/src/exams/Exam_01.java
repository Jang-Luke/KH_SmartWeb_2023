package exams;

class A {
	public void funcA() {
		System.out.println("A�Դϴ�.");
	}
}
class B extends A{
	public void funcA() {
		System.out.println("B�Դϴ�.");
	}
}
public class Exam_01 {
	
	public static void main(String[] args) {
		
		// ���� �� ���� ��
		// ������ 
		// Ŭ���� �� ��Ӱ��迡�� �θ�Ŭ���� �ڷ������� ���� ���� �������� �����Ǵ� ����
		// ���� Ŭ���� ���������� ���� Ŭ���� �ν��Ͻ��� �ּҸ� ������ �� �ִ�.
		// ���������� ����ȯ ����ȯ���� BŬ������ �޼��� ��밡��.
		
		A a = new B();		// up casting  // down casting
		a.funcA();
		
		// �������� ������ �θ�Ŭ���� ���������� �⺻������ �ڽ��� Type��ŭ�� ������ ����
		// ���� �ڽ��� Type�� �ƴ� ���Ե� �ν��Ͻ��� ��� ����� ����ϰ� �ʹٸ� Down casting �ʿ�
		// *���� ��Ȳ : �ڽ�Ŭ�������� Overriding �� �޼���� Down Casting���� ���
		
	}
}
