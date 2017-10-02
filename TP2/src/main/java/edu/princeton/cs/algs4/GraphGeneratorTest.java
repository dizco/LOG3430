package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphGeneratorTest {

	
	// Simple EC
	/**
	 * Cas de test : V valide et p invalide
	 */
	@Test
	public void testSimpleEC_1() {
		try {
			Graph simple = GraphGenerator.simple(15, 1.01);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et p valide
	 */
	@Test
	public void testSimpleEC_2() {
		try {
			Graph simple = GraphGenerator.simple(-1, 0.32);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	// Simple AC
	/**
	 * Cas de test : V valide et p invalide
	 */
	@Test
	public void testSimpleAC_1() {
		try {
			Graph simple = GraphGenerator.simple(15, 1.01);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et p valide
	 */
	@Test
	public void testSimpleAC_2() {
		try {
			Graph simple = GraphGenerator.simple(-6, 0.32);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et p invalide
	 */
	@Test
	public void testSimpleAC_3() {
		try {
			Graph simple = GraphGenerator.simple(-3, 1.03);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V valide et p valide
	 */
	@Test
	public void testSimpleAC_4() {
		Graph simple = GraphGenerator.simple(4, 0.45);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 4 sommets", simple.V() , 4);
	}	

	
	/**
	 * Cas de test : V minimum et p valide
	 */
	@Test
	public void testSimpleLimite_MinV() {
		Graph simple = GraphGenerator.simple(0, 0.45);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 0 sommets", simple.V() , 0);
	}
	
	/**
	 * Cas de test : V minimum + et p valide
	 */
	@Test
	public void testSimpleLimite_MinPlusV() {
		Graph simple = GraphGenerator.simple(1, 0.45);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 1 sommets", simple.V() , 1);
	}
	
	/**
	 * Cas de test : V valide et p minimum
	 */
	@Test
	public void testSimpleLimite_MinP() {
		Graph simple = GraphGenerator.simple(4, 0);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 4 sommets", simple.V() , 4);
		assertEquals("Le graphe devrait avoir 0 arêtes", simple.E() , 0);
	}
	
	/**
	 * Cas de test : V valide et p minimum +
	 */
	@Test
	public void testSimpleLimite_MinPlusP() {
		Graph simple = GraphGenerator.simple(4, 0.1);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 4 sommets", simple.V() , 4);
	}
	
	/**
	 * Cas de test : V valide et p moyen
	 */
	@Test
	public void testSimpleLimite_MoyP() {
		Graph simple = GraphGenerator.simple(4, 0.5);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 4 sommets", simple.V() , 4);
	}
	
	/**
	 * Cas de test : V valide et p maximum -
	 */
	@Test
	public void testSimpleLimite_MaxMoinsP() {
		Graph simple = GraphGenerator.simple(4, 0.9);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 4 sommets", simple.V() , 4);
	}
	
	/**
	 * Cas de test : V valide et p maximum
	 */
	@Test
	public void testSimpleLimite_MaxP() {
		Graph simple = GraphGenerator.simple(4, 1);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 4 sommets", simple.V() , 4);
	}
	
	
	// Bipartite EC
	/**
	 * Cas de test : V1 valide, V2 valide et p invalide
	 */
	@Test
	public void testBipartiteEC_1() {
		try {
			Graph g = GraphGenerator.bipartite(15, 10, 1.01);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 invalide, V2 invalide et p valide
	 */
	@Test
	public void testBipartiteEC_2() {
		try {
			Graph g = GraphGenerator.bipartite(-3, -4, 0.22);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	//Bipartite AC
	/**
	 * Cas de test : V1 invalide, V2 invalide et p invalide
	 */
	@Test
	public void testBipartiteAC_1() {
		try {
			Graph g = GraphGenerator.bipartite(-7, -3, 1.11);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 invalide, V2 invalide et p valide
	 */
	@Test
	public void testBipartiteAC_2() {
		try {
			Graph g = GraphGenerator.bipartite(-1, -1, 0.32);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 invalide, V2 valide et p valide
	 */
	@Test
	public void testBipartiteAC_3() {
		try {
			Graph g = GraphGenerator.bipartite(-1, 1, 0.32);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 invalide, V2 valide et p invalide
	 */
	@Test
	public void testBipartiteAC_4() {
		try {
			Graph g = GraphGenerator.bipartite(-1, 1, 1.01);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 valide, V2 invalide et p invalide
	 */
	@Test
	public void testBipartiteAC_5() {
		try {
			Graph g = GraphGenerator.bipartite(1, -1, 1.01);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p invalide
	 */
	@Test
	public void testBipartiteAC_6() {
		try {
			Graph g = GraphGenerator.bipartite(1, 1, 1.01);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 valide, V2 invalide et p valide
	 */
	@Test
	public void testBipartiteAC_7() {
		try {
			Graph g = GraphGenerator.bipartite(1, -2, 0.32);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p valide
	 */
	@Test
	public void testBipartiteAC_8() {
		Graph g = GraphGenerator.bipartite(1, 2, 0.32);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 3 sommets", g.V() , 3);
	}
	
	/**
	 * Cas de test : V1 minimum, V2 valide et p valide
	 */
	@Test
	public void testBipartiteLimite_MinV1() {
		Graph g = GraphGenerator.bipartite(0, 2, 0.45);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 2 sommets", g.V() , 2);
	}
	
	/**
	 * Cas de test : V1 minimum +, V2 valide et p valide
	 */
	@Test
	public void testBipartiteLimite_MinPlusV1() {
		Graph g = GraphGenerator.bipartite(1, 2, 0.45);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 3 sommets", g.V() , 3);
	}
	
	/**
	 * Cas de test : V1 valide, V2 min et p valide
	 */
	@Test
	public void testBipartiteLimite_MinV2() {
		Graph g = GraphGenerator.bipartite(2, 0, 0.45);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 2 sommets", g.V() , 2);
	}
	
	/**
	 * Cas de test : V1 valide, V2 min + et p valide
	 */
	@Test
	public void testBipartiteLimite_MinPlusV2() {
		Graph g = GraphGenerator.bipartite(2, 1, 0.45);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 3 sommets", g.V() , 3);
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p min
	 */
	@Test
	public void testBipartiteLimite_MinP() {
		Graph g = GraphGenerator.bipartite(2, 2, 0.0);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
		assertEquals("Le graphe devrait avoir 0 arêtes", g.E(), 0);
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p min +
	 */
	@Test
	public void testBipartiteLimite_MinPlusP() {
		Graph g = GraphGenerator.bipartite(2, 2, 0.1);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p moy
	 */
	@Test
	public void testBipartiteLimite_MoyP() {
		Graph g = GraphGenerator.bipartite(2, 2, 0.5);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p max -
	 */
	@Test
	public void testBipartiteLimite_MaxMoinsP() {
		Graph g = GraphGenerator.bipartite(2, 2, 0.9);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	/**
	 * Cas de test : V1 valide, V2 valide et p max
	 */
	@Test
	public void testBipartiteLimite_MaxP() {
		Graph g = GraphGenerator.bipartite(2, 2, 1);
		assertEquals("Le graphe devrait être de type bipartite", g.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	
	//Regular EC
	/**
	 * Cas de test : V pair et k pair
	 */
	@Test
	public void testRegularEC_1() {
		Graph g = GraphGenerator.regular(2, 14);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 2 sommets", g.V() , 2);
	}
	
	/**
	 * Cas de test : V impair et k impair
	 */
	@Test
	public void testRegularEC_2() {
		try {
			Graph g = GraphGenerator.regular(1, 1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et k invalide
	 */
	@Test
	public void testRegularEC_3() {
		try {
			Graph g = GraphGenerator.regular(-1, -1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	//Regular AC
	/**
	 * Cas de test : V pair et k pair
	 */
	@Test
	public void testRegularAC_1() {
		Graph g = GraphGenerator.regular(2, 14);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 2 sommets", g.V() , 2);
	}
	
	/**
	 * Cas de test : V pair et k invalide
	 */
	@Test
	public void testRegularAC_2() {
		try {
			Graph g = GraphGenerator.regular(2, -1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V pair et k impair
	 */
	@Test
	public void testRegularAC_3() {
		Graph g = GraphGenerator.regular(2, 13);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 2 sommets", g.V() , 2);
	}
	
	/**
	 * Cas de test : V impair et k pair
	 */
	@Test
	public void testRegularAC_4() {
		Graph g = GraphGenerator.regular(1, 14);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 1 sommets", g.V() , 1);
	}
	
	/**
	 * Cas de test : V impair et k invalide
	 */
	@Test
	public void testRegularAC_5() {
		try {
			Graph g = GraphGenerator.regular(1, -1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V impair et k impair
	 */
	@Test
	public void testRegularAC_6() {
		try {
			Graph g = GraphGenerator.regular(1, 1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et k pair
	 */
	@Test
	public void testRegularAC_7() {
		try {
			Graph g = GraphGenerator.regular(-1, 14);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et k invalide
	 */
	@Test
	public void testRegularAC_8() {
		try {
			Graph g = GraphGenerator.regular(-1, -1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V invalide et k impair
	 */
	@Test
	public void testRegularAC_9() {
		try {
			Graph g = GraphGenerator.regular(-1, 1);
		    fail();
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	/**
	 * Cas de test : V pair min et k pair
	 */
	@Test
	public void testRegularLimite_MinPairV() {
		Graph g = GraphGenerator.regular(0, 4);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 0 sommets", g.V() , 0);
	}
	
	/**
	 * Cas de test : V pair min + et k pair
	 */
	@Test
	public void testRegularLimite_MinPairPlusV() {
		Graph g = GraphGenerator.regular(2, 4);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 2 sommets", g.V() , 2);
	}
	
	/**
	 * Cas de test : V impair min et k pair
	 */
	@Test
	public void testRegularLimite_MinImpairV() {
		Graph g = GraphGenerator.regular(1, 4);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 1 sommets", g.V() , 1);
	}
	
	/**
	 * Cas de test : V impair min + et k pair
	 */
	@Test
	public void testRegularLimite_MinImpairPlusV() {
		Graph g = GraphGenerator.regular(3, 4);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 3 sommets", g.V() , 3);
	}
	
	/**
	 * Cas de test : V pair et k pair min
	 */
	@Test
	public void testRegularLimite_MinPairK() {
		Graph g = GraphGenerator.regular(4, 0);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	/**
	 * Cas de test : V pair et k pair min +
	 */
	@Test
	public void testRegularLimite_MinPairPlusK() {
		Graph g = GraphGenerator.regular(4, 2);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	/**
	 * Cas de test : V pair et k impair min
	 */
	@Test
	public void testRegularLimite_MinImpairK() {
		Graph g = GraphGenerator.regular(4, 1);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
	/**
	 * Cas de test : V pair et k impair min +
	 */
	@Test
	public void testRegularLimite_MinImpairPlusK() {
		Graph g = GraphGenerator.regular(4, 3);
		assertEquals("Le graphe devrait être de type regular", g.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 4 sommets", g.V() , 4);
	}
	
}
