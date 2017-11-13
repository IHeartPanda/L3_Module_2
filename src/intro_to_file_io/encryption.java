package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class encryption {
	public static void main(String[] args) {
		String x = "";
		String code = "";

		try {
			FileWriter fw = new FileWriter("encrpyt");
			code = JOptionPane.showInputDialog("Enter a Message");
			for (int i = 0; i < code.length(); i++) {
				x += (char) (code.charAt(i) * 2);
			}
			System.out.println(x);
			fw.write(x);
			fw.close();

		} catch (IOException r) {
			// TODO Auto-generated catch block
			r.printStackTrace();
		}

	}
}
