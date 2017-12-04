package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BagTest {

	@Test
	public void testIsEmpty() {
		Bag b = new Bag();
		assertTrue(b.isEmpty());
	}

	@Test
	public void testSize() {
		Bag b = new Bag();
		assertEquals(0, b.size());
	}

	@Test
	public void testAdd() {
		Bag b = new Bag();
		b.add(2);
		assertEquals(1, b.size());
		
	}
}
