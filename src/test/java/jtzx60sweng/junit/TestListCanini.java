package jtzx60sweng.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestListCanini{
   
	private ListCanini testCanini = new ListCanini();
	
	@Before
	public	void init(){
		testCanini.add("Border Collie");
		testCanini.add("Alaszkai Malamu");
		testCanini.add("Corgi");
	}
   
	@Test
	public void testSize(){
		assertEquals("Méret ellenőrzés",3,testCanini.size());
	}
	
	@Test
	public void testAdd(){
		testCanini.add("Beagle");
		assertEquals("Hozzáadás ellenőrzés",4,testCanini.size());
	}
	
	@Test
	public void testIsEmpty(){
		assertFalse(testCanini.isEmpty());
	}
	
	@Test
	public void testRemove(){
		testCanini.removeAll();
	}
	
	@Test
	public void remove(){
		testCanini.remove("Corgi");
	}
	
}
