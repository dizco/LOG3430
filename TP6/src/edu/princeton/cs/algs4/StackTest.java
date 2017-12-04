package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testIsEmpty() {
		Stack s = new Stack();
		assertTrue(s.isEmpty());
	}

	@Test
	public void testSize() {
		Stack s = new Stack();
		assertEquals(0, s.size());
	}

	@Test
	public void testPush() {
		Stack s = new Stack();
		s.push(2);
		assertEquals(1, s.size());
	}

	@Test
	public void testPop() {
		Stack s = new Stack();
		s.push(2);
		assertEquals(2, s.pop());
	}

	@Test
	public void testPeek() {
		Stack s = new Stack();
		s.push(2);
		assertEquals(2, s.peek());
	}

	@Test
	public void testToString() {
		Stack s = new Stack();
		s.push(2);
		assertEquals("2 ", s.toString());
	}

}
