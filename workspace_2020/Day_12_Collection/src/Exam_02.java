import java.util.ArrayList;

public class Exam_02 {
	public static void main(String[] args) {
		// ������, ��ü�� �����̵�.
		// Object : ��� Ŭ����Ÿ�Կ� �ְ����Ŭ����
		//<> ���� ���ǰ���.
//		ArrayList<ArrayList<String>> arr = new ArrayList<>();
		ArrayList<String> arr = new ArrayList<>();	
		
		arr.add("Hello");
		arr.add("Wold");
		arr.add("Collection");
	
//		for(int i=0; i< arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		// : �����ʿ� �����Ͱ� ������
		// : ���ʿ� �����͸� ���� ����
		// for rich�� : Collection�� �־�� ����, ���������� ����, �ݺ�Ƚ�� ���� �Ұ�
		for(String str : arr) {		
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(((String)arr.get(2)).length());
//		System.out.println(arr.get(2).length());
		// �������������� �ٿ�ĳ������ �ؾ��ϴ� ���ŷο�������. 
		
		// size() �� �� ����
		// lengs() �� ���� ����
		
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
		
//		arr.remove(0);
//		arr.add(1,"Jva");
//		
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
//		
//		System.out.println(arr.size()); //arr�� ����
		
	}
}
