/**
 * 
 */
package strings;

import java.util.StringTokenizer;

/**
 * @author macdja38 & Missile1337
 *
 */
public class StringsTester {

	/**
	 * 
	 */
	public static void main(String args[]) {
		int MenuOption = 0;
		int i;
		int j;
		Strings String = new Strings();
		System.out.println("1) Set the reference String.");
		System.out.println("2) Get the reference String.");
		System.out.println("3) Test the position of a letter (letter provided by user) (if there is more than one, return all positions of that letter.)");
		System.out.println("4) the position of a word (word provided by user)");
		System.out.println("5) the first character in the string");
		System.out.println("6) the character at position x of a string");
		System.out.println("7) the length of the entire string");
		System.out.println("8) the last word in the string");
		System.out.println("9) a substring that starts at a particular position and is a particular number of characters long (provided by user)");
		System.out.println("10) Convert the entire text to upper case");
		System.out.println("11) Get the character code of a particular character (provided by user)");
		System.out.println("12) Display the sentence as tokens, having each token on the next line.");
		System.out.println("99) Enter 99 to quit");
		while(true){
			MenuOption = Keyboard.getInteger();
			switch(MenuOption) {
			case 1:
				System.out.println("Please enter a new target string:");
				String.SetString(Keyboard.getString());
				break;
			case 2:
				System.out.println("Current target string is:");
				System.out.println(String.GetString());
				break;
			case 3:
				System.out.println("The character can be found at: " + String.GetPos(Keyboard.getCharacter()));
				break;
			case 4:
				System.out.println("The String can be found at " + String.GetPos(Keyboard.getString()));
				break;
			case 5:
				System.out.println("The first letter is " + String.GetChar(0 ));
				break;
			case 6:
				System.out.println("Input the index of the target character.");
				i = Keyboard.getInteger(0, String.GetLength());
				System.out.println("The letter at " + i + " is " + String.GetChar(i));
				break;
			case 7:
				System.out.println("The string is " + String.GetLength() + " Characters long."); 
				break;
			case 8:
				StringTokenizer tkns = new StringTokenizer(String.GetString());
			    while (tkns.countTokens()>1) {
			    	tkns.nextToken();
			    }
			    System.out.println(tkns.nextToken());
			    tkns=null;
			    System.gc();
				break;
			case 9:
				System.out.println("Please input the starting position of the substring.");
				i=Keyboard.getInteger(0,String.GetLength());
				System.out.println("Please input the length of the substring.");
				j=Keyboard.getInteger(1,String.GetLength()-i);
				System.out.println(String.SubString(i-1,j-1));
				break;
			case 10:
				System.out.println(String.GetString().toUpperCase());
				break;
			case 11:
				System.out.println((int)Keyboard.getCharacter());
				break;
			case 12:
				StringTokenizer tkns1 = new StringTokenizer(String.GetString());
			    while (tkns1.hasMoreTokens()) {
			        System.out.println(tkns1.nextToken());
			    }
			    tkns1=null;
			    System.gc();
				break;
			case 99:
				return;
			default:
				System.out.println("Please enter a valid Command.");
			}
		}
	}

}