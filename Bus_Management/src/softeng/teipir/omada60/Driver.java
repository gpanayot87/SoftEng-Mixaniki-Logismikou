package softeng.teipir.omada60;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;

public class Driver extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver frame = new Driver();
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
	public Driver() {
		setTitle("Bus Management System for SoftEng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDriversLicenceNumber = new JLabel("Driver's Licence Number:");
		lblDriversLicenceNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDriversLicenceNumber.setBounds(50, 53, 139, 18);
		contentPane.add(lblDriversLicenceNumber);

		textField = new JTextField();
		textField.setBounds(199, 52, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(50, 122, 319, 102);
		contentPane.add(textPane);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(163, 88, 89, 23);
		contentPane.add(btnSubmit);

		JLabel lblDriversInterface = new JLabel("Driver's Interface");
		lblDriversInterface.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDriversInterface.setBounds(36, 11, 234, 24);
		contentPane.add(lblDriversInterface);
	}

	static JButton btnSubmit;
	{
		class Handler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String dln = textField.getText();

				try {
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				} catch (ClassNotFoundException ex) {
					Logger.getLogger(MainClass.class.getName()).log(
							Level.SEVERE, null, ex);
				}
				try {

					Connection conn = null;
					Statement stmt = null;
					ResultSet rs = null;

					try {

						String connectionURL = "jdbc:mysql://10.0.0.10:3306/db001";
						String username = "user001";
						String password = "test123"; // To be filled by teacher

						conn = DriverManager.getConnection(connectionURL,
								username, password);

						stmt = conn.createStatement();

						rs = stmt
								.executeQuery("select * from buses where dlc = '"
										+ dln + "' ");

						while (rs.next()) {
							String plate = rs.getString("plate");
							String year = rs.getString("year");
							String eng = rs.getString("engine");
							String seat = rs.getString("seats");
							String loc = rs.getString("location");
							String fuel = rs.getString("fuel");
							String serv = rs.getString("service");

							String txt = System.out.println(plate + year + eng
									+ seat + loc + fuel + serv);
							JTextField.setText(txt);

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
							} finally {
								return;
							}

					}
				} finally {
					return;
				}
			}

			public void actionPerformed1(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		}
	}
}
