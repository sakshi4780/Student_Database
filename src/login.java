import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class login {

	private JFrame frame;
	private JTextField textFieldusName;
	private JPasswordField passwordField;
	private JLabel jlabelpass;
    private JButton btnlogin;
    private JLabel jlabelUsname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 450, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    jlabelUsname = new JLabel("USERNAME");
	    jlabelUsname.setForeground(new Color(245, 245, 245));
		jlabelUsname.setBounds(51, 64, 117, 14);
		jlabelUsname.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
		frame.getContentPane().add(jlabelUsname);
		
		textFieldusName = new JTextField();
		textFieldusName.setBounds(222, 55, 155, 23);
		textFieldusName.setForeground(Color.RED);
		frame.getContentPane().add(textFieldusName);
		textFieldusName.setColumns(10);
		
	    btnlogin = new JButton("LOGIN");
	    btnlogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnlogin.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent arg0) {
				String usname=textFieldusName.getText();
				String pass=passwordField.getText();
				if(usname.equals("DATABASE123") && pass.equals("sakshi@123")) { 
					JOptionPane.showMessageDialog(frame,"LOGIN SUCESSFUL!");
						homepage1 hmp= new homepage1();
						hmp.setVisible(true);
			
				
				}
				else {
					JOptionPane.showMessageDialog(frame,"incorrect password or username");
					
			}
			}
		});
		btnlogin.setBounds(159, 145, 106, 29);
		btnlogin.setBackground(new Color(240, 255, 255));
		frame.getContentPane().add(btnlogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(222, 89, 155, 23);
		frame.getContentPane().add(passwordField);
		
	    jlabelpass = new JLabel("PASSWORD");
	    jlabelpass.setForeground(new Color(240, 255, 240));
		jlabelpass.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
		jlabelpass.setBounds(51, 94, 117, 14);
		frame.getContentPane().add(jlabelpass);
	}
}
