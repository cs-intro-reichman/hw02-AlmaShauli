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
		int y = 0;

		do {

			// Prints thr number that rolled
			System.out.print(x + " ");

			// Changes the last number to the new last number
			y = x;

			// Rolls a number between 0 (inclusive) to 10 (not inclusive)
			x = (int) (10 * Math.random());
		}
		// Checks if the rolled number is less than or equal to the last number printed
		while (x >= y);
	}
}
