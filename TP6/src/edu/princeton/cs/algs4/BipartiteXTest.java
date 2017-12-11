/**
 * 
 */
package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;


public class BipartiteXTest {

	/*
	 * Test de la sortie de isBipartite()
	 */
	@Test
	public void testIsBipartite() {
		Graph g = new Graph(10);
		BipartiteX b = new BipartiteX(g);
		assertTrue(b.isBipartite());
	}

	/*
	 * Test de la sortie de color()
	 */
	@Test
	public void testColor() {
		Graph g = new Graph(10);
		BipartiteX b = new BipartiteX(g);
		assertEquals(false, b.color(5));
	}

	/*
	 * Test de la sortie de oddCycle()
	 */
	@Test
	public void testOddCycle() {
		BipartiteX b = new BipartiteX(GraphGenerator.cycle(10));
		assertNull(b.oddCycle());
	}

}
