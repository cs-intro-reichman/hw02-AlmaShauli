/**
 * Gets a command-line argument (int), and prints all the divisors of the given
 * number.
 */
public class Divisors {
	public static void main(String[] args) {
		//// Put your code here

		// Receiving number
		int x = Integer.parseInt(args[0]);

		// Determining the smallest divisor
		int d = 1;

		// Checking if the divisor is less than or equal to the number received
		while (d <= x) {

			// Checking if d is a divisor of x
			if (x % d == 0) {

				// Prints the divisor number
				System.out.println(d);
			}

			// Increases the divisor number by 1
			d += 1;
		}

	}
}
