package intro_to_file_io;

import java.io.FileReader;
import java.io.FileWriter;

public class copywriter {
public static void main(String[] args) {
	try {
FileWriter fw = new FileWriter("src/intro_to_file_io/junk.java", true);
fw.write("//Copyright @ 2017 by Kaiya Park");
fw.close();
}
	catch(Exception e){
		
	}
}
}
