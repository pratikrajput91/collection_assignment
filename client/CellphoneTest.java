package com.capgemini.client;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class CellphoneTest {
	private static Cellphone apple;
	private static Cellphone samsung;
	private static Cellphone htc;

	@BeforeClass
	public static void setUp() {
		apple=new Cellphone("apple","s8","Golden","ios",68000);
	samsung=new Cellphone("samsung","j7","White","android",25000);
		htc=new Cellphone("htc","desire520","black","android",20000);
		
	}
	@Test
	public void testIsAcceptingDuplicate() {
		HashSet<Cellphone> cell=new HashSet<Cellphone>();
		cell.add(apple);
		cell.add(samsung);
		cell.add(htc);
		assertEquals(3,cell.size());
		
	}
	@Test
	public void testIsOrderMaintained() {
		ArrayList<Cellphone> cell=new ArrayList<Cellphone>();
		cell.add(apple);
		cell.add(samsung);
		cell.add(htc);
		Iterator<Cellphone> iterator=cell.iterator();
		assertEquals("apple", iterator.next().getCompany());
		assertEquals("samsung", iterator.next().getCompany());
		assertEquals("htc", iterator.next().getCompany());
	}
	@Test
	public void testSortedorNot() {
		TreeSet<Cellphone> cell=new TreeSet<Cellphone>();
		cell.add(apple);
		cell.add(samsung);
		cell.add(htc);
		Iterator<Cellphone> iterator=cell.iterator();
		assertEquals("apple", iterator.next().getCompany());
		assertEquals("samsung", iterator.next().getCompany());
		assertEquals("htc", iterator.next().getCompany());

}
}




