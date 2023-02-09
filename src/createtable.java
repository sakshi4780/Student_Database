import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class createtable extends JFrame {

	private JPanel contentPane;
	private JTextField tablename;
	private JTextField t3;
	private JTextField t2;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	 private JComboBox comboBox_d6;
	 private JComboBox comboBox_d5;
	 private JComboBox comboBox_d4;
	 private JComboBox comboBox_d3;
	 private JComboBox comboBox_d2;
	 private JComboBox comboBox_d1;
	 JFrame frame;
	 private JLabel lb8;
	 private JLabel lb9;
	 private JLabel lb10;
	 private JTextField t8;
	 private JTextField t9;
	 private JTextField t10;
	 private JComboBox comboBox_d7;
	 private JComboBox comboBox_d8;
	 private JComboBox comboBox_d9;
	 private JTextField fno;
	 private JLabel lblNewLabel_2;
	 private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createtable frame = new createtable();
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
	public createtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(-19, 0, 924, 499);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(165, 42, 42));
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel showitem1 = new JLabel(" FIELD1 is already selected as ID with Datatype int");
		showitem1.setBounds(49, 72, 421, 17);
		showitem1.setForeground(new Color(245, 222, 179));
		showitem1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(showitem1);
		
		JTextArea txtrNoteChooseThe = new JTextArea();
		txtrNoteChooseThe.setBounds(20, 432, 904, 22);
		txtrNoteChooseThe.setText("NOTE: Enter the name of the fields in Textboxes and choose respective datatypes from the ComboBox present infront of each field. ");
		txtrNoteChooseThe.setFont(new Font("Monospaced", Font.PLAIN, 12));
		contentPane_1.add(txtrNoteChooseThe);
		
		JLabel lblNewLabel_1 = new JLabel("TABLE NAME");
		lblNewLabel_1.setBounds(50, 41, 92, 20);
		lblNewLabel_1.setForeground(new Color(245, 222, 179));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane_1.add(lblNewLabel_1);
		
	
		
		
		tablename = new JTextField();
		tablename.setBounds(150, 41, 170, 20);
		tablename.setColumns(10);
		contentPane_1.add(tablename);
		
		 comboBox_d1 = new JComboBox();
		comboBox_d1.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d1.setBounds(309, 114, 105, 20);
		contentPane_1.add(comboBox_d1);
		comboBox_d1.setVisible(false);
		
		 comboBox_d2 = new JComboBox();
		comboBox_d2.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d2.setBounds(309, 160, 105, 20);
		contentPane_1.add(comboBox_d2);
		comboBox_d2.setVisible(false);
		
		 comboBox_d3 = new JComboBox();
		comboBox_d3.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d3.setBounds(309, 212, 105, 20);
		contentPane_1.add(comboBox_d3);
		comboBox_d3.setVisible(false);

		 comboBox_d4 = new JComboBox();
		comboBox_d4.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d4.setBounds(309, 263, 105, 20);
		contentPane_1.add(comboBox_d4);
		comboBox_d4.setVisible(false);

		
	    comboBox_d5 = new JComboBox();
		comboBox_d5.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d5.setBounds(309, 318, 105, 20);
		contentPane_1.add(comboBox_d5);
		comboBox_d5.setVisible(false);

		
		 comboBox_d6 = new JComboBox();
		comboBox_d6.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d6.setBounds(771, 114, 105, 20);
		contentPane_1.add(comboBox_d6);
		comboBox_d6.setVisible(false);

		
		comboBox_d7 = new JComboBox();
		comboBox_d7.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d7.setBounds(771, 160, 105, 20);
		contentPane_1.add(comboBox_d7);
		comboBox_d7.setVisible(false);

		
		comboBox_d8 = new JComboBox();
		comboBox_d8.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d8.setBounds(771, 212, 105, 20);
		contentPane_1.add(comboBox_d8);
		comboBox_d8.setVisible(false);

		
		comboBox_d9 = new JComboBox();
		comboBox_d9.setModel(new DefaultComboBoxModel(new String[] {"INT", "VARCHAR(50)", "DECIMAL()", "BOOLEAN"}));
		comboBox_d9.setBounds(771, 260, 105, 20);
		contentPane_1.add(comboBox_d9);
		comboBox_d9.setVisible(false);

		
	
		
		
		fno = new JTextField();
		fno.setBounds(461, 41, 128, 20);
		contentPane_1.add(fno);
		fno.setColumns(10);
		
		
		t3 = new JTextField();
		t3.setBounds(160, 160, 139, 20);
		t3.setColumns(10);
		contentPane_1.add(t3);
		t3.setVisible(false);
		
		t2 = new JTextField();
		t2.setBounds(160, 114, 139, 21);
		t2.setColumns(10);
		contentPane_1.add(t2);
		t2.setVisible(false);
		
		t4 = new JTextField();
		t4.setBounds(160, 212, 139, 20);
		t4.setColumns(10);
		contentPane_1.add(t4);
		t4.setVisible(false);
		
		
		t5 = new JTextField();
		t5.setBounds(160, 263, 139, 20);
		contentPane_1.add(t5);
		t5.setColumns(10);
		t5.setVisible(false);
		
		t6 = new JTextField();
		t6.setBounds(160, 318, 139, 20);
		contentPane_1.add(t6);
		t6.setColumns(10);
		t6.setVisible(false);
		
		t7 = new JTextField();
		t7.setBounds(622, 114, 139, 20);
		contentPane_1.add(t7);
		t7.setColumns(10);
		t7.setVisible(false);
		
		t8 = new JTextField();
		t8.setBounds(622, 159, 139, 23);
		contentPane_1.add(t8);
		t8.setColumns(10);
		t8.setVisible(false);
		
		t9 = new JTextField();
		t9.setBounds(622, 212, 139, 20);
		contentPane_1.add(t9);
		t9.setColumns(10);
		t9.setVisible(false);
		
		t10 = new JTextField();
		t10.setBounds(622, 260, 139, 20);
		contentPane_1.add(t10);
		t10.setColumns(10);
		t10.setVisible(false);

		JLabel lb2 = new JLabel("FIELD2");
		lb2.setBounds(50, 114, 51, 17);
		lb2.setForeground(new Color(245, 222, 179));
		lb2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(lb2);
		lb2.setVisible(false);
		
		JLabel lb3 = new JLabel("FIELD3");
		lb3.setBounds(50, 160, 51, 17);
		lb3.setForeground(new Color(245, 222, 179));
		lb3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(lb3);
		lb3.setVisible(false);
		
		JLabel lb4 = new JLabel("FIELD4");
		lb4.setBounds(50, 212, 51, 17);
		lb4.setForeground(new Color(245, 222, 179));
		lb4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(lb4);
		lb4.setVisible(false);
		
		JLabel lb5 = new JLabel("FIELD5");
		lb5.setBounds(50, 263, 51, 17);
		lb5.setForeground(new Color(245, 222, 179));
		lb5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(lb5);
		lb5.setVisible(false);
		
		JLabel lb6 = new JLabel("FIELD6");
		lb6.setBounds(53, 318, 51, 17);
		lb6.setForeground(new Color(245, 222, 179));
		lb6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(lb6);
		lb6.setVisible(false);
		
		JLabel lb7 = new JLabel("FIELD7");
		lb7.setBounds(522, 114, 51, 17);
		lb7.setForeground(new Color(245, 222, 179));
		lb7.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		contentPane_1.add(lb7);
		lb7.setVisible(false);
		
		
		
		lb8 = new JLabel("FIELD8");
		lb8.setForeground(new Color(245, 222, 179));
		lb8.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		lb8.setBounds(522, 160, 51, 17);
		contentPane_1.add(lb8);
		lb8.setVisible(false);
		
		
		lb9 = new JLabel("FIELD9");
		lb9.setForeground(new Color(245, 222, 179));
		lb9.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		lb9.setBounds(522, 212, 51, 17);
		contentPane_1.add(lb9);
		lb9.setVisible(false);
		
		lb10 = new JLabel("FIELD10");
		lb10.setForeground(new Color(245, 222, 179));
		lb10.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		lb10.setBounds(522, 263, 67, 17);
		contentPane_1.add(lb10);
		lb10.setVisible(false);
		lblNewLabel_2 = new JLabel("No of Fields");
		lblNewLabel_2.setForeground(new Color(245, 222, 179));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(366, 41, 92, 20);
		contentPane_1.add(lblNewLabel_2);
		
	
	
	
		
		btnNewButton_1 = new JButton("OK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int txt1=Integer.parseInt(fno.getText());
				if(txt1==2) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					
				}
				else if(txt1==3) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
				}
				else if(txt1==4) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					
				}
				else if(txt1==5) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					t5.setVisible(true);
					comboBox_d4.setVisible(true);
					lb5.setVisible(true);
					
				}
				else if(txt1==6) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					t5.setVisible(true);
					comboBox_d4.setVisible(true);
					lb5.setVisible(true);
					
					t6.setVisible(true);
					comboBox_d5.setVisible(true);
					lb6.setVisible(true);
					
				}
				else if(txt1==7) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					t5.setVisible(true);
					comboBox_d4.setVisible(true);
					lb5.setVisible(true);
					
					t6.setVisible(true);
					comboBox_d5.setVisible(true);
					lb6.setVisible(true);
					
					t7.setVisible(true);
					comboBox_d6.setVisible(true);
					lb7.setVisible(true);
					
				}
				else if(txt1==8) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					t5.setVisible(true);
					comboBox_d4.setVisible(true);
					lb5.setVisible(true);
					
					t6.setVisible(true);
					comboBox_d5.setVisible(true);
					lb6.setVisible(true);
					
					t7.setVisible(true);
					comboBox_d6.setVisible(true);
					lb7.setVisible(true);
					
					t8.setVisible(true);
					comboBox_d7.setVisible(true);
					lb8.setVisible(true);
					
				}
				else if(txt1==9) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					t5.setVisible(true);
					comboBox_d4.setVisible(true);
					lb5.setVisible(true);
					
					t6.setVisible(true);
					comboBox_d5.setVisible(true);
					lb6.setVisible(true);
					
					t7.setVisible(true);
					comboBox_d6.setVisible(true);
					lb7.setVisible(true);
					
					t8.setVisible(true);
					comboBox_d7.setVisible(true);
					lb8.setVisible(true);
					t9.setVisible(true);
					comboBox_d8.setVisible(true);
					lb9.setVisible(true);
					
				}
				else if(txt1==10) {
					t2.setVisible(true);
					comboBox_d1.setVisible(true);
					lb2.setVisible(true);
					t3.setVisible(true);
					comboBox_d2.setVisible(true);
					lb3.setVisible(true);
					
					t4.setVisible(true);
					comboBox_d3.setVisible(true);
					lb4.setVisible(true);
					t5.setVisible(true);
					comboBox_d4.setVisible(true);
					lb5.setVisible(true);
					
					t6.setVisible(true);
					comboBox_d5.setVisible(true);
					lb6.setVisible(true);
					
					t7.setVisible(true);
					comboBox_d6.setVisible(true);
					lb7.setVisible(true);
					
					t8.setVisible(true);
					comboBox_d7.setVisible(true);
					lb8.setVisible(true);
					t9.setVisible(true);
					comboBox_d8.setVisible(true);
					lb9.setVisible(true);
					t10.setVisible(true);
					comboBox_d9.setVisible(true);
					lb10.setVisible(true);
					
				}
				else if(txt1>10) {
					
					JOptionPane.showMessageDialog(frame,"This is mini Database so no of field should be between 2-10!");
				}
				else if(txt1<=1) {
					JOptionPane.showMessageDialog(frame,"Must have atleast two fields!");
				}
				

				
			}
		});
		btnNewButton_1.setBounds(599, 40, 67, 23);
		contentPane_1.add(btnNewButton_1);
		
		
		
		JButton btnNewButton = new JButton("CREATE TABLE");
		btnNewButton.setBounds(50, 367, 139, 36);
		contentPane_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String f1="ID";
                int txt2=Integer.parseInt(fno.getText());
                String name=tablename.getText();
				
				String f2=t2.getText().toString();
			    String df2=comboBox_d1.getSelectedItem().toString();
				String f3=t3.getText().toString();
				String df3=comboBox_d2.getSelectedItem().toString();
				String f4=t4.getText().toString();
				String df4=comboBox_d3.getSelectedItem().toString();
				String f5=t5.getText().toString();
			    String df5=comboBox_d4.getSelectedItem().toString();
			    String f6=t6.getText().toString();
			    String df6=comboBox_d5.getSelectedItem().toString();
			    String f7=t7.getText().toString();
			    String df7=comboBox_d6.getSelectedItem().toString();
			    String f8=t8.getText().toString();
			    String df8=comboBox_d7.getSelectedItem().toString();
			    String f9=t9.getText().toString();
			    String df9=comboBox_d8.getSelectedItem().toString();
			    String f10=t10.getText().toString();
			    String df10=comboBox_d9.getSelectedItem().toString();

				try {
		    		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		    		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sakshi@123");
		    		Statement smt=cn.createStatement();
		    		if(txt2==2) {
		    			String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");
		    		}
		    		
		    		else if(txt2==3) {
		    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+")";
		    		smt.executeLargeUpdate(q);
		    		
		    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		
		    		else if(txt2==4) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		else if(txt2==5) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+","+f5+" "+df5+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		else if(txt2==6) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+","+f5+" "+df5+","+f6+" "+df6+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		else if(txt2==7) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+","+f5+" "+df5+","+f6+" "+df6+","+f7+" "+df7+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		else if(txt2==8) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+","+f5+" "+df5+","+f6+" "+df6+","+f7+" "+df7+","+f8+" "+df8+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		else if(txt2==9) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+","+f5+" "+df5+","+f6+" "+df6+","+f7+" "+df7+","+f8+" "+df8+","+f9+" "+df9+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		else if(txt2==10) {
			    		String q="create table "+name+"("+f1+" INT ,"+f2+"  "+df2+","+f3+"  "+df3+","+f4+" "+df4+","+f5+" "+df5+","+f6+" "+df6+","+f7+" "+df7+","+f8+" "+df8+","+f9+" "+df9+","+f10+" "+df10+")";
			    		smt.executeLargeUpdate(q);
			    		
			    		JOptionPane.showMessageDialog(frame,"Table created sucessfully!");}
		    		
		    		
		    		cn.close();
		    		
		    	}
		  	     catch(Exception e1) {
		  	    	 System.out.println(e1.getMessage());
		  	    	JOptionPane.showMessageDialog(frame,"ERROR!");
		  	     }
				
		  	     
			}
		});
		
		JButton btnNewButton_2 = new JButton("EDIT TABLE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opentable ed7=new opentable();
				ed7.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(275, 367, 139, 36);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("NEW TABLE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createtable fn=new createtable();
				fn.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(508, 367, 128, 36);
		contentPane_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("HOME PAGE");
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				homepage1 hm=new homepage1();
				hm.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(716, 367, 120, 36);
		contentPane_1.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("CREATE TABLE");
		lblNewLabel.setForeground(new Color(255, 222, 173));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		lblNewLabel.setBounds(365, 11, 432, 23);
		contentPane_1.add(lblNewLabel);
	}
}
