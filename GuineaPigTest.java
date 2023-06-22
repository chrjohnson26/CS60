package com.gradescope.hw7;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuineaPigTest {

	@Test
	public void testGuineaPigStringInt() {
		GuineaPig testPig = new GuineaPig("Bob", 1);
		assertEquals("Bob", testPig.getName());
		assertEquals(testPig instanceof GuineaPig, true);
		Squeakable tPig = new GuineaPig("Bob",1);
		assertEquals(tPig instanceof GuineaPig, true);
	}

	@Test
	public void testGuineaPig() {
		GuineaPig testPig2 = new GuineaPig();
		assertEquals("arya", testPig2.getName());
		assertEquals(testPig2 instanceof GuineaPig, true);
		Squeakable tPig2 = new GuineaPig();
		assertEquals(tPig2 instanceof GuineaPig, true);

	}

	@Test
	public void testGetName() {
		GuineaPig testPig3 = new GuineaPig("Hamburger", 1);
		GuineaPig testPig4 = new GuineaPig();
		assertEquals("Hamburger", testPig3.getName());
		assertEquals("arya", testPig4.getName());
	}

	@Test
	public void testCompareToEquals() {
		GuineaPig testPig5 = new GuineaPig("Harry", 5);
		GuineaPig testPig6 = new GuineaPig("Harry", 5);
		assertEquals(0, testPig5.compareTo(testPig6));
	}
	
	@Test
	public void testCompareToGreater() {
		GuineaPig testPig7 = new GuineaPig("Harry", 2);
		GuineaPig testPig8 = new GuineaPig("Harry", 1);
		assertEquals(1, testPig7.compareTo(testPig8));
		GuineaPig testPig9 = new GuineaPig("C", 10);
		GuineaPig testPig10 = new GuineaPig("A", 10);
		assertEquals(2, testPig9.compareTo(testPig10));
	}
	
	@Test
	public void testCompareToLess() {
		GuineaPig testPig7 = new GuineaPig("Harry", 1);
		GuineaPig testPig8 = new GuineaPig("Harry", 2);
		assertEquals(-1, testPig7.compareTo(testPig8));
		GuineaPig testPig9 = new GuineaPig("A", 10);
		GuineaPig testPig10 = new GuineaPig("B", 10);
		assertEquals(-1, testPig9.compareTo(testPig10));
	}
	
	@Test
	public void testComparable() {
		Comparable<GuineaPig> gp = new GuineaPig();
		GuineaPig gp2 = new GuineaPig();
		assertEquals(0, gp.compareTo(gp2));
	}
	
	@Test
	public void testSqueak() {
		GuineaPig gp = new GuineaPig();
		Squeakable gp2 = new GuineaPig();
		assertEquals("Squeak! (Feed me!)", gp.squeak());
		assertEquals("Squeak! (Feed me!)", gp2.squeak());

	}
}
