package com.lib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class BookReg extends javax.swing.JFrame {
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton jButton3;
	private JButton jButton2;
	private JComboBox jComboBox5;
	private JLabel jLabel10;
	private JButton jButton1;
	private JComboBox jComboBox4;
	private JLabel jLabel9;
	private JComboBox jComboBox3;
	private JLabel jLabel8;
	private JTextField jTextField4;
	private JComboBox jComboBox2;
	private JTextField jTextField3;
	private JComboBox jComboBox1;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel7;
	private JLabel jLabel6;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BookReg inst = new BookReg();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public BookReg() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Book ID");
				jLabel2.setBounds(96, 118, 87, 23);
				jLabel2.setBackground(new java.awt.Color(255,0,128));
				jLabel2.setForeground(new java.awt.Color(255,255,255));
				jLabel2.setFont(new java.awt.Font("Algerian",0,14));
				jLabel2.setSize(87, 23);

			}   
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Book Name");
				jLabel3.setBounds(96, 170, 82, 20);
				jLabel3.setForeground(new java.awt.Color(255,255,255));
				jLabel3.setFont(new java.awt.Font("Algerian",0,14));
				jLabel3.setSize(87, 23);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Book Edition");
				jLabel4.setBounds(96, 227, 130, 23);
				jLabel4.setForeground(new java.awt.Color(255,255,255));
				jLabel4.setFont(new java.awt.Font("Algerian",0,14));
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("ISBN");
				jLabel5.setBounds(96, 284, 49, 20);
				jLabel5.setForeground(new java.awt.Color(255,255,255));
				jLabel5.setFont(new java.awt.Font("Algerian",0,14));
				jLabel5.setSize(87, 23);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Volume No.");
				jLabel6.setBounds(96, 333, 82, 21);
				jLabel6.setForeground(new java.awt.Color(255,255,255));
				jLabel6.setFont(new java.awt.Font("Algerian",0,14));
				jLabel6.setSize(87, 23);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Author");
				jLabel7.setBounds(96, 392, 72, 19);
				jLabel7.setForeground(new java.awt.Color(255,255,255));
				jLabel7.setFont(new java.awt.Font("Algerian",0,14));
				jLabel7.setSize(87, 23);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(290, 118, 208, 23);
				jTextField1.setEnabled(false);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(290, 169, 208, 23);
			}
			{
				ComboBoxModel jComboBox1Model = 
					new DefaultComboBoxModel(
							new String[] { "1", "2","3","4","5" });
				jComboBox1 = new JComboBox();
				getContentPane().add(jComboBox1);
				jComboBox1.setModel(jComboBox1Model);
				jComboBox1.setBounds(290, 226, 101, 23);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setBounds(290, 283, 208, 23);
			}
			{
				ComboBoxModel jComboBox2Model = 
					new DefaultComboBoxModel(
							new String[] { "I", "II","III","IV","V" });
				jComboBox2 = new JComboBox();
				getContentPane().add(jComboBox2);
				jComboBox2.setModel(jComboBox2Model);
				jComboBox2.setBounds(290, 332, 101, 23);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setBounds(290, 388, 208, 23);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("Category");
				jLabel8.setBounds(96, 450, 82, 16);
				jLabel8.setForeground(new java.awt.Color(255,255,255));
				jLabel8.setFont(new java.awt.Font("Algerian",0,14));
				jLabel8.setSize(87, 23);
			}
			{
				ArrayList a1=Dbcon.getCategory();
				ComboBoxModel jComboBox3Model = 
				new DefaultComboBoxModel(a1.toArray());
				jComboBox3 = new JComboBox();
				getContentPane().add(jComboBox3);
				jComboBox3.setModel(jComboBox3Model);
				jComboBox3.setBounds(290, 443, 106, 23);
				jComboBox3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jComboBox3ActionPerformed(evt);
					}
				});
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("Sub-Category");
				jLabel9.setBounds(96, 507, 130, 23);
				jLabel9.setForeground(new java.awt.Color(255,255,255));
				jLabel9.setFont(new java.awt.Font("Algerian",0,14));
			}
			{
				
				ComboBoxModel jComboBox4Model = 
				new DefaultComboBoxModel();
				jComboBox4 = new JComboBox();
				getContentPane().add(jComboBox4);
				jComboBox4.setModel(jComboBox4Model);
				jComboBox4.setBounds(290, 500, 106, 23);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Submit");
				jButton1.setBounds(287, 590, 104, 48);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("Publisher");
				jLabel10.setBounds(96, 558, 72, 16);
				jLabel10.setForeground(new java.awt.Color(255,255,255));
				jLabel10.setFont(new java.awt.Font("Algerian",0,14));
				jLabel10.setSize(87, 23);
			}
			{
				ArrayList a3=Dbcon.getPublisher();

				ComboBoxModel jComboBox5Model = 
					new DefaultComboBoxModel(a3.toArray());	
				jComboBox5 = new JComboBox();
				getContentPane().add(jComboBox5);
				jComboBox5.setModel(jComboBox5Model);
				jComboBox5.setBounds(290, 551, 101, 23);
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Get Id");
				jButton2.setBounds(547, 118, 91, 23);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("Go to Admin Page");
				jButton3.setBounds(520, 615, 146, 23);
				jButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton3ActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(1300, 750);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		
		System.out.println("jButton1.actionPerformed, event="+evt);
		
		String bookid = jTextField1.getText();
		String bookname = jTextField2.getText();
		String bookedition = (String) jComboBox1.getSelectedItem();
		String isbn = jTextField3.getText();
		String volno = (String) jComboBox2.getSelectedItem();
		String author = jTextField4.getText();
		//String publisher = (String) jComboBox5.getSelectedItem();
		//String  category= (String)jComboBox3.getSelectedItem();
		
		Dbcon db =new Dbcon();
	    try {
			db.btodb(bookid,bookname,jComboBox1.getSelectedItem().toString(),isbn,jComboBox2.getSelectedItem().toString(),jComboBox4.getSelectedItem().toString(),jComboBox5.getSelectedItem().toString(),author);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
        
		
		
		
		//TODO add your code for jButton1.actionPerformed
	}
	
	private void jComboBox3ActionPerformed(ActionEvent evt) {
		System.out.println("jComboBox3.actionPerformed, event="+evt);
		//TODO add your code for jComboBox3.actionPerformed
		jComboBox4.removeAllItems();
		try {
			ArrayList a2=Dbcon.getsubCat(jComboBox3.getSelectedItem().toString());
			for(int i=0;i<a2.size();i++)
			{
				jComboBox4.addItem(a2.get(i));
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed
		PortConnection rr=new PortConnection();
		String tag=rr.openConnection("AT+CMGD=1");
		tag=tag.substring(7, tag.length());
		jTextField1.setText(tag);
	}
	
	private void jButton3ActionPerformed(ActionEvent evt) {
		System.out.println("jButton3.actionPerformed, event="+evt);
		//TODO add your code for jButton3.actionPerformed
		AdminPage obj=new AdminPage();
		obj.setVisible(true);
		this.dispose();
	}

}
