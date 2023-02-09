import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class opentable extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField t5;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t6;
	private JTextField t7;
	private JTextField t1;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JLabel column10;
	private JLabel column9;
	private JLabel column8;
	private JLabel column7;
	private JLabel column6;
	private JLabel column5;
	private JLabel column4;
	private JLabel column3;
	private JLabel column2;
	private JLabel column1;
	String cnam1;
	String cnam2;
	String cnam3;
	String cnam4;
	String cnam5;
	String cnam6;
	String cnam7;
	String cnam8;
	String cnam9;
	String cnam10;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
	JLabel l9;
	JLabel l10;
	private JTextField ts1;
	private JTextField ts2;
	private JTextField ts3;
	private JTextField ts4;
	private JTextField ts5;
	private JTextField ts6;
	private JTextField ts7;
	private JTextField ts8;
	private JTextField ts9;
	private JTextField ts10;
	private JTable table;
	JPanel panel;
	JFrame frame;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_6;
	
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					opentable frame = new opentable();
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
	public opentable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(95, 158, 160));
		contentPane_1.setBounds(0, 0, 896, 617);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("ENTER TABLE NAME");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(22, 52, 159, 14);
		contentPane_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(191, 51, 151, 22);
		contentPane_1.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Fields are.....");
		lblNewLabel_1.setForeground(new Color(255, 250, 205));
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(22, 96, 114, 14);
		contentPane_1.add(lblNewLabel_1);
		
		column1 = new JLabel("Field1 ");
		column1.setForeground(new Color(250, 250, 210));
		column1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column1.setBackground(new Color(222, 184, 135));
		column1.setBounds(22, 140, 79, 29);
		contentPane_1.add(column1);
		column1.setVisible(false);
		
		column2 = new JLabel("Field2");
		column2.setForeground(new Color(250, 250, 210));
		column2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column2.setBounds(22, 180, 130, 22);
		contentPane_1.add(column2);
		column2.setVisible(false);
		
		column3 = new JLabel("Field3");
		column3.setForeground(new Color(250, 250, 210));
		column3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column3.setBackground(SystemColor.menu);
		column3.setBounds(22, 217, 130, 22);
		contentPane_1.add(column3);
		column3.setVisible(false);
		
		column4 = new JLabel("Field4");
		column4.setForeground(new Color(250, 250, 210));
		column4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column4.setBounds(10, 250, 136, 22);
		contentPane_1.add(column4);
		column4.setVisible(false);
		
		column5 = new JLabel("Field5");
		column5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column5.setForeground(new Color(255, 255, 204));
		column5.setBounds(22, 295, 130, 22);
		contentPane_1.add(column5);
		column5.setVisible(false);
		
		column6 = new JLabel("Field6");
		column6.setForeground(new Color(255, 255, 204));
		column6.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column6.setBounds(22, 331, 130, 22);
		contentPane_1.add(column6);
		column6.setVisible(false);
		
	    column7 = new JLabel("Field7");
		column7.setForeground(new Color(255, 255, 204));
		column7.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		column7.setBounds(22, 368, 130, 19);
		contentPane_1.add(column7);
		column7.setVisible(false);
	
		 column8 = new JLabel("Field8");
		 column8.setForeground(new Color(250, 250, 210));
		 column8.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		 column8.setBackground(SystemColor.menu);
		 column8.setBounds(370, 140, 130, 29);
		 contentPane_1.add(column8);
		 column8.setVisible(false);
		 
		 column9 = new JLabel("Field9");
		 column9.setForeground(new Color(250, 250, 210));
		 column9.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		 column9.setBackground(SystemColor.menu);
		 column9.setBounds(370, 180, 130, 22);
		 contentPane_1.add(column9);
		 column9.setVisible(false);
		 
		 column10 = new JLabel("Field10");
		 column10.setForeground(new Color(250, 250, 210));
		 column10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		 column10.setBackground(SystemColor.menu);
		 column10.setBounds(370, 219, 130, 20);
		 contentPane_1.add(column10);
		 column10.setVisible(false);
	
		
		t1 = new JTextField();
		t1.setBounds(162, 144, 180, 20);
		contentPane_1.add(t1);
		t1.setColumns(10);
		t1.setVisible(false);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(162, 177, 180, 20);
		contentPane_1.add(t2);
		t2.setVisible(false);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(162, 214, 180, 20);
		contentPane_1.add(t3);
		t3.setVisible(false);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(162, 253, 180, 20);
		contentPane_1.add(t4);
		t4.setVisible(false);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(162, 294, 180, 20);
		contentPane_1.add(t5);
		t5.setVisible(false);
		
		t6 = new JTextField();
		t6.setBounds(162, 330, 180, 22);
		contentPane_1.add(t6);
		t6.setColumns(10);
		t6.setVisible(false);
		
		t7 = new JTextField();
		t7.setBounds(162, 367, 180, 20);
		contentPane_1.add(t7);
		t7.setColumns(10);
		t7.setVisible(false);
		
		 t8 = new JTextField();
		 t8.setBounds(510, 139, 159, 20);
		 contentPane_1.add(t8);
		 t8.setColumns(10);
		 t8.setVisible(false);
		 
		 t9 = new JTextField();
		 t9.setBounds(510, 179, 159, 20);
		 contentPane_1.add(t9);
		 t9.setColumns(10);
		 t9.setVisible(false);
		 
		 t10 = new JTextField();
		 t10.setBounds(510, 211, 159, 20);
		 contentPane_1.add(t10);
		 t10.setColumns(10);
		 t10.setVisible(false);
			
     	panel = new JPanel();
		panel.setBounds(356, 265, 518, 117);
		contentPane_1.add(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		
		l1 = new JLabel("New label");
		l1.setBounds(10, 17, 68, 14);
		panel.add(l1);
		l1.setVisible(false);
		
		l2 = new JLabel("New label");
		l2.setBounds(10, 42, 68, 14);
		panel.add(l2);
		l2.setVisible(false);
		
		l3 = new JLabel("New label");
		l3.setBounds(10, 67, 68, 14);
		panel.add(l3);
		l3.setVisible(false);
		
		l4 = new JLabel("New label");
		l4.setBounds(10, 92, 68, 14);
		panel.add(l4);
		l4.setVisible(false);
		 
		l5 = new JLabel("New label");
		l5.setBounds(192, 17, 68, 14);
		panel.add(l5);
		l5.setVisible(false);
		
		l6 = new JLabel("New label");
		l6.setBounds(192, 42, 68, 14);
		panel.add(l6);
		l6.setVisible(false);
		
		l7 = new JLabel("New label");
		l7.setBounds(192, 67, 68, 14);
		panel.add(l7);
		l7.setVisible(false);
		
	    l8 = new JLabel("New label");
		l8.setBounds(192, 92, 46, 14);
		panel.add(l8);
		l8.setVisible(false);
		
		l9 = new JLabel("New label");
		l9.setBounds(354, 17, 46, 14);
		panel.add(l9);
		l9.setVisible(false);
		 
		l10 = new JLabel("New label");
		l10.setBounds(354, 42, 46, 14);
		panel.add(l10);
		l10.setVisible(false);
		
		ts1 = new JTextField();
		ts1.setBounds(76, 14, 86, 20);
		panel.add(ts1);
		ts1.setColumns(10);
		ts1.setVisible(false);
		
		ts2 = new JTextField();
		ts2.setBounds(76, 39, 86, 20);
		panel.add(ts2);
		ts2.setColumns(10);
		ts2.setVisible(false);
		
		ts3 = new JTextField();
		ts3.setBounds(76, 64, 86, 20);
		panel.add(ts3);
		ts3.setColumns(10);
		ts3.setVisible(false);
		
		ts4 = new JTextField();
		ts4.setBounds(76, 89, 86, 20);
		panel.add(ts4);
		ts4.setColumns(10);
		ts4.setVisible(false);
		
		ts5 = new JTextField();
		ts5.setBounds(258, 14, 86, 20);
		panel.add(ts5);
		ts5.setColumns(10);
		ts5.setVisible(false);
		
		ts6 = new JTextField();
		ts6.setBounds(258, 39, 86, 20);
		panel.add(ts6);
		ts6.setColumns(10);
		ts6.setVisible(false);
		
		ts7 = new JTextField();
		ts7.setBounds(258, 64, 86, 20);
		panel.add(ts7);
		ts7.setColumns(10);
		ts7.setVisible(false);
		
	    ts8 = new JTextField();
		ts8.setBounds(258, 92, 86, 20);
		panel.add(ts8);
		ts8.setColumns(10);
		ts8.setVisible(false);
		 
		ts9 = new JTextField();
		ts9.setBounds(426, 14, 86, 20);
		panel.add(ts9);
		ts9.setColumns(10);
		ts9.setVisible(false);
		  
		ts10 = new JTextField();
		ts10.setBounds(426, 39, 86, 20);
		panel.add(ts10);
		ts10.setColumns(10);
		ts10.setVisible(false);
		 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 438, 809, 165);
		contentPane_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(table);
		
		 
		
			JButton btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String txt=textField.getText();
					try {
						
			    		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			    		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sakshi@123");
			    		Statement smt=cn.createStatement();
			    		String q="SELECT * FROM "+txt+"";
			    		ResultSet rs=smt.executeQuery(q);
			    		ResultSetMetaData rst=(ResultSetMetaData) rs.getMetaData();
			    		int cno=rst.getColumnCount();
			    		if(cno==9) {
			    			
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		 cnam3=rst.getColumnName(3);
			    		 cnam4=rst.getColumnName(4);
			    		 cnam5=rst.getColumnName(5);
			    		 cnam6=rst.getColumnName(6);
			    		 cnam7=rst.getColumnName(7);
			    		 cnam8=rst.getColumnName(8);
			    		 cnam9=rst.getColumnName(9);
			    		DefaultTableModel model=new DefaultTableModel();
			    		column1.setVisible(true);
			    		column2.setVisible(true);
			    		column3.setVisible(true);
			    		column4.setVisible(true);
			    		column5.setVisible(true);
			    		column6.setVisible(true);
			    		column7.setVisible(true);
			    		column8.setVisible(true);
			    		column9.setVisible(true);
			    		
			    		t1.setVisible(true);
			    		t2.setVisible(true);
			    		t3.setVisible(true);
			    		t4.setVisible(true);
			    		t5.setVisible(true);
			    		t6.setVisible(true);
			    		t7.setVisible(true);
			    		t8.setVisible(true);
			    		t9.setVisible(true);
			    		
			    		
			    		
			    		column1.setText(cnam1);
			    		column2.setText(cnam2);
			    		column3.setText(cnam3);
			    		column4.setText(cnam4);
			    		column5.setText(cnam5);
			    		column6.setText(cnam6);
			    		column7.setText(cnam7);
			    		column8.setText(cnam8);
			    		column9.setText(cnam9);
			    	    
			    	    table = new JTable();
			    		table.setModel(new DefaultTableModel(
			    			new Object[][] {
			    			},
			    			new String[] {"","","","","","","","","",
			    				
			    			}
			    		));
			    		scrollPane.setViewportView(table);
			    		
			    		JTableHeader th=table.getTableHeader();
			    		TableColumnModel tcm=th.getColumnModel();
			    		TableColumn tc=tcm.getColumn(0);
			    		 tc.setHeaderValue(cnam1);
			    		 tc=tcm.getColumn(1);
			    		 tc.setHeaderValue(cnam2);
			    		 tc=tcm.getColumn(2);
			    		 tc.setHeaderValue(cnam3);
			    	     tc=tcm.getColumn(3);
			    	     tc.setHeaderValue(cnam4);
			    		 tc=tcm.getColumn(4);
			    		 tc.setHeaderValue(cnam5);
			    		 tc=tcm.getColumn(5);
			    		 tc.setHeaderValue(cnam6);
			    		 tc=tcm.getColumn(6);
			    		 tc.setHeaderValue(cnam7);
			    		 tc=tcm.getColumn(7);
			    		 tc.setHeaderValue(cnam8);
			    		 tc=tcm.getColumn(8);
			    		 tc.setHeaderValue(cnam9);
			    		 
			    		 
			    		
			    		
			    		th.repaint();
			    		while(rs.next()) {
			    			model.addRow(new Object[] {
			    					rs.getString(cnam1),
			    					rs.getString(cnam2),
			    					rs.getString(cnam3),
			    					rs.getString(cnam4),
			    					rs.getString(cnam5),
			    					rs.getString(cnam6),
			    					rs.getString(cnam7),
			    					rs.getString(cnam8),
			    					rs.getString(cnam9),
			    					
			    			});
			    		}
			    		
			    		JOptionPane.showMessageDialog(frame,"Table selected!");
			    		rs.close();
			    		cn.close();
			    		}
			    		else if(cno==10) {
			    			cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 cnam9=rst.getColumnName(9);
				    		 cnam10=rst.getColumnName(10);
				    		DefaultTableModel model=new DefaultTableModel();
				    		column1.setVisible(true);
				    		column2.setVisible(true);
				    		column3.setVisible(true);
				    		column4.setVisible(true);
				    		column5.setVisible(true);
				    		column6.setVisible(true);
				    		column7.setVisible(true);
				    		column8.setVisible(true);
				    		column9.setVisible(true);
				    		column10.setVisible(true);
				    		t1.setVisible(true);
				    		t2.setVisible(true);
				    		t3.setVisible(true);
				    		t4.setVisible(true);
				    		t5.setVisible(true);
				    		t6.setVisible(true);
				    		t7.setVisible(true);
				    		t8.setVisible(true);
				    		t9.setVisible(true);
				    		t10.setVisible(true);
				    		
				    		
				    		column1.setText(cnam1);
				    		column2.setText(cnam2);
				    		column3.setText(cnam3);
				    		column4.setText(cnam4);
				    		column5.setText(cnam5);
				    		column6.setText(cnam6);
				    		column7.setText(cnam7);
				    		column8.setText(cnam8);
				    		column9.setText(cnam9);
				    	    column10.setText(cnam10);
				    	    table = new JTable();
				    		table.setModel(new DefaultTableModel(
				    			new Object[][] {
				    			},
				    			new String[] {"","","","","","","","","","",
				    				
				    			}
				    		));
				    		scrollPane.setViewportView(table);
				    		
				    		JTableHeader th=table.getTableHeader();
				    		TableColumnModel tcm=th.getColumnModel();
				    		TableColumn tc=tcm.getColumn(0);
				    		 tc.setHeaderValue(cnam1);
				    		 tc=tcm.getColumn(1);
				    		 tc.setHeaderValue(cnam2);
				    		 tc=tcm.getColumn(2);
				    		 tc.setHeaderValue(cnam3);
				    	     tc=tcm.getColumn(3);
				    	     tc.setHeaderValue(cnam4);
				    		 tc=tcm.getColumn(4);
				    		 tc.setHeaderValue(cnam5);
				    		 tc=tcm.getColumn(5);
				    		 tc.setHeaderValue(cnam6);
				    		 tc=tcm.getColumn(6);
				    		 tc.setHeaderValue(cnam7);
				    		 tc=tcm.getColumn(7);
				    		 tc.setHeaderValue(cnam8);
				    		 tc=tcm.getColumn(8);
				    		 tc.setHeaderValue(cnam9);
				    		 tc=tcm.getColumn(9);
				    		 tc.setHeaderValue(cnam10);
				    		 
				    		
				    		
				    		th.repaint();
				    		while(rs.next()) {
				    			model.addRow(new Object[] {
				    					rs.getString(cnam1),
				    					rs.getString(cnam2),
				    					rs.getString(cnam3),
				    					rs.getString(cnam4),
				    					rs.getString(cnam5),
				    					rs.getString(cnam6),
				    					rs.getString(cnam7),
				    					rs.getString(cnam8),
				    					rs.getString(cnam9),
				    					rs.getString(cnam10),
				    			});
				    		}
				    		
				    		JOptionPane.showMessageDialog(frame,"Table selected!");
				    		rs.close();
				    		cn.close();
			    		}
			    		if(cno==8) {
			    			
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 
				    		DefaultTableModel model=new DefaultTableModel();
				    		column1.setVisible(true);
				    		column2.setVisible(true);
				    		column3.setVisible(true);
				    		column4.setVisible(true);
				    		column5.setVisible(true);
				    		column6.setVisible(true);
				    		column7.setVisible(true);
				    		column8.setVisible(true);
				    		
				    		
				    		t1.setVisible(true);
				    		t2.setVisible(true);
				    		t3.setVisible(true);
				    		t4.setVisible(true);
				    		t5.setVisible(true);
				    		t6.setVisible(true);
				    		t7.setVisible(true);
				    		t8.setVisible(true);
				    		
				    		
				    		
				    		
				    		column1.setText(cnam1);
				    		column2.setText(cnam2);
				    		column3.setText(cnam3);
				    		column4.setText(cnam4);
				    		column5.setText(cnam5);
				    		column6.setText(cnam6);
				    		column7.setText(cnam7);
				    		column8.setText(cnam8);
				    		
				    	    
				    	    table = new JTable();
				    		table.setModel(new DefaultTableModel(
				    			new Object[][] {
				    			},
				    			new String[] {"","","","","","","","",
				    				
				    			}
				    		));
				    		scrollPane.setViewportView(table);
				    		
				    		JTableHeader th=table.getTableHeader();
				    		TableColumnModel tcm=th.getColumnModel();
				    		TableColumn tc=tcm.getColumn(0);
				    		 tc.setHeaderValue(cnam1);
				    		 tc=tcm.getColumn(1);
				    		 tc.setHeaderValue(cnam2);
				    		 tc=tcm.getColumn(2);
				    		 tc.setHeaderValue(cnam3);
				    	     tc=tcm.getColumn(3);
				    	     tc.setHeaderValue(cnam4);
				    		 tc=tcm.getColumn(4);
				    		 tc.setHeaderValue(cnam5);
				    		 tc=tcm.getColumn(5);
				    		 tc.setHeaderValue(cnam6);
				    		 tc=tcm.getColumn(6);
				    		 tc.setHeaderValue(cnam7);
				    		 tc=tcm.getColumn(7);
				    		 tc.setHeaderValue(cnam8);

				    		th.repaint();
				    		while(rs.next()) {
				    			model.addRow(new Object[] {
				    					rs.getString(cnam1),
				    					rs.getString(cnam2),
				    					rs.getString(cnam3),
				    					rs.getString(cnam4),
				    					rs.getString(cnam5),
				    					rs.getString(cnam6),
				    					rs.getString(cnam7),
				    					rs.getString(cnam8),
				    					
				    					
				    			});
				    		}
				    		
				    		JOptionPane.showMessageDialog(frame,"Table selected!");
				    		rs.close();
				    		cn.close();
				    		}
			    		if(cno==7) {
			    			
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		DefaultTableModel model=new DefaultTableModel();
				    		column1.setVisible(true);
				    		column2.setVisible(true);
				    		column3.setVisible(true);
				    		column4.setVisible(true);
				    		column5.setVisible(true);
				    		column6.setVisible(true);
				    		column7.setVisible(true);
				    		
				    		
				    		t1.setVisible(true);
				    		t2.setVisible(true);
				    		t3.setVisible(true);
				    		t4.setVisible(true);
				    		t5.setVisible(true);
				    		t6.setVisible(true);
				    		t7.setVisible(true);
				    		
				    		column1.setText(cnam1);
				    		column2.setText(cnam2);
				    		column3.setText(cnam3);
				    		column4.setText(cnam4);
				    		column5.setText(cnam5);
				    		column6.setText(cnam6);
				    		column7.setText(cnam7);
				    		
				    	    table = new JTable();
				    		table.setModel(new DefaultTableModel(
				    			new Object[][] {
				    			},
				    			new String[] {"","","","","","","",
				    				
				    			}
				    		));
				    		scrollPane.setViewportView(table);
				    		
				    		JTableHeader th=table.getTableHeader();
				    		TableColumnModel tcm=th.getColumnModel();
				    		TableColumn tc=tcm.getColumn(0);
				    		 tc.setHeaderValue(cnam1);
				    		 tc=tcm.getColumn(1);
				    		 tc.setHeaderValue(cnam2);
				    		 tc=tcm.getColumn(2);
				    		 tc.setHeaderValue(cnam3);
				    	     tc=tcm.getColumn(3);
				    	     tc.setHeaderValue(cnam4);
				    		 tc=tcm.getColumn(4);
				    		 tc.setHeaderValue(cnam5);
				    		 tc=tcm.getColumn(5);
				    		 tc.setHeaderValue(cnam6);
				    		 tc=tcm.getColumn(6);
				    		 tc.setHeaderValue(cnam7);
				    		
				    		
				    		 
				    		 
				    		
				    		
				    		th.repaint();
				    		while(rs.next()) {
				    			model.addRow(new Object[] {
				    					rs.getString(cnam1),
				    					rs.getString(cnam2),
				    					rs.getString(cnam3),
				    					rs.getString(cnam4),
				    					rs.getString(cnam5),
				    					rs.getString(cnam6),
				    					rs.getString(cnam7),
				    					
				    					
				    			});
				    		}
				    		
				    		JOptionPane.showMessageDialog(frame,"Table selected!");
				    		rs.close();
				    		cn.close();
				    		}
			    		
			    	
					if(cno==6) {
		    			
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		 cnam3=rst.getColumnName(3);
			    		 cnam4=rst.getColumnName(4);
			    		 cnam5=rst.getColumnName(5);
			    		 cnam6=rst.getColumnName(6);
			    		
			    		DefaultTableModel model=new DefaultTableModel();
			    		column1.setVisible(true);
			    		column2.setVisible(true);
			    		column3.setVisible(true);
			    		column4.setVisible(true);
			    		column5.setVisible(true);
			    		column6.setVisible(true);
			    		
			    		
			    		t1.setVisible(true);
			    		t2.setVisible(true);
			    		t3.setVisible(true);
			    		t4.setVisible(true);
			    		t5.setVisible(true);
			    		t6.setVisible(true);
			    		
			    		
			    		column1.setText(cnam1);
			    		column2.setText(cnam2);
			    		column3.setText(cnam3);
			    		column4.setText(cnam4);
			    		column5.setText(cnam5);
			    		column6.setText(cnam6);
			    		
			    		
			    	    table = new JTable();
			    		table.setModel(new DefaultTableModel(
			    			new Object[][] {
			    			},
			    			new String[] {"","","","","","",
			    				
			    			}
			    		));
			    		scrollPane.setViewportView(table);
			    		
			    		JTableHeader th=table.getTableHeader();
			    		TableColumnModel tcm=th.getColumnModel();
			    		TableColumn tc=tcm.getColumn(0);
			    		 tc.setHeaderValue(cnam1);
			    		 tc=tcm.getColumn(1);
			    		 tc.setHeaderValue(cnam2);
			    		 tc=tcm.getColumn(2);
			    		 tc.setHeaderValue(cnam3);
			    	     tc=tcm.getColumn(3);
			    	     tc.setHeaderValue(cnam4);
			    		 tc=tcm.getColumn(4);
			    		 tc.setHeaderValue(cnam5);
			    		 tc=tcm.getColumn(5);
			    		 tc.setHeaderValue(cnam6);
			    		
			    		
			    		 
			    		 
			    		
			    		
			    		th.repaint();
			    		while(rs.next()) {
			    			model.addRow(new Object[] {
			    					rs.getString(cnam1),
			    					rs.getString(cnam2),
			    					rs.getString(cnam3),
			    					rs.getString(cnam4),
			    					rs.getString(cnam5),
			    					rs.getString(cnam6),
			    					
			    					
			    					
			    			});
			    		}
			    		
			    		JOptionPane.showMessageDialog(frame,"Table selected!");
			    		rs.close();
			    		cn.close();
			    		}
					if(cno==5) {
		    			
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		 cnam3=rst.getColumnName(3);
			    		 cnam4=rst.getColumnName(4);
			    		 cnam5=rst.getColumnName(5);
			    		
			    		
			    		DefaultTableModel model=new DefaultTableModel();
			    		column1.setVisible(true);
			    		column2.setVisible(true);
			    		column3.setVisible(true);
			    		column4.setVisible(true);
			    		column5.setVisible(true);
			    	
			    		
			    		
			    		t1.setVisible(true);
			    		t2.setVisible(true);
			    		t3.setVisible(true);
			    		t4.setVisible(true);
			    		t5.setVisible(true);
			    		
			    		
			    		
			    		column1.setText(cnam1);
			    		column2.setText(cnam2);
			    		column3.setText(cnam3);
			    		column4.setText(cnam4);
			    		column5.setText(cnam5);
			    		
			    		
			    		
			    	    table = new JTable();
			    		table.setModel(new DefaultTableModel(
			    			new Object[][] {
			    			},
			    			new String[] {"","","","","",
			    				
			    			}
			    		));
			    		scrollPane.setViewportView(table);
			    		
			    		JTableHeader th=table.getTableHeader();
			    		TableColumnModel tcm=th.getColumnModel();
			    		TableColumn tc=tcm.getColumn(0);
			    		 tc.setHeaderValue(cnam1);
			    		 tc=tcm.getColumn(1);
			    		 tc.setHeaderValue(cnam2);
			    		 tc=tcm.getColumn(2);
			    		 tc.setHeaderValue(cnam3);
			    	     tc=tcm.getColumn(3);
			    	     tc.setHeaderValue(cnam4);
			    		 tc=tcm.getColumn(4);
			    		 tc.setHeaderValue(cnam5);
			    		
			    		
			    		
			    		 
			    		 
			    		
			    		
			    		th.repaint();
			    		while(rs.next()) {
			    			model.addRow(new Object[] {
			    					rs.getString(cnam1),
			    					rs.getString(cnam2),
			    					rs.getString(cnam3),
			    					rs.getString(cnam4),
			    					rs.getString(cnam5),
			    					
			    					
			    					
			    			});
			    		}
			    		
			    		JOptionPane.showMessageDialog(frame,"Table selected!");
			    		rs.close();
			    		cn.close();
			    		}
					if(cno==4) {
		    			
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		 cnam3=rst.getColumnName(3);
			    		 cnam4=rst.getColumnName(4);
			    		
			    		
			    		DefaultTableModel model=new DefaultTableModel();
			    		column1.setVisible(true);
			    		column2.setVisible(true);
			    		column3.setVisible(true);
			    		column4.setVisible(true);
		
			    		t1.setVisible(true);
			    		t2.setVisible(true);
			    		t3.setVisible(true);
			    		t4.setVisible(true);
			    		
                		column1.setText(cnam1);
			    		column2.setText(cnam2);
			    		column3.setText(cnam3);
			    		column4.setText(cnam4);
	              	    table = new JTable();
			    		table.setModel(new DefaultTableModel(
			    			new Object[][] {
			    			},
			    			new String[] {"","","","",
			    				
			    			}
			    		));
			    		scrollPane.setViewportView(table);
			    		
			    		JTableHeader th=table.getTableHeader();
			    		TableColumnModel tcm=th.getColumnModel();
			    		TableColumn tc=tcm.getColumn(0);
			    		 tc.setHeaderValue(cnam1);
			    		 tc=tcm.getColumn(1);
			    		 tc.setHeaderValue(cnam2);
			    		 tc=tcm.getColumn(2);
			    		 tc.setHeaderValue(cnam3);
			    	     tc=tcm.getColumn(3);
			    	     tc.setHeaderValue(cnam4);
			    		 
                       	th.repaint();
			    		while(rs.next()) {
			    			model.addRow(new Object[] {
			    					rs.getString(cnam1),
			    					rs.getString(cnam2),
			    					rs.getString(cnam3),
			    					rs.getString(cnam4),
			    			});
			    		}
			    		
			    		JOptionPane.showMessageDialog(frame,"Table selected!");
			    		rs.close();
			    		cn.close();
			    		}
					if(cno==3) {
		    			
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		 cnam3=rst.getColumnName(3);
			    		
			    		
			    		DefaultTableModel model=new DefaultTableModel();
			    		column1.setVisible(true);
			    		column2.setVisible(true);
			    		column3.setVisible(true);
			    		
		
			    		t1.setVisible(true);
			    		t2.setVisible(true);
			    		t3.setVisible(true);
			    		
			    		
               		column1.setText(cnam1);
			    		column2.setText(cnam2);
			    		column3.setText(cnam3);
			    	
	              	    table = new JTable();
			    		table.setModel(new DefaultTableModel(
			    			new Object[][] {
			    			},
			    			new String[] {"","","",
			    				
			    			}
			    		));
			    		scrollPane.setViewportView(table);
			    		
			    		JTableHeader th=table.getTableHeader();
			    		TableColumnModel tcm=th.getColumnModel();
			    		TableColumn tc=tcm.getColumn(0);
			    		 tc.setHeaderValue(cnam1);
			    		 tc=tcm.getColumn(1);
			    		 tc.setHeaderValue(cnam2);
			    		 tc=tcm.getColumn(2);
			    		 tc.setHeaderValue(cnam3);
			    	    
			    		 
                      	th.repaint();
			    		while(rs.next()) {
			    			model.addRow(new Object[] {
			    					rs.getString(cnam1),
			    					rs.getString(cnam2),
			    					rs.getString(cnam3),
			    					
			    			});
			    		}
			    		
			    		JOptionPane.showMessageDialog(frame,"Table selected!");
			    		rs.close();
			    		cn.close();
			    		}
					if(cno==2) {
		    			
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		
			    		
			    		
			    		DefaultTableModel model=new DefaultTableModel();
			    		column1.setVisible(true);
			    		column2.setVisible(true);
	
			    		t1.setVisible(true);
			    		t2.setVisible(true);
	    		
              		    column1.setText(cnam1);
			    		column2.setText(cnam2);
			    		
			    	
	              	    table = new JTable();
			    		table.setModel(new DefaultTableModel(
			    			new Object[][] {
			    			},
			    			new String[] {"","",
			    				
			    			}
			    		));
			    		scrollPane.setViewportView(table);
			    		
			    		JTableHeader th=table.getTableHeader();
			    		TableColumnModel tcm=th.getColumnModel();
			    		TableColumn tc=tcm.getColumn(0);
			    		 tc.setHeaderValue(cnam1);
			    		 tc=tcm.getColumn(1);
			    		 tc.setHeaderValue(cnam2);
			    		 
                     	th.repaint();
			    		while(rs.next()) {
			    			model.addRow(new Object[] {
			    					rs.getString(cnam1),
			    					rs.getString(cnam2),
			    					
			    					
			    			});
			    		}
			    		
			    		JOptionPane.showMessageDialog(frame,"Table selected!");
			    		rs.close();
			    		cn.close();
			    		}
					
		    		
		    	}
			  	     catch(Exception e1) {
			  	    	 System.out.println(e1.getMessage());
			  	    	 System.out.println("table not exists");
			  	    	JOptionPane.showMessageDialog(frame,"Table does not exists!");
			  	     }
			  	     
				}
			});
			btnNewButton.setForeground(new Color(25, 25, 112));
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(352, 50, 62, 23);
			contentPane_1.add(btnNewButton);
			
			JButton insertdata = new JButton("INSERT");
			insertdata.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String txt=textField.getText();
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sakshi@123");
						Statement st=con.createStatement(); 
						
						String sql="Select * from "+txt+"";
						ResultSet rs1=st.executeQuery(sql);
			
			    		ResultSetMetaData rst=(ResultSetMetaData) rs1.getMetaData();
			           int cno=rst.getColumnCount();
			             
			           if(cno==10) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 cnam9=rst.getColumnName(9);
				    		 cnam10=rst.getColumnName(10);
				    	
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						     String cna5=t5.getText();
						     String cna6=t6.getText();
						     String cna7=t7.getText();
						     String cna8=t8.getText();
						     String cna9=t9.getText();
						     String cna10=t10.getText();
			    	    
					      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+","+cnam5+","+cnam6+","+cnam7+","+cnam8+","+cnam9+","+cnam10+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"','"+cna5+"','"+cna6+"','"+cna7+"','"+cna8+"','"+cna9+"','"+cna10+"')");
					     
					      JOptionPane.showMessageDialog(frame,"record added");
					}
			           else if(cno==9) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 cnam9=rst.getColumnName(9);
				    		 
				    	
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						     String cna5=t5.getText();
						     String cna6=t6.getText();
						     String cna7=t7.getText();
						     String cna8=t8.getText();
						     String cna9=t9.getText();
						    
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+","+cnam5+","+cnam6+","+cnam7+","+cnam8+","+cnam9+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"','"+cna5+"','"+cna6+"','"+cna7+"','"+cna8+"','"+cna9+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==8) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						     String cna5=t5.getText();
						     String cna6=t6.getText();
						     String cna7=t7.getText();
						     String cna8=t8.getText();
						     
						    
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+","+cnam5+","+cnam6+","+cnam7+","+cnam8+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"','"+cna5+"','"+cna6+"','"+cna7+"','"+cna8+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==7) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						     String cna5=t5.getText();
						     String cna6=t6.getText();
						     String cna7=t7.getText();
						     
						    
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+","+cnam5+","+cnam6+","+cnam7+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"','"+cna5+"','"+cna6+"','"+cna7+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==6) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 
				    		
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						     String cna5=t5.getText();
						     String cna6=t6.getText();
						    
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+","+cnam5+","+cnam6+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"','"+cna5+"','"+cna6+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==5) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						     String cna5=t5.getText();
						     
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+","+cnam5+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"','"+cna5+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==4) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 
				    		
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						     String cna4=t4.getText();
						    
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+","+cnam4+")  values('"+cna1+"','"+cna2+"','"+cna3+"','"+cna4+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==3) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						     String cna3=t3.getText();
						   
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+","+cnam3+")  values('"+cna1+"','"+cna2+"','"+cna3+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
			           else if(cno==2) {
			        	   cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		
						     String cna1=t1.getText();
						     String cna2=t2.getText();
						    
						      int rs=st.executeUpdate("insert into "+txt+"("+cnam1+","+cnam2+")  values('"+cna1+"','"+cna2+"')");
						     
						      JOptionPane.showMessageDialog(frame,"record added");
			           }
					}
					catch(Exception e) {
			  	    	 System.out.println(e.getMessage());
			  	    	 
			  	    	JOptionPane.showMessageDialog(frame,"ERROR!");
			  	     }
				
				}
			});
			insertdata.setForeground(new Color(25, 25, 112));
			insertdata.setBackground(new Color(230, 230, 250));
			insertdata.setBounds(22, 404, 123, 23);
			contentPane_1.add(insertdata);
			
			JButton btnNewButton_1 = new JButton("RETRIEVE DATA");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String txt1=textField.getText();
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sakshi@123");
						Statement st=con.createStatement();
						String sql="Select * from "+txt1+"";
						ResultSet rs1=st.executeQuery(sql);
			
			    		ResultSetMetaData rst=(ResultSetMetaData) rs1.getMetaData();
			    	     
			    		 int cno=rst.getColumnCount();
			    		if(cno==10) {
						while(rs1.next()) {
							cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 cnam9=rst.getColumnName(9);
				    		 cnam10=rst.getColumnName(10);
							String col1=rs1.getString(cnam1);
							String col2=rs1.getString(cnam2);
							String col3=rs1.getString(cnam3);
							String col4=rs1.getString(cnam4);
							String col5=rs1.getString(cnam5);
							String col6=rs1.getString(cnam6);
							String col7=rs1.getString(cnam7);
							String col8=rs1.getString(cnam8);
							String col9=rs1.getString(cnam9);
							String col10=rs1.getString(cnam10);
						    String tbData[]= {col1,col2,col3,col4,col5,col6,col7,col8,col9,col10};
							DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
							tb1Model.addRow(tbData);
							
						}	
						}
			    		else if(cno==9) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		 cnam4=rst.getColumnName(4);
					    		 cnam5=rst.getColumnName(5);
					    		 cnam6=rst.getColumnName(6);
					    		 cnam7=rst.getColumnName(7);
					    		 cnam8=rst.getColumnName(8);
					    		 cnam9=rst.getColumnName(9);
					    		 
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								String col5=rs1.getString(cnam5);
								String col6=rs1.getString(cnam6);
								String col7=rs1.getString(cnam7);
								String col8=rs1.getString(cnam8);
								String col9=rs1.getString(cnam9);
								
							    String tbData[]= {col1,col2,col3,col4,col5,col6,col7,col8,col9};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			
			    		}
			    		}
			    		else if(cno==8) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		 cnam4=rst.getColumnName(4);
					    		 cnam5=rst.getColumnName(5);
					    		 cnam6=rst.getColumnName(6);
					    		 cnam7=rst.getColumnName(7);
					    		 cnam8=rst.getColumnName(8);
					    		
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								String col5=rs1.getString(cnam5);
								String col6=rs1.getString(cnam6);
								String col7=rs1.getString(cnam7);
								String col8=rs1.getString(cnam8);
								
							    String tbData[]= {col1,col2,col3,col4,col5,col6,col7,col8,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			
			    		}
			    		}
			    		else if(cno==7) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		 cnam4=rst.getColumnName(4);
					    		 cnam5=rst.getColumnName(5);
					    		 cnam6=rst.getColumnName(6);
					    		 cnam7=rst.getColumnName(7);
					    		
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								String col5=rs1.getString(cnam5);
								String col6=rs1.getString(cnam6);
								String col7=rs1.getString(cnam7);
								
							    String tbData[]= {col1,col2,col3,col4,col5,col6,col7,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			}
			    		}
			    		else if(cno==6) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		 cnam4=rst.getColumnName(4);
					    		 cnam5=rst.getColumnName(5);
					    		 cnam6=rst.getColumnName(6);
					    		 
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								String col5=rs1.getString(cnam5);
								String col6=rs1.getString(cnam6);
								
							    String tbData[]= {col1,col2,col3,col4,col5,col6,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			}
			    		}
			    		else if(cno==5) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		 cnam4=rst.getColumnName(4);
					    		 cnam5=rst.getColumnName(5);
					    		
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								String col5=rs1.getString(cnam5);
								
							    String tbData[]= {col1,col2,col3,col4,col5,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			}
			    		}
			    		else if(cno==4) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		 cnam4=rst.getColumnName(4);
					    		
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								
							    String tbData[]= {col1,col2,col3,col4,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			}
			    		}
			    		else if(cno==3) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		 cnam3=rst.getColumnName(3);
					    		
					    		
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								
							    String tbData[]= {col1,col2,col3,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			}
			    		}
			    		else if(cno==2) {
			    			while(rs1.next()) {
			    				cnam1=rst.getColumnName(1);
					    		 cnam2=rst.getColumnName(2);
					    		
					    		
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								
							    String tbData[]= {col1,col2,};
								DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
								tb1Model.addRow(tbData);
			    			}
			    		}
			    		con.close();
					}
					catch(Exception e) {
			  	    	 System.out.println(e.getMessage());
			  	    	 
			  	    	JOptionPane.showMessageDialog(frame,"ERROR!");
			  	     }
				}
			});
			btnNewButton_1.setForeground(new Color(25, 25, 112));
			btnNewButton_1.setBackground(new Color(222, 184, 135));
			btnNewButton_1.setBounds(201, 404, 123, 23);
			contentPane_1.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("DELETE");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sakshi@123");
						String txt=textField.getText();
						String sql="Select * from "+txt+"";
						Statement st=con.createStatement(); 
						String sId=t1.getText();
						ResultSet rs1=st.executeQuery(sql);
			
			    		ResultSetMetaData rst=(ResultSetMetaData) rs1.getMetaData();
			    	     cnam1=rst.getColumnName(1);
			    	     
						
						String query="Delete from "+txt+" where "+cnam1+" = "+sId+"";
				//	PreparedStatement pst=con.prepareStatement(query);
				//	pst.executeUpdate();
		               int rs=st.executeUpdate(query);	
		               
		       
					    JOptionPane.showMessageDialog(frame,"Deleted sucessfully");
						}
								
									catch(Exception e) {
							  	    	 System.out.println(e.getMessage());
							  	    	 JOptionPane.showMessageDialog(frame,"ERROR!");
							  	     }

				}
			});
			btnNewButton_2.setForeground(new Color(25, 25, 112));
			btnNewButton_2.setBackground(new Color(230, 230, 250));
			btnNewButton_2.setBounds(391, 404, 123, 23);
			contentPane_1.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("SEARCH");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String sId=t1.getText();
					String txt=textField.getText();
					try {
						 
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","sakshi@123");
						Statement st=con.createStatement(); 
						
						String sql="Select * from "+txt+" where ID="+sId+"";
						ResultSet rs1=st.executeQuery(sql);
			
			    		ResultSetMetaData rst=(ResultSetMetaData) rs1.getMetaData();
			    	    int cno=rst.getColumnCount();
			    	    if(cno==10) {
			    		 l1.setVisible(true);
			    		 l2.setVisible(true);
			    		 l3.setVisible(true);
			    		 l4.setVisible(true);
			    		 l5.setVisible(true);
			    		 l6.setVisible(true);
			    		 l7.setVisible(true);
			    		 l8.setVisible(true);
			    		 l9.setVisible(true);
			    		 l10.setVisible(true);
			    		 ts1.setVisible(true);
			    		 ts1.setVisible(true);
			    		 ts2.setVisible(true);
			    		 ts3.setVisible(true);
			    		 ts4.setVisible(true);
			    		 ts5.setVisible(true);
			    		 ts6.setVisible(true);
			    		 ts7.setVisible(true);
			    		 ts8.setVisible(true);
			    		 ts9.setVisible(true);
			    		 ts10.setVisible(true);
			    		 
			    	     cnam1=rst.getColumnName(1);
			    		 cnam2=rst.getColumnName(2);
			    		 cnam3=rst.getColumnName(3);
			    		 cnam4=rst.getColumnName(4);
			    		 cnam5=rst.getColumnName(5);
			    		 cnam6=rst.getColumnName(6);
			    		 cnam7=rst.getColumnName(7);
			    		 cnam8=rst.getColumnName(8);
			    		 cnam9=rst.getColumnName(9);
			    		 cnam10=rst.getColumnName(10);
			    
					     panel.setVisible(true);  
					     l1.setText(cnam1);
					     l2.setText(cnam2);
					     l3.setText(cnam3);
					     l4.setText(cnam4);
					     l5.setText(cnam5);
					     l6.setText(cnam6);
					     l7.setText(cnam7);
					     l8.setText(cnam8);
					     l9.setText(cnam9);
					     l10.setText(cnam10);
					    
					     while(rs1.next()) {
								String col1=rs1.getString(cnam1);
								String col2=rs1.getString(cnam2);
								String col3=rs1.getString(cnam3);
								String col4=rs1.getString(cnam4);
								String col5=rs1.getString(cnam5);
								String col6=rs1.getString(cnam6);
								String col7=rs1.getString(cnam7);
								String col8=rs1.getString(cnam8);
								String col9=rs1.getString(cnam9);
								String col10=rs1.getString(cnam10);
								
								ts1.setText(col1);
								ts2.setText(col2);
								ts3.setText(col3);
								ts4.setText(col4);
								ts5.setText(col5);
								ts6.setText(col6);
								ts7.setText(col7);
								ts8.setText(col8);
								ts9.setText(col9);
								ts10.setText(col10);								
								}
					     
					     JOptionPane.showMessageDialog(frame,"searched");
			    	    }
			    	    else if(cno==9) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		 l4.setVisible(true);
				    		 l5.setVisible(true);
				    		 l6.setVisible(true);
				    		 l7.setVisible(true);
				    		 l8.setVisible(true);
				    		 l9.setVisible(true);
				    		
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    		 ts4.setVisible(true);
				    		 ts5.setVisible(true);
				    		 ts6.setVisible(true);
				    		 ts7.setVisible(true);
				    		 ts8.setVisible(true);
				    		 ts9.setVisible(true);
				    		 
				    		 
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		 cnam9=rst.getColumnName(9);
                 		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						     l4.setText(cnam4);
						     l5.setText(cnam5);
						     l6.setText(cnam6);
						     l7.setText(cnam7);
						     l8.setText(cnam8);
						     l9.setText(cnam9);
						    
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									String col4=rs1.getString(cnam4);
									String col5=rs1.getString(cnam5);
									String col6=rs1.getString(cnam6);
									String col7=rs1.getString(cnam7);
									String col8=rs1.getString(cnam8);
									String col9=rs1.getString(cnam9);
									
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
									ts4.setText(col4);
									ts5.setText(col5);
									ts6.setText(col6);
									ts7.setText(col7);
									ts8.setText(col8);
									ts9.setText(col9);
																	
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    else if(cno==8) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		 l4.setVisible(true);
				    		 l5.setVisible(true);
				    		 l6.setVisible(true);
				    		 l7.setVisible(true);
				    		 l8.setVisible(true);
				    		
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    		 ts4.setVisible(true);
				    		 ts5.setVisible(true);
				    		 ts6.setVisible(true);
				    		 ts7.setVisible(true);
				    		 ts8.setVisible(true);
				    		 
				    		 
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		 cnam8=rst.getColumnName(8);
				    		
                		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						     l4.setText(cnam4);
						     l5.setText(cnam5);
						     l6.setText(cnam6);
						     l7.setText(cnam7);
						     l8.setText(cnam8);
						    
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									String col4=rs1.getString(cnam4);
									String col5=rs1.getString(cnam5);
									String col6=rs1.getString(cnam6);
									String col7=rs1.getString(cnam7);
									String col8=rs1.getString(cnam8);
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
									ts4.setText(col4);
									ts5.setText(col5);
									ts6.setText(col6);
									ts7.setText(col7);
									ts8.setText(col8);
									
																	
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    
			    	    else if(cno==7) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		 l4.setVisible(true);
				    		 l5.setVisible(true);
				    		 l6.setVisible(true);
				    		 l7.setVisible(true);
				    		
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    		 ts4.setVisible(true);
				    		 ts5.setVisible(true);
				    		 ts6.setVisible(true);
				    		 ts7.setVisible(true);
				    		 
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		 cnam7=rst.getColumnName(7);
				    		
               		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						     l4.setText(cnam4);
						     l5.setText(cnam5);
						     l6.setText(cnam6);
						     l7.setText(cnam7);
						    
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									String col4=rs1.getString(cnam4);
									String col5=rs1.getString(cnam5);
									String col6=rs1.getString(cnam6);
									String col7=rs1.getString(cnam7);
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
									ts4.setText(col4);
									ts5.setText(col5);
									ts6.setText(col6);
									ts7.setText(col7);
									
									
																	
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    else if(cno==6) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		 l4.setVisible(true);
				    		 l5.setVisible(true);
				    		 l6.setVisible(true);
				    	
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    		 ts4.setVisible(true);
				    		 ts5.setVisible(true);
				    		 ts6.setVisible(true);
				    	
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    		 cnam6=rst.getColumnName(6);
				    		
              		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						     l4.setText(cnam4);
						     l5.setText(cnam5);
						     l6.setText(cnam6);
						
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									String col4=rs1.getString(cnam4);
									String col5=rs1.getString(cnam5);
									String col6=rs1.getString(cnam6);
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
									ts4.setText(col4);
									ts5.setText(col5);
									ts6.setText(col6);
													
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    else if(cno==5) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		 l4.setVisible(true);
				    		 l5.setVisible(true);
				    		
				    	
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    		 ts4.setVisible(true);
				    		 ts5.setVisible(true);
				    		
				    	
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		 cnam5=rst.getColumnName(5);
				    	
             		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						     l4.setText(cnam4);
						     l5.setText(cnam5);
						   
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									String col4=rs1.getString(cnam4);
									String col5=rs1.getString(cnam5);
									
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
									ts4.setText(col4);
									ts5.setText(col5);
									
													
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    else if(cno==4) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		 l4.setVisible(true);
				 
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    		 ts4.setVisible(true);
		    	
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		 cnam4=rst.getColumnName(4);
				    		
            		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						     l4.setText(cnam4);
					    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									String col4=rs1.getString(cnam4);
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
									ts4.setText(col4);
									
													
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    else if(cno==3) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		 l3.setVisible(true);
				    		
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    		 ts3.setVisible(true);
				    	
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    		 cnam3=rst.getColumnName(3);
				    		
           		     panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						     l3.setText(cnam3);
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									String col3=rs1.getString(cnam3);
									
									ts1.setText(col1);
									ts2.setText(col2);
									ts3.setText(col3);
												
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    else if(cno==2) {
			    	    	 l1.setVisible(true);
				    		 l2.setVisible(true);
				    		
				    		 ts1.setVisible(true);
				    		 ts1.setVisible(true);
				    		 ts2.setVisible(true);
				    
				    	     cnam1=rst.getColumnName(1);
				    		 cnam2=rst.getColumnName(2);
				    	  		
          		             panel.setVisible(true);
						     l1.setText(cnam1);
						     l2.setText(cnam2);
						  
						    
						     while(rs1.next()) {
									String col1=rs1.getString(cnam1);
									String col2=rs1.getString(cnam2);
									
									
									ts1.setText(col1);
									ts2.setText(col2);
								
									}
						     
						     JOptionPane.showMessageDialog(frame,"search sucessful!");
				    	    }
			    	    
			    	    
			    	    
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(frame,"ERROR");
                         }
				}
			});
			btnNewButton_3.setForeground(new Color(25, 25, 112));
			btnNewButton_3.setBackground(new Color(222, 184, 135));
			btnNewButton_3.setBounds(577, 404, 123, 23);
			contentPane_1.add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("CLEAR");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					 DefaultTableModel model=(DefaultTableModel)table.getModel();
					 model.setRowCount(0);
					    	t1.setText("");
					    	t2.setText("");
					     	t3.setText("");
	         				t4.setText("");
							t5.setText("");
							t6.setText("");
							t7.setText("");
							t8.setText("");
							t9.setText("");
							t10.setText("");
							ts1.setText("");
							ts2.setText("");
							ts3.setText("");
							ts4.setText("");
							ts5.setText("");
							ts6.setText("");
							ts7.setText("");
							ts8.setText("");
							ts9.setText("");
							ts10.setText("");
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
							l10.setText("");
						
					 
				}
			});
			btnNewButton_4.setForeground(new Color(25, 25, 112));
			btnNewButton_4.setBackground(new Color(230, 230, 250));
			btnNewButton_4.setBounds(750, 404, 123, 22);
			contentPane_1.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("NEW TABLE");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					opentable edf=new opentable();
					edf.setVisible(true);
				}
			});
			btnNewButton_5.setBounds(760, 136, 114, 23);
			contentPane_1.add(btnNewButton_5);
			
			lblNewLabel_2 = new JLabel("SEARCH BOX");
			lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
			lblNewLabel_2.setBounds(564, 242, 136, 22);
			contentPane_1.add(lblNewLabel_2);
			
			btnNewButton_6 = new JButton("HOMEPAGE");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					homepage1 hm=new homepage1();
					hm.setVisible(true);
				}
				
			});
			btnNewButton_6.setBounds(760, 182, 114, 23);
			contentPane_1.add(btnNewButton_6);
			
	}
}
