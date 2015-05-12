/**
 * 
 */
package strings;

import java.nio.ShortBuffer;

/**
 * @author macdja38 & Missile1337
 *
 */
public class Strings {
	private StringBuffer string = new StringBuffer("The quick brown fox jumps over the lazy dog");
	/**
	 * 
	 */
	public Strings() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Get the raw string that operations are being performed on.
	 * return String
	 */
	public String GetString() {
		return this.string.toString();
	}
	
	/**
	 * Set the target string other operations will be performed on.
	 * @param s
	 */
	public void SetString(String s) {
		this.string.delete(0, 500);
		this.string.append(s);
	}

	/**
	 * returns the index's of the character given
	 * @param character to find
	 * @return comma and space separated list of all positions of character
	 */
	public StringBuffer GetPos(char character) {
		StringBuffer SB = new StringBuffer();
		for(int i=0;i<this.string.length();i++) {
			if(this.string.charAt(i)==character) {
				SB.append(i+1 + ", ");
			}
		}
		return SB;
	}
	
	public int GetPos(String s) {
		return this.string.indexOf(s)+1;
	}

	public char GetChar(int i) {
		return this.string.charAt(i-1);
	}

	public int GetLength() {
		return this.string.length();
	}
	
	public String SubString(int i, int j) {
		return this.string.substring(i, i+j+1);
	}
}
