import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;

public class createdatabasehome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createdatabasehome frame = new createdatabasehome();
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
	public createdatabasehome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Given below are the fields and their respective datatypes for the table.");
		lblNewLabel_1.setForeground(new Color(175, 238, 238));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(26, 31, 524, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("You can consider the following fields if you want.");
		lblNewLabel_2.setForeground(new Color(175, 238, 238));
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(26, 77, 368, 19);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnFieldsNameId = new JTextPane();
		txtpnFieldsNameId.setText("FIELDS\r\nName\r\nID\r\nDOB\r\nGender\r\nDepartment\r\nContact \r\nEmail\r\n");
		txtpnFieldsNameId.setBounds(112, 131, 108, 164);
		contentPane.add(txtpnFieldsNameId);
		
		JTextPane txtpnDatatypesVarcharInt = new JTextPane();
		txtpnDatatypesVarcharInt.setText("DATATYPES\r\nVARCHAR()\r\nINT\r\nVARCHAR()\r\nVARCHAR()\r\nVARCHAR()\r\nVARCHAR()\r\nVARCHAR()");
		txtpnDatatypesVarcharInt.setBounds(220, 131, 140, 164);
		contentPane.add(txtpnDatatypesVarcharInt);
		
		JButton btnNewButton_5 = new JButton("CONTINUE");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createtable f7=new createtable();
				f7.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(193, 340, 156, 35);
		contentPane.add(btnNewButton_5);
	}
}
