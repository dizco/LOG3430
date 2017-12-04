package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BipartiteXExtendedTest {

	@Test
	public void testGetVerticesWithAnEdgeToB() {
		BipartiteXExtended b = new BipartiteXExtended(GraphGenerator.complete(10));
		assertEquals(9, b.getVerticesWithAnEdgeToB(4).size());
	}

}
