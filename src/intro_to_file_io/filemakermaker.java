package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class filemakermaker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton save = new JButton();
	JButton load = new JButton();
	JTextArea textarea = new JTextArea(50, 50);

	public static void main(String[] args) {
		new filemakermaker();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(save)) {
			String fileName = JOptionPane.showInputDialog("Name your file");
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/" + fileName + ".txt");
				fw.write(textarea.getText());
				textarea.setText("");
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else {
			if (textarea.getText().isEmpty()) {
				String nameFile = JOptionPane.showInputDialog("What is the name of your file?");
				try {
					BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/" + nameFile + ".txt"));

					String line = br.readLine();
					while (line != null) {
						textarea.setText(line);
						line = br.readLine();
					}
					br.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			} else {
				int response = JOptionPane.showConfirmDialog(null, "Are you sure? you should save your work");
				if (response == 0) {
					String nameFile = JOptionPane.showInputDialog("What is the name of your file?");
					try {
						BufferedReader br = new BufferedReader(
								new FileReader("src/intro_to_file_io/" + nameFile + ".txt"));

						String line = br.readLine();
						while (line != null) {
							textarea.setText(line);
							line = br.readLine();
						}
						br.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
			}
		}
	}

	filemakermaker() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(save);
		panel.add(load);
		save.setText("save");
		load.setText("load");
		save.addActionListener(this);
		load.addActionListener(this);
		panel.add(textarea);
		frame.pack();
		frame.setVisible(true);
	}
}
