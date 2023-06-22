package com.gradescope.hw7;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClarinetTest {
	@Test
	public void testClarinet() {
		new Clarinet();
	}
	
	@Test
	public void testGetKey() {
		Clarinet c = new Clarinet();
		assertEquals(c.getKey(),"Bb");
		Instrument c2 = new Clarinet();
		assertEquals(c2.getKey(),"Bb");
		assertEquals(c2 instanceof Clarinet, true);
	}

	@Test
	public void testSqueak() {
		Clarinet c = new Clarinet();
		Squeakable c2 = new Clarinet();
		assertEquals("Squeak! (Need more practice...)", c.squeak());
		assertEquals("Squeak! (Need more practice...)", c2.squeak());

	}
}
