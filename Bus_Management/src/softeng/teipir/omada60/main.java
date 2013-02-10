package softeng.teipir.omada60;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

public class main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(final String[] args) {
  
		Login log =  new Login();
		
		Connection conn = null;
		Statement stmt = null;
		Statement stmt2 = null;
		ResultSet rs = null;

		try {

			String connectionURL = "jdbc:mysql://10.0.0.10:3306/db001";
			String username = "user001";
			String password = "test123"; //To be filled by teacher

			conn = DriverManager.getConnection(connectionURL, username,
					password);

			stmt = conn.createStatement();
			stmt2 = conn.createStatement();

			//String ntable = "create table LastNames_a6t1 (id int, surname varchar(20), hash int)";
			//stmt.executeUpdate(ntable);
			
			rs = stmt.executeQuery("select id from users where username is '+ user + ' password is '+ pass +'");

			Login log =  new Login();
			Admin adm = new Admin();
			
			
			
			
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				

				int m = surname.length();
				int hash = (m + 10) * 2;

				String data = "insert into LastNames_a6t1 values (" + id + ",'"
						+ surname + "'," + hash + ")";
				
				stmt2.executeUpdate(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}