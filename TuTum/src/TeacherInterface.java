import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.*;

public class TeacherInterface extends JFrame {
	private JTabbedPane t1 = new JTabbedPane();
	private JScrollPane jp1;
	private JPanel jp2;
	private Container c1, c2;
	private JLabel l1, l2;
	private JTextField text1, text2;
	private JLabel header;
	 public TeacherInterface() {
		  setTitle("Teacher");  
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      buildContents();
	      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
	      setVisible(true); 
	}
   
	
    public void buildContents() {
    	  jp1=new JScrollPane();
    	  jp2=new JPanel();
    	  
    	  c2=getContentPane();
    	  
    	  l1=new JLabel("Attendance List");
    	  l2=new JLabel("Create Security Alert");
    	    
    	    jp1.add(l1);
    	    jp2.add(l2);
    	    c2.add(jp1);
    	    
    	    t1.addTab("Attendance List", jp1);
    	    t1.addTab("Create Security Alert", jp2);

    	    add(t1);
    	
    }
}
