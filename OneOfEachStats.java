import java.util.Random;

/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get two command-line arguments: an int value
 * that determines how many families to simulate, and an int value
 * that serves as the seed of the random numbers generated by the program.
 * Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main(String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
		Random generator = new Random(seed);

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		int familiesWith2Children = 0;
		int familiesWith3Children = 0;
		int familiesWith4OrMoreChildren = 0;

		double sumOfAllTheChildren = 0;

		for (int t = 0; t < T; t++) {
			boolean isBoy = false;
			boolean isGirl = false;
			double birth = generator.nextDouble();
			int sumOfChildren = 1;

			if (birth == 0) {
				isGirl = true;
				while (!isBoy) {
					birth = generator;

					if (birth == 1) {
						isBoy = true;
					}
					sumOfChildren++;
				}
			} else {
				isBoy = true;
				while (!isGirl) {
					birth = generator;

					if (birth == 0) {
						isGirl = true;
					}
					sumOfChildren++;
				}

			}
			sumOfAllTheChildren += sumOfChildren;
			if (sumOfChildren == 2) {
				familiesWith2Children++;
			} else if (sumOfChildren == 3) {
				familiesWith3Children++;
			} else {
				familiesWith4OrMoreChildren++;
			}
		}

		System.out.println(sumOfAllTheChildren / (double) T + " children to get at lest one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesWith2Children);
		System.out.println("Number of families with 3 children: " + familiesWith3Children);
		System.out.println("Number of families with 4 or more children: " + familiesWith4OrMoreChildren);
		int max = familiesWith2Children;
		if (max < familiesWith3Children) {
			max = familiesWith3Children;
		}
		if (max < familiesWith4OrMoreChildren) {
			max = familiesWith4OrMoreChildren;
			System.out.println("The most common number of children is 4 or more");
		} else if (max == familiesWith2Children) {
			System.out.println("The most common number of children is 2");
		} else {
			System.out.println("The most common number of children is 3");
		}

	}
}
