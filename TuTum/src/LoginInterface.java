import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* TODO:
 	Add action listener
	link login functionality to the database
	route successful teacher logins to teacher interface
	route successful guard logins to guard interface
*/
public class LoginInterface extends JFrame {
	
	// instance variable section -- GUI components
	 private JLabel lblUsername, lblPassword;
	 private JTextField txtUsername, txtPassword;
	 private JButton btnLogin;
	 private JPanel pnlUsername, pnlButton, pnlPassword;
	 private DatabaseConnection dbLoginAPI;
	 
	 // constructor
	 public LoginInterface(DatabaseConnection d) {
		  setTitle("Login");  
	      setSize(350, 200);   
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	      buildContents();
	      pack(); // optional(gets rid of whitespace)
	      setVisible(true); 
	      
	      dbLoginAPI = d;
	 }
	 
	 // Generates all JComponents on the UI
	 public void buildContents() {
		 //initializing instance variables
		 lblUsername = new JLabel("Username: ");
		 txtUsername = new JTextField(10);
		 txtUsername.setToolTipText("Type your Username");
		 
		 lblPassword = new JLabel("Password: ");
		 txtPassword = new JTextField(10);
		 txtPassword.setToolTipText("Type in your Password");
		 
		 btnLogin = new JButton("Login");
		 btnLogin.addActionListener(new LoginListener());
		 //add actionListener here
		 pnlPassword = new JPanel();
		 pnlUsername = new JPanel();
		 pnlButton = new JPanel();
		 //adding panels to frame
		 pnlUsername.add(lblUsername);
		 pnlUsername.add(txtUsername);
		 
		 pnlPassword.add(lblPassword);
		 pnlPassword.add(txtPassword);
		 
		 pnlButton.add(btnLogin);
		 
		 //adding panels to frame
		setLayout(new GridLayout(3,1));
		add(pnlUsername);
		add(pnlPassword);
		add(pnlButton);
		 
	 }
	 
	 class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
		}
	 }
}
