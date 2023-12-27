/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		//// Write your code here

		// Rolls a number between 0 (inclusive) to 10 (not inclusive)
		int x = (int) (10 * Math.random());

		// Prints the number that rolled
		System.out.print(x + " ");

		// Rolls a number between 0 (inclusive) to 10 (not inclusive)
		int y = (int) (10 * Math.random());

		//
		while (x <= y) {

			// Prints thr number that rolled
			System.out.print(y + " ");

			// Changes the last number to the new last number
			x = y;

			// Rolls a number between 0 (inclusive) to 10 (not inclusive)
			y = (int) (10 * Math.random());

			// Checks if the rolled number is lees than or equal to the last number printed
		}

	}
}
