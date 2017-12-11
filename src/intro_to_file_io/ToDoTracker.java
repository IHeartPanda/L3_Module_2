package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoTracker implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	ArrayList <String> a = new ArrayList <String> ();
	int p = -1;
public static void main(String[] args) {
	ToDoTracker to = new ToDoTracker();
} 
ToDoTracker(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.add(p);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	b1.setText("add task");
	b2.setText("remove task");
	b3.setText("save");
	b4.setText("load");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	f.pack();
	f.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(b1)) {
		String task = JOptionPane.showInputDialog("Enter a task");
		a.add(task);
		System.out.println(a);
		p = p + 1;
	}
	if(e.getSource().equals(b2)) {
		a.remove(p);
		p = p - 1;
		System.out.println(a);
	}
	if(e.getSource().equals(b3)) {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/file.txt");
			for (int i = 0; i < a.size(); i++) {
			fw.write(a.get(i) + "\n");	
			}
			JOptionPane.showMessageDialog(null, "Saving...");
			fw.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	if(e.getSource().equals(b4)) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/file.txt"));
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				a.add(line);
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException d) {
			// TODO Auto-generated catch block
			d.printStackTrace();
		}
	}
}
}
