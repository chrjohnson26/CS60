package com.gradescope.hw4;

public class Hw4Pr3Recursion {

	/**
	 * Counts the number of divisible integers
	 * 
	 * @param n - a non-negative integer indicating the range to check
	 * @param k - a positive integer indicating the divisor
	 * @return the number of integers between 0 and n (inclusive) that are divisible
	 *         by k
	 */
	public static int countDivisibleBy(int n, int k) {
		if (n == 0) {
			return 1;
		} else if (n % k == 0) {
			return countDivisibleBy(n - 1, k) + 1;
		} else {
			return countDivisibleBy(n - 1, k);
		}
	}

	public static void main(String[] args) {
		// You can add debugging statements here to test your methods!
	}

}
