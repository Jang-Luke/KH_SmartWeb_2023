package quiz01;


class Work extends Thread{
	public void PlusThread() {
		for(int i =1; i<=10; i++) {
			System.out.print("+");
		}
	}
	
}
class Work2 extends Thread{
	public void MinusThread() {
		for(int i =1; i<=10; i++) {
			System.out.print("-");
		}
	}
	
}

class Work3 extends Thread{
	public void MinusThread() {
		for(int i =1; i<=10; i++) {
			System.out.print("*");
		}
	}
	
}

public class Main {
	public static void main(String[] args) {


		// + �� ����ϴ� PlusThread
		// - �� ����ϴ� MinusThread
		// * �� ����ϴ� MplyThread
		// �� ���� �����Ͽ� ���� 100���� ��ȣ�� ���ÿ� ����ϰ� ����� ���ô�.
		Work wo = new Work();
		Work2 wo2 = new Work2();
		Work3 wo3 = new Work3();
		
		wo.start();
		wo2.start();
		wo3.start();
		
		

	}
}
