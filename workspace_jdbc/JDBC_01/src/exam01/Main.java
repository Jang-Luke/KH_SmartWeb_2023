package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// JDBC : Java DataBase Connectivity
		// Java ���α׷����� DBMS�� ����ϱ� ���� ���̺귯�� �� ����
		// OJDBC  JAR

		// executeQuery : SELECT
		// executeUpdate : UPDATE, DELETE, INSERT
		
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "kh";
		String dbPW = "kh";
		
		try {
			Connection con = DriverManager.getConnection(url,dbID,dbPW);
			System.out.println("���� ����");
			Statement stat = con.createStatement();
			
			System.out.println("�ű� ����� �޴��� �̸� : ");
			String name = sc.nextLine();
			
			System.out.println(name + "�޴��� ���� : ");
			int price = Integer.parseInt(sc.nextLine());
			
			System.out.println("ICE ���� ���� ('Y','N') : ");
			String isIce = sc.nextLine();
			
			
			
			String sql = 
					"insert into cafe values(cafe_seq.nextval,'"+name+"',"+price+",'"+isIce+"')";
			int result = stat.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("�Է� ����");
			}else {
				System.out.println("�Է� ����");
			}
			con.commit();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		}
	}
}






















