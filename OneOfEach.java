
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		//// Put your code here

		boolean isBoy = false;
		boolean isGirl = false;
		int birth = (int) (2 * Math.random());
		int sum = 1;
		int sumOfChildren = sum;

		if (birth == 0) {
			isGirl = true;
			while (!isBoy) {
				birth = (int) (2 * Math.random());

				if (birth == 1) {
					isBoy = true;
				}
				sum++;
			}
			sumOfChildren += sum;
			while (sum != 0) {
				System.out.print("g ");
				sum--;
			}
			System.out.print("b");
		} else {
			isBoy = true;
			while (!isGirl) {
				birth = (int) (2 * Math.random());

				if (birth == 0) {
					isGirl = true;
				}
				sum++;
			}
			sumOfChildren += sum;
			while (sum != 0) {
				System.out.print("b ");
				sum--;
			}
			System.out.print("g");
		}
		System.out.println("");
		System.out.println("You made it... and you now have " + sumOfChildren + " children");
	}
}
