package exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "kh";
			String pw = "kh";
			Connection con = DriverManager.getConnection(url,id,pw);	//sql �α���
			Statement stat = con.createStatement();		// sql ��������

			String sql = "SELECT * FROM DEPARTMENT";

			ResultSet rs = stat.executeQuery(sql);		//

			while(rs.next()) {	// rs.next()���� ������ (����κп��� ���� �����ü� ���⋚��)

				String dept_id = rs.getString("dept_id");	// ���̺��� ������ ��(�÷����̵�)
				String dept_title = rs.getString("dept_title");
				String location_id = rs.getString("location_id");

				System.out.println(dept_id+"\t"+dept_title+"\t"+location_id);
			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
