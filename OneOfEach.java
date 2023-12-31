
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double child;
		int count = 0;

		boolean girl = false;
		boolean boy = false;

		while (!(girl && boy)) {
			count++;
			child = Math.random();
			if (child > 0.5) {
				girl = true;
				System.out.print("g ");
			} else { 
				boy = true;
				System.out.print("b ");
			}
		}

		System.out.println("\nYou made it... and you now have " + count + " children.");
	}
}
