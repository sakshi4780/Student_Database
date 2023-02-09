import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class homepage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage1 frame = new homepage1();
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
	public homepage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 386);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOMEPAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(31, 89, 118, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("1.Create a New Table");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(31, 142, 406, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2. Open a Existing  Table");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(28, 181, 280, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("DATABASE MANAGEMENT SYSTEM");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_5.setBounds(89, 21, 447, 43);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createdatabasehome crt=new createdatabasehome();
				crt.setVisible(true);
			}
		});
		btnNewButton.setBounds(447, 141, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OPEN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opentable edf=new opentable();
				edf.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(447, 185, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Aarti\\Database-Management-System.jpg"));
		lblNewLabel_4.setBounds(-17, 268, 848, 105);
		contentPane.add(lblNewLabel_4);
	}
}
