package com.lib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
public class Login extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JButton jButton1;
	private JPasswordField jPasswordField1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Login() {
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
				jLabel1.setText("UserName");
				jLabel1.setBounds(156, 135, 71, 20);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(273, 132, 198, 23);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Password");
				jLabel2.setBounds(156, 193, 71, 26);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Login");
				jButton1.setBounds(246, 278, 83, 28);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jPasswordField1 = new JPasswordField();
				getContentPane().add(jPasswordField1);
				jPasswordField1.setBounds(273, 195, 198, 23);
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
		String username=jTextField1.getText();
		String password=jPasswordField1.getText();
	if(username.equals("Admin")&&password.equals("admin"))
	{
		AdminPage obj=new AdminPage();
		obj.setVisible(true);
		this.dispose();
	}
	else
		JOptionPane.showMessageDialog(null, "Invalid Login Credentails");
	}

}
