/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//// Put your code here

		// Receiving string
		String str = args[0];

		// Prints the string received in reverse order
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i - 1));
		}

		// Prints the middle character
		System.out.println("");
		System.out.println("The middle character is " + str.charAt((str.length() - 1) / 2));

	}
}
