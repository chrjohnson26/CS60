package com.gradescope.hw5;

public class Student {
	/**
	 * The Student's name.
	 */
	private String name;

	/**
	 * The Student's id.
	 */
	private final long id;

	/**
	 * Initializes a Student assigning a name and id.
	 */
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
	}

	/**
	 * Accesses the Student's name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Accesses the Student's ID.
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * Sets the Student's name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns a string representation of the Student object.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name + " " + "[" + this.id + "]";
	}

	/**
	 * Compares two Student objects. The result is true if and only if the two
	 * Student ids are equal
	 * 
	 * @param student - Student to compare this Student against
	 * @return true if the two Students represent the same id
	 */
	public boolean equals(Student student) {
		if (this.id == student.id) {
			return true;
		}
		return false;
	}
}
