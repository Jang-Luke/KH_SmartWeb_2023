package custom;

// Ŭ������ �� ���� ����� ���
// �������� - ���������� public, protected, package, private
// �ܺο� ���� �� �ʿ䰡 ���� ������ private Ű����� ���ܼ�
// Ŭ���� �������� �ǵ���� �������� Ŭ���� ����� �����ϰ� ����� ���
// Ŭ���� �����ڿ��� �������� ������ �� ����.
// Ŭ���� ������� ���Ǽ����� ������ ��ħ.
// package : �ڽŰ� ���� ��Ű�� �������� ����.

public class TV {
	String brand;			// ���������ڸ� ���������ָ� �⺻ package ����
	private int price;
	private int weight;
	private int channel;
	// ���赵���� �Ӽ��� �����ϴ� ���� - ��� ���� ( Member Field )

	public void setChannel(int cha) {	// main�� channel�� �ѵ� ����.									
		if(cha > 0 ) {					// method�� ���� �Ǻ� ����
			channel = cha;
		}
	}

	public int getChannel() {	
		return channel;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
			this.brand = brand;	
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPirce() {
		return price;
	}

	public void setPirce(int pirce) {
		this.price = pirce;
	}

	void powerON() {}
	void powerOFF() {}
	// Member Method


	// Constructor


	// Nested Class


}

// public : �������� ���ٰ���
// private : 

