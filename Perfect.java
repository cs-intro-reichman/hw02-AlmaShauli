/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		//// Put your code here

		// Receiving number
		int N = Integer.parseInt(args[0]);

		// A string that say that the number N is a perfect number
		String str = N + " is a perfect number since " + N + " = 1";

		// Determining the smallest divisor (not including 1)
		int d = 2;

		// Sum of the divisor
		int sum = 1;

		// Checking if the divisor is less than the number received
		while (d < N) {

			// Determining an integer k that help to check if d is a divisor of N
			for (int k = 1; k < N + 1; k++) {

				// Checking if d is a divisor of N
				if (k * d == N) {

					// Adds the divisor to the string
					str += " + " + d;

					// Adds the divisor to the sum of the divisors
					sum += d;
				}
			}

			// Increases the divisor number by 1
			d += 1;
		}

		// Checks if N is a perfect number and prints the answer
		if (sum == N) {
			System.out.println(str);
		} else {
			System.out.println(N + " is not a perfect number");
		}

	}
}
