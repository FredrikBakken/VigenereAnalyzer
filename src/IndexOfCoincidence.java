// Index of Coincidence source:
// http://www.cs.trincoll.edu/~crypto/student/emilio/IC.java
public class IndexOfCoincidence {
	public static double calculate(String s) {
		int i;
		int N = 0;
		double sum = 0.0000000000000;
		double total = 0.0000000000000;
		s = s.toUpperCase();

		// Initialize array of values to count frequency of each letter
		int[] values = new int[26];
		for (i = 0; i < 26; i++) {
			values[i] = 0;
		}

		// Calculate frequency of each letter in s
		int ch;
		for (i = 0; i < s.length(); i++) {
			ch = s.charAt(i) - 65;
			if (ch >= 0 && ch < 26) {
				values[ch]++;
				N++;
			}
		}

		// Calculate the sum of each frequency
		for (i = 0; i < 26; i++) {
			ch = values[i];
			sum = sum + (ch * (ch - 1));
		}

		// Divide by N(N-1)
		total = sum / (N * (N - 1));

		// Return the result
		return total;

	}
}