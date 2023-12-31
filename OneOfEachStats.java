import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		double child;
		int count = 0;

		boolean girl = false;
		boolean boy = false;

		// New variables
		double average;
		String mostCommon;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		int totalChildren = 0;

		for (int i = 0; i < T; i++) {
			count = 0;
			girl = false;
			boy = false;
			while (!(girl && boy)) {
				child = generator.nextDouble();
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
		average = Double.valueOf(totalChildren) / Double.valueOf(T);

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
