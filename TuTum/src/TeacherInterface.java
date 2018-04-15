import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.*;

public class TeacherInterface extends JFrame {
	private JTabbedPane t1 = new JTabbedPane();
	private JPanel jp1, jp2, levelPanel, messagePanel, studentList;
	private JButton create = new JButton("Create");
	private JScrollPane jsp1;
	private Container c1, c2;
	private JLabel l1, l2, l3, l4;
	private JTextField text1, text2, button;
	private JLabel header;
	
	private String id;
	
	 public TeacherInterface(String teacher_id) {
		  setTitle("Teacher");  
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      buildContents();
	      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
	      setResizable(false);
	      pack();
	      setLocationRelativeTo(null);
	      setVisible(true);
	      
	      this.id = teacher_id;
	 }
   
	
    public void buildContents() {
    	  jp1 = new JPanel();
    	  jp2 = new JPanel();
    	  levelPanel = new JPanel();
    	  messagePanel = new JPanel();
    	  studentList = new JPanel();
    	  GridLayout layoutsubPanels = new GridLayout(2,1);
    	  GridLayout layoutPanels = new GridLayout(3,1);
    	  
          TableModel dataModel = new AbstractTableModel() {
              public int getColumnCount() { return 5; }
              public int getRowCount() { return 10;}
              public Object getValueAt(int row, int col) { return new Integer(69); }
          };
          JTable table = new JTable(dataModel);
          table.setValueAt("Hey",0,0);
          jp1.add(table);
    	  
    	  l3 = new JLabel("Alert Level (0, 1, 2)");
    	  l4 = new JLabel("Message");
    	  
    	  TextField level, message;
    	  level = new TextField();
    	  message = new TextField();
    	  jp2.setLayout(layoutPanels);
    	  create.setPreferredSize(new Dimension(200,40));
    	  levelPanel.add(l3);
    	  levelPanel.setLayout(layoutsubPanels);
    	  messagePanel.add(l4);
    	  messagePanel.setLayout(layoutsubPanels);
    	  levelPanel.add(level);
    	  messagePanel.add(message);
    	    jp2.add(levelPanel);
    	    jp2.add(messagePanel);
    	    jp2.add(create);
    	    
    	    t1.addTab("Attendance List", jp1);
    	    t1.addTab("Create Security Alert", jp2);

    	    add(t1);
    	
    }
}
