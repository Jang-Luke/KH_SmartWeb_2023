
public class Exam_01 {
	public static void main(String[] args) {

		here: while(true) { 		// �� �극��ũ
			for(int i=1; i <=10; i++) {
				System.out.println(i);
				if(i == 5) {
					break here;
				}
			}
		}
	}
}




/*
int i;
for(i=1; i<=10; i++) {
	int a = 10;		// ���������� �߰�ȣ ������ �������.
	System.out.println(a); // ��� a++ �ص� �� 10.
	a++; //11
 */