package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestComplet extends TestCase {

	public TestComplet(String testName) {
        super(testName);
	}
	
	/* Niveau 1 */
	//On ne teste pas StdOut car on considère qu'il s'agit d'une classe utilitaire
	
	public void testBag() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BagTest test = new BagTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				method.invoke(test);
			}
		}
	}
	
	public void testQueue() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		QueueTest test = new QueueTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				test.setUp();
				method.invoke(test);
			}
		}
	}
	
	public void testStack() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StackTest test = new StackTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				method.invoke(test);
			}
		}
	}
	
	/* Niveau 2 */
	public void testGraph() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		GraphTest test = new GraphTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				test.setUp();
				method.invoke(test);
			}
		}
	}
	
	
	/* Niveau 3 */
	public void testBipartiteX() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BipartiteXTest test = new BipartiteXTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				method.invoke(test);
			}
		}
	}
	
	public void testGraphGenerator() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		GraphGeneratorTest test = new GraphGeneratorTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				method.invoke(test);
			}
		}
	}
	
	/* Niveau 4 */
	public void testBipartiteXExtended() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BipartiteXExtendedTest test = new BipartiteXExtendedTest();
		for(Method method : test.getClass().getMethods()){
			if (method.getName().startsWith("test")){
				method.invoke(test);
			}
		}
	}
	
	/* Suite de tests servant à définir l'ordre des tests */
	public static junit.framework.Test suite() {
        TestSuite suite = new TestSuite("Test MyClass");
        suite.addTest(new TestComplet("testBag"));
        suite.addTest(new TestComplet("testQueue"));
        suite.addTest(new TestComplet("testStack"));
        suite.addTest(new TestComplet("testGraph"));
        suite.addTest(new TestComplet("testBipartiteX"));
        suite.addTest(new TestComplet("testGraphGenerator"));
        suite.addTest(new TestComplet("testBipartiteXExtended"));
        return suite;
	}

}
