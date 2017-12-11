package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {

	Graph g;
	
	/*
	 * Fonction qui initialise un graphe avant chaque cas de test
	 */
	@Before  
    public void setUp()
    {
		g = new Graph(10);
    }
	
	/*
	 * Test de la sortie de V()
	 */
	@Test
	public void testV() {
		assertEquals(10, g.V());
	}

	/*
	 * Test de la sortie de E()
	 */
	@Test
	public void testE() {
		assertEquals(0, g.E());
	}

	/*
	 * Test du comportement de addEdge()
	 */
	@Test
	public void testAddEdge() {
		g.addEdge(3, 6);
		assertEquals(1, g.E());
	}

	/*
	 * Test de la sortie de adj()
	 */
	@Test
	public void testAdj() {
		g.addEdge(3, 6);
		assertNotNull(g.adj(3));
	}

	/*
	 * Test de la sortie de degree()
	 */
	@Test
	public void testDegree() {
		g.addEdge(3, 6);
		assertEquals(1, g.degree(3));
	}

	/*
	 * Test de la sortie de toString()
	 */
	@Test
	public void testToString() {
		assertTrue(g.toString().length()>10);
	}

	/*
	 * Test de la sortie de getTypeName()
	 */
	@Test
	public void testGetTypeName() {
		assertNull(g.getTypeName());
	}

	/*
	 * Test du comportement de getTypeName()
	 */
	@Test
	public void testSetTypeName() {
		g.setTypeName("LOGGG");
		assertEquals("LOGGG", g.getTypeName());
	}

}
