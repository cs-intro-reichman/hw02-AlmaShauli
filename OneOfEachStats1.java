/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		//// Put your code here

		int T = Integer.parseInt(args[0]);
		int familiesWith2Children = 0;
		int familiesWith3Children = 0;
		int familiesWith4OrMoreChildren = 0;

		double sumOfAllTheChildren = 0;

		for (int t = 0; t < T; t++) {
			boolean isBoy = false;
			boolean isGirl = false;
			int birth = (int) (2 * Math.random());
			int sumOfChildren = 1;

			if (birth == 0) {
				isGirl = true;
				while (!isBoy) {
					birth = (int) (2 * Math.random());

					if (birth == 1) {
						isBoy = true;
					}
					sumOfChildren++;
				}
			} else {
				isBoy = true;
				while (!isGirl) {
					birth = (int) (2 * Math.random());

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

		System.out.println(
				"Average: " + sumOfAllTheChildren / (double) T + " children to get at lest one of each gender.");
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
