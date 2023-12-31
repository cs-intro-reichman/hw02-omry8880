/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double child;
		int count = 0;

		boolean girl = false;
		boolean boy = false;

		// New variables
		int experiments = Integer.parseInt(args[0]);
		double average;
		String mostCommon;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		int totalChildren = 0;

		for (int i = 0; i < experiments; i++) {
			count = 0;
			girl = false;
			boy = false;
			while (!(girl && boy)) {
				child = Math.random();
				if (child > 0.5) {
					girl = true;
				} else { 
					boy = true;
				}
				count++;
			}
			totalChildren += count;
			if (count == 2) {
				twoChildren += 1;
			}
			else if (count == 3) {
				threeChildren += 1;
			} else {
				fourOrMoreChildren += 1;
			}

		}
		average = Double.valueOf(totalChildren) / Double.valueOf(experiments);

		if (twoChildren > threeChildren && twoChildren > fourOrMoreChildren) {
			mostCommon = "2";
		}
		else if (threeChildren > twoChildren && threeChildren > fourOrMoreChildren) {
			mostCommon = "3";
		}
		else {
			mostCommon = "4 or more";
		}

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 children: " + fourOrMoreChildren);
		System.out.println("The most common number of children is " + mostCommon + ".");
	}
}
