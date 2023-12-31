/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// given a number x, print all its divisors
		int num = Integer.parseInt(args[0]);

		// i cannot be zero because then we'll be dividing by zero which is undefined. We'll start from 1 and end the count with the number given.
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
