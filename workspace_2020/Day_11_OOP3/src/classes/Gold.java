package classes;

public class Gold extends Member{

	public Gold(int id, String name, double point) {
		super(id, name, point);
	} 	
	
	public double getBonus() {
		return this.getPoint()*0.04;
	}
	// extends  ���
	// super �θ�Ŭ����
	// derived �ڽ�Ŭ����
	
	


}
