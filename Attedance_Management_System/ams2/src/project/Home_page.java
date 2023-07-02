package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Home_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page frame = new Home_page();
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
	public Home_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attedance_Management_System");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(29, 10, 444, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setIcon(new ImageIcon(Home_page.class.getResource("/img/Water-Drop-Blur-HD-Wallpaper.jpg")));
		lblNewLabel_1.setBounds(-1128, -706, 2056, 1340);
		contentPane.add(lblNewLabel_1);
	}
}
