package assignment.swing.demo;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistrationPage extends JFrame implements ActionListener{

	
	// Java program to implement
	// a Simple Registration Form
	// using Java Swing


		// Components of the Form
		
		 JLabel title,name,mob,gender,dob;
		 JTextField tname,tmob;
		 JRadioButton male,female;
		ButtonGroup gengp;
		 JComboBox date;
		 JComboBox month;
		 JComboBox year;
		 JLabel add;
		 JTextArea tadd;
		 JButton sub,reset;
		 JTextArea tout;
		 
		 JLabel res;
		

		private String dates[]
			= { "1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25",
				"26", "27", "28", "29", "30",
				"31" };
		private String months[]
			= { "Jan", "feb", "Mar", "Apr",
				"May", "Jun", "July", "Aug",
				"Sup", "Oct", "Nov", "Dec" };
		private String years[]
			= { "1995", "1996", "1997", "1998",
				"1999", "2000", "2001", "2002",
				"2003", "2004", "2005", "2006",
				"2007", "2008", "2009", "2010",
				"2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018",
				"2019" };

		// constructor, to initialize the components
		// with default values.
		public RegistrationPage()
		{
			
			setTitle("User Registration");
			setBounds(300, 90, 800, 600);
			setDefaultCloseOperation(javax.swing.  
			        WindowConstants.DISPOSE_ON_CLOSE);
			setResizable(false);

			
			setLayout(null);

			title = new JLabel("Registration Form");
			title.setFont(new Font("Arial", Font.PLAIN, 30));
			title.setSize(300, 30);
			title.setLocation(300, 30);
			add(title);

			name = new JLabel("Name");
			
			name.setSize(100, 20);
			name.setLocation(100, 100);
			add(name);

			tname = new JTextField();
			tname.setSize(190, 20);
			tname.setLocation(200, 100);
			add(tname);

			mob = new JLabel("Mobile");
			mob.setSize(100, 20);
			mob.setLocation(100, 150);
			add(mob);

			tmob = new JTextField();
			
			tmob.setSize(150, 20);
			tmob.setLocation(200, 150);
			add(tmob);

			gender = new JLabel("Gender");
			
			gender.setSize(100, 20);
			gender.setLocation(100, 200);
			add(gender);

			male = new JRadioButton("Male");
			male.setSelected(true);
			male.setSize(75, 20);
			male.setLocation(200, 200);
			add(male);

			female = new JRadioButton("Female");
			female.setSelected(false);
			female.setSize(80, 20);
			female.setLocation(275, 200);
			add(female);

			gengp = new ButtonGroup();
			gengp.add(male);
			gengp.add(female);

			dob = new JLabel("DOB");
			dob.setSize(100, 20);
			dob.setLocation(100, 250);
			add(dob);

			date = new JComboBox(dates);
			date.setSize(50, 20);
			date.setLocation(200, 250);
			add(date);

			month = new JComboBox(months);
			month.setSize(60, 20);
			month.setLocation(250, 250);
			add(month);

			year = new JComboBox(years);
			year.setSize(60, 20);
			year.setLocation(320, 250);
			add(year);

			add = new JLabel("Address");
			add.setSize(100, 20);
			add.setLocation(100, 300);
			add(add);

			tadd = new JTextArea();
			
			tadd.setSize(200, 75);
			tadd.setLocation(200, 300);
			tadd.setLineWrap(true);
			add(tadd);

			

			sub = new JButton("Submit");
			
			sub.setSize(100, 20);
			sub.setLocation(150, 450);
			sub.addActionListener(this);
			add(sub);

			reset = new JButton("Cancel");
			
			reset.setSize(100, 20);
			reset.setLocation(270, 450);
			reset.addActionListener(this);
			add(reset);

			


			res = new JLabel("");
			
			res.setSize(500, 25);
			res.setLocation(100, 500);
			add(res);


			setVisible(true);
		}
		

		
		public void actionPerformed(ActionEvent e)
		{
			JFrame userFrame=new JFrame();
			userFrame.setTitle("Registered User Data");
			 JLabel userTitle =new JLabel("Registered User Data");
			 userTitle.setFont(new Font("Arial", Font.PLAIN, 30));
			 userFrame.add(userTitle);
			userFrame.setBounds(300, 90, 500, 500);
			if (e.getSource() == sub) {
				String data1;
			     String data
		         = "  Name : "
		           + tname.getText() + "\n"
		           + "\n" +"  Mobile : "
		           + tmob.getText() + "\n";
		     if (male.isSelected())
		         data1 = "\n" + "  Gender : Male"
		                 + "\n";
		     else
		         data1 = "\n" + "  Gender : Female"
		                 + "\n";
		     String data2
		         =  "\n" +"  DOB : "
		           + (String)date.getSelectedItem()
		           + "/" + (String)month.getSelectedItem()
		           + "/" + (String)year.getSelectedItem()
		           + "\n";
		     String data3 ="\n"+ "  Address : " + tadd.getText();

		     tout = new JTextArea();
		        
		        tout.setSize(300, 400);
		        tout.setLineWrap(true);
		        tout.setEditable(false);
		        userFrame.add(tout);
		        tout.setText(data + data1 + data2 + data3);
		        
		    userFrame.setVisible(true);
		    userFrame.add(userTitle);

		     
		}
				
				
			

			else if (e.getSource() == reset) {
				
				tname.setText(null);
				tadd.setText(null);
				tmob.setText(null);
				res.setText(null);
//				setText(null);
				date.setSelectedIndex(0);
				month.setSelectedIndex(0);
				year.setSelectedIndex(0);
				
			}
		}
		
		
	}

	// Driver Code
	
		
	


	


