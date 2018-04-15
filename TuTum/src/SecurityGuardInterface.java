import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SecurityGuardInterface extends JFrame {
	//instance variable section -- GUI components
	private JButton btnPotential, btnSuspect, btnEmergency;
	private JPanel potentialPanel, suspectPanel, emergencyPanel;
	
	private String id;
	
	//constructor
		 public SecurityGuardInterface(String guard_id) {
			  setTitle("Security Guard Alerts");  
		      setSize(350, 200);   
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		      buildContents();
		      pack(); // optional(gets rid of whitespace)
		      setVisible(true); 
		      setResizable(false);
		      
		      this.id = guard_id;
		   }
		 public void buildContents() {
			 
			 //initializing instance variables
			 btnEmergency = new JButton("EMERGENCY");
			 btnSuspect = new JButton("Suspicous activity");
			 btnPotential = new JButton("Potential threat");
			
			 
			 //tooltips
			 btnEmergency.setToolTipText("Press to contact law enforcement");
			 btnSuspect.setToolTipText("Press if danger may increase");
			 btnPotential.setToolTipText("Press if there may be danger");
			 
			 potentialPanel = new JPanel();
			 suspectPanel = new JPanel();
			 emergencyPanel = new JPanel();
			 
			 
			 //adding panels to frame
			 potentialPanel.add(btnPotential);
			 suspectPanel.add(btnSuspect);
			 emergencyPanel.add(btnEmergency);
		

			// adjusting panels
		    setLayout(new BorderLayout());
			add(potentialPanel, BorderLayout.LINE_START);
			add(suspectPanel, BorderLayout. LINE_END);
			add(emergencyPanel, BorderLayout.CENTER);
		 
		 }
}

	

