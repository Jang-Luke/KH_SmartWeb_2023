
public class Exam_01 {
	public static void main(String[] args) {

		// ������� �迭�� �ּҸ� arr�� ����
		// ���� ���� heap �޸𸮸� ����ϰڴ� -> new
		int [] arr = new int[] {10,20,30,40};// <-- �迭 ���� ���� : int�� ���� 4�� ���� (���������� �������)

		//		arr[0] = 10;
		//		arr[1] = 20;
		//		arr[2] = 30;
		//		arr[3] = 40;

		

		// �Ʒ� �ڵ带 �ݺ������� �����ؼ� ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//		System.out.println(arr[1-1]);
		//		System.out.println(arr[3/2]);
		//		System.out.println(arr[(int)(Math.random())*3]);
		//		System.out.println(arr[Integer.parseInt(sc.nextline())]);
		//		System.out.println(arr[a]);


	}
}







// �޸𸮿����� ��4�� 
// stack, data, heap, text
// stack : �۰� ������ �� ���� ����
// heap : �������̰� ���� ŭ

// String:  ���� �ּҸ� ����. ������ (heap) 
// Scanner sc = new Scanner(System.in); ���⼭ new�� heap
// String str = new String("Hellow World"); ���߿� ��� ����.

// offset : ���������� ���� �󸶳� �������ִ°�

