/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		double randomOne, randomTwo;

		randomOne = (int) (10 * Math.random());
		randomTwo = (int) (10 * Math.random());

		do { 
			System.out.println(randomOne);
			System.out.println(randomOne < randomTwo ? randomTwo : "");
			randomOne = (int) (10 * Math.random());
			randomTwo = (int) (10 * Math.random());
		} while (randomOne < randomTwo);
	}
}
