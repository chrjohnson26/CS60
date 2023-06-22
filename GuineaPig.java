package com.gradescope.hw7;

/**
 * A guinea pig.
 */
public class GuineaPig implements Comparable<GuineaPig>, Squeakable {
	private int age;
	private String name;

	/**
	 * Initializes a new guinea pig object.
	 * 
	 * @param name - the name
	 * @param age  - the age
	 */
	public GuineaPig(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Initializes a new guinea pig object with default name "arya" and age 1 (Prof
	 * Wu's pet).
	 */
	public GuineaPig() {
		this("arya", 1);
	}

	/**
	 * Returns the name of this guinea pig.
	 */
	public String getName() {
		return this.name;
	}

	@Override
	/**
	 * Compares this GuineaPig object to o GuineaPig object based on their age
	 * Returns a negative integer if this GuineaPig age is less than other GuineaPig age or they
	 * both have the same age and this GuineaPig's name is alphabetically earlier
	 * than other GuineaPig's name
	 * 
	 * Returns a positive integer if this GuineaPig age is greater than other GuineaPig age or they
	 * both have the same age and other GuineaPig's name is alphabetically earlier
	 * than this GuineaPig's name
	 * 
	 * Returns 0 if this GuineaPig's age and name are equal to other GuineaPig's age
	 * and name
	 * 
	 * @param o - GuineaPig object
	 */
	public int compareTo(GuineaPig o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age > o.age) {
			return 1;
		} else {
			return this.name.compareTo(o.name);
		}
	}

	@Override
	/**
	 * Returns a String that represents when the GuineaPig object squeaks
	 * 
	 * @return String
	 */
	public String squeak() {
		return "Squeak! (Feed me!)";
	}
}
