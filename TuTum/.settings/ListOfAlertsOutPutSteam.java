import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;

public class ListOfAlertsOutPutSteam extends OutputStream {
	//instance variable section -- GUI components
	private JFrame mainFrame;
	private JLabel listOfAlertsLabel;
	private JLabel selectLabel;
	private JPanel controlPanel;
	
	//constructor
	 public ListOfAlertsGui() {
		
