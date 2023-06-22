package com.gradescope.hw7;

/**
 * 
 * A Clarinet
 *
 */
public class Clarinet extends Instrument implements Squeakable {

	public Clarinet() {
		super("Bb");
	}
	
	@Override
	/**
	 *  Returns a String that represents when the Clarinet object squeaks
	 *  @return String
	 */
	public String squeak() {
		return "Squeak! (Need more practice...)";
	}
}
