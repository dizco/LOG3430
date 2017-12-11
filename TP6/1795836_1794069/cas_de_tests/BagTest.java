package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BagTest {

	/*
	 * Test de la sortie de isEmpty()
	 */
	@Test
	public void testIsEmpty() {
		Bag b = new Bag();
		assertTrue(b.isEmpty());
	}

	/*
	 * Test de la sortie de size()
	 */
	@Test
	public void testSize() {
		Bag b = new Bag();
		assertEquals(0, b.size());
	}
	
	/*
	 * Test du fonctionnement de add()
	 */
	@Test
	public void testAdd() {
		Bag b = new Bag();
		b.add(2);
		assertEquals(1, b.size());
		
	}
}
