package intro_to_file_io;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoTracker {
public static void main(String[] args) {
	ToDoTracker to = new ToDoTracker();
}
ToDoTracker(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.add(p);
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	b1.setText("add task");
	b2.setText("remove task");
	b3.setText("save");
	b4.setText("load");
	f.pack();
	f.setVisible(true);
}
}
