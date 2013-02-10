package softeng.teipir.omada60;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.swing.JButton;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField txtTableName;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setTitle("Bus Management System for SoftEng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(62, 165, 339, 121);
		contentPane.add(textPane);
		
		txtTableName = new JTextField();
		txtTableName.setBounds(220, 44, 86, 20);
		contentPane.add(txtTableName);
		txtTableName.setColumns(10);
		
		JLabel lblAdministratorsInterface = new JLabel("Administrator's Interface");
		lblAdministratorsInterface.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdministratorsInterface.setBounds(36, 11, 234, 24);
		contentPane.add(lblAdministratorsInterface);
		
		textField = new JTextField();
		textField.setBounds(220, 86, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTable = new JLabel("Table to use:");
		lblTable.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTable.setBounds(97, 47, 95, 14);
		contentPane.add(lblTable);
		
		JLabel lblQuery = new JLabel("Query:");
		lblQuery.setHorizontalAlignment(SwingConstants.TRAILING);
		lblQuery.setBounds(100, 89, 95, 14);
		contentPane.add(lblQuery);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(182, 131, 89, 23);
		contentPane.add(btnSubmit);
	
		
	
	
	
	}

	static JButton btnSubmit; {
		class Handler implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 String tb = textField.getText();
	        	 String que = textField.getText();
			    try {
		               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		            } catch (ClassNotFoundException ex) {
		                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		            }
		            try {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

		/*	String connectionURL = "jdbc:mysql://10.0.0.10:3306/db001";
			String username = "user001";
			String password = "test123"; To be filled by teacher */

			String connectionURL;
			String password;
			conn = DriverManager.getConnection(connectionURL, getName(),
					password);

			stmt = conn.createStatement();
					
			rs = stmt.executeQuery("select '" +que+"' from '" +tb+"'");
			
			
			if (tb = "busses"){
			while (rs.next()) {
				String plate = rs.getString("plate");
				String year = rs.getString("year");
				String eng = rs.getString("engine");
				String seat = rs.getString("seats");
				String loc = rs.getString("location");
				String fuel = rs.getString("fuel");
				String serv = rs.getString("service");
				String dln = rs.getString("dln");
		
			String txt = System.out.println(plate+year+eng+seat+loc+fuel+serv+dln);
			
			JTextField.setText(txt);
			
			}
			}
			if (tb == "drivers" ){
				while (rs.next()) {
					String name = rs.getString("Name");
					String last = rs.getString("Last");
					String addr = rs.getString("address");
					String age = rs.getString("age");
					String dln = rs.getString("dln");
					String pho = rs.getString("phone");
					String ssn = rs.getString("ssn");
					String mail = rs.getString("Email");
			
					String txt2 = System.out.println(name+last+addr+age+dln+pho+ssn+mail);
					JTextField.setText(txt2);
			}
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

}finally {
	return;
}
	
	
	        }

		}
	}
}
		
