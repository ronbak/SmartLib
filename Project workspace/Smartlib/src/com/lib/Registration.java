package com.lib;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
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
public class Registration extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JButton jButton2;
	private JLabel jLabel11;
	private JComboBox jComboBox1;
	private JLabel jLabel10;
	private JTextField jTextField3;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JFormattedTextField jFormattedTextField3;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JFormattedTextField jFormattedTextField2;
	private JTextField jTextField2;
	private JButton jButton1;
	private JFormattedTextField jFormattedTextField1;
	private JTextField jTextField1;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Registration inst = new Registration();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setResizable(false);
			}
		});
	}
	
	public Registration() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(192,192,192));
		
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("User Registration");
				jLabel1.setBounds(427, 35, 402, 28);
				jLabel1.setFont(new java.awt.Font("Algerian",3,36));
				jLabel1.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Name");
				jLabel2.setBounds(72, 109, 194, 16);
				jLabel2.setFont(new java.awt.Font("Algerian",0,16));
				jLabel2.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Password");
				jLabel3.setBounds(72, 150, 194, 16);
				jLabel3.setBackground(new java.awt.Color(192,192,192));
				jLabel3.setFont(new java.awt.Font("Algerian",0,16));
				jLabel3.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Number");
				jLabel4.setBounds(72, 189, 194, 16);
				jLabel4.setFont(new java.awt.Font("Algerian",0,16));
				jLabel4.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Emailid");
				jLabel5.setBounds(72, 232, 194, 16);
				jLabel5.setFont(new java.awt.Font("Algerian",0,16));
				jLabel5.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("DOB");
				jLabel6.setBounds(72, 273, 194, 16);
				jLabel6.setFont(new java.awt.Font("Algerian",0,16));
				jLabel6.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Gender");
				jLabel7.setBounds(72, 312, 194, 16);
				jLabel7.setFont(new java.awt.Font("Algerian",0,16));
				jLabel7.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("Date of Registration");
				jLabel8.setBounds(72, 353, 194, 16);
				jLabel8.setFont(new java.awt.Font("Algerian",0,16));
				jLabel8.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("Address");
				jLabel9.setBounds(72, 451, 194, 16);
				jLabel9.setFont(new java.awt.Font("Algerian",0,16));
				jLabel9.setForeground(new java.awt.Color(255,255,255));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(266, 104, 204, 21);
				jTextField1.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent evt) {
						jTextField1KeyPressed(evt);
					}
				});
			}
			{
				MaskFormatter form1 = new MaskFormatter("##########");
				jFormattedTextField1 = new JFormattedTextField(form1);
				getContentPane().add(jFormattedTextField1);
				jFormattedTextField1.setBounds(266, 184, 204, 23);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(266, 227, 204, 23);
				jTextField2.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent evt) {
						jTextField2KeyPressed(evt);
					}
				});
			}
			{
				MaskFormatter form = new MaskFormatter("##/##/####");
				jFormattedTextField2 = new JFormattedTextField(form);
				getContentPane().add(jFormattedTextField2);
				jFormattedTextField2.setBounds(266, 268, 204, 23);
			}
			{
				
				jRadioButton1 = new JRadioButton();
				getContentPane().add(jRadioButton1);
				jRadioButton1.setText("Male");
				jRadioButton1.setBounds(266, 308, 76, 20);
			
				jRadioButton2 = new JRadioButton();
				getContentPane().add(jRadioButton2);
				jRadioButton2.setText("Female");
				jRadioButton2.setBounds(353, 308, 93, 20);
			
				ButtonGroup g= new ButtonGroup();
				g.add(jRadioButton1);
				jRadioButton1.setBackground(new java.awt.Color(192,192,192));
				g.add(jRadioButton2);
				jRadioButton2.setBackground(new java.awt.Color(192,192,192));

			}
			{
				MaskFormatter form2 = new MaskFormatter("##/##/####");
				jFormattedTextField3 = new JFormattedTextField(form2);
				getContentPane().add(jFormattedTextField3);
				jFormattedTextField3.setBounds(266, 348, 204, 23);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Submit");
				jButton1.setBounds(266, 578, 232, 50);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						try {
							jButton1ActionPerformed(evt);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});

			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(266, 449, 207, 65);
				{
					jTextArea1 = new JTextArea();
					jScrollPane1.setViewportView(jTextArea1);
					jTextArea1.setBounds(512, 455, 204, 62);
				}
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setBounds(266, 145, 204, 23);
			}
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("Location");
				jLabel10.setBounds(72, 394, 194, 16);
				jLabel10.setFont(new java.awt.Font("Algerian",0,16));
				jLabel10.setForeground(new java.awt.Color(255,255,255));
			}
			{
				ArrayList al=Dbcon.getLocation();
				ComboBoxModel jComboBox1Model = 
					new DefaultComboBoxModel(al.toArray());
				jComboBox1 = new JComboBox();
				getContentPane().add(jComboBox1);
				jComboBox1.setModel(jComboBox1Model);
				jComboBox1.setBounds(266, 394, 100, 23);
			}
			{
				jLabel11 = new JLabel();
				getContentPane().add(jLabel11);
				jLabel11.setText("(Password should contain only numbers)");
				jLabel11.setBounds(482, 148, 334, 16);
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Go to Admin Page");
				jButton2.setBounds(660, 605, 142, 23);
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			{
				jLabel12 = new JLabel();
				getContentPane().add(jLabel12);
				jLabel12.setText("jLabel12");
				jLabel12.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/t2.jpg")));
				jLabel12.setBounds(0, 0, 1967, 1080);
			}

			pack();
			this.setSize(1300, 750);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) throws Exception {
		System.out.println("jButton1.actionPerformed, event="+evt);
		
		String num=jFormattedTextField1.getText();
	
		int result=Dbcon.checkExistence(num);
		if(result>0)
		{
			JOptionPane.showMessageDialog(null, "User already exists");	
			}
			else
			{
		
		
		
		
		String name=jTextField1.getText();
	    String pass= jTextField3.getText();
	    int password=Integer.parseInt(pass);
	    
	    String emailid= jTextField2.getText();
	    String dob=jFormattedTextField2.getText();
	    String dateofreg = jFormattedTextField3.getText();
	    String address= jTextArea1.getText();
	    String gender = null;
	    if(jRadioButton1.isSelected()==true)
	    {
	    	gender=jRadioButton1.getText();
	    }
	    else if(jRadioButton2.isSelected()==true)
	    {
	    	gender=jRadioButton2.getText();
	    }
	  
	    Dbcon db =new Dbcon();
	    try {
	    	if(num.length()==0||name.length()==0||emailid.length()==0||dob.length()==0||dateofreg.length()==0||address.length()==0||gender.length()==0)
	    			{
	    		JOptionPane.showMessageDialog(null, "Please fill all the details" );
	    	}
	    	else
	    	{
			db.toDatabase(num,name,emailid, dob,address,dateofreg,gender,password,jComboBox1.getSelectedItem().toString());
	    	}}
	    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jFormattedTextField1.setText("");     
		jFormattedTextField2.setText("");
		jFormattedTextField3.setText("");
		jTextArea1.setText("");

		
		
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		System.out.println("jButton2.actionPerformed, event="+evt);
		//TODO add your code for jButton2.actionPerformed
		
		AdminPage obj=new AdminPage();
		obj.setVisible(true);
		this.dispose();
		
		
		}
	
	private void jTextField2KeyPressed(KeyEvent evt) {
		System.out.println("jTextField2.keyPressed, event="+evt);
		//TODO add your code for jTextField2.keyPressed

		String email=jTextField2.getText();
Pattern p = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
Matcher m = p.matcher(email);
if (!m.find())
{
jTextField2.setForeground(Color.RED);
//JOptionPane.showMessageDialog(null, "please enter a valid email-id");
}else
{
jTextField2.setForeground(Color.BLACK);
}
	}
	
	private void jTextField1KeyPressed(KeyEvent evt) {
		System.out.println("jTextField1.keyPressed, event="+evt);
		//TODO add your code for jTextField1.keyPressed
	
		String name=jTextField1.getText();
		Pattern pt=Pattern.compile("[0-9,!@#$%^&*()_}{.,?]");
		Matcher mt=pt.matcher(name);
		if(mt.find()){
			jTextField1.setForeground(Color.red);
			
			
			}else{
				jTextField1.setForeground(Color.BLACK);
			}
	
	
	}

}
