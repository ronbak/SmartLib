package com.lib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;


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
public class BookIssue extends javax.swing.JFrame {
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton jButton1;
	private JButton jButton4;
	private JButton jButton3;
	private JLabel jLabel1;
	private JButton jButton2;
	private JTextField jTextField4;
	private JFormattedTextField jFormattedTextField1;
	private JTextField jTextField3;
	private JTextField jTextField2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BookIssue inst = new BookIssue();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public BookIssue() {
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
				jLabel2.setText("Book Id");
				jLabel2.setBounds(75, 139, 141, 16);
				jLabel2.setFont(new java.awt.Font("Algerian",0,16));
				jLabel2.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("User Name");
				jLabel3.setBounds(75, 198, 141, 16);
				jLabel3.setFont(new java.awt.Font("Algerian",0,16));
				jLabel3.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Mobile number");
				jLabel4.setBounds(75, 253, 141, 16);
				jLabel4.setFont(new java.awt.Font("Algerian",0,16));
				jLabel4.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Email-id");
				jLabel5.setBounds(75, 313, 141, 16);
				jLabel5.setFont(new java.awt.Font("Algerian",0,16));
				jLabel5.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(223, 136, 162, 23);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setBounds(223, 191, 162, 23);
			}
			{
				MaskFormatter mf= new MaskFormatter("##########");
				jFormattedTextField1 = new JFormattedTextField(mf);
				getContentPane().add(jFormattedTextField1);
				jFormattedTextField1.setBounds(223, 250, 162, 23);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setBounds(223, 310, 162, 23);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Get Id");
				jButton1.setBounds(460, 132, 79, 30);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Submit");
				jButton2.setBounds(273, 403, 65, 23);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("jLabel1");
				jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/t7.jpg")));
				jLabel1.setBounds(0, 0, 989, 632);
				jLabel1.setSize(989, 550);
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("Go to Adminpage");
				jButton3.setBounds(472, 313, 132, 23);
				jButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton3ActionPerformed(evt);
					}

					
				});
			}
			{
				jButton4 = new JButton();
				getContentPane().add(jButton4);
				jButton4.setText("Check");
				jButton4.setBounds(462, 189, 77, 21);
				jButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton4ActionPerformed(evt);
					}		
				});
			}
			pack();
			this.setSize(900, 580);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	private void jButton3ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		AdminPage obj=new AdminPage();
		obj.setVisible(true);
		this.dispose();
	}	

	private void jButton4ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String uno= jTextField2.getText();
		try {
				
				Dbcon.checkreserve(uno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		//TODO add your code for jButton1.actionPerformed
		
		
		
		PortConnection rr=new PortConnection();
		String tag=rr.openConnection("AT+CMGD=1");
		tag=tag.substring(2, tag.length());
		jTextField2.setText(tag);
		
	
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed

		String name= jTextField3.getText();
		String num=jFormattedTextField1.getText();
		String emailid=jTextField4.getText();
		try {
			Dbcon.issueBook(jTextField2.getText(),name,num,emailid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jTextField2.setText("");
			jTextField3.setText("");
			jTextField4.setText("");
			jFormattedTextField1.setText("");
		}
	}

}
