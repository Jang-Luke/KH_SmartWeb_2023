package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Gold;
import classes.Member;
import classes.Ruby;
import classes.Silver;

public class Main {
	public static void main(String[] args) {
		
		
		// ���
		// ������
		// �߻�ȭ
		
		
		// Collection
		// �迭 ������ �ذ��ϱ� ���� ù ��° ���
		// 1. ���� �迭 - Vector -> ArrayList
		// 2. LinkedList 
		// 3. Hash / Tree
		
		// ȸ������ �ý���
		// ��� Ŭ���� ���� ( Silver )
		// ȸ�� ID
		// ȸ�� �̸�
		// ȸ�� ����Ʈ
		
		
		// �ϼ��� �ڵ� ������ 3����
		// �ڵ� �ߺ��� (���� ���� ������) - ��� [ IS - A ���� ]
		// �ڵ� ���յ� (���� ���� ������) - ������ 
		// ����� - Collection
		
		
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		
		
		while(true) {
			System.out.println("===ȸ�� ���� �ý���===");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� ���");
			System.out.println("0.����");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				
				manager.insert(new Silver(1001, "Tom",1000));
				manager.insert(new Silver(1002, "Jane", 2000));
				manager.insert(new Silver(1003, "Mike", 3000));
				manager.insert(new Gold(1004, "Susan", 4000));
				manager.insert(new Ruby(1005, "jung", 6000));
							
			}else if(menu==2) {

				ArrayList<Member> members = manager.getMember();
				
				System.out.println("ID\tName\tpoint\tbonus");
				
				for(Member mem : members) {
					System.out.println(mem.getId()+"\t"
										+mem.getName()+"\t"
										+mem.getPoint()+"\t"
										+mem.getBonus());
				}	// member. ������ ArrayList, members.get(i)���� Object, getId() int
				
			
			}else if(menu==0) {
				System.out.println("ȸ�� ���� ����");
				System.exit(0);
			}
		}
		
	}
}
