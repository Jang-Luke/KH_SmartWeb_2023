package custom;

public class Car {
	
	// this : (�ڱ���������)
	// Ŭ������ �������� �ν��Ͻ��� �����Ǹ� , Ŭ���� ���ο��� �ν��Ͻ� �ּҸ� �˼� �ְ�
	// �ڹٿ� ���� �̸� �غ�� ����ʵ�.(this)
	
	private String model;	// �޸� ��ġ�󿡼� �ٸ��⶧���� ����x
	private String color;	// �Ű� ������ heap, set�� stack
	private int price;		// this�� 
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}



//model = model �� �Ű������� set���� �򰥸��� �ʱ�����
