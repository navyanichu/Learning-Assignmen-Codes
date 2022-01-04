package assignment.swing.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage {
	JTextField text, value;

	public static void main(String[] args) {

		
		JFrame frame = new JFrame("Login");
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
	        	ValidUser page = new ValidUser();   

	            page.setVisible(true);  
	            JLabel valid_label = new JLabel("Welcome: "+userValue);
	            page.getContentPane().add(valid_label); 
	        }  
	        else{  
	        	
	        	//If it is a invalid user a pop up window will appear showing to enter valid credentials 
 
	        	 InvalidUser page = new InvalidUser();
	        	 page.setVisible(true);  
		            JLabel invalid_label = new JLabel("Please enter valid username and password");
		            page.getContentPane().add(invalid_label);
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
		frame.add(pass);
		frame.add(userLabel);
		frame.add(label);
		frame.add(passLabel);
		frame.add(submit);
		frame.add(user);
		frame.add(reset);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);

	}
}
