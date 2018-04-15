import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComponent.*;
import javax.swing.text.JTextComponent.*;
import javax.swing.JOptionPane;


public class ListOfAlertsGui{
	//instance variable section -- GUI components
	private JFrame listFrame;
	private JLabel listLabel;
	private JPanel controlPanel;
	
	//constructor
	public ListOfAlertsGui() {
		createGUI();
	}
	
	public static void main(String[] args) {
		ListOfAlertsGui listOfAlerts = new ListOfAlertsGui();
		listOfAlerts.showTextAreaDemo();
		
	}
	private void createGUI() {
		listFrame = new JFrame("List of Alerts");
		listFrame.setSize(400,400);
		listFrame.setLayout(new GridLayout(3,1));
		
		listFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
			});
		listLabel = new JLabel("", JLabel.CENTER);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		listFrame.add(listLabel);
		listFrame.add(controlPanel);
		listFrame.setVisible(true);
	}
	private void showTextAreaDemo() {
		listLabel.setText("List of Alerts");
		JLabel commentLabel = new JLabel("Alert:", JLabel.RIGHT);
		
		JTextArea commentTextArea = new JTextArea("ALERT",5,20);
		
		JScrollPane scrollPane = new JScrollPane(commentTextArea);
		JButton showButton = new JButton("Load");
		
		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "List of all alerts have been printed");
			}
				
			});
		controlPanel.add(commentLabel);
		controlPanel.add(scrollPane);
		controlPanel.add(showButton);
		listFrame.setVisible(true);
	}
	
	}
	
