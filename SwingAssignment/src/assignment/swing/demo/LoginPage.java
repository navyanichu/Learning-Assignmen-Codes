package assignment.swing.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
  
public class LoginPage {
	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("User Login");
		JLabel label = new JLabel();
		label.setBounds(20, 150, 200, 50);
		
		
		//User name field
		JLabel userLabel = new JLabel("Username:");
		userLabel.setBounds(20, 20, 80, 30);
		JTextField user = new JTextField();
		user.setBounds(100, 20, 100, 30);
		
		//Password field
		JLabel passLabel = new JLabel("Password:");
		passLabel.setBounds(20, 75, 80, 30);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100, 75, 100, 30);
		
		//Login button
		JButton submit = new JButton("Login");
		submit.setBounds(50, 150, 80, 30);
		
		//Action to authenticate user on click of login button 
		submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae)      
	    {  
	        String userValue = user.getText();         
	        String passValue = pass.getText();         
	          
	        //check whether the credentials are authentic or not  
	        if (userValue.equals("quest123") && passValue.equals("quest")) {   
	        	
	        	//If it is a valid user a pop up window will appear showing Welcome
	        	RegistrationPage regPage = new RegistrationPage();   
	        	
//	            JLabel success_label = new JLabel("Successfull Login..");
//	            success_label.setBounds(89, 30, 200, 50);
//	            JLabel valid_label = new JLabel();
//	            valid_label.setText( "Welcome: "+userValue);
//	            success_label.setHorizontalAlignment(JLabel.CENTER);
//	            valid_label.setHorizontalAlignment(JLabel.CENTER);
//	            page.getContentPane().add(success_label);
//	            page.getContentPane().add(valid_label); 
//	            page.getContentPane().setBackground(Color.GREEN);
	        }  
	        else{  
	        	
	        	//If it is a invalid user a pop up window will appear showing to enter valid credentials 
 
	        	 InvalidUser page = new InvalidUser();
	        	 page.setVisible(true);  
		            JLabel invalid_label = new JLabel();
		            invalid_label.setText("<html>Invalid credentials !!<br/>Please enter the valid username and password </html>");
		           
		            invalid_label.setHorizontalAlignment(JLabel.CENTER);
		            page.getContentPane().add(invalid_label);
		            page.getContentPane().setBackground(Color.orange);
	        }  
	    }}
	
);
		JButton reset = new JButton("Cancel");
		reset.setBounds(150, 150, 80, 30);
		
		//to clear contents on input on clicking Cancel
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText(null);
				pass.setText(null);
			}
		});
		
		//adding all elements to frame
		frame.add(label);
		frame.add(user);
		frame.add(pass);
		frame.add(userLabel);
		frame.add(passLabel);
		frame.add(submit);
		frame.add(reset);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(javax.swing.  
		        WindowConstants.DISPOSE_ON_CLOSE);
		
	}
}
