
public class Exam_02 {
	public static void main(String[] args) {
		
		
		
//		int length=str.length();
				
//		System.out.println(length);
		
		String str = "Hello World";
		
		int len = str.charAt(2);	// At : ~ �� ��ġ�� char��
		char len2 = str.charAt(2);
		
		System.out.println(len);
		System.out.println(len2);
		
		System.out.println("==================");
		
		
		int i = str.indexOf('d');
		System.out.println(i);
		int j = (char) str.indexOf("e");
		System.out.println(j);
		
		System.out.println("-----------------");
		
		boolean ss = str.startsWith("W");	// ������ �����Ҷ�
		System.out.println(ss);
		
		System.out.println(str.endsWith("ld")); // ������ ������
		System.out.println("=-=-");
		System.out.println(str.equals("Hello"));
		System.out.println(str.contains("H"));	// �����Ѵ�
		System.out.println("-----------------");
		String []st = str.split(" ");
		System.out.println(st[0]);
		System.out.println(st[1]);

	}
}
