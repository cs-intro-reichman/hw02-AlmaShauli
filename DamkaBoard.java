/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here

		// Receiving number
		int n = Integer.parseInt(args[0]);

		// Set the starting line number
		int line = 0;

		// Checks that the line is not bigger than the received number
		while (n > line) {

			// Checks if is a even line
			if (line % 2 == 0) {

				// Prints n times *
				for (int i = 0; i < n; i++) {

					System.out.print("* ");
				}
			} else {

				// Prints n times *
				for (int i = 0; i < n; i++) {

					System.out.print(" *");
				}
			}

			// Skip to the next line
			System.out.println("");

			line++;
		}
	}
}
