package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("���̺귯���� ã���� �����ϴ�.");
			System.exit(0);
		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="kh";
		String pw ="kh";
		
		try {
			Connection con = DriverManager.getConnection(url,id,pw);
			
			Statement stat = con.createStatement();
			
			String sql ="UPDATE CAFE SET PRICE=5000 WHERE NAME='Americano'";
			
			int result = stat.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("������Ʈ ����");
			}else {
				System.out.println("������Ʈ ����");
			}
			
			con.commit();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		}
		
	}
}
