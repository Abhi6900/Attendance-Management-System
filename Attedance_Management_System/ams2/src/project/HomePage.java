package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public <teacherlogin> HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Click!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginPage lp=new LoginPage ();
				lp.setVisible(true);
				//HomePage.dispose();
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(10, 115, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Click!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				teacherlogin tp=new teacherlogin();
				tp.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(162, 115, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Click!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				studentlogin sp=new studentlogin();
				sp.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(318, 115, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Attedance Management System\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(72, 10, 354, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN\r\n");
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(24, 79, 85, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER");
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(162, 79, 100, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("STUDENT");
		lblNewLabel_3.setFont(new Font("Trajan Pro", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(303, 79, 100, 26);
		contentPane.add(lblNewLabel_3);
	}

}
