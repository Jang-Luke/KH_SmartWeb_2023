package classes;

public class Silver extends Member {

	public Silver(int id, String name, double point) {
		super(id, name, point);
	}

	public double getBonus() {				// �����̾��� �������̵� ������ ä���ָ� ���ø���Ʈ
		return this.getPoint() * 0.02;		// ���� ������ ����.	
		
	}
	
	// �θ�Ŭ�����κ��� ��ӹ��� �޼��带 �����ϰ� ������ ������Ÿ���� �ٽ� �����ϸ�
	// ��ӹ��� �޼��带 ������ ȿ���� ������.
	// �߻�޼���� �������̵� �������϶� �����Ѵ�.
	
	
}
