package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class encryption {
	public static void main(String[] args) {
		try {
			FileWriter fw  = new FileWriter("src/intro_to_file_io/test2.txt");
			String code = JOptionPane.showInputDialog("Enter a Message");
			fw.write(code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
