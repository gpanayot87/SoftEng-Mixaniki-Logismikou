package softeng.teipir.omada60;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblWelcomePleaseLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Bus Management System for SoftEng");
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(138, 104, 66, 18);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(138, 137, 62, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(204, 104, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblWelcomePleaseLogin = new JLabel("Welcome. Please Login.");
		lblWelcomePleaseLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWelcomePleaseLogin.setBounds(39, 75, 197, 18);
		contentPane.add(lblWelcomePleaseLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(175, 176, 89, 23);
		contentPane.add(btnLogin);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				final String UNAME = textField.getText();
			    @SuppressWarnings("deprecation")
			    final String PSW = passwordField.getText();
			    
			}
			});
			    
			    
			   
		
		
		JLabel label = new JLabel("\u0395\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03C4\u03B7\u03C2 \u03BF\u03BC\u03AC\u03B4\u03B1\u03C2 60 \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u039C\u03B7\u03C7\u03B1\u03BD\u03B9\u03BA\u03AE \u039B\u03BF\u03B3\u03B9\u03C3\u03BC\u03B9\u03BA\u03BF\u03CD 2013");
		label.setFont(new Font("Tahoma", Font.ITALIC, 8));
		label.setBounds(204, 236, 215, 14);
		contentPane.add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 135, 86, 20);
		contentPane.add(passwordField);
	}

static JButton btnLogin; {
	private static class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	 String UNAME = textField.getText();
		    @SuppressWarnings("deprecation")
		     String PSW = passwordField.getText();
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

		String connectionURL = "jdbc:mysql://10.0.0.10:3306/db001";
		String username = "user001";
		String password = "test123"; //To be filled by teacher

		conn = DriverManager.getConnection(connectionURL, username,
				password);

		stmt = conn.createStatement();
				
		rs = stmt.executeQuery("select * from users where username='" +UNAME+"', password='" +PSW+"'");
		
		while (rs.next()) {
			String usr = rs.getString("username");
			String pass = rs.getString("password");
			String idn = rs.getString("id");
		
		
		if (idn == "1") {
			
			Admin adm = new Admin();
		}
		if (idn == "2") {
		
			Secretary secr = new Secretary();
		
					}
		if (idn == "3"){
			
			Driver dvr = new Driver();
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

}
	
	
	
	
	
	
}


