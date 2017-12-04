package edu.princeton.cs.algs4;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class QueueTest {

	Queue q;
	
	@Before  
    public void setUp()
    {
		q = new Queue();
    }
	
	/*
	 * Test du chemin de l'état vide à l'état vide
	 */
	@Test
	public void testIsEmptyVide() {
		q.isEmpty();
		assertEmpty();
	}
	
	/*
	 * Test du chemin de l'état vide à l'état vide
	 */
	@Test
	public void testToStringVide() {
		q.toString();
		assertEmpty();
	}
	
	/*
	 * Test du chemin de l'état vide à l'état vide
	 */
	@Test
	public void testSizeVide() {
		q.size();
		assertEmpty();
	}
	
	/*
	 * Test du chemin de l'état vide à l'état vide
	 */
	@Test
	public void testIteratorVide() {
		q.iterator();
		assertEmpty();
	}
	
	/*
	 * Test du chemin de l'état vide à l'état erreur
	 */
	@Test
	public void testDequeueVide() {
		try {
			q.dequeue();
			fail("Dequeue ne devrait pas fonctionner avec une queue vide");
		}
		catch (NoSuchElementException e) {
			//Catch
		}
	}
	
	/*
	 * Test du chemin de l'état vide à l'état erreur
	 */
	@Test
	public void testPeekVide() {
		try {
			q.peek();
			fail("Peek ne devrait pas fonctionner avec une queue vide");
		}
		catch (NoSuchElementException e) {
			//Catch
		}
	}
	
	/*
	 * Test du chemin de l'état vide à l'état non vide
	 */
	@Test
	public void testEnqueueVide() {
		q.enqueue("item");
		assertNotEmpty();
	}
	
	/*
	 * Test du chemin de l'état non vide à l'état vide
	 */
	@Test
	public void testDequeueNonVide() {
		q.enqueue("item");
		q.dequeue();
		assertEmpty();
	}
	
	/*
	 * Test du chemin de l'état non vide à l'état non vide
	 */
	@Test
	public void testToStringNonVide() {
		q.enqueue("item");
		q.toString();
		assertNotEmpty();
	}
	
	/*
	 * Test du chemin de l'état non vide à l'état non vide
	 */
	@Test
	public void testSizeNonVide() {
		q.enqueue("item");
		q.size();
		assertNotEmpty();
	}
	
	/*
	 * Test du chemin de l'état non vide à l'état non vide
	 */
	@Test
	public void testIteratorNonVide() {
		q.enqueue("item");
		q.iterator();
		assertNotEmpty();
	}

	/*
	 * Test du chemin de l'état non vide à l'état non vide
	 */
	@Test
	public void testEnqueueNonVide() {
		q.enqueue("item");
		q.enqueue("item2");
		assertNotEmpty();
	}

	/*
	 * Test du chemin de l'état non vide à l'état non vide
	 */
	@Test
	public void testPeekNonVide() {
		q.enqueue("item");
		q.peek();
		assertNotEmpty();
	}

	/*
	 * Test du chemin de l'état non vide à l'état non vide
	 */
	@Test
	public void testIsEmptyNonVide() {
		q.enqueue("item");
		q.isEmpty();
		assertNotEmpty();
	}

	/*
	 * Test du chemin de l'état non vide à l'état non vide avec condition spéciale que n > 1
	 */
	@Test
	public void testDequeue2NonVide() {
		q.enqueue("item");
		q.enqueue("item2");
		q.dequeue();
		assertNotEmpty();
	}

	/*
	 * Fonction qui assert que la queue soit vide
	 */
	public void assertEmpty() {
		assertEquals("Queue devrait etre vide", 0, q.size());
	}
	/*
	 * Fonction qui assert que la queue soit non vide
	 */
	public void assertNotEmpty() {
		assertTrue("Queue ne devrait pas etre vide", q.size() > 0);
	}

}
