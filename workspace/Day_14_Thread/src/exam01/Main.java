package exam01;

class Worker extends Thread{
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println("�ι�° for : " + i);
		}
	}
	
}

class Worker2 extends Thread{
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println("����° for : " + i);
		}
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		// Thread �۾� 
		// Step1. Thread Ŭ������ ��ӹ޴� ����� ���� Ŭ������ �ۼ��Ѵ�.
		// Step2. Thread Ŭ�����κ��� ��ӹ޴� public void run �޼��带 overriding �Ѵ�.
		// Step3. ���� ó���ϰ��� �ϴ� �ҽ� �ڵ带 run ���ο� �����Ѵ�.
		// Step4. ���� �Ϸ�� Ŭ������ �ν��Ͻ�ȭ �Ѵ�.
		// Step5. ������� �ν��Ͻ��κ��� start(); �޼��带 call �Ѵ�.
		
		Worker w = new Worker();
		Worker2 w2 = new Worker2();
		w.start();
		w2.start();
		
		for(int i =1; i<=10; i++) {
			System.out.println("ù��° for : " + i);
		}
		
	}
}
