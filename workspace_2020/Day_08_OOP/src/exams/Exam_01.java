package exams;
import java.util.Scanner;

import custom.TV;

public class Exam_01 {
	public static void main(String[] args) {
		
		TV samsung = new TV();
	
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		
		String str = new String("Apple");
		System.out.println("Apple" == "Apple");
		System.out.println(str == "Apple");
		
	}
}				

//Stack�޸𸮿� �����ϳ��� ����
// new�� ����Ͽ� �����ڷ����� heap�޸𸮿� ����(instance(��ü))
// instance�� �ּҰ��� ������ ��ƾ��Ѵ�. 