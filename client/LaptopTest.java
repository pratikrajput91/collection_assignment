package com.capgemini.client;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

public class LaptopTest {
	private static Laptop dell;
	private static Laptop hp;
	private static Laptop asus;
	
	@BeforeClass
	public static void setUp() {
		dell=new Laptop("Dell","Inspiron 5550","Linux","i7");
		hp=new Laptop("HP","Probook","windows 10","i5");
		asus=new Laptop("Asus","dragon","Ubantu","i5");
		
	}
	@Test
	public void testIsItAcceptingDuplicates() {
		HashSet<Laptop> set=new HashSet<Laptop>();
		set.add(dell);
		set.add(hp);
		set.add(asus);
		assertEquals(3,set.size());
		
	}
	@Test
	public void testIsTheOrderIsMaintained() {
		ArrayList<Laptop> al=new ArrayList<Laptop>();
		al.add(dell);
		al.add(hp);
		al.add(asus);
		Iterator<Laptop> iterator=al.iterator();
		assertEquals("Dell", iterator.next().getCompany());
	}
	

}
