package com.lib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
public class AdminPage extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JButton jButton7;
	private JButton jButton1;
	private JButton jButton6;
	private JLabel jLabel6;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AdminPage inst = new AdminPage();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public AdminPage() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Register User");
				jLabel1.setBounds(81, 67, 132, 24);
				jLabel1.setForeground(new java.awt.Color(255,255,255));
				jLabel1.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Register Books");
				jLabel2.setBounds(81, 124, 132, 24);
				jLabel2.setForeground(new java.awt.Color(255,255,255));
				jLabel2.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Issue Books");
				jLabel3.setBounds(81, 174, 132, 24);
				jLabel3.setForeground(new java.awt.Color(255,255,255));
				jLabel3.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Forget Password");
				jLabel4.setBounds(81, 229, 159, 24);
				jLabel4.setForeground(new java.awt.Color(255,255,255));
				jLabel4.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Check  Fine");
				jLabel5.setBounds(81, 281, 132, 24);
				jLabel5.setForeground(new java.awt.Color(255,255,255));
				jLabel5.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Click to Register a user ");
				jButton1.setBounds(252, 69, 203, 23);
				jButton1.setForeground(new java.awt.Color(0,0,0));
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Click to Register a Book");
				jButton2.setBounds(252, 124, 203, 23);
				jButton2.setForeground(new java.awt.Color(0,0,0));
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("Forgot Password");
				jButton3.setBounds(252, 231, 203, 23);
				jButton3.setForeground(new java.awt.Color(0,0,0));
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
				jButton4.setBounds(252, 282, 203, 23);
				jButton4.setForeground(new java.awt.Color(0,0,0));
				jButton4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton4ActionPerformed(evt);
					}
				});
			}
			{
				jButton5 = new JButton();
				getContentPane().add(jButton5);
				jButton5.setText("Check for Theft");
				jButton5.setBounds(252, 350, 203, 23);
				jButton5.setForeground(new java.awt.Color(0,0,0));
				jButton5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						try {
							jButton5ActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Check for theft");
				jLabel6.setBounds(81, 353, 153, 24);
				jLabel6.setForeground(new java.awt.Color(255,255,255));
				jLabel6.setFont(new java.awt.Font("Algerian",0,16));
			}
			{
				jButton6 = new JButton();
				getContentPane().add(jButton6);
				jButton6.setText("Issue book");
				jButton6.setBounds(252, 175, 203, 23);
				jButton6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton6ActionPerformed(evt);
					}
				});
			}
			{
				jButton7 = new JButton();
				getContentPane().add(jButton7);
				jButton7.setText("Clear reserved books");
				jButton7.setBounds(252, 411, 203, 24);
				jButton7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						try {
							jButton7ActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("jLabel7");
				jLabel7.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/t1.jpg")));
				jLabel7.setBounds(-9, 0, 1961, 1200);
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
		//TODO add your code for jButton1.actionPerformed
		
		Registration obj=new Registration();
		obj.setVisible(true);
		this.dispose();
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed
		BookReg obj=new BookReg();
		obj.setVisible(true);
		this.dispose();
	}
	
	private void jButton3ActionPerformed(ActionEvent evt) {
		System.out.println("jButton3.actionPerformed, event="+evt);
		
		//TODO add your code for jButton3.actionPerformed
		Forgotpwd obj=new Forgotpwd();
		obj.setVisible(true);
		this.dispose();
	}
	
	
	private void jButton5ActionPerformed(ActionEvent evt) throws Exception {
		System.out.println("jButton5.actionPerformed, event="+evt);
		//TODO add your code for jButton5.actionPerformed
		RfidReader rr=new RfidReader();
		String tag=rr.enableRFIDReader();
		tag=tag.substring(1, tag.length());
		int result=Dbcon.checkfortheft(tag);
		if(result==0)
		{
			JOptionPane.showMessageDialog(null, "Book has been stolen")	;
			}
		else
		{
			
		}
	}
	
	private void jButton6ActionPerformed(ActionEvent evt) {
		System.out.println("jButton6.actionPerformed, event="+evt);
		//TODO add your code for jButton6.actionPerformed
		BookIssue obj=new BookIssue();
		obj.setVisible(true);
		this.dispose();

	}
	
	private void jButton7ActionPerformed(ActionEvent evt) throws Exception {
		System.out.println("jButton7.actionPerformed, event="+evt);
		
		int result=Dbcon.clearbooks();
		if(result==1)
		{
			JOptionPane.showMessageDialog(null, "cleared")	;
			}
		else
		{
			
		}
		//TODO add your code for jButton7.actionPerformed
	}
	
	private void jButton4ActionPerformed(ActionEvent evt) {
		System.out.println("jButton4.actionPerformed, event="+evt);
		//TODO add your code for jButton4.actionPerformed
		
		Fine obj=new Fine();
		obj.setVisible(true);
		this.dispose();
	}

}
