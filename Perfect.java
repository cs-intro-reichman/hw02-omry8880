/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int input = Integer.parseInt(args[0]);
		int i = 1; // We'll start from 1 so we won't divide by 0
		int sum = 1; // We'll start from 1 because 1 is always a divider of number n, n >= 1
		String divisors = "1"; // 1 + ...other dividers (if any)

		while (i < input) {
			i++;
			if (input % i == 0 && i != input) { // #feedback - you can increase i after the if and then avoid having the "i != input" condition.
				sum += i;
				divisors += " + " + i;
			}
		}

		if (sum == input) {
			System.out.print(input + " is a perfect number since " + input + " = " + divisors);
		} else { 
			System.out.println(input + " is not a perfect number"); // 6, 24, 28, 496, 5002, 8128 
		}
	}
}
