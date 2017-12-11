package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	/*
	 * Test de la sortie de isEmpty()
	 */
	@Test
	public void testIsEmpty() {
		Stack s = new Stack();
		assertTrue(s.isEmpty());
	}

	/*
	 * Test de la sortie de size()
	 */
	@Test
	public void testSize() {
		Stack s = new Stack();
		assertEquals(0, s.size());
	}

	/*
	 * Test du comportement de push()
	 */
	@Test
	public void testPush() {
		Stack s = new Stack();
		s.push(2);
		assertEquals(1, s.size());
	}
	
	/*
	 * Test du comportement de pop()
	 */
	@Test
	public void testPop() {
		Stack s = new Stack();
		s.push(2);
		assertEquals(2, s.pop());
	}

	/*
	 * Test du comportement de peek())
	 */
	@Test
	public void testPeek() {
		Stack s = new Stack();
		s.push(2);
		assertEquals(2, s.peek());
	}

	/*
	 * Test de la sortie de toString()
	 */
	@Test
	public void testToString() {
		Stack s = new Stack();
		s.push(2);
		assertEquals("2 ", s.toString());
	}

}
