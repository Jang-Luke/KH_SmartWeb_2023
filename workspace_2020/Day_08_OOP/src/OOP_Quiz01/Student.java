package OOP_Quiz01;

import java.util.Scanner;

public class Student {
	private String name;
	private int kor,eng,math;

	// Constructor - ������
	// ���� - ������� �ν��Ͻ��� �ʱⰪ�� �����ϰ� �ϱ� ���� �������� ���Ǵ� �޼���
	// ������ �޼���� ��Ÿ �ٸ� �޼����� �ٸ��� return ���� ������ ����.
	// ������ �޼���� �ٸ� �޼����� �ٸ��� method call Ÿ�̹��� ������ �� ����.
	// ��Ÿ Ư���� �Ϲ� �޼���� �����ϴ�.

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	}

	/*public Student() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		eng = Integer.parseInt(sc.nextLine());
		kor = Integer.parseInt(sc.nextLine());
		math = Integer.parseInt(sc.nextLine());	
	}*/

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	@Override
	public String toString() {
		return "Student [�̸�= "+ name +", ����=" + eng + ", ����=" + kor + ", "
				+ "����=" + math + ", �հ�="+(kor+eng+math) + 
				", ���="+((kor+eng+math)/3.0) +"]";
	}


}
