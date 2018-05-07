package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testReview implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton prev = new JButton();
	JButton next = new JButton();

	public static void main(String[] args) {
		testReview tr = new testReview();
	}

	testReview() {
		frame.add(panel);
		panel.add(label);
		panel.add(prev);
		panel.add(next);
		prev.setText("prev");
		next.setText("next");
		prev.addActionListener(this);
		next.addActionListener(this);
		frame.setVisible(true);
		String info = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/Students"));
			String line = br.readLine();
			info += line;
			while (line != null) {
				line = br.readLine();
				info += line;
			}

			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> words = new ArrayList<String>();
		String newString = "";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < info.length(); j++) {
				if (info.charAt(j) == ',') {
					words.add(newString);
					break;
				} else {
					newString += info.charAt(j);
				}
			}
			label.setText(words.get(i));
			frame.pack();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

class Student {
	int level;
	String firstName;
	String lastName;
	String location;
}