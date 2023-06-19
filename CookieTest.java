package com.gradescope.hw5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieTest {

	/********************
	 * constructors
	 ********************/

	@Test
	public void testCookie() {
		new Cookie();
	}

	@Test
	public void testCookie1() {
		new Cookie("sugar");
	}

	@Test
	public void testCookie2() {
		new Cookie("chocolate chip");
	}

	@Test
	public void testCookie3() {
		new Cookie("gluten free");
	}

	@Test
	public void testCookie4() {
		new Cookie("rocky road");
	}

	/********************************
	 * Non-static Methods
	 ********************************/

	@Test
	public void testGetType() {
		Cookie sugarCookie = new Cookie("chocolate chip");
		assertEquals("chocolate chip", sugarCookie.getType());
	}

	@Test
	public void testGetCalories() {
		Cookie sugarCookie = new Cookie("gluten free");
		assertEquals(400, sugarCookie.getCalories());
	}

	@Test
	public void testListIngredients() {
		Cookie sugarCookie = new Cookie("sugar");
		assertEquals("[butter, sugar, eggs, flour]", sugarCookie.listIngredients());
	}

	@Test
	public void testAddIngredients() {
		Cookie sugarCookie = new Cookie("sugar");
		sugarCookie.addIngredient("brown sugar");
		assertEquals("[butter, sugar, eggs, flour, brown sugar]", sugarCookie.listIngredients());
	}

	/********************************
	 * Static Methods
	 ********************************/

	@Test
	public void testGetCookieCount() {
		Cookie.resetCookieCount();
		assertEquals(0, Cookie.getCookieCount());
	}

	@Test
	public void testCookieCountFrom0to3() {
		Cookie.resetCookieCount();
		assertEquals(0, Cookie.getCookieCount());
		Cookie a = new Cookie();
		assertEquals(1, Cookie.getCookieCount());
		Cookie b = new Cookie();
		assertEquals(2, Cookie.getCookieCount());
		Cookie c = new Cookie();
		assertEquals(3, Cookie.getCookieCount());
	}

	@Test
	public void testResetCookieCount() {
		Cookie.resetCookieCount();
		assertEquals(0, Cookie.getCookieCount());
	}

	@Test
	public void testRightNumberOfCookies() {
		assertEquals(6, Cookie.rightNumberOfCookies());
	}

	@Test
	public void testIsDeliciousCookieType() {
		Cookie chocolate = new Cookie("chocolate");
		assertTrue(Cookie.isDeliciousCookieType(chocolate.getType()));
	}

	@Test
	public void testIsDeliciousCookieType1() {
		Cookie sugar = new Cookie("sugar");
		assertFalse(Cookie.isDeliciousCookieType(sugar.getType()));
	}

	/********************************
	 * Cookie Box Constructor/Methods
	 ********************************/

	@Test
	public void testCookieBox() {
		new Cookie();
	}

	@Test
	public void testAddCookie() {
		Cookie newCookie = new Cookie();
		CookieBox box = new CookieBox();
		box.addCookie(newCookie);
		assertEquals(400, box.totalCaloriesInBox());
	}

	@Test
	public void testTotalCaloriesInBox() {
		Cookie newCookie = new Cookie();
		Cookie newCookie2 = new Cookie("chocolate chip");
		CookieBox box = new CookieBox();
		box.addCookie(newCookie);
		box.addCookie(newCookie2);
		assertEquals(900, box.totalCaloriesInBox());
	}
}
