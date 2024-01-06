/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int random, followingRand;

		random = (int) (10 * Math.random());

		do {
			followingRand = random;
			System.out.println(followingRand);
			random = (int) (10 * Math.random());

		} while (followingRand < random); // #feedback - should be >=
	}
}
