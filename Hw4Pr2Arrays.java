package com.gradescope.hw4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

/**
 * Fill in the body of the methods below based upon the specification provided.
 * It may be helpful to look at the test cases provided in Hw4Pr2ArraysTest.java
 * to understand the intended behavior of the method.
 * 
 * All content is based upon problems at CodingBat.com.
 */

public class Hw4Pr2Arrays {

	/**
	 * Given an array of ints, return the number of 9's in the array.
	 * 
	 * Source: http://codingbat.com/prob/p184031 (answer available)
	 */
	public static int arrayCount9(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Given an array of ints, return true if one of the first 4 elements in the
	 * array is a 9. The array length may be less than 4.
	 * 
	 * Source: http://codingbat.com/prob/p186031 (answer available)
	 */
	public static boolean arrayFront9(int[] nums) {
		int end = 4;
		if (nums.length < 4) {
			end = nums.length;
		}
		for (int i = 0; i < end; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array
	 * somewhere.
	 * 
	 * Source: http://codingbat.com/prob/p136041 (answer available)
	 */
	public static boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1) {
				if (nums[i + 1] == 2) {
					if (nums[i + 2] == 3) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return the number of times that two 6's are next to
	 * each other in the array plus the number of times where a 6 is followed by a
	 * 7.
	 * 
	 * Source: http://codingbat.com/prob/p110019 (answer available)
	 */
	public static int array667(int[] nums) {
		int counter = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6) {
				if (nums[i + 1] == 6) {
					counter++;
				}
				if (nums[i + 1] == 7) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * Given an array of ints, we'll say that a triple is a value appearing 3 times
	 * in a row in the array. Return true if the array does not contain any triples.
	 * 
	 * Source: http://codingbat.com/prob/p170221 (answer available)
	 */
	public static boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Given an array of ints, return true if 6 appears as either the first or last
	 * element in the array. The array will be length 1 or more.
	 * 
	 * Source: http://codingbat.com/prob/p185685 (hint available)
	 */
	public static boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	/**
	 * Given an array of ints, return true if the array is length 1 or more, and the
	 * first element and the last element are equal.
	 * 
	 * Source: http://codingbat.com/prob/p118976 (hint available)
	 */
	public static boolean sameFirstLast(int[] nums) {
		return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	}

	/**
	 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	 * Hint: Don't overthink this one. No computation required!
	 * 
	 * Source: http://codingbat.com/prob/p167011
	 */
	public static int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	/**
	 * Given 2 arrays of ints, a and b, return true if they have the same first
	 * element or they have the same last element. Both arrays will be length 1 or
	 * more.
	 * 
	 * Source: http://codingbat.com/prob/p191991
	 */
	public static boolean commonEnd(int[] a, int[] b) {
		return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
	}

	/**
	 * Given an array of ints length 3, return the sum of all the elements.
	 * 
	 * Source: http://codingbat.com/prob/p175763
	 */
	public static int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	/**
	 * Given an array of ints length 3, return an array with the elements "rotated
	 * left" so {1, 2, 3} yields {2, 3, 1}.
	 * 
	 * Source: http://codingbat.com/prob/p185139
	 */
	public static int[] rotateLeft3(int[] nums) {
		int[] copy = new int[3];
		copy[0] = nums[1];
		copy[1] = nums[2];
		copy[2] = nums[0];
		return copy;
	}

	/**
	 * Return the number of even ints in the given array. Note: the % "mod" operator
	 * computes the remainder, e.g. 5 % 2 is 1.
	 * 
	 * Source: http://codingbat.com/prob/p162010
	 */
	public static int countEvens(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array length 1 or more of ints, return the difference between the
	 * largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
	 * and Math.max(v1, v2) methods return the smaller or larger of two values.
	 * 
	 * Source: http://codingbat.com/prob/p196640
	 */
	public static int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		return max - min;
	}

	/**
	 * Return the "centered" average of an array of ints, which we'll say is the
	 * mean average of the values, except ignoring the largest and smallest values
	 * in the array. If there are multiple copies of the smallest value, ignore just
	 * one copy, and likewise for the largest value. Use int division to produce the
	 * final average. You may assume that the array is length 3 or more.
	 * 
	 * Source: http://codingbat.com/prob/p136585
	 */
	public static int centeredAverage(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
			sum += nums[i];
		}
		return (sum - max - min) / (nums.length - 2);
	}

	public static void main(String[] args) {
		// You can add debugging statements here to test your methods!
	}
}
