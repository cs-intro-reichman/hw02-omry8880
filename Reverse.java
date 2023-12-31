/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){ 
		String str = args[0];

		int j = str.length();
		int middle = j%2==0 ? (j+1) / 2 : j / 2;
		String reversed = "";

		while (j != 0) {
			reversed += str.charAt(j - 1);
			j -= 1;
		}

		System.out.println(reversed + "\nThe middle character is " + str.charAt(middle));
	}
}
