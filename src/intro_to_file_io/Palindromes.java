package intro_to_file_io;

import java.util.ArrayList;

public class Palindromes {
	boolean work = true;
	ArrayList<Character> array = new ArrayList<Character>();

	public boolean isPalindrome(String s) {
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			array.add(c);
		}
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == array.get(array.size() - i - 1)) {

			} else {
				return false;
			}
		}
		return true;

	}

}
