
public class Exam_02 {
	public static void main(String[] args) {
		
		// int�� ���� 3ĭ¥���� arr1�� �ۼ��ϰ�,
		// 0 : 48 , 1:99, 2:33�� ������ ��
		// ȭ�鿡 ����غ��ô�.
		
		// String �� ���� 2ĭ¥���� arr2 �� �ۼ��ϰ�,
		// 0: "Hellow", 1: "World" �� ������ ��
		// ȭ�鿡 ����� ���ô�.
		
		// char �� ���� 5ĭ¥���� arr3�� �ۼ��ϰ�,
		// 0 : 'A' 1:'r' 2:'r' 3: 'a' 4: 'y' �� ������ ��
		// ȭ�鿡 ����� ���ô�.
		
		int [] arr1 = new int[] {48,99,33};
		String [] arr2 = new String[] {"Hellow","World"};
		char [] arr3 = new char[] {'A','r','r','a','y'};
		
		for(int i=0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		System.out.println();
		for(int k=0; k<arr3.length; k++) {
			System.out.print(arr3[k]);
		}
	}
}
