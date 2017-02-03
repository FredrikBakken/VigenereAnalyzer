import java.util.ArrayList;
import java.util.Scanner;

class VigenereAnalyzer {

	public static Scanner sc = new Scanner(System.in);

	public static ArrayList<String> list = new ArrayList<String>();

	public static ArrayList<Double> ioc = new ArrayList<Double>();

	// Get the ciphertext from the user (removes all non-letter characters)
	public static char[] getCipher() {
		System.out.println("Please insert the vigènere cipher: ");
		String cipher = sc.nextLine();
		for (int i = 0; i < cipher.length(); i++) {
			cipher = cipher.replaceAll("[^a-zA-Z]", "");
		}
		char[] c = cipher.toCharArray();
		return c;
	}

	// Guess the key length
	public static int keyGuess() {
		System.out.println("\nHow long do you think the key length is? ");
		int k = sc.nextInt();
		return k;
	}

	// Getting the ciphertext sequences
	public static void getSequence(char[] c, int k) {
		System.out.println("");
		for (int i = 0; i < k; i++) {
			String seq = "";
			for (int j = 0; j < c.length; j++) {
				int v = j * k + i;
				if (v < c.length) {
					seq += String.valueOf(c[j * k + i]);
				}
			}
			list.add(seq);
		}
	}

	// Print the ciphertext sequences
	public static void printSequence() {
		int count = 1;
		for (String output : list) {
			System.out.println("Sequence " + count + ":\n" + output);
			System.out.println("Sequence avg.: " + IndexOfCoincidence.calculate(output) + "\n");
			ioc.add((double) IndexOfCoincidence.calculate(output));
			count++;
		}
	}

	// Get the average index of coincidence value
	public static double getAvg(int k) {
		double tot = 0.0000000000000;
		double avg = 0.0000000000000;

		for (int i = 0; i < ioc.size(); i++) {
			tot = tot + ioc.get(i);
		}

		avg = tot / k;

		return avg;
	}

	// Main method
	public static void main(String[] args) {
		char[] cipher;
		int key_guess;

		System.out.println("VIGÈNERE ANALYZER\n");
		cipher = getCipher();
		key_guess = keyGuess();

		getSequence(cipher, key_guess);
		printSequence();

		System.out.println("Index of Coincidence: " + getAvg(key_guess));
	}
}