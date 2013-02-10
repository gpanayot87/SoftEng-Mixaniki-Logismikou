package softeng.teipir.omada60;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

public class Secretary extends JFrame {

	private JPanel contentPane;
	private JTextField textField_plate;
	private JTextField textField_year;
	private JTextField textField_engine;
	private JTextField textField_seat;
	private JTextField textField_dln;
	private JTextField textField_loc;
	private JTextField textField_fuel;
	private JTextField textField_serv;
	private JTextField textField_name;
	private JTextField textField_last;
	private JTextField textField_addr;
	private JTextField textField_age;
	private JTextField textField_dln2;
	private JTextField textField_pho;
	private JTextField textField_ssn;
	private JTextField textField_mail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secretary frame = new Secretary();
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
	public Secretary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBusInformation = new JLabel("Bus information:");
		lblBusInformation.setBounds(95, 58, 102, 18);
		contentPane.add(lblBusInformation);
		
		textField_plate = new JTextField();
		textField_plate.setText("0");
		textField_plate.setBounds(141, 87, 86, 20);
		contentPane.add(textField_plate);
		textField_plate.setColumns(10);
		
		JLabel lblLicencePlate = new JLabel("Licence Plate:");
		lblLicencePlate.setBounds(57, 90, 73, 14);
		contentPane.add(lblLicencePlate);
		
		JLabel lblYearBought = new JLabel("Year Bought:");
		lblYearBought.setBounds(57, 130, 73, 14);
		contentPane.add(lblYearBought);
		
		JLabel lblEngineCapacity = new JLabel("Engine Capacity:");
		lblEngineCapacity.setBounds(39, 168, 91, 14);
		contentPane.add(lblEngineCapacity);
		
		JLabel lblNumberOfSeats = new JLabel("Number of Seats:");
		lblNumberOfSeats.setBounds(39, 209, 91, 14);
		contentPane.add(lblNumberOfSeats);
		
		textField_year = new JTextField();
		textField_year.setText("0");
		textField_year.setColumns(10);
		textField_year.setBounds(141, 127, 86, 20);
		contentPane.add(textField_year);
		
		textField_engine = new JTextField();
		textField_engine.setToolTipText("Values in CC");
		textField_engine.setText("0");
		textField_engine.setColumns(10);
		textField_engine.setBounds(141, 165, 86, 20);
		contentPane.add(textField_engine);
		
		textField_seat = new JTextField();
		textField_seat.setText("0");
		textField_seat.setColumns(10);
		textField_seat.setBounds(141, 206, 86, 20);
		contentPane.add(textField_seat);
		
		textField_dln = new JTextField();
		textField_dln.setToolTipText("Driver's Licence Number to associate with");
		textField_dln.setText("0");
		textField_dln.setColumns(10);
		textField_dln.setBounds(424, 87, 86, 20);
		contentPane.add(textField_dln);
		
		JLabel lblDriversLicenceNumber = new JLabel("Driver's Licence Number:");
		lblDriversLicenceNumber.setToolTipText("Fill the DLN to assocciate with the bus");
		lblDriversLicenceNumber.setBounds(288, 90, 126, 14);
		contentPane.add(lblDriversLicenceNumber);
		
		JLabel lblLocationxY = new JLabel("Location [x, y]:");
		lblLocationxY.setToolTipText("");
		lblLocationxY.setBounds(288, 130, 126, 14);
		contentPane.add(lblLocationxY);
		
		JLabel lblFuel = new JLabel("Fuel:");
		lblFuel.setToolTipText("");
		lblFuel.setBounds(288, 168, 126, 14);
		contentPane.add(lblFuel);
		
		JLabel lblLastService = new JLabel("Service:");
		lblLastService.setToolTipText("");
		lblLastService.setBounds(288, 209, 126, 14);
		contentPane.add(lblLastService);
		
		textField_fuel = new JTextField();
		textField_fuel.setToolTipText("Value in Litres");
		textField_fuel.setText("0");
		textField_fuel.setColumns(10);
		textField_fuel.setBounds(424, 165, 86, 20);
		contentPane.add(textField_fuel);
		
		textField_serv = new JTextField();
		textField_serv.setToolTipText("Vehicle Status");
		textField_serv.setText("0");
		textField_serv.setColumns(10);
		textField_serv.setBounds(424, 206, 86, 20);
		contentPane.add(textField_serv);
		
		JLabel lblSecretarysInterface = new JLabel("Secretary's Interface");
		lblSecretarysInterface.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSecretarysInterface.setBounds(43, 23, 234, 24);
		contentPane.add(lblSecretarysInterface);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(421, 253, 89, 23);
		contentPane.add(btnUpdate);
		
		textField_loc = new JTextField();
		textField_loc.setToolTipText("Insert Values: Longtitude, Latitude");
		textField_loc.setText("0");
		textField_loc.setColumns(10);
		textField_loc.setBounds(424, 127, 86, 20);
		contentPane.add(textField_loc);
		
		JLabel label = new JLabel("Bus information:");
		label.setBounds(95, 313, 102, 18);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setToolTipText("Fill the DLN tAo assocciate with the bus");
		lblName.setBounds(57, 342, 126, 14);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setToolTipText("Fill the DLN to assocciate with the bus");
		lblLastName.setBounds(57, 367, 126, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setToolTipText("Fill the DLN to assocciate with the bus");
		lblAddress.setBounds(57, 392, 126, 14);
		contentPane.add(lblAddress);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setToolTipText("Fill the DLN to assocciate with the bus");
		lblAge.setBounds(57, 417, 126, 14);
		contentPane.add(lblAge);
		
		JLabel lblLicenceNumber = new JLabel("Licence Number:");
		lblLicenceNumber.setToolTipText("Fill the DLN tAo assocciate with the bus");
		lblLicenceNumber.setBounds(288, 342, 126, 14);
		contentPane.add(lblLicenceNumber);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setToolTipText("Fill the DLN tAo assocciate with the bus");
		lblPhone.setBounds(288, 367, 126, 14);
		contentPane.add(lblPhone);
		
		JLabel lblSsn = new JLabel("SSN:");
		lblSsn.setToolTipText("Social Security Number:");
		lblSsn.setBounds(288, 392, 126, 14);
		contentPane.add(lblSsn);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setToolTipText("");
		lblEmail.setBounds(288, 417, 126, 14);
		contentPane.add(lblEmail);
		
		textField_name = new JTextField();
		textField_name.setText("0");
		textField_name.setColumns(10);
		textField_name.setBounds(141, 339, 86, 20);
		contentPane.add(textField_name);
		
		textField_last = new JTextField();
		textField_last.setText("0");
		textField_last.setColumns(10);
		textField_last.setBounds(141, 364, 86, 20);
		contentPane.add(textField_last);
		
		textField_addr = new JTextField();
		textField_addr.setText("0");
		textField_addr.setColumns(10);
		textField_addr.setBounds(141, 392, 86, 20);
		contentPane.add(textField_addr);
		
		textField_age = new JTextField();
		textField_age.setText("0");
		textField_age.setColumns(10);
		textField_age.setBounds(141, 417, 86, 20);
		contentPane.add(textField_age);
		
		textField_dln2 = new JTextField();
		textField_dln2.setText("0");
		textField_dln2.setColumns(10);
		textField_dln2.setBounds(424, 339, 86, 20);
		contentPane.add(textField_dln2);
		
		textField_pho = new JTextField();
		textField_pho.setText("0");
		textField_pho.setColumns(10);
		textField_pho.setBounds(424, 364, 86, 20);
		contentPane.add(textField_pho);
		
		textField_ssn = new JTextField();
		textField_ssn.setToolTipText("Personal Insurance Number");
		textField_ssn.setText("0");
		textField_ssn.setColumns(10);
		textField_ssn.setBounds(424, 389, 86, 20);
		contentPane.add(textField_ssn);
		
		textField_mail = new JTextField();
		textField_mail.setText("0");
		textField_mail.setColumns(10);
		textField_mail.setBounds(424, 414, 86, 20);
		contentPane.add(textField_mail);
		
		JButton btnUpdate2 = new JButton("Update");
		btnUpdate2.setBounds(421, 453, 89, 23);
		contentPane.add(btnUpdate2);
	}
	static JButton btnUpdate; {
		private static class Handler implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 String pl = textField_plate.getText();
	        	 String ye = textField_year.getText();
	        	 String en = textField_engine.getText();
	        	 String se = textField_seat.getText();
	        	 String lo = textField_loc.getText();
	        	 String fu = textField_fuel.getText();
	        	 String srv = textField_serv.getText();
	        	 
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

	/*		String connectionURL = "jdbc:mysql://10.0.0.10:3306/db001";
			String username = "user001";
			String password = "test123"; To be filled by teacher */

			conn = DriverManager.getConnection(connectionURL, username,
					password);

			stmt = conn.createStatement();
					
			rs = stmt.executeQuery("select * from buses where dlc = '" +dln+"' ");
			
			while (rs.next()) {
				String plate = rs.getString("plate");
				String year = rs.getString("year");
				String eng = rs.getString("engine");
				String seat = rs.getString("seats");
				String loc = rs.getString("location");
				String fuel = rs.getString("fuel");
				String serv = rs.getString("service");
				
				String data = "insert into busses values (" + pl + ",'"
						+ ye + "'," + en + "," + se + "," + lo + "," + fu + "," + srv + ")";
				
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
		
		static JButton btnUpdate2; {
			private static class Handler implements ActionListener {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	 String name = textField_name.getText();
		        	 String last = textField_last.getText();
		        	 String addr = textField_addr.getText();
		        	 String age = textField_age.getText();
		        	 String dln2 = textField_dln2.getText();
		        	 String phone = textField_pho.getText();
		        	 String ssn = textField_ssn.getText();
		        	 String mail = textField_mail.getText();
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

		/*		String connectionURL = "jdbc:mysql://10.0.0.10:3306/db001";
				String username = "user001";
				String password = "test123"; To be filled by teacher */

				conn = DriverManager.getConnection(connectionURL, username,
						password);

				stmt = conn.createStatement();
						
				rs = stmt.executeQuery("select * from drivers ");
				
				while (rs.next()) {
					String na = rs.getString("name");
					String ls = rs.getString("last");
					String ad = rs.getString("address");
					String ag = rs.getString("age");
					String dln = rs.getString("dln");
					String ph = rs.getString("phone");
					String ssn = rs.getString("ssn");
					String ma = rs.getString("email");
					
					String data2 = "insert into drivers values (" + na + ",'"
							+ ls + "'," + ad + "," + dln + "," + ph + "," + ssn + "," + ma + ")";
					
					stmt2.executeUpdate(data2);
				
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
