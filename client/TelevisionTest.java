package com.capgemini.client;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class TelevisionTest {
	public static Television LG;
	public static Television Samsung;
	public static Television Onida;
	
	

	@BeforeClass
	public static void setUp() {
		LG=new Television("lg","led",true,27000);
		Samsung=new Television("samsung","lcd",false,21000);
		Onida=new Television("onida","plasma",true,18000);
	
		

}
	@Test
	public void testIsAcceptingDuplicates() {
		HashSet<Television> television=new HashSet<Television>();
		television.add(LG);
		television.add(Samsung);
		television.add(Onida);
		assertEquals(3,television.size());
		
	}

@Test
public void testIsOrderMaintained() {
	ArrayList<Television> television=new ArrayList<Television>();
	television.add(LG);
	television.add(Samsung);
	television.add(Onida);
	Iterator<Television> iterator=television.iterator();
	assertEquals("LG", iterator.next().getCompany());
	assertEquals("Samsung", iterator.next().getCompany());
	assertEquals("Onida", iterator.next().getCompany());
}
@Test
public void testSortedOrNot() {
	TreeSet<Television> television=new TreeSet<Television>();
	television.add(LG);
	television.add(Samsung);
	television.add(Onida);
	Iterator<Television> iterator=television.iterator();
	assertEquals("LG", iterator.next().getCompany());
	assertEquals("Samsung", iterator.next().getCompany());
	assertEquals("Onida", iterator.next().getCompany());

}
}
