
public class Quiz_05 {
	public static void main(String[] args) {


		// 1 ~ 45 ������ ������ ��ø���� �ʰ� 7���� �̾Ƽ� ����ϼ���.
		// ������ ��õ �ζ� ��ȣ �����
	/*	int [] arr = new int [7];
		int lotto;

		here:	for(int i =0; i < arr.length; i++) {
			lotto = (int)((Math.random()*45)+1);
			for(int j=0; j<arr.length; j++) {
				if(lotto==arr[j]) {
					i--;
					continue here;
				}
			}
			arr[i] = lotto;
			System.out.println("��õ �ζ� ��ȣ : " + arr[i]);
		}*/
		int[] nums = new int[45];
		for(int i =0; i<nums.length; i++) {
			nums[i]=i+1;
		}
		
		for(int i=0; i < nums.length*10; i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			
			int tmp = nums[x];
			nums[x] = nums[y];
			nums[y] = tmp;
			
			
		}
		System.out.println("��õ �ζ� ��ȣ : \t" + nums[0] + "\t"+
												nums[1] + "\t"+
		nums[2] + "\t"+
		nums[3] + "\t"+
		nums[4] + "\t"+
		nums[5] + "\t");
		System.out.println("���ʽ� ��ȣ : \t" + nums[6]);
	}
}
