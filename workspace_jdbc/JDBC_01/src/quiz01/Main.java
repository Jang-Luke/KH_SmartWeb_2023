package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		
		// employee ���̺���, ���, �����, �޿��� ������ ����ϴ� �ڵ带 �ۼ�
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id ="kh";
			String pw ="kh";
			Connection con = DriverManager.getConnection(url,id,pw);
			Statement stat = con.createStatement();
			
			String sql ="SELECT * FROM EMPLOYEE";
			
			ResultSet rs = stat.executeQuery(sql);
			
			
			System.out.println("���\t�����\t�޿�");
			while(rs.next()) {
				String emp_id = rs.getString("EMP_ID");
				String emp_name = rs.getString("EMP_NAME");
				int salary = rs.getInt("salary");

				System.out.println(emp_id+"\t"+emp_name+"\t"+salary);	
			}	
			con.close();
			
		} catch (Exception e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
		
	}
}
