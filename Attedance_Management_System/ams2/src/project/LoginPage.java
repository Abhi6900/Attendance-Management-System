package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Admin Login Page");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(10, 10, 297, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(10, 94, 108, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Paassword:");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(10, 158, 95, 27);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(99, 96, 222, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(99, 160, 222, 25);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
					Statement s=con.createStatement();
					String q="select * from login where username='"+textField.getText()+"'";
					ResultSet rs=s.executeQuery(q);
					String password="";
					String pass=String.valueOf(passwordField.getPassword());
					while(rs.next()) {
						password=rs.getString("password");
					}
					if(pass.equals(password)) {
						dispose();
						admin_portal ap =new admin_portal();
						ap.setVisible( true);
					}
				}	catch(Exception ae) {
					System.out.print(ae);
				}
				}
		});
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(10, 216, 108, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_1.setBounds(213, 216, 108, 27);
		contentPane.add(btnNewButton_1);
		//lblNewLabel_1.setText("");
		//lblNewLabel_2.setText("");
		
		
		JButton btnNewButton_2 = new JButton("back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage hp =new HomePage();
				hp.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_2.setBounds(422, 29, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
