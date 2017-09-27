package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphGeneratorTest {

	@Test
	public void testSimpleVE() {
		Graph simple = GraphGenerator.simple(15,32);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 15 sommets", simple.V() , 15);
	}

	@Test
	public void testSimpleVP() {
		Graph simple = GraphGenerator.simple(150,0.618281828);
		assertEquals("Le graphe devrait être de type simple", simple.getTypeName() , "simple");
		assertEquals("Le graphe devrait avoir 150 sommets", simple.V() , 150);
	}
	
	@Test
	public void testComplete() {
		Graph complete = GraphGenerator.complete(1532);
		assertEquals("Le graphe devrait être de type complete", complete.getTypeName() , "complete");
		assertEquals("Le graphe devrait avoir 1532 sommets", complete.V() , 1532);
	}
	
	@Test
	public void testCompleteBipartite() {
		Graph completeBipartite = GraphGenerator.completeBipartite(42,13);
		assertEquals("Le graphe devrait être de type completeBipartite", completeBipartite.getTypeName() , "completeBipartite");
		assertEquals("Le graphe devrait avoir 55 sommets", completeBipartite.V() , 42 + 13);
	}
	
	@Test
	public void testBipartiteE() {
		Graph bipartite = GraphGenerator.bipartite(44,33, 222);
		assertEquals("Le graphe devrait être de type bipartite", bipartite.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 77 sommets", bipartite.V() , 77);
	}
	
	@Test
	public void testBipartiteP() {
		Graph bipartite = GraphGenerator.bipartite(44,33, 0.75);
		assertEquals("Le graphe devrait être de type bipartite", bipartite.getTypeName() , "bipartite");
		assertEquals("Le graphe devrait avoir 77 sommets", bipartite.V() , 77);
	}
	
	@Test
	public void testPath() {
		Graph path = GraphGenerator.path(123);
		assertEquals("Le graphe devrait être de type path", path.getTypeName() , "path");
		assertEquals("Le graphe devrait avoir 123 sommets", path.V() , 123);
	}
	
	@Test
	public void testBinaryTree() {
		Graph binaryTree = GraphGenerator.binaryTree(321);
		assertEquals("Le graphe devrait être de type binaryTree", binaryTree.getTypeName() , "binaryTree");
		assertEquals("Le graphe devrait avoir 321 sommets", binaryTree.V() , 321);
	}
	
	@Test
	public void testCycle() {
		Graph cycle = GraphGenerator.cycle(111);
		assertEquals("Le graphe devrait être de type cycle", cycle.getTypeName() , "cycle");
		assertEquals("Le graphe devrait avoir 111 sommets", cycle.V() , 111);
	}
	
	@Test
	public void testEulerianCycle() {
		Graph eulerianCycle = GraphGenerator.eulerianCycle(12,21);
		assertEquals("Le graphe devrait être de type eulerianCycle", eulerianCycle.getTypeName() , "eulerianCycle");
		assertEquals("Le graphe devrait avoir 12 sommets", eulerianCycle.V() , 12);
	}
	
	@Test
	public void testEulerianPath() {
		Graph eulerianPath = GraphGenerator.eulerianPath(23,32);
		assertEquals("Le graphe devrait être de type eulerianPath", eulerianPath.getTypeName() , "eulerianPath");
		assertEquals("Le graphe devrait avoir 23 sommets", eulerianPath.V() , 23);
	}
	
	@Test
	public void testWheel() {
		Graph wheel = GraphGenerator.wheel(42);
		assertEquals("Le graphe devrait être de type wheel", wheel.getTypeName() , "wheel");
		assertEquals("Le graphe devrait avoir 42 sommets", wheel.V() , 42);
	}
	
	@Test
	public void testStar() {
		Graph star = GraphGenerator.star(77);
		assertEquals("Le graphe devrait être de type star", star.getTypeName() , "star");
		assertEquals("Le graphe devrait avoir 77 sommets", star.V() , 77);
	}
	
	@Test
	public void testRegular() {
		Graph regular = GraphGenerator.regular(66, 14);
		assertEquals("Le graphe devrait être de type regular", regular.getTypeName() , "regular");
		assertEquals("Le graphe devrait avoir 66 sommets", regular.V() , 66);
	}
	
	@Test
	public void testTree() {
		Graph tree = GraphGenerator.tree(1000);
		assertEquals("Le graphe devrait être de type tree", tree.getTypeName() , "tree");
		assertEquals("Le graphe devrait avoir 1000 sommets", tree.V() , 1000);
	}
}
