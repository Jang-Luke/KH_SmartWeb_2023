import java.util.Scanner;

public class Exam_01 {

	// Method ���Ǻ�(Definition)
	public static int plus(int num1, int num2){		// �޼��� ���ʿ� ���� ������ Ÿ��, �������� �Ű�����
		int result= num1+num2;					
		return result;
	}
	
	// �� ������ ���ڷ� ���޹޾� ������ ����� ��ȯ�ϴ� minus �޼���
	public static int minus(int a, int b) {
		int minus = a-b;
		return minus;
	}
	// �� ������ ���ڷ� ���޹޾� �������� ����� �Ǽ��� ��ȯ�ϴ� divide �޼���
	public static double divide(double a, double b) {
		double result = a/b;
		return result;
	}
	
	// �� ������ ���ڷ� ���� �޾� �� ū���� ��ȯ�ϴ� bigger �޼���
	// (�� ���� ���ٸ� 0�� ��ȯ)
	public static int bigger(int a, int b) {
		int result=0;
		if(a < b) {
			result = b;
		}else if(a >  b) {
			result = a;
		}else if(a==b) {
			result = 0;
		}
		return result;
	}
	
	// "���" �� ���ڷ� �����ϸ� Apple ��, "����"�� ���ڷ� �����ϸ� Strawberry�� 
	// ��ȯ�ϴ� translate �޼��� ����
	// (����� ���Ⱑ �ƴ� �ٸ� ���� ���޵��� none ��ȯ)
	public static String translate(String result) {
		
		if(result == "���") {
			result="Apple";						//.equals ���� �񱳹�
		}else if(result == "����") {
			result="Strawberry";
		}else {
			result="none";
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// System.out.println(10+5);
		// System.out.println(plus(10,5));		// �޼��� ȣ���
		
		
//		int result = plus(10,5);	// ����� ���� �޼���
		
		System.out.println(minus(10,7));
		System.out.println(divide(10,3));
		System.out.println(bigger(4,10));
		System.out.println(translate("������"));
		String str = new String("����");
		System.out.println(str);
		

//		System.out.println(result);	
			// ���� �޼���
		// puls method �� �����ϴ� 10�� 5�� ����,�μ���(parameter, argument) �̶�� �θ���.
		// �޼��忡 ���޵Ǿ����� ���� �޴� ������ �Ű� ������� �θ���.
		
	}
}

