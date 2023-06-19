package com.gradescope.hw5;

import java.util.Arrays;

public class Course {
	/**
	 * The Course's code.
	 */
	private final String code;

	/**
	 * The Course's capacity.
	 */
	private final int cap;

	/**
	 * The Course's list of Student enrollment.
	 */
	private Student[] enrolled;

	/**
	 * Initializes a Course assigning a code, cap and initializing enrolled.
	 */
	public Course(String code, int cap) {
		this.code = code;
		this.cap = cap;
		enrolled = new Student[0];
	}

	public String getCode() {
		return this.code;
	}

	public int getCap() {
		return this.cap;
	}

	public int getNumEnrolled() {
		return this.enrolled.length;
	}

	/**
	 * If enrollment is below capacity a new student is 
	 * enrolled in the Course. If at capacity -1 is returned.
	 * An integer which represents the new enrollment number is returned
	 * and enrolled is updated.
	 */
	public int enrollStudent(Student student) {
		if (this.enrolled.length < this.cap) {
			Student[] newEnrolled = new Student[this.enrolled.length + 1];
			for (int i = 0; i < this.enrolled.length + 1; i++) {
				if (i < this.enrolled.length && this.enrolled[i].equals(student)) {
					return -1;
				}
				if (i == this.enrolled.length) {
					newEnrolled[i] = student;
				} else {
					newEnrolled[i] = this.enrolled[i];
				}
			}
			this.enrolled = newEnrolled;
			return this.enrolled.length;
		}
		return -1;
	}

	/**
	 * Returns a string representation of the enrolled array.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String getStudents() {
		return Arrays.asList(this.enrolled).toString();
	}
}
