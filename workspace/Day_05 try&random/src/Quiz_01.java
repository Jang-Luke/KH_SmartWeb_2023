
public class Quiz_01 {
	
	public static int myRand(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static void main(String[] args) {
		
		// 5 ~ 10 ����
		// (int)(Math.random() * (10-5+1)+5);
		// myRand(5,10); <-- 5 ~ 10 ������ ����
		
		for(int i =0; i < 20; i++) {
			System.out.print(myRand(0,9) + "\t"); 	// 0 ~ 9
			System.out.print(myRand(1,10) + "\t");	// 1 ~10
			System.out.print(myRand(20,35) + "\t");	// 20 ~ 35
			System.out.println(myRand(0,1));			// 0 or 1
			
		}
		
/*		double rand = Math.random();
		
		// 0~9 ������ ������ 
		System.out.println("0 ~ 9������ ������ : " + ((int)(rand*10)));
		// 1~10 ������ ������ 
		System.out.println("1 ~ 10������ ������ : " + ((int)(rand*10)+1));
		// 20~35������ ������
		System.out.println("20 ~ 35������ ������ : " + (int)(rand*(35-20+1)+20));
		// 0 �Ǵ� 1
		System.out.println("0�Ǵ� 1 : " + (int)(rand*2));
		*/
		
	}
}
