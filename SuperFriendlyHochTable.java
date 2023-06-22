package com.gradescope.hw7;


/**
 * A table at the Hoch with chairs and people. Hoch tables are never full!
 * (There's always room for N+1.) At a super friendly table, whenever a person
 * is or removed added, they say hello or bye to everyone else at the table.
 * When class starts, everyone says bye.
 */
public class SuperFriendlyHochTable extends HochTable {
	/**
	 * The default number of chairs.
	 */
	public static final int NUMBER_OF_CHAIRS = 10;

	/**
	 * Constructs a table with the default number of chairs.
	 */
	public SuperFriendlyHochTable() {
		this(SuperFriendlyHochTable.NUMBER_OF_CHAIRS);
	}

	/**
	 * Constructs a table with the specified number of chairs.
	 * 
	 * @param capacity - the number of seats
	 * @throws IllegalArgumentException if the capacity is less than 0
	 */
	public SuperFriendlyHochTable(int capacity) {
		super(capacity);
	}

	/**
	 * Adds a person to this table if there is space.
	 * 
	 * @param name - the name of the person to add
	 * @return a welcome message
	 */
	public String addPerson(String name) {
		// add a chair if needed
		if (this.numChairs == this.numPeople) {
			this.numChairs++;
		}

		// greet the person
		String welcome = "";
		if (this.emptySeat()) {
			this.numPeople++;
			this.people.add(name);
			if (this.numPeople == 1) {
				welcome = "(Silence - no one is here to say hello.)";
			} else {
				welcome = "Welcome " + name + "!";
			}
		} else {
			if (this.numPeople == 0) {
				welcome = "(Silence - no one is here to say sorry.)";
			} else {
				welcome = "Sorry - there is no space for you " + name + ".";
			}
		}

		String thanks = "";
		if (this.numPeople > 1) {
			String oldNames = this.people.subList(0, this.people.size() - 1).toString();
			oldNames = oldNames.substring(1, oldNames.length() - 1); // strip square brackets
			thanks = "Thanks " + oldNames + "!!!!!";
		}

		if (welcome != "" && thanks != "") {
			welcome += " ";
		}

		return welcome + thanks;
	}

	/**
	 * Removes a person from this table.
	 * 
	 * @param name - the name of the person to remove
	 * @return a goodbye message
	 */
	public String removePerson(String name) {
		boolean wasRemoved = this.people.remove(name);
		if (!wasRemoved) {
			return "Weird! " + name + " was not here!";
		}

		this.numPeople--;
		if (this.numPeople == 0) {
			return "(Silence - no one is here to say goodbye.)";
		}
		String names = this.people.toString();
		names = names.substring(1, names.length() - 1); // strip square brackets
		return "Bye " + name + ". " + "Bye " + names + ".";
	}

	/**
	 * Clears the table as everyone goes to class.
	 * 
	 * @return a goodbye message
	 */
	public String classStartingSoon() {
		String message;
		if (this.numPeople > 1) {
			message = "Bye everyone!";
		} else {
			message = "(Silence - no one is here to say goodbye.)";
		}
		this.numPeople = 0;
		this.people.clear();
		return message;
	}
}
